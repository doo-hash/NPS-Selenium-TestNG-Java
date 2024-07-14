package com.novoproso.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudPage {
	
	WebDriver driver;
	
	@FindBy(tagName = "h1")
	WebElement heading;
	
	@FindBy(tagName = "h1")
	WebElement subHeading;
	
	@FindBy(tagName = "h1")
	WebElement ulElement;
	
	@FindBy(tagName = "h1")
	WebElement pElement;
	
	public CloudPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
