package pl.lait.Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.PageObjects.*;
import pl.lait.Setup.Init;

public class ReservationTest  extends Init{

	protected static WebDriver driver;
	
	@Before
	public void run(){
	driver = getDriver();
	}
	
	@Test
	public void reservation(){
		
		MainPage mainPage = new MainPage();
		SignOnPage signOnPage = new SignOnPage();
		ReservationPage reservationPage = new ReservationPage();
		
		
		// przechodzimy w głównym menu do strony SIGN-ON
		mainPage.link_signOn(driver).click();
		// logujemy się na naszym koncie istniejącym Ewelina/hasło:Ewelina
		signOnPage.loginAs("Ewelina", "Ewelina", driver);
		// wypełniamy pierwszą stronę rezerwacji
		
		reservationPage.radio_oneWay(driver).click(); //metoda oneWay zwraca element który mozemy kliknąć
		reservationPage.selectPassengersCount(driver, "2");
		reservationPage.selectPassengersCount(driver).selectByVisibleText("3");
		
		reservationPage.selectFromPort(driver, "Frankfurt");
		reservationPage.selectFromMonth(driver, "July");
		reservationPage.selectFromDay(driver, "18");
		
		reservationPage.selectToPort(driver, "Paris");
		reservationPage.selectToMonth(driver, "July");
		reservationPage.selectToDay(driver, "18");
	}
}
