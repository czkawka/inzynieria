package pl.wmii.interfejs.client.application.utlis.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLogger {
	
	private static final Logger logger = Logger.getLogger("ApplicationLogger");
			
	public final static void debug(String wiadomosc) {
		logger.log(Level.INFO,wiadomosc);
	}
	
	public final static void error(String wiadomosc) {
		logger.log(Level.SEVERE, wiadomosc);
	}
	
	
	
}
