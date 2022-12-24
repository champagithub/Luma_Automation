package luma.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasepageClass {
	 public static WebDriver driver;
	 public static Properties prop;
	 public static Logger log;
	 
	 public BasepageClass()  {
		log = Logger.getLogger("Test Lead Champa Nandi");
		PropertyConfigurator.configure("Log4j.properties");
	    prop = new Properties();
	    FileInputStream fl;
		try {
			fl = new FileInputStream("./src/main/java/luma/ny/config/Config.properties");
			 prop.load(fl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			log.info(e.getMessage());
			//e.printStackTrace(e.getMessage());
		}
	finally{
		System.out.println("config file is founding");
	}
	
	 }
	public static void startAutomation() {
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			log.info("Start Automation in Chrome browser");
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		 else if (browserName.equalsIgnoreCase("edge")) {
				log.info("Start Automation in edge Browser");
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		 }
			/*
			 * else if (browserName.equalsIgnoreCase("FireFox")) {
			 * WebDriverManager.firefoxdriver(); driver=new FireFoxDriver(); }
			 */
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		// driver.get("https://magento.softwaretestingboard.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("URL"));
	}

}
