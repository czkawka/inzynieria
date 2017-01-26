package pl.wmii.appka.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Damian on 25.01.2017.
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("test")
public class ConnnectionTestService {

  @GET
  @Path("connectiontest")
  public Response connectionTest() {
    return Response.ok(new String("Superrrr")).build();
  }
}
