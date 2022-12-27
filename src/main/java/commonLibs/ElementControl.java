package commonLibs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementControl {
	
	public void click(WebElement element) {
		
		element.click();
		
	}
	
	public void type(WebElement element, String text) {
		
		element.sendKeys(text);
	}
	
	public void clear(WebElement element) {
		
		element.clear();
		
	}
	
	public void selectViaVisibleText(WebElement element, String text) {
		
		Select select = new Select(element);
		
		select.selectByVisibleText(text);
		
	}
	
	public String getText(WebElement element) {
		return element.getText();
				
	}

}
