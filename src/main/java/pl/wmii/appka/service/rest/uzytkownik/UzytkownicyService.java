package pl.wmii.appka.service.rest.uzytkownik;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Damian on 14.12.2016.
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("uzytkownik")
public class UzytkownicyService {

  @GET
  @Path("uzytkownik")
  public Response podajUzytkownikow() {
    return null;
  }

  @GET
  @Path("uzytkownik/{id}")
  public Response podajUzytkownika(@PathParam("id") Long id){
    return null;
  }

  @POST
  @Path("dodajuzytkownik")
  public Response dodajUzytkownika(){
    return null;
  }

  @DELETE
  @Path("usunuzytkownika/{id}")
  public Response usunUzytkownika(@PathParam("id") Long id){
    return null;
  }

  @PUT
  @Path("edytujuzytkownika/{id}")
  public Response edytujUzytkownika(@PathParam("id") Long id){
    return null;
  }

}
