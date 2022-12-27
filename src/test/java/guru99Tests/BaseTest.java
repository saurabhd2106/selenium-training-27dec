package guru99Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.guru99.LoginPage;

import commonLibs.CommonDriver;

public class BaseTest {
	
	CommonDriver cmnDriver;

	WebDriver driver;

	LoginPage loginPage;

	@BeforeMethod
	public void Setup() {

		cmnDriver = new CommonDriver("chrome");

		cmnDriver.navigatToUrl("http://demo.guru99.com/v4");

		driver = cmnDriver.getDriver();

		loginPage = new LoginPage(driver);

	}

	@AfterMethod
	public void cleanup() {

		cmnDriver.quitBrowser();
	}

}
