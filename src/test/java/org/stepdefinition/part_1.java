package org.stepdefinition;

import org.POJO.part_1POJO;
import org.base.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class part_1 extends BaseClass {

	part_1POJO p;

	@When("To lanch the URL of the application")
	public void to_lanch_the_URL_of_the_application() {
		lanchBrowser();
		lanchUrl("https://scentarts.ae/");
		windowMaximize();
	}

	@When("click the “About Us” button")
	public void click_the_About_Us_button() throws InterruptedException {
		p = new part_1POJO();
		Thread.sleep(3000);
		clickBtn(p.getAboutus());
	}

	@When("scroll down and see the Download Brochure \\(English)")
	public void scroll_down_and_see_the_Download_Brochure_English() throws InterruptedException {
		p = new part_1POJO();
		Thread.sleep(5000);
		scroll(p.getScrollDown());
	}

	@Then("check the Brochure is downloaded")
	public void check_the_Brochure_is_downloaded() throws InterruptedException {
		p = new part_1POJO();
		Thread.sleep(3000);
		clickBtn(p.getDownload_Brochure());
		Thread.sleep(5000);
		driver.navigate().back();
	}

}
