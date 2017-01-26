package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna;

import java.util.List;

import com.google.gwt.http.client.Response;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rest.client.RestCallback;
import com.gwtplatform.dispatch.rest.client.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import pl.wmii.interfejs.client.application.ApplicationPresenter;
import pl.wmii.interfejs.client.application.model.ChlodzenieProcesoraDTO;
import pl.wmii.interfejs.client.application.model.DyskTwardyDTO;
import pl.wmii.interfejs.client.application.model.KartaDzwiekowaDTO;
import pl.wmii.interfejs.client.application.model.KartaGraficznaDTO;
import pl.wmii.interfejs.client.application.model.KartaSieciowaDTO;
import pl.wmii.interfejs.client.application.model.NapedDTO;
import pl.wmii.interfejs.client.application.model.PamiecRamDTO;
import pl.wmii.interfejs.client.application.model.PlytaGlownaDTO;
import pl.wmii.interfejs.client.application.model.ProcesorDTO;
import pl.wmii.interfejs.client.application.model.ZasilaczDTO;
import pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget.wybieracz.WybierczPodzespolu;
import pl.wmii.interfejs.client.place.NameTokens;
import pl.wmii.interfejs.client.rest.PodzespolyService;

public class UtworzPcPresneter extends Presenter<UtworzPcPresneter.MyView, UtworzPcPresneter.MyProxy>
		implements UtworzPcUiHandlers {

	public interface MyView extends View, HasUiHandlers<UtworzPcUiHandlers> {
		void initView();
	}

	@ProxyStandard
	@NameToken(NameTokens.UTWORZ_PC)
	public interface MyProxy extends ProxyPlace<UtworzPcPresneter> {

	}

	@Inject
	public UtworzPcPresneter(EventBus eventBus, MyView view, MyProxy proxy, RestDispatch restDispatch,
			PodzespolyService podzespolyService) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
		getView().setUiHandlers(this);
		this.podzespolyService = podzespolyService;
		this.restDispatch = restDispatch;
	}

	private RestDispatch restDispatch;

	private PodzespolyService podzespolyService;

	@Override
	protected void onReveal() {
		super.onReveal();
		getView().initView();
	}

	@Override
	public void pobierzChlodzenia(final WybierczPodzespolu<ChlodzenieProcesoraDTO> wyb) {
		restDispatch.execute(podzespolyService.podajChlodzeniaProcesora(),
				new RestCallback<List<ChlodzenieProcesoraDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<ChlodzenieProcesoraDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});

	}

	@Override
	public void pobierzDyski(final WybierczPodzespolu<DyskTwardyDTO> wyb) {
		restDispatch.execute(podzespolyService.podajDyskTwardy(),
				new RestCallback<List<DyskTwardyDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<DyskTwardyDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzKartyDzwiekowe(final WybierczPodzespolu<KartaDzwiekowaDTO> wyb) {
		restDispatch.execute(podzespolyService.podajKrataDziewiekowe(),
				new RestCallback<List<KartaDzwiekowaDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<KartaDzwiekowaDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzKartyGraficzne(final WybierczPodzespolu<KartaGraficznaDTO> wyb) {
		restDispatch.execute(podzespolyService.podajGpu(),
				new RestCallback<List<KartaGraficznaDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<KartaGraficznaDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzSieciowe(final WybierczPodzespolu<KartaSieciowaDTO> wyb) {
		restDispatch.execute(podzespolyService.podajKartySieciowe(),
				new RestCallback<List<KartaSieciowaDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<KartaSieciowaDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzNapedy(final WybierczPodzespolu<NapedDTO> wyb) {
		restDispatch.execute(podzespolyService.podajNapedy(),
				new RestCallback<List<NapedDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<NapedDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzRam(final WybierczPodzespolu<PamiecRamDTO> wyb) {
		restDispatch.execute(podzespolyService.podajRamy(),
				new RestCallback<List<PamiecRamDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<PamiecRamDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzPlytyGlowe(final WybierczPodzespolu<PlytaGlownaDTO> wyb) {
		restDispatch.execute(podzespolyService.podajPlytyGlowne(),
				new RestCallback<List<PlytaGlownaDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<PlytaGlownaDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzProcesory(final WybierczPodzespolu<ProcesorDTO> wyb) {
		restDispatch.execute(podzespolyService.podajProcesory(),
				new RestCallback<List<ProcesorDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<ProcesorDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

	@Override
	public void pobierzZasilacze(final WybierczPodzespolu<ZasilaczDTO> wyb) {
		restDispatch.execute(podzespolyService.podajZasilacze(),
				new RestCallback<List<ZasilaczDTO>>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(List<ZasilaczDTO> result) {
						wyb.setData(result);
					}

					@Override
					public void setResponse(Response response) {
					}
				});
	}

}
