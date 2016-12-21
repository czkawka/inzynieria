package pl.wmii.interfejs.client.rest;

import com.gwtplatform.dispatch.rest.shared.RestAction;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Damian on 20.12.2016.
 */

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("adres")
public interface DaneService {

  @GET
  @Path("test")
  RestAction<String> test();
}
