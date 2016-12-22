package pl.wmii.interfejs.client.gin;



import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import pl.wmii.interfejs.client.application.ApplicationModule;
import pl.wmii.interfejs.client.place.NameTokens;



public class ClientModule extends AbstractPresenterModule{

	@Override
	protected void configure() {
		 install(new DefaultModule.Builder()
	                .defaultPlace(NameTokens.HOME)
	                .errorPlace(NameTokens.HOME)
	                .unauthorizedPlace(NameTokens.HOME)
	                .build());
		//install(new RestDispatchAsyncModule());
		install(new ApplicationModule());
		
		install(new DispatchModule());
	}

}
