package pl.wmii.appka.service.rest.zestaw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.model.entity.ZestawKomputerowyDAO;
import pl.wmii.appka.service.utils.EntityUtil;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("zestawy")
public class ZestawyService {

	private EntityManager entityManager = new EntityUtil().getEntityManager();
	private static final Logger logger = LoggerFactory.getLogger(ZestawyService.class);

	@GET
	@Path("zestaw/{id}")
	public Response podajZestaw(@PathParam("id") Long id) {
		return null;
	}

	@PUT
	@Path("zestaw")
	public Response zapiszZestaw(ZestawKomputerowyDAO zestaw) {
		return null;
	}

}
