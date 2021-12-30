package utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
	


	 
		static Properties config;
		public GetProperties() {
			config =new Properties();
			FileInputStream fis;
			try {
				fis = new FileInputStream("C:\\Users\\maddy\\eclipse-workspace\\E2E\\src\\main\\resources\\configure.properties");
			try {
				config.load(fis);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}}catch (IOException e) {
				e.printStackTrace();
			}
		}
		public String getDriverPath() {
			String driver = config.getProperty("driver");
			if(driver!=null) {
				return driver;
			}
			else
				throw new RuntimeException("CD Not specified");
		}
		public String getUrl() {
			String url = config.getProperty("url");
			if(url!=null) {
				return url;
			}
			else
				throw new RuntimeException("URL Not specified");
		}
		public String getItem() {
			String item_name = config.getProperty("item_name");
			if(item_name!=null) {
				return item_name;
			}
			else
				throw new RuntimeException("URL Not specified");
		}
		public String grtExtentReportPath() {
			String ExtentReportPath = config.getProperty("ExtentReportPath");
			if(ExtentReportPath!=null) {
				return ExtentReportPath;
			}
			else
				throw new RuntimeException("ExtentReportPath Not specified");
		}
	}


