package pl.lait.Setup;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Init {
	
	static FirefoxDriver driver;
	
	public static FirefoxDriver getDriver(){
	
	if(driver == null){
		driver = new FirefoxDriver();
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
