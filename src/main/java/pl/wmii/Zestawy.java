package pl.wmii;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_JSON)
@Path("zestawy")
public interface Zestawy {
  
  @GET
  @Path("podajzestaw/{id}")
  Response podajZestaw(@PathParam("id") int id);
  
}
