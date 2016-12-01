package pl.wmii.appka.service.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import pl.wmii.appka.model.MyszkaDAO;

@Path("zestawy")
@Produces("Application/JSON")
public class Zestawy {
	
	@GET
	@Path("podaj")
	Response  podajMyszki() {
		List<MyszkaDAO> myszki;
		
		return Response.ok().build();
	}
}
