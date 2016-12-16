package pl.wmii.appka.service.rest.uzytkownik;


import org.hibernate.QueryException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.model.dto.UzytkownikDTO;
import pl.wmii.appka.model.entity.UzytkownikDAO;
import pl.wmii.appka.service.utils.BazoweKryteria;
import pl.wmii.appka.service.utils.EntityUtil;
import pl.wmii.appka.service.utils.WynikWyszukiwania;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damian on 14.12.2016.
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("uzytkownik")
public class UzytkownicyService {

  private static final Logger logger = LoggerFactory.getLogger(UzytkownicyService.class);
  EntityManager entityManager = new EntityUtil().getEntityManager();

  protected UzytkownikDAO podajUzytkownikaImpl(Long id) {
    UzytkownikDAO uzytkownikDAO;

    try {
      uzytkownikDAO = entityManager.find(UzytkownikDAO.class, id);
    } catch(Exception e) {
      logger.debug("Nie udalo sie wyszukac uzytkownika id = " + id + " " + e);
      throw new QueryException(e);
    } finally {
      entityManager.close();
    }
    return uzytkownikDAO;
  }

  @GET
  @Path("uzytkownikow")
  public Response podajUzytkownikow() {

    List<UzytkownikDAO> uzytkownikDAOList;
    List<UzytkownikDTO> uzytkownikDTOList = new ArrayList<UzytkownikDTO>();
    logger.debug("Pobieram liste uzytkownikow");

    try {
      Query query = entityManager.createQuery("",UzytkownikDAO.class);
      uzytkownikDAOList = query.getResultList();
    } catch(Exception e) {

      logger.debug("Nie udało się pobrac listy użytkowników  " + e);
      return Response.status(Status.INTERNAL_SERVER_ERROR).
              entity("Nie udało się pobrać listy użytkownikow").build();
    } finally {
      entityManager.close();
    }

    for(UzytkownikDAO u : uzytkownikDAOList) {
      uzytkownikDTOList.add(u.podajDTO());
    }

    return Response.ok(new WynikWyszukiwania<UzytkownikDTO>(uzytkownikDTOList)).build();
  }

  @GET
  @Path("uzytkownik/{id}")
  public Response podajUzytkownika(@PathParam("id") Long id){

    logger.debug("Pobieranie uzytkownika o id = " + id);
    return Response.ok(podajUzytkownikaImpl(id).podajDTO()).build();
  }

  @POST
  @Path("dodajuzytkownik")
  public Response dodajUzytkownika(){
    return null;
  }

  @PUT
  @Path("edytujuzytkownika/{id}")
  public Response edytujUzytkownika(@PathParam("id") Long id){
    return null;
  }

  @DELETE
  @Path("usunuzytkownika/{id}")
  public Response usunUzytkownika(@PathParam("id") Long id){

    entityManager.remove(podajUzytkownika(id));
    return Response.ok().build();
  }

  @GET
  @Path("wyszukajuzytkownikow")
  public Response wyszukajUzytkownikow(BazoweKryteria kryteria) {
    return null;
  }

}
