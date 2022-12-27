package commonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameControl {
	
	private WebDriver driver;
	
	public FrameControl(WebDriver driver) {
		
		this.driver = driver;
		
	}

	public void switchToFrame(WebElement element) {
		
		driver.switchTo().frame(element);

	}

	public void switchToFrame(String idOrName) {
		
		driver.switchTo().frame(idOrName);

	}
	
	public void switchContent() {
		driver.switchTo().defaultContent();
	}
}
