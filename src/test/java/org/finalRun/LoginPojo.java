package org.finalRun;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {

		PageFactory.initElements(driver, this);
	}

	// webelement txtemail=driver.findElement(By.id("mail"));
	@CacheLookup
	@FindBy(id = "email")
	private WebElement txtEmail;

	@CacheLookup
	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
