package pl.wmii.interfejs.client.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gwtplatform.dispatch.rest.shared.RestAction;

import pl.wmii.interfejs.client.application.model.ChlodzenieProcesoraDTO;
import pl.wmii.interfejs.client.application.model.DyskTwardyDTO;
import pl.wmii.interfejs.client.application.model.KartaDzwiekowaDTO;
import pl.wmii.interfejs.client.application.model.KartaGraficznaDTO;
import pl.wmii.interfejs.client.application.model.KartaSieciowaDTO;
import pl.wmii.interfejs.client.application.model.NapedDTO;
import pl.wmii.interfejs.client.application.model.ObudowaDTO;
import pl.wmii.interfejs.client.application.model.PamiecRamDTO;
import pl.wmii.interfejs.client.application.model.PlytaGlownaDTO;
import pl.wmii.interfejs.client.application.model.ProcesorDTO;
import pl.wmii.interfejs.client.application.model.ZasilaczDTO;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("podzespoly")
public interface PodzespolyService {
	  @GET
	  @Path("zasilacz")
	  public RestAction<List<ZasilaczDTO>> podajZasilacze() ;

	  @GET
	  @Path("zasilacz/{id}")
	  public RestAction<ZasilaczDTO> podajZasilacz(@PathParam("id") Long id);

	  @GET
	  @Path("procesor")
	  public RestAction<List<ProcesorDTO>> podajProcesory();

	  @GET
	  @Path("procesor/{id}")
	  public RestAction<ProcesorDTO> podajProcesor(@PathParam("id") Long id);

	  @GET
	  @Path("plytaglowna")
	  public RestAction<List<PlytaGlownaDTO>> podajPlytyGlowne();

	  @GET
	  @Path("plytaglowna/{id}")
	  public RestAction<PlytaGlownaDTO> podajPlyteGlowna(@PathParam("id") Long id);

	  @GET
	  @Path("ram")
	  public RestAction<List<PamiecRamDTO>> podajRamy() ;

	  @GET
	  @Path("ram/{id}")
	  public RestAction<PamiecRamDTO> podajRam(@PathParam("id") Long id);

	  @GET
	  @Path("obudowa")
	  public RestAction<List<ObudowaDTO>> podajObudowy();

	  @GET
	  @Path("obudowa/{id}")
	  public RestAction<ObudowaDTO> podajObudowe(@PathParam("id") Long id);
	  
	  @GET
	  @Path("naped")
	  public RestAction<List<NapedDTO>> podajNapedy();

	  @GET
	  @Path("naped/{id}")
	  public RestAction<NapedDTO> podajNaped(@PathParam("id") Long id) ;

	  @GET
	  @Path("kartasieciowa")
	  public RestAction<List<KartaSieciowaDTO>> podajKartySieciowe();

	  @GET
	  @Path("kartasieciowa/{id}")
	  public RestAction<KartaSieciowaDTO> podajKarteSieciowa(@PathParam("id") Long id);

	  @GET
	  @Path("gpu")
	  public RestAction<List<KartaGraficznaDTO>> podajGpu();

	  @GET
	  @Path("gpu/{id}")
	  public RestAction<KartaGraficznaDTO> podajGpus(@PathParam("id") Long id);

	  @GET
	  @Path("kartadziwiekowa")
	  public RestAction<List<KartaDzwiekowaDTO>> podajKrataDziewiekowe();

	  @GET
	  @Path("kartadziwiekowa/{id}")
	  public RestAction<KartaDzwiekowaDTO> podajKartaDzwiekowa(@PathParam("id") Long id);

	  @GET
	  @Path("dysktwardy")
	  public RestAction<List<DyskTwardyDTO>> podajDyskTwardy() ;

	  @GET
	  @Path("dysktwardy/{id}")
	  public RestAction<DyskTwardyDTO> podajDyskTwardy(@PathParam("id") Long id);

	  @GET
	  @Path("chlodzenieprocesora")
	  public RestAction<List<ChlodzenieProcesoraDTO>> podajChlodzeniaProcesora();

	  @GET
	  @Path("chlodzenieprocesora/{id}")
	  public RestAction<ChlodzenieProcesoraDTO> podajChlodzenieProcesora(@PathParam("id") Long id);
}
