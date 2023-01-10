package org.stepdefinition;

import org.POJO.part_2POJO;
import org.base.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class part_2 extends BaseClass {

	part_2POJO p;

	@When("click the “Products” button")
	public void click_the_Products_button() throws InterruptedException {
		p = new part_2POJO();
		clickBtn(p.getHome());
		Thread.sleep(3000);
		clickBtn(p.getProducts());
	}

	@When("mouse hover the “Products” button again hovers the “Aroma Oil”")
	public void mouse_hover_the_Products_button_again_hovers_the_Aroma_Oil() throws InterruptedException {
		p = new part_2POJO();
		moveTheCursor(p.getProducts());
		Thread.sleep(3000);
		moveTheCursor(p.getAromaOil());
	}

	@When("select the “Sweet”")
	public void select_the_Sweet() throws InterruptedException {
		p = new part_2POJO();
		moveTheCursor(p.getSweet());
		Thread.sleep(3000);
		clickBtn(p.getSweet());
	}

	@When("Users can see the “Harmony” and choose the oil")
	public void users_can_see_the_Harmony_and_choose_the_oil() throws InterruptedException {
		p = new part_2POJO();
		Thread.sleep(3000);
		clickBtn(p.getHARMONY());
	}

	@When("select the volume ml and add quality")
	public void select_the_volume_ml_and_add_quality() throws InterruptedException {
		p = new part_2POJO();
		Thread.sleep(3000);
		clickBtn(p.getChoose_an_option());
		Thread.sleep(3000);
		clickBtn(p.getMl());
		Thread.sleep(3000);
		p.getQty().clear();
		Thread.sleep(3000);
		passText("3", p.getQty());
	}

	@When("Then click “Add To Cart”")
	public void then_click_Add_To_Cart() throws InterruptedException {
		p = new part_2POJO();
		Thread.sleep(3000);
		clickBtn(p.getAdd_to_cart());
	}

	@Then("click the “Process To Checkout”")
	public void click_the_Process_To_Checkout() throws InterruptedException {
		p = new part_2POJO();
		Thread.sleep(3000);
		clickBtn(p.getProceed_to_Checkout());
	}

}
