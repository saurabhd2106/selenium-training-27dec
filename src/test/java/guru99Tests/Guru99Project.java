package guru99Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Guru99Project extends BaseTest {

	@Test(priority = 0)
	public void login() {

		loginPage.loginToApplication("mngr465136", "EpybYzU");

	}

	@Test(priority = 1000)
	public void addCustomer() {

		// login

		loginPage.loginToApplication("mngr465136", "EpybYzU");

		// Add Customer

		driver.findElement(By.linkText("New Customer")).click();

		String randomEmail = "abc" + System.currentTimeMillis() + "@gm.com";

		randomEmail = String.format("abc%d@gmail.com", System.currentTimeMillis());

		System.out.println(randomEmail);

		String customerId;

		customerId = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();

		System.out.println(customerId);

		WebElement accountsDropdown = driver.findElement(By.name("selaccount"));

		Select select = new Select(accountsDropdown);

		select.selectByVisibleText("Current");

		driver.quit();
	}

	@Test(priority = -1000)
	public void randomEmailGenerator() {

		String randomEmail = "abc" + System.currentTimeMillis() + "@gm.com";

		randomEmail = String.format("abc%d@gmail.com", System.currentTimeMillis());

		System.out.println(randomEmail);

	}

}
