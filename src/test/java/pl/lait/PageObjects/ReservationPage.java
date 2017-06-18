package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {
	
	static String oneWay_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
	//po skopiowaniu adresu z xpatha usunąć wszystkie "x:" !!!!

	static String passCount_name = "passCount";
	static String fromPort_name = "fromPort";
	static String fromMonth_name = "fromMonth";
	static String fromDay_name = "fromDay";
	static String toPort_name = "toPort";
	static String toMonth_name = "toMonth";
	static String toDay_name = "toDay";
	
	static String servClass_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input[2]";
	
	public WebElement radio_oneWay(WebDriver driver){
		return driver.findElement(By.xpath(oneWay_xpath));
	}
	
	public Select selectPassengersCount(WebDriver driver){
		Select passengers = new Select(driver.findElement(By.name(passCount_name)));
		return passengers;
	}

	public void selectPassengersCount(WebDriver driver, String visibleText){
		Select passengers = new Select(driver.findElement(By.name(passCount_name)));
		passengers.selectByVisibleText(visibleText);
	}
	
	
	public void selectFromPort(WebDriver driver, String visibleText){
		Select fromPort = new Select(driver.findElement(By.name(fromPort_name)));
		fromPort.selectByVisibleText(visibleText);
	}
	
	public void selectFromMonth(WebDriver driver, String visibleText){
		Select fromMonth = new Select(driver.findElement(By.name(fromMonth_name)));
		fromMonth.selectByVisibleText(visibleText);
	}
	
	public void selectFromDay(WebDriver driver, String visibleText){
		Select fromDay = new Select(driver.findElement(By.name(fromDay_name)));
		fromDay.selectByVisibleText(visibleText);
	}
	
	public void selectToPort(WebDriver driver, String visibleText){
		Select toPort = new Select(driver.findElement(By.name(toPort_name)));
		toPort.selectByVisibleText(visibleText);
	}
	
	public void selectToMonth(WebDriver driver, String visibleText){
		Select toMonth = new Select(driver.findElement(By.name(toMonth_name)));
		toMonth.selectByVisibleText(visibleText);
	}
	
	public void selectToDay(WebDriver driver, String visibleText){
		Select toDay = new Select(driver.findElement(By.name(toDay_name)));
		toDay.selectByVisibleText(visibleText);
	}
	
	public WebElement radio_First(WebDriver driver){}
		
	}
}
