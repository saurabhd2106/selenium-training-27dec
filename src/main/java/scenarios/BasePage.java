package scenarios;

import org.openqa.selenium.WebDriver;

import commonLibs.AlertHandling;
import commonLibs.ElementControl;
import commonLibs.FrameControl;
import commonLibs.MouseControl;
import commonLibs.WindowControl;

public class BasePage {
	
	ElementControl elementControl;
	
	MouseControl mouseControl;
	
	FrameControl frameControl;
	
	WindowControl windowControl;
	
	AlertHandling alertControl;
	
	public BasePage(WebDriver driver) {
		
		elementControl = new ElementControl();
		
		mouseControl = new MouseControl(driver);
		
		frameControl = new FrameControl(driver);
		
		windowControl =new WindowControl(driver);
		
		alertControl = new AlertHandling(driver);
	}

}
