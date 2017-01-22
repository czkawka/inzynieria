package pl.wmii.appka.service.rest.peryferia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.model.dto.KlawiaturaDTO;
import pl.wmii.appka.model.dto.MonitorDTO;
import pl.wmii.appka.model.dto.MyszkaDTO;
import pl.wmii.appka.model.entity.peryferia.KlawiaturaDAO;
import pl.wmii.appka.model.entity.peryferia.MonitorDAO;
import pl.wmii.appka.model.entity.peryferia.MyszkaDAO;
import pl.wmii.appka.service.utils.EntityUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damian on 17.01.2017.
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("peryferia")
public class PeryferiaService {

  private EntityManager entityManager = new EntityUtil().getEntityManager();
  private static final Logger logger = LoggerFactory.getLogger(PeryferiaService.class);

  @GET
  @Path("klawiatura")
  public Response podajKlawiatury() {
    List<KlawiaturaDAO> wynikQuery;

    try{
      Query query = entityManager.createQuery("SELECT k FROM KlawiaturaDAO k");
      wynikQuery = query.getResultList();
    } catch(Exception ex ) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udało się pobrać")
              .build();
    } finally {
      entityManager.close();
    }

    List<KlawiaturaDTO> wynik = new ArrayList<>();

    for(KlawiaturaDAO k : wynikQuery) {
      wynik.add(k.podajDTO());
    }

    return Response.ok(wynik).build();
  }

  @GET
  @Path("klawiatura/{id}")
  public Response podajKlawiature(@PathParam("id") Long id) {
    KlawiaturaDTO wynik;

    try{
      KlawiaturaDAO wynikQuery = entityManager.find(KlawiaturaDAO.class,id);
      wynik = wynikQuery.podajDTO();
    } catch(Exception ex) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udało się znaleźć")
              .build();
    } finally {
      entityManager.close();
    }

    return Response.ok(wynik).build();
  }


  @GET
  @Path("myszka")
  public Response podajMyszki() {
    List<MyszkaDAO> wynikQuery;

    try{
      Query query = entityManager.createQuery("SELECT m FROM MyszkaDAO m");
      wynikQuery = query.getResultList();
    } catch(Exception ex ) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udało się pobrać")
              .build();
    } finally {
      entityManager.close();
    }

    List<MyszkaDTO> wynik = new ArrayList<>();

    for(MyszkaDAO k : wynikQuery) {
      wynik.add(k.podajDTO());
    }

    return Response.ok(wynik).build();
  }

  @GET
  @Path("myszka/{id}")
  public Response podajMyszke(@PathParam("id") Long id) {
    MyszkaDTO wynik;

    try{
      MyszkaDAO wynikQuery = entityManager.find(MyszkaDAO.class, id);
      wynik = wynikQuery.podajDTO();
    } catch(Exception ex) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udało się znaleźć")
              .build();
    } finally {
      entityManager.close();
    }

    return Response.ok(wynik).build();
  }


  @GET
  @Path("monitor")
  public Response podajMonitory() {

    List<MonitorDAO> wynikQuery;

    try{
      wynikQuery = entityManager.createQuery("SELECT k FROM MonitorDAO k").getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("")
              .build();
    } finally {
     entityManager.close();
    }

    List<MonitorDTO> wyniki = new ArrayList<>();

    for(MonitorDAO m : wynikQuery) {
      wyniki.add(m.podajDTO());
    }

    return Response.ok().build();
  }

  @GET
  @Path("monitor/{id}")
  public Response podajMonitor(@PathParam("id") Long id){

    MonitorDTO wynik;

    try{
      wynik = entityManager.find(MonitorDAO.class, id).podajDTO();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("yyyyyy")
              .build();
    }


    return Response.ok(wynik).build();
  }

}
