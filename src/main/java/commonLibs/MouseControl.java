package commonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseControl {
	
	private Actions action;
	
	public MouseControl(WebDriver driver) {
		 action = new Actions(driver);
	}
	
	public void dragAndDrop(WebElement source, WebElement destination) {
		
		action.dragAndDrop(source, destination).build().perform();
		
	}
	
	public void moveToElement(WebElement element) {
		
		action.moveToElement(element).build().perform();
		
	}

}
