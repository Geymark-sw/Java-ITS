package calcolatrice;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Calcolatrice {
	
	// Creo un logger
		private static Logger logger = Logger.getLogger(Calcolatrice.class.getName());

		static {
			logger.setUseParentHandlers(false);
			logger.setLevel(Level.INFO); // Set the log level
			ConsoleHandler handler = new ConsoleHandler();
			handler.setLevel(Level.FINEST); // Set handler log level
			logger.addHandler(handler);
		}
	
	public Calcolatrice() {
		
	}
	
	public float somma(float a, float b) {
		
		float r = a + b;
		logger.info("Somma eseguita");
		return r;
		
	}
	
	public float sottrazione(float a, float b) {
		float r = a - b;
		logger.info("Sottrazione eseguita");
		return r;
		
	}
	
	public float divisione(float a, float b) {
		
		if(b != 0) {
			float r = a / b;
			logger.info("Divisione eseguita");
			return r;
		}else {
			logger.severe("Errore, impossibile dividere per 0");
			return 0;
		}
	}

	
	public float moltiplicazione(float a, float b) {
		float r = a * b;
		logger.info("Moltiplicazione eseguita");
		return r;
		
	}
}
