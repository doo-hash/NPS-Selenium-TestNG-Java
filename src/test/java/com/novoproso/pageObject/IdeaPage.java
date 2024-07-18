package com.novoproso.pageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.novoproso.utilities.HighlightElementClass;
import com.novoproso.utilities.MouseHoverScript;

public class IdeaPage {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	HighlightElementClass highlightElement = new HighlightElementClass();
	JavascriptExecutor executor;
	MouseHoverScript hoverScript;
	
	@FindBy(tagName = "h2")
	WebElement heading;
	
	@FindBy(tagName = "h4")
	WebElement subHeading;
	
	@FindBy(tagName = "hr")
	WebElement hrElement;
	
	@FindBy(tagName = "img")
	WebElement imageElement;
	
	@FindBy(tagName = "ul")
	List<WebElement> ulElements;
	
	@FindBy(xpath = "//div[contains(@class,'service-info')]/p")
	List<WebElement> productContent;
	
	public IdeaPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.actions = new Actions(driver);
		this.executor = (JavascriptExecutor) driver;
		this.hoverScript = new MouseHoverScript();

		PageFactory.initElements(driver, this);
	}
	
	//check if heading is visible
	public boolean isHeadingVisible() {
		return heading.isDisplayed();
	}
	
	//get heading text
	public String getHeading() {
		highlightElement.highlightElement(driver, heading);
		return heading.getText();
	}

	//get subheading text
	public String getSubHeading() {
		highlightElement.highlightElement(driver, subHeading);
		return subHeading.getText();
	}
	
	//check if hr is visible
	public boolean ishrTagVisible() {
		return hrElement.isDisplayed();
	}
	
	//get image element
	public boolean isImageVisible() {
		highlightElement.highlightElement(driver, imageElement);
		return imageElement.isDisplayed();
	}

	// get ul elements count
	public int getUlElementsSize() {
		return ulElements.size();
	}
		
	//check if ul elements is visible
	public boolean isContentVisible(int index) {
		return ulElements.get(index).isDisplayed();
	}
	
	//get p content
	public void getPContent(int index) {
		highlightElement.highlightElement(driver, productContent.get(index));
	}
	
	//get Ul content
	public void getUlContent(int index) {
		highlightElement.highlightElement(driver, ulElements.get(index));
	}
	
}
