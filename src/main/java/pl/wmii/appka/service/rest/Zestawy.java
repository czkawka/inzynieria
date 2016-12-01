package pl.wmii.appka.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
		//Dba db = new Dba();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT * FROM Nagrywarka ");
		
//		db.openEm(true);
//		myszki = db.getActiveEm().createNativeQuery(sql.toString()).getResultList();
//		db.closeEm();
		
		napedy.add(new NapedDAO(5, "", 5, "", ""));
		
		return Response.ok(new WynikWraper<List<NapedDAO>>(napedy)).build();
	}
	
	
}
