package scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import commonLibs.CommonDriver;

public class AlertTest {
	
	AlertPage alertPage;
	
	@Test
	public void verifyAlert() {
		CommonDriver cmnDriver = new CommonDriver("chrome");
		
		cmnDriver.navigatToUrl("https://test.qatechhub.com/alert-handling/");
		
		alertPage = new AlertPage(cmnDriver.getDriver());
		
		alertPage.clickHereButton();
		
		System.out.println(alertPage.getTextMessage());
		
		alertPage.acceptAlert();
		
		cmnDriver.quitBrowser();
		
	}

}
