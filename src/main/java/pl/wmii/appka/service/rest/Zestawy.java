package pl.wmii.appka.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.model.User;
import pl.wmii.appka.model.dto.UserDTO;
import pl.wmii.appka.service.utils.WynikWraper;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("zestawy")
public class Zestawy {

	// Wprowadza możliwość wyprowadzania logów na terminalu serwera
	private static final Logger LOGGER = LoggerFactory.getLogger(Zestawy.class);

	private static EntityManagerFactory emf;

	private EntityManager em;
	
	@GET
	@Path("user")
	public Response podajUserow() {
		
		List<User> users;
		
		try {
			emf = Persistence.createEntityManagerFactory("testJPA");
			em = emf.createEntityManager();
			Query q = em.createQuery("SELECT u FROM User u");
			users = q.getResultList();
			
		} catch (Exception ex) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("No coś nie dziła").build();
		}
		
		List<UserDTO> dto = new ArrayList<UserDTO>();
		
		for(User u : users) {
			dto.add(u.podajDTO());
		}
		
		return Response.ok(new WynikWraper<UserDTO>(dto)).build();
	}
}
