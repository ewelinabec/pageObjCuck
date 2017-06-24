package pl.lait.Setup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	
	// static FirefoxDriver driver; -wersja poprzednia
	static WebDriver driver;
	
	public static WebDriver getDriver(){
	
	if(driver == null){
		
		URL hubURL = null;
		
		try {
			//po uruchomieniu huba u noda (java-jar seleniuserver...) ustawiamy jego adres IP (localhost)
		hubURL = new URL ("http://192.168.0.113:4444/wd/hub/"); //zamiast localhost dajemy ip zeby zawsze znaleźć
		} catch (MalformedURLException e) {
			//: TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// zmieniamy fireFoxDriver na WebDriver więc trzeba też podać jakiej przeglądarki oczekujemy
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		//wyłączamy stary sposób i wskazujemy nowy - podajac w parametrach
		//driver = new FirefoxDriver();
		driver = new RemoteWebDriver(hubURL, cap);
		
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}else{
		return driver;
	}
}

	public static void close(){
		driver.close();
		driver.quit();
		driver = null;
	}
	
	@After
	public void cleanUp(){
		close();
	}
	

}
