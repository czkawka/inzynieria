package pl.wmii.interfejs.client.rest;

import com.gwtplatform.dispatch.rest.shared.RestAction;

import pl.wmii.interfejs.client.application.model.KomputerDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Damian on 20.12.2016.
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("test")
public interface DaneService {

	@GET
	@Path("connectiontest")
	RestAction<String> connectionTest();
	
	@POST
	@Path("zapiszZestaw")
	RestAction<String> zapiszZestaw(KomputerDTO komputer);
	
}
