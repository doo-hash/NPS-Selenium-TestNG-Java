package com.novoproso.pageObject.blocks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.novoproso.utilities.HighlightElementClass;
import com.novoproso.utilities.MouseHoverScript;

public class Footer {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	HighlightElementClass highlightElement = new HighlightElementClass();
	JavascriptExecutor executor;
	MouseHoverScript hoverScript;
	
	@FindBy(tagName = "footer")
	WebElement footer;
	
	@FindBy(xpath = "//div[contains(@class,'footer-logo')]/a")
	WebElement footerLogoLink;
	
	@FindBy(className = "twitter")
	WebElement twitterLink;
	
	@FindBy(className = "facebook")
	WebElement facebookLink;
	
	@FindBy(className = "linkedin")
	WebElement linkedinLink;
	
	@FindBy(xpath = "//div/p/a[contains(@href,'policy.html')]")
	WebElement policyLink;
	
	@FindBy(xpath = "//div[contains(@id,'md')]/p/a")
	WebElement footerbottomCopyrightLink;
	
	@FindBy(xpath = "//p[contains(@class,'pull-right')]/a")
	WebElement designedByLinkElement;
	
	public Footer(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.actions = new Actions(driver);
		this.executor = (JavascriptExecutor) driver;
		this.hoverScript = new MouseHoverScript();
		
		PageFactory.initElements(driver, this);
	}
	
	//scroll To bottom
	public void scrollToBottom() {
		executor.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		wait.until(ExpectedConditions.visibilityOf(footer));
	}

	//check footer is visible
	public boolean isFooterVisible() {
		return footer.isDisplayed();
	}
	
	//check links are visible
	public boolean isFooterLinksVisible() {
		wait.until(d-> footerLogoLink.isDisplayed());
		return footerLogoLink.isDisplayed();
	}
	
	//click footer logo link
	public void clickFooterLogoLink() {
		hoverScript.mouseHoverJScript(footerLogoLink, driver);
		highlightElement.highlightElement(driver, footerLogoLink);
		footerLogoLink.click();
	}
	
	//click twitter link
	public void clickTwitterLink() {
		hoverScript.mouseHoverJScript(twitterLink, driver);
		highlightElement.highlightElement(driver, twitterLink);
		twitterLink.click();
	}
	
	//click facebook link
	public void clickFacebookLink() {
		hoverScript.mouseHoverJScript(facebookLink, driver);
		highlightElement.highlightElement(driver, facebookLink);
		facebookLink.click();
	}
	
	//click linkedin link
	public void clickLinkedInLink() {
		hoverScript.mouseHoverJScript(linkedinLink, driver);
		highlightElement.highlightElement(driver, linkedinLink);
		linkedinLink.click();
	}
	
	//click policy link
	public void clickPolicyLink() {
		hoverScript.mouseHoverJScript(policyLink, driver);
		highlightElement.highlightElement(driver, policyLink);
		policyLink.click();
	}
	
	//click copyright link
	public void clickCopyrightLink() {
		hoverScript.mouseHoverJScript(footerbottomCopyrightLink, driver);
		highlightElement.highlightElement(driver, footerbottomCopyrightLink);
		footerbottomCopyrightLink.click();
	}
	
	//click designed by link
	public void clickDesignedByLink() {
		hoverScript.mouseHoverJScript(designedByLinkElement, driver);
		highlightElement.highlightElement(driver, designedByLinkElement);
		designedByLinkElement.click();
	}
	
}
