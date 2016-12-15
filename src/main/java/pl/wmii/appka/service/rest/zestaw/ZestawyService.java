package pl.wmii.appka.service.rest.zestaw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.model.dto.UzytkownikDTO;
import pl.wmii.appka.model.entity.UzytkownikDAO;
import pl.wmii.appka.service.utils.EntityUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("zestawy")
public class ZestawyService {

	private EntityManager em = new EntityUtil().getEm();
	private static final Logger logger = LoggerFactory.getLogger(ZestawyService.class);


	@GET
	@Path("podaj")
	public Response podajUserow(@Context HttpServletRequest request) {
		List<UzytkownikDTO> users = new ArrayList<UzytkownikDTO>();
		List<UzytkownikDAO> uzytkownicy;
		try {
			uzytkownicy = em.createQuery("select u from UzytkownikDAO u",UzytkownikDAO.class).getResultList();
			for (UzytkownikDAO u :  uzytkownicy) {
				users.add(u.podajDTO());
			}
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("").build();
		} finally {
			em.close();
		}

		return Response.ok(users).build();
	}


}
