package pl.wmii.appka.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.model.User;
import pl.wmii.appka.model.dto.UserDTO;
import pl.wmii.appka.model.dto.UzytkownikDTO;
import pl.wmii.appka.model.entity.UzytkownikDAO;
import pl.wmii.appka.service.utils.WynikWraper;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("zestawy")
public class Zestawy {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("testJPA");
	private static final Logger logger = LoggerFactory.getLogger(Zestawy.class);
	private EntityManager em;
	
	@GET
	@Path("user")
	public Response podajUserow() {


		List<UzytkownikDAO> users;
		List<UzytkownikDTO> usersDTO = new ArrayList<UzytkownikDTO>();

		try {
			em = emf.createEntityManager();
			users = em.createQuery("SELECT u FROM UzytkownikDAO u",UzytkownikDAO.class).getResultList();

		} catch ( Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Coś nie poszło" + e).build();
		} finally {
			em.close();
		}

		for(UzytkownikDAO u : users) {
			usersDTO.add(u.podajDTO());
		}



		return Response.ok(usersDTO).build();
	}

	@GET
	@Path("nowyuser")
	public Response utworzUser() {

		try {
			em = emf.createEntityManager();


			UzytkownikDAO user = new UzytkownikDAO();
			user.setLogin("Nowy");
			user.setNazwisko("Nowy");
			user.setImiona("Nowy");
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();


		} catch(Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Nie udało się dodać użytkownika").build();
		} finally {
			em.close();
		}


		return Response.ok("Utowrzone uzytownika").build();
	}

}
