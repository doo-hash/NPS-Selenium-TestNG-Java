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

public class LocalSportsPage {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	HighlightElementClass highlightElement = new HighlightElementClass();
	JavascriptExecutor executor;
	MouseHoverScript hoverScript;
	
	@FindBy(tagName = "h2")
	WebElement heading;
	
	@FindBy(tagName = "img")
	WebElement imageElement;
	
	@FindBy(tagName = "ul")
	List<WebElement> ulElements;
	
	
	public LocalSportsPage(WebDriver driver, WebDriverWait wait) {
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

	//get image element
	public boolean isImageVisible() {
		highlightElement.highlightElement(driver, imageElement);
		return imageElement.isDisplayed();
	}

	// get ul elements count
	public int getUlElementsSize() {
		return ulElements.size();
	}
	
	//check if content is visible
	public boolean isContentVisible(int index) {
		return ulElements.get(index).isDisplayed();
	}
		
}
