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


public class Header {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	HighlightElementClass highlightElement = new HighlightElementClass();
	JavascriptExecutor executor;
	MouseHoverScript hoverScript;
	
	@FindBy(linkText = "START NOW")
	WebElement startNowButton;
	
	@FindBy(xpath = "h1")
	WebElement brandLink;
	
	@FindBy(xpath = "//li/a[@href='#home']")
	WebElement homeLink;
	
	@FindBy(xpath = "//li/a[@href='#about-us']")
	WebElement AboutUsLink;
	
	@FindBy(xpath = "//li/a[@href='#products']")
	WebElement productsLink;
	
	@FindBy(xpath = "//li/a[@href='#services']")
	WebElement servicesLink;
	
	@FindBy(xpath = "//li/a[@href='#career']")
	WebElement careersLink;
	
	@FindBy(xpath = "//li/a[@href='#contact']")
	WebElement contactUsLink;
	
	@FindBy(xpath = "h1")
	WebElement toggleButton;
	
	@FindBy(xpath = "(//li/ul)[1]")
	WebElement aboutUsDropdown;
	
	@FindBy(xpath = "(//li/ul)[2]")
	WebElement productsDropdown;

	@FindBy(xpath = "(//li/ul)[3]")
	WebElement servicesDropdown;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'csr.html')]")
	WebElement csrLink;

	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'localSports.html')]")
	WebElement localSportsLink;

	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'DAN.html')]")
	WebElement danLink;

	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'BDIngension.html')]")
	WebElement bdIngensionLink;

	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'idea.html')]")
	WebElement ideaLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'sd.html')]")
	WebElement sdLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'itstaff.html')]")
	WebElement itStaffLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'cloud.html')]")
	WebElement cloudLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'ai.html')]")
	WebElement aiLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'bigData.html')]")
	WebElement bigDataLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'hra.html')]")
	WebElement hraLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'itpm.html')]")
	WebElement itpmLink;
	
	@FindBy(xpath = "//li/ul/li/a[contains(@href, 'network.html')]")
	WebElement networkLink;
	
	
	
	//Constructor
	public Header(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.actions = new Actions(driver);
		this.executor = (JavascriptExecutor) driver;
		this.hoverScript = new MouseHoverScript();
		
		PageFactory.initElements(driver, this);
	}
	
	
	//check if Start now button is visible
	public boolean isStartNowVisible() {
		return startNowButton.isDisplayed();
	}
	
	//click start now button
	public void clickStartNowButton() {
		highlightElement.highlightElement(driver, startNowButton);
		startNowButton.click();
		wait.until(ExpectedConditions.visibilityOf(homeLink));
	}
	
	//check if home link is visible
	public boolean isHomeLinkVisible() {
		return homeLink.isDisplayed();
	}
	
	//click home link
	public void clickHomeLink() {
		highlightElement.highlightElement(driver, homeLink);
		homeLink.click();
		wait.until(ExpectedConditions.visibilityOf(startNowButton));
	}
	
	//check if about us link is visible
	public boolean isAboutUsLinkVisible() {
		return AboutUsLink.isDisplayed();
	}

	//hover to see dropdown is visible
	public void hoverAboutUsLink() {
		wait.until(ExpectedConditions.elementToBeClickable(AboutUsLink));
		hoverScript.mouseHoverJScript(AboutUsLink, driver);
		highlightElement.highlightElement(driver, AboutUsLink);
//		actions.moveToElement(AboutUsLink).perform();
		wait.until(ExpectedConditions.visibilityOf(aboutUsDropdown));
	}
	
	//click about us link
	public void clickAboutUsLink() {
		wait.until(ExpectedConditions.elementToBeClickable(AboutUsLink));
		highlightElement.highlightElement(driver, AboutUsLink);
		AboutUsLink.click();
	}
	
	//hover and click csr link
	public void hoverClickCSRLink() {
		wait.until(ExpectedConditions.elementToBeClickable(AboutUsLink));

		hoverScript.mouseHoverJScript(AboutUsLink, driver);
		highlightElement.highlightElement(driver, AboutUsLink);

		wait.until(ExpectedConditions.visibilityOf(aboutUsDropdown));
		
		hoverScript.mouseHoverJScript(csrLink, driver);
		highlightElement.highlightElement(driver, csrLink);
		csrLink.click();
	}
	
	//hover and click local sports link
	public void hoverClickLocalSportsLink() {
		wait.until(ExpectedConditions.elementToBeClickable(AboutUsLink));

		hoverScript.mouseHoverJScript(AboutUsLink, driver);
		highlightElement.highlightElement(driver, AboutUsLink);

		wait.until(ExpectedConditions.visibilityOf(aboutUsDropdown));
		
		hoverScript.mouseHoverJScript(localSportsLink, driver);
		highlightElement.highlightElement(driver, localSportsLink);
		localSportsLink.click();
	}
	
	//check if products link is visible
	public boolean isProductsLinkVisible() {
		return productsLink.isDisplayed();
	}
	
	//hover to see dropdown is visible
	public void hoverProductsLink() {
		wait.until(ExpectedConditions.elementToBeClickable(productsLink));
		hoverScript.mouseHoverJScript(productsLink, driver);
		highlightElement.highlightElement(driver, productsLink);
//		actions.moveToElement(productsLink).perform();
		wait.until(ExpectedConditions.visibilityOf(productsDropdown));
	}
	
	//click Products link
	public void clickProductsLink() {
		wait.until(ExpectedConditions.elementToBeClickable(productsLink));
		highlightElement.highlightElement(driver, productsLink);
		productsLink.click();
	}
	
	//hover and click DAN link
	public void hoverClickDANLink() {
		wait.until(ExpectedConditions.elementToBeClickable(productsLink));

		hoverScript.mouseHoverJScript(productsLink, driver);
		highlightElement.highlightElement(driver, productsLink);

		wait.until(ExpectedConditions.visibilityOf(productsDropdown));
		
		hoverScript.mouseHoverJScript(danLink, driver);
		highlightElement.highlightElement(driver, danLink);
		danLink.click();
	}
	
	//hover and click BDIngension link
	public void hoverClickBDIngensionLink() {
		wait.until(ExpectedConditions.elementToBeClickable(productsLink));

		hoverScript.mouseHoverJScript(productsLink, driver);
		highlightElement.highlightElement(driver, productsLink);

		wait.until(ExpectedConditions.visibilityOf(productsDropdown));
		
		hoverScript.mouseHoverJScript(bdIngensionLink, driver);
		highlightElement.highlightElement(driver, bdIngensionLink);
		bdIngensionLink.click();
	}
	
	//check if services link is visible
	public boolean isServicesLinkVisible() {
		return servicesLink.isDisplayed();
	}
	
	//hover to see dropdown is visible
	public void hoverServicesLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));
		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);
//		actions.moveToElement(servicesLink).perform();
		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
	}
	
	//click services link
	public void clickServicesLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));
		highlightElement.highlightElement(driver, servicesLink);
		servicesLink.click();
	}
	
	//hover and click idea link
	public void hoverClickIdeaLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(ideaLink, driver);
		highlightElement.highlightElement(driver, ideaLink);
		ideaLink.click();
	}
	
	//hover and click software link
	public void hoverClickSDLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(sdLink, driver);
		highlightElement.highlightElement(driver, sdLink);
		sdLink.click();
	}
	
	//hover and click ITStaff link
	public void hoverClickIStaffLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(itStaffLink, driver);
		highlightElement.highlightElement(driver, itStaffLink);
		itStaffLink.click();
	}

	//hover and click cloud link
	public void hoverClickCloudLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(cloudLink, driver);
		highlightElement.highlightElement(driver, cloudLink);
		cloudLink.click();
	}
	
	//hover and click ai link
	public void hoverClickAILink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(aiLink, driver);
		highlightElement.highlightElement(driver, aiLink);
		aiLink.click();
	}
	
	//hover and click bigData link
	public void hoverClickBigDataLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(bigDataLink, driver);
		highlightElement.highlightElement(driver, bigDataLink);
		bigDataLink.click();
	}
	
	//hover and click hra link
	public void hoverClickHRALink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(hraLink, driver);
		highlightElement.highlightElement(driver, hraLink);
		hraLink.click();
	}
	
	//hover and click itpm link
	public void hoverClickITPMLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(itpmLink, driver);
		highlightElement.highlightElement(driver, itpmLink);
		itpmLink.click();
	}
	
	//hover and click network link
	public void hoverClickNetworkLink() {
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));

		hoverScript.mouseHoverJScript(servicesLink, driver);
		highlightElement.highlightElement(driver, servicesLink);

		wait.until(ExpectedConditions.visibilityOf(servicesDropdown));
		
		hoverScript.mouseHoverJScript(networkLink, driver);
		highlightElement.highlightElement(driver, networkLink);
		networkLink.click();
	}
	
	
	//check if careers link is visible
	public boolean isCareersLinkVisible() {
		return careersLink.isDisplayed();
	}
	
	//click careers link
	public void clickCareersLink() {
		wait.until(ExpectedConditions.elementToBeClickable(careersLink));
		highlightElement.highlightElement(driver, careersLink);
		careersLink.click();
	}
	
	//check if contact link is visible
	public boolean isContactLinkVisible() {
		return contactUsLink.isDisplayed();
	}
	
	//click contact link
	public void clickContactLink() {
		wait.until(ExpectedConditions.elementToBeClickable(contactUsLink));
		highlightElement.highlightElement(driver, contactUsLink);
		contactUsLink.click();
	}
	
}
