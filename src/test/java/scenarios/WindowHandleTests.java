package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonLibs.CommonDriver;

public class WindowHandleTests {
	
	WindowHandle windowHandlePage;
	
	@Test
	public void windowHandle() {
		
		
		CommonDriver cmnDriver = new CommonDriver("chrome");
		
		cmnDriver.navigatToUrl("https://test.qatechhub.com/window-handling/");
		
		windowHandlePage = new WindowHandle(cmnDriver.getDriver());
		
		windowHandlePage.switchToNewTab();
		
		String actualTitle = cmnDriver.getTitle();
		
		String expectedTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		cmnDriver.closeBrowser();
		
		windowHandlePage.switchToParentTab();
		
		String actualChildTitle = cmnDriver.getTitle();
		
		String expectedChildTitle = "Window Handling";
		
		Assert.assertEquals(actualChildTitle, expectedChildTitle);
		
		cmnDriver.quitBrowser();
	}

}
