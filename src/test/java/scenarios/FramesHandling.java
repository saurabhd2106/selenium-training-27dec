package scenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import commonLibs.CommonDriver;

public class FramesHandling {
	
	JQueryPage jQueryPage;
	
	@Test
	public void switchToFrameAndDragNDrop() {
		
		
		CommonDriver cmnDriver = new CommonDriver("chrome");
		
		WebDriver driver = cmnDriver.getDriver();
		
		jQueryPage = new JQueryPage(driver);
		
		cmnDriver.navigatToUrl("https://jqueryui.com/droppable/");
		
		jQueryPage.dragAndDrop();
		
	}

}
