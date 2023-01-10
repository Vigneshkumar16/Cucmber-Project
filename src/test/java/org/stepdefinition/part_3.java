package org.stepdefinition;

import org.POJO.part_3POJO;
import org.base.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class part_3 extends BaseClass{
	
	part_3POJO p;
	@When("click the “Products” button.")
	public void click_the_Products_button() throws InterruptedException {
		p = new part_3POJO();
		Thread.sleep(3000);
		clickBtn(p.getHome());
		Thread.sleep(3000);
		clickBtn(p.getProducts());
	}

	@Then("mouse hover the “Products” button and clicks the Car Diffusers")
	public void mouse_hover_the_Products_button_and_clicks_the_Car_Diffusers() throws InterruptedException {
		p = new part_3POJO();
		Thread.sleep(3000);
		moveTheCursor(p.getProducts());
		Thread.sleep(3000);
		moveTheCursor(p.getCar_Diffusers());
		Thread.sleep(3000);
		clickBtn(p.getCar_Diffusers());
		Thread.sleep(3000);
		clickBtn(p.getHome());
		Thread.sleep(3000);
		moveTheCursor(p.getIcon());
	}

}
