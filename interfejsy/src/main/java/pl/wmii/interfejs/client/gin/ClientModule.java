package pl.wmii.interfejs.client.gin;



import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import pl.wmii.interfejs.client.application.ApplicationModule;
import pl.wmii.interfejs.client.place.NameTokens;



public class ClientModule extends AbstractPresenterModule{

	@Override
	protected void configure() {
		 install(new DefaultModule.Builder()
	                .defaultPlace(NameTokens.ROOT)
	                .errorPlace(NameTokens.ERROR_PLACE)
	                .unauthorizedPlace(NameTokens.ERROR_PLACE)
	                .build());
		install(new ApplicationModule());
		install(new DispatchModule());
	}

}
