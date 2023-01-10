package org.POJO;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class part_2POJO extends BaseClass {

	public part_2POJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Home'])[3]")
	private WebElement Home;

	@FindBy(xpath = "(//a[text()='Products'])[3]")
	private WebElement Products;

	@FindBy(xpath = "(//a[text()='Aroma Oil'])[3]")
	private WebElement AromaOil;

	@FindBy(xpath = "(//a[text()='Sweet'])[3]")
	private WebElement Sweet;

	@FindBy(xpath = "//a[text()='HARMONY']")
	private WebElement HARMONY;

	@FindBy(xpath = "//span[text()='Choose an option']")
	private WebElement Choose_an_option;

	@FindBy(xpath = "//li[text()='1000ml']")
	private WebElement ml;

	@FindBy(xpath = "//input[@title='Qty']")
	private WebElement qty;

	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement Add_to_cart;

	@FindBy(xpath = "//a[@class='button btn-primary medium checkout-button']")
	private WebElement Proceed_to_Checkout;

	public WebElement getHome() {
		return Home;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getAromaOil() {
		return AromaOil;
	}

	public WebElement getSweet() {
		return Sweet;
	}

	public WebElement getHARMONY() {
		return HARMONY;
	}

	public WebElement getChoose_an_option() {
		return Choose_an_option;
	}

	public WebElement getMl() {
		return ml;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getAdd_to_cart() {
		return Add_to_cart;
	}

	public WebElement getProceed_to_Checkout() {
		return Proceed_to_Checkout;
	}
}
