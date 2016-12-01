package pl.wmii.appka.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import pl.wmii.appka.model.NapedDAO;
import pl.wmii.appka.service.Dba;
import pl.wmii.appka.service.rest.utils.WynikWraper;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("zestawy")
public class Zestawy {
	
	@GET
	@Path("myszki")
	public Response  podajMyszki() {
		List<NapedDAO> napedy = new ArrayList<NapedDAO>();
		Dba db = new Dba(true);
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT * FROM Nagrywarka ");
		
		try {
			napedy = db.getActiveEm().createNativeQuery(sql.toString()).getResultList();
			db.sendToLogger("Jesteśmy w dupce");
		} catch(Exception ex) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Jebło").build();
		} finally {
			db.closeEm();
		}
		
		return Response.ok(new WynikWraper<NapedDAO>(napedy)).build();
	}
	
	
}
