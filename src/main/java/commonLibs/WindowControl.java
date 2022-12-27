package commonLibs;

import org.openqa.selenium.WebDriver;

public class WindowControl {

	private WebDriver driver;

	public WindowControl(WebDriver driver) {

		this.driver = driver;

	}

	public void switchToChildWindow() {

		String windowHandle = driver.getWindowHandles().toArray()[1].toString();

		driver.switchTo().window(windowHandle);

	}

	public void switchToParentWindow() {

		String windowHandle = driver.getWindowHandles().toArray()[0].toString();

		driver.switchTo().window(windowHandle);

	}

	public void switchToNthWindow(int number) {

		String windowHandle = driver.getWindowHandles().toArray()[number].toString();

		driver.switchTo().window(windowHandle);

	}

}
