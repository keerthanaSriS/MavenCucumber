package org.stepdefinition;

import org.finalRun.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void bfrScene() {
		System.out.println("bfr sce");
		chromeBrowser();
		maxWindow();
		applyImplicitWait();
	}

	@Before(order = 2)
	public void bfr2() {
		System.out.println("bfr 2");
	}

	@Before(order = 1)
	public void bfr1() {
		System.out.println("bfr 1");
	}

	@After
	public void afrSce(Scenario s) {
		
		if (s.isFailed()) {
		
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			
			s.embed(screen, "image/png");
			
			
		}
		
		closeBrowser();
		System.out.println("afr sce");
	}

	@After(order = 1)
	public void afr1() {
		System.out.println("after1");
	}

	@After(order = 2)
	public void afr2() {
		System.out.println("after2");
	}

}
