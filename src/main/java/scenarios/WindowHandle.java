package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandle extends BasePage {

	public WindowHandle(WebDriver driver) {
		
		
		super(driver);
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Click Here")
	public WebElement clickHereButton;

	public void switchToNewTab() {

		elementControl.click(clickHereButton);

		windowControl.switchToChildWindow();

	}
	
	public void switchToParentTab() {
		windowControl.switchToParentWindow();
	}

}
