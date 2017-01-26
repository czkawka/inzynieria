package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna;

import com.gwtplatform.mvp.client.UiHandlers;

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

public interface UtworzPcUiHandlers extends UiHandlers{
	void pobierzChlodzenia(WybierczPodzespolu<ChlodzenieProcesoraDTO> wyb);

	void pobierzDyski(WybierczPodzespolu<DyskTwardyDTO> wyb);

	void pobierzKartyDzwiekowe(WybierczPodzespolu<KartaDzwiekowaDTO> wyb);

	void pobierzKartyGraficzne(WybierczPodzespolu<KartaGraficznaDTO> wyb);

	void pobierzSieciowe(WybierczPodzespolu<KartaSieciowaDTO> wyb);

	void pobierzNapedy(WybierczPodzespolu<NapedDTO> wyb);

	void pobierzRam(WybierczPodzespolu<PamiecRamDTO> wyb);

	void pobierzPlytyGlowe(WybierczPodzespolu<PlytaGlownaDTO> wyb);

	void pobierzProcesory(WybierczPodzespolu<ProcesorDTO> wyb);

	void pobierzZasilacze(WybierczPodzespolu<ZasilaczDTO> wyb);
}
