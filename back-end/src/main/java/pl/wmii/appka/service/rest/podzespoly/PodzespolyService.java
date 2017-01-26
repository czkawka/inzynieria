package pl.wmii.appka.service.rest.podzespoly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.wmii.appka.model.dto.*;
import pl.wmii.appka.model.entity.podzespoly.*;
import pl.wmii.appka.service.utils.EntityUtil;

import javax.persistence.EntityManager;
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
@Path("podzespoly")
public class PodzespolyService {

  private EntityManager entityManager = new EntityUtil().getEntityManager();
  private static final Logger logger = LoggerFactory.getLogger(PodzespolyService.class);

  @GET
  @Path("zasilacz")
  public Response podajZasilacze() {
    List<ZasilaczDTO> wyniki = new ArrayList<>();
    List<ZasilaczDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from ZasilaczDAO p",ZasilaczDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(ZasilaczDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("zasilacz/{id}")
  public Response podajZasilacz(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("procesor")
  public Response podajProcesory() {
    List<ProcesorDAO> wyniki = new ArrayList<ProcesorDAO>();
    List<ProcesorDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from ProcesorDAO p",ProcesorDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(ProcesorDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("procesor/{id}")
  public Response podajProcesor(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("plytaglowna")
  public Response podajPlytyGlowne() {
    List<PlytaGlownaDTO> wyniki = new ArrayList<PlytaGlownaDTO>();
    List<PlytaGlownaDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from PlytaGlownaDAO p",PlytaGlownaDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(PlytaGlownaDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("plytaglowna/{id}")
  public Response podajPlyteGlowna(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("ram")
  public Response podajRamy() {
    List<PamiecRamDTO> wyniki = new ArrayList<PamiecRamDTO>();
    List<PamiecRamDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from PamiecRamDAO p",PamiecRamDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(PamiecRamDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("ram/{id}")
  public Response podajRam(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("obudowa")
  public Response podajObudowy() {
    List<ObudowaDTO> wyniki = new ArrayList<ObudowaDTO>();
    List<ObudowaDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from ObudowaDAO p",ObudowaDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(ObudowaDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("obudowa/{id}")
  public Response podajObudowe(@PathParam("id") Long id) {
    return null;
  }
  @GET
  @Path("naped")
  public Response podajNapedy() {
    List<NapedDTO> wyniki = new ArrayList<NapedDTO>();
    List<NapedDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from NapedDAO p",NapedDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(NapedDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("naped/{id}")
  public Response podajNaped(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("kartasieciowa")
  public Response podajKartySieciowe() {
    List<KartaSieciowaDTO> wyniki = new ArrayList<>();
    List<KartaSieciowaDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from KartaSieciowaDAO p",KartaSieciowaDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(KartaSieciowaDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("kartasieciowa/{id}")
  public Response podajKarteSieciowa(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("gpu")
  public Response podajGpu() {
    List<KartaGraficznaDTO> wyniki = new ArrayList<>();
    List<KartaGraficznaDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from KartaGraficznaDAO p",KartaGraficznaDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(KartaGraficznaDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("gpu/{id}")
  public Response podajGpus(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("kartadziwiekowa")
  public Response podajKrataDziewiekowe() {
    List<KartaDzwiekowaDTO> wyniki = new ArrayList<>();
    List<KartaDzwiekowaDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from KartaDzwiekowaDAO  p",KartaDzwiekowaDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(KartaDzwiekowaDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("kartadziwiekowa/{id}")
  public Response podajKartaDzwiekowa(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("dysktwardy")
  public Response podajDyskTwardy() {
    List<DyskTwardyDTO> wyniki = new ArrayList<>();
    List<DyskTwardyDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from DyskTwardyDAO p",DyskTwardyDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(DyskTwardyDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("dysktwardy/{id}")
  public Response podajDyskTwardy(@PathParam("id") Long id) {
    return null;
  }

  @GET
  @Path("chlodzenieprocesora")
  public Response podajChlodzeniaProcesora() {
    List<ChlodzenieProcesoraDTO> wyniki = new ArrayList<>();
    List<ChlodzenieProcesoraDAO> wynikiQuery;

    try {
      wynikiQuery = entityManager.createQuery("select p from ChlodzenieProcesoraDAO p",ChlodzenieProcesoraDAO.class).getResultList();
    } catch(Exception e) {
      return Response
              .status(Response.Status.INTERNAL_SERVER_ERROR)
              .entity("Nie udalo sie wyszukac")
              .build();
    } finally {
      entityManager.close();
    }

    for(ChlodzenieProcesoraDAO dao : wynikiQuery) {
      wyniki.add(dao.podajDTO());
    }

    return Response.ok(wyniki).build();
  }

  @GET
  @Path("chlodzenieprocesora/{id}")
  public Response podajChlodzenieProcesora(@PathParam("id") Long id) {
    return null;
  }
}
