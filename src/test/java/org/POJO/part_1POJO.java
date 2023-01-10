package org.POJO;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class part_1POJO extends BaseClass {

	public part_1POJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='About Us'])[3]")
	private WebElement aboutus;

	@FindBy(xpath = "(//div[@class='content'])[1]")
	private WebElement ScrollDown;

	@FindBy(xpath = "//a[text()='Download Brochure (ENGLISH)']")
	private WebElement Download_Brochure;

	public WebElement getAboutus() {
		return aboutus;
	}

	public WebElement getScrollDown() {
		return ScrollDown;
	}

	public WebElement getDownload_Brochure() {
		return Download_Brochure;
	}

}
