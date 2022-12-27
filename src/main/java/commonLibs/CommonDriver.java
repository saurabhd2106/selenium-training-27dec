package commonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonDriver {

	private WebDriver driver;

	private String currentWorkingDirectory;
	

	public CommonDriver(String browserType) {

		browserType = browserType.trim();
		
		currentWorkingDirectory = System.getProperty("user.dir");

		switch (browserType.toLowerCase()) {
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", currentWorkingDirectory + "/driver/chromedriver");

			driver = new ChromeDriver();

			break;

		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", currentWorkingDirectory + "/driver/geckodriver");

			driver = new FirefoxDriver();

			break;
		case "edge":

			System.setProperty("webdriver.edge.driver", currentWorkingDirectory + "/driver/edgedriver");
			driver = new EdgeDriver();

			break;

		default:
			break;
		}

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	}
	
	public void navigatToUrl(String url) {
		
		
		url = url.trim();
		
		driver.get(url);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void closeBrowser() {
		
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
