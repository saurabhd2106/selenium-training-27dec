package com.guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.ElementControl;

public class LoginPage extends BasePage {

	// Define webelements using @FindBy annotations

	@FindBy(name = "uid")
	private WebElement usernameField;

	@FindBy(name = "password")
	private WebElement passwordField;

	@FindBy(name = "btnLogin")
	private WebElement loginButton;

	// Initalize the web elements

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Write the logic

	public void loginToApplication(String user, String pass) {

		elementControl.type(usernameField, user);

		elementControl.type(passwordField, pass);

		elementControl.click(loginButton);

	}

}
