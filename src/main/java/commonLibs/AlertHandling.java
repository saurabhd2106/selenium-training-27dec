package commonLibs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandling {

	private WebDriver driver;

	public AlertHandling(WebDriver driver) {

		this.driver = driver;

	}

	public void acceptAlert() {

		Alert alert = driver.switchTo().alert();

		alert.accept();

	}

	public void dismissAlert() {

		Alert alert = driver.switchTo().alert();

		alert.dismiss();

	}

	public String getMessageFromAlert() {
		Alert alert = driver.switchTo().alert();

		return alert.getText();
	}

}
