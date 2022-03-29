package org.finalRun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class frgtPassPojo extends BaseClass{

	public frgtPassPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement frgtPassBtn;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement txtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;

	public WebElement getFrgtPassBtn() {
		return frgtPassBtn;
	}

	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
	
	
	
}
