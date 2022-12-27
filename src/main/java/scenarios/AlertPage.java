package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage extends BasePage {

	@FindBy(id = "NormalAlert")
	public WebElement normalAlertButton;

	public AlertPage(WebDriver driver) {

		super(driver);
		
		PageFactory.initElements(driver, this);

	}

	public void clickHereButton() {
		elementControl.click(normalAlertButton);
	}

	public void acceptAlert() {

		alertControl.acceptAlert();
	}

	public String getTextMessage() {
		return alertControl.getMessageFromAlert();
	}

}
