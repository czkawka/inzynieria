package pl.wmii.appka.service.rest.podzespoly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.service.utils.EntityUtil;

import javax.persistence.EntityManager;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Damian on 17.01.2017.
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("podzespoly")
public class PodzespolyService {

  private EntityManager entityManager = new EntityUtil().getEntityManager();
  private static final Logger logger = LoggerFactory.getLogger(PodzespolyService.class);

  @GET
  @Path("zasilacz")
  public Response podajZasilacze() {
    return null;
  }

  @GET
  @Path("zasilacz/{id}")
  public Response podajZasilacz(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("procesor")
  public Response podajProcesory() {
    return null;
  }

  @GET
  @Path("procesor/{id}")
  public Response podajProcesor(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("plytaglowna")
  public Response podajPlytyGlowne() {
    return null;
  }

  @GET
  @Path("plytaglowna/{id}")
  public Response podajPlyteGlowna(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("ram")
  public Response podajRamy() {
    return null;
  }

  @GET
  @Path("ram/{id}")
  public Response podajRam(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("obudowa")
  public Response podajObudowy() {
    return null;
  }

  @GET
  @Path("obudowa/{id}")
  public Response podajObudowe(@PathParam("id") Long id) {
    return null;
  }
  @GET
  @Path("naped")
  public Response podajNapedy() {
    return null;
  }

  @GET
  @Path("naped/{id}")
  public Response podajNaped(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("kartasieciowa")
  public Response podajKartySieciowe() {
    return null;
  }

  @GET
  @Path("kartasieciowa/{id}")
  public Response podajKarteSieciowa(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("gpu")
  public Response podajGpu() {
    return null;
  }

  @GET
  @Path("gpu/{id}")
  public Response podajGpus(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("kartadziwiekowa")
  public Response podajKrataDziewiekowe() {
    return null;
  }

  @GET
  @Path("kartadziwiekowa/{id}")
  public Response podajKartaDzwiekowa(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("dysktwardy")
  public Response podajDyskTwardy() {
    return null;
  }

  @GET
  @Path("dysktwardy/{id}")
  public Response podajDyskTwardy(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("chlodzenieprocesora")
  public Response podajChlodzeniaProcesora() {
    return null;
  }

  @GET
  @Path("chlodzenieprocesora/{id}")
  public Response podajChlodzenieProcesora(@PathParam("id") Long id) {
    return null;
  }
}
