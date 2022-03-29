package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.finalRun.BaseClass;
import org.finalRun.LoginPojo;
import org.finalRun.frgtPassPojo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion extends BaseClass {

	LoginPojo l;
	frgtPassPojo f;

	@When("User have to enter invalid email and valid password")
	public void user_have_to_enter_invalid_email_and_valid_password(io.cucumber.datatable.DataTable d) {
		// 1-D --- map
		Map<String, String> map = d.asMap(String.class, String.class);
		String username = map.get("email");
		String password1 = map.get("password");

		LoginPojo l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillText(user, username);

		WebElement password = l.getTxtPass();
		fillText(password, password1);
	}

	@When("User have to enter valid emailadd and valid password")
	public void user_have_to_enter_valid_emailadd_and_valid_password(io.cucumber.datatable.DataTable d1) {
		// 2--D map

		List<Map<String, String>> asmaps = d1.asMaps();
		String username = asmaps.get(1).get("Email");
		String password1 = asmaps.get(0).get("Password");
	
		LoginPojo l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillText(user, username);

		WebElement password = l.getTxtPass();
		fillText(password, password1);
	}

	@When("User have to enter <{string}> and <{string}>")
	public void user_have_to_enter_and(String username, String password) {
		LoginPojo l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillText(user, username);

		WebElement password1 = l.getTxtPass();
		fillText(password1, password);
	}

	@Given("User have to enter facebook through chrome Browser")
	public void user_have_to_enter_facebook_through_chrome_Browser() {

		launchUrl("https://www.facebook.com/");

	}

	@Given("user have to click forgot password")
	public void user_have_to_click_forgot_password() {
		f = new frgtPassPojo();
		WebElement btnFrgt = f.getFrgtPassBtn();
		btnClick(btnFrgt);
	}

	@When("user have to enter email or phone number")
	public void user_have_to_enter_email_or_phone_number() {
		WebElement phNo = f.getTxtBox();
		fillText(phNo, "98765434567");
	}

	@Then("user have to show credentials page")
	public void user_have_to_show_credentials_page() {

		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.contains("privacy_mutation_token")) {
			System.out.println("user enter credentials pages");
		} else {

			System.out.println("user doesn't enter credentials pages");
		}
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		WebElement button = l.getBtnLogin();
		btnClick(button);
		Thread.sleep(2000);

	}

}
