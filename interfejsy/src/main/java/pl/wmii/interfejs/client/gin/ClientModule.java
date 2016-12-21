package pl.wmii.interfejs.client.gin;



import com.gwtplatform.dispatch.rest.client.gin.RestDispatchAsyncModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import pl.wmii.interfejs.client.application.ApplicationModule;
import pl.wmii.interfejs.client.place.NameTokens;



public class ClientModule extends AbstractPresenterModule{

	@Override
	protected void configure() {
		 install(new DefaultModule.Builder()
	                .defaultPlace(NameTokens.FORM)
	                .errorPlace(NameTokens.FORM)
	                .unauthorizedPlace(NameTokens.FORM)
	                .build());
		//install(new RestDispatchAsyncModule());
		install(new ApplicationModule());
		
		install(new DispatchModule());
	}

}
