package org.POJO;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class part_3POJO extends BaseClass {

	public part_3POJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Home'])[3]")
	private WebElement Home;

	@FindBy(xpath = "(//a[text()='Products'])[3]")
	private WebElement Products;

	@FindBy(xpath = "(//a[text()='Car Diffusers'])[3]")
	private WebElement Car_Diffusers;

	@FindBy(xpath = "(//span[@class='icon pe-7s-cart'])[2]")
	private WebElement icon;

	public WebElement getIcon() {
		return icon;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getCar_Diffusers() {
		return Car_Diffusers;
	}
}
