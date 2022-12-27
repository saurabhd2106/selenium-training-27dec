package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryPage extends BasePage {

	@FindBy(css = ".demo-frame")
	public WebElement frame;

	@FindBy(id = "draggable")
	public WebElement source;

	@FindBy(id = "droppable")
	public WebElement destination;

	public JQueryPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void dragAndDrop() {
		
		frameControl.switchToFrame(frame);
		
		mouseControl.dragAndDrop(source, destination);

	}

}
