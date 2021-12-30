package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	



		private static Logger Log = Logger.getLogger(Log.class.getName());
		public void config() {
			PropertyConfigurator.configure("C:\\Users\\maddy\\eclipse-workspace\\E2E\\src\\main\\resources\\log4j.properties");
		}
		public static void info(String message) {
			Log.info(message);
		}

		public static void warn(String message) {
			Log.warn(message);
		}

		public static void error(String message) {
			Log.error(message);
		}

		public static void fatal(String message) {
			Log.fatal(message);
		}

		public static void debug(String message) {
			Log.debug(message);
		}
	}


