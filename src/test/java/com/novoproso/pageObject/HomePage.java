package com.novoproso.pageObject;

import java.util.List;

import org.openqa.selenium.By;
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

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	HighlightElementClass highlightElement = new HighlightElementClass();
	JavascriptExecutor executor;
	MouseHoverScript hoverScript;

	@FindBy(id = "about-us")
	WebElement aboutUsSection;
	
	@FindBy(xpath = "//h2[.='About us']")
	WebElement aboutUsSectionHeading;

	@FindBy(id = "products")
	WebElement productsSection;
	
	@FindBy(xpath = "//div[contains(@class,'products-heading')]/h2")
	WebElement productsSectionHeading;
	
	@FindBy(xpath = "//div[contains(@class,'products-heading')]/h4")
	WebElement productsSubHeading;
	
	@FindBy(xpath = "//div[contains(@class,'products-content')]/div[contains(@class,'product')]")
	List<WebElement> products;

	@FindBy(xpath = "//div[contains(@class,'product')]/div[contains(@class,'product-heading')]/h4")
	List<WebElement> productName;
	
	@FindBy(xpath = "//div[contains(@class,'product')]/div[contains(@class,'product-image')]/img")
	List<WebElement> productImage;
	
	@FindBy(xpath = "//div[contains(@class,'product')]/div[contains(@class,'product-content')]/p")
	List<WebElement> productContent;
	
	@FindBy(xpath = "//div[contains(@class,'product-button')]/a")
	List<WebElement> productReadMoreLink;
	
	@FindBy(id = "services")
	WebElement servicesSection;
	
	@FindBy(xpath = "//div[contains(@class,'services-heading')]/h2")
	WebElement servicesSectionHeading;
	
	@FindBy(xpath = "//div[contains(@class,'service')]/div[contains(@class,'image')]/img")
	List<WebElement> services;

	@FindBy(xpath = "//div[contains(@class,'service')]/div[contains(@class,'content')]/h4")
	List<WebElement> serviceName;
	
	@FindBy(xpath = "//div[contains(@class,'product')]/div[contains(@class,'product-image')]/img")
	List<WebElement> serviceImage;
	
	@FindBy(xpath = "//div[contains(@class,'service')]/div[contains(@class,'content')]/p")
	List<WebElement> serviceContent;
	
	@FindBy(xpath = "//div[contains(@class,'service-button')]/a")
	List<WebElement> serviceReadMoreLink;
	
	@FindBy(id = "career")
	WebElement careersSection;
	
	@FindBy(xpath = "//div[contains(@class,'careers-heading')]/h2")
	WebElement careersSectionHeading;
	
	@FindBy(xpath = "//div[contains(@class,'careers-heading')]/h4")
	WebElement careersSubHeading;

	@FindBy(xpath = "//div[contains(@class,'career-mail-info')]/h4")
	WebElement careersMail;

	@FindBy(xpath = "//div[contains(@class,'career-card')]")
	List<WebElement> careers;
	
	@FindBy(xpath = "//div[contains(@class,'career-card')]/h4")
	List<WebElement> careerName;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/span[contains(text(),'Position ID')]")
	List<WebElement> careerPositionHeading;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/p")
	List<WebElement> careerPosition;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/span[contains(text(),'Length')]")
	List<WebElement> careerDurationHeading;

	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/p")
	List<WebElement> careerDuration;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/span[contains(text(),'Location')]")
	List<WebElement> careerLocationHeading;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/p")
	List<WebElement> careerLocation;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/span[contains(text(),'Education')]")
	List<WebElement> careerEducationHeading;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/div/p")
	List<WebElement> careerEducation;
	
	@FindBy(xpath = "//div[contains(@class,'card-footer')]/span")
	List<WebElement> careerDetailsLink;
		
	@FindBy(xpath = "//div[contains(@class,'overlay')]")
	List<WebElement> modelCareer;
	
	@FindBy(id = "contact")
	WebElement contactUsSection;
	
	@FindBy(xpath = "//div[contains(@id, 'contact-us')]//h2")
	WebElement contactUsSectionHeading;

	@FindBy(xpath = "//div[contains(@id, 'contact-us')]//p")
	WebElement contactUsSubHeading;

	@FindBy(xpath = "(//div[contains(@class, 'contact-form')]/div/div)[1]")
	WebElement contactFomrBlock;
	
	@FindBy(xpath = "(//div[contains(@class, 'contact-form')]/div/div)[2]")
	WebElement addressBlock;
	
	@FindBy(xpath = "(//div[contains(@class, 'contact-info')]/ul/li)[1]")
	WebElement contactAddress;
	
	@FindBy(xpath = "(//div[contains(@class, 'contact-info')]/ul/li)[2]")
	WebElement contactNumber;
	
	@FindBy(xpath = "(//div[contains(@class, 'contact-info')]/ul/li)[3]")
	WebElement contactEmailAddress;
	
	@FindBy(xpath = "//div[contains(@class, 'contact-info')]/ul/li/iframe")
	WebElement mapElement;
	
	@FindBy(xpath = "//*[@id=\"mapDiv\"]/div/div[3]/div[3]/div/div")
	WebElement mapLocationAddress;

	@FindBy(xpath = "//div[contains(@class,'google-maps-link')]/a")
	WebElement mapLocationLink;
	
	@FindBy(xpath = "//input[contains(@name,'name')]")
	WebElement nameInput;
	
	@FindBy(xpath = "//input[contains(@name,'email')]")
	WebElement emailInput;
	
	@FindBy(xpath = "//input[contains(@name,'subject')]")
	WebElement subjectInput;
	
	@FindBy(xpath = "//textarea[contains(@name,'message')]")
	WebElement messageInput;
	
	@FindBy(className = "btn-submit")
	WebElement submitButton;
	
	@FindBy(className = "form_status")
	WebElement successMessage;
	
	@FindBy(xpath = "//div[contains(@class,'cookie-container')]/p/button")
	WebElement cookieButton;
	
		
	//Constructor
	public HomePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.actions = new Actions(driver);
		this.executor = (JavascriptExecutor) driver;
		this.hoverScript = new MouseHoverScript();

		PageFactory.initElements(driver, this);
	}

	//is cookie visible
	public boolean isCookieVisible() {
		wait.until(d -> cookieButton.isDisplayed());
		return cookieButton.isDisplayed();
	}
	
	//close cookie button
	public void closeCookieButton() {
		highlightElement.highlightElement(driver, cookieButton);
		cookieButton.click();
	}
	
	//check if about us section visible
	public boolean isAboutUsSectionVisible() {
		return aboutUsSection.isDisplayed();
	}
	
	//check if about us heading visible
	public boolean isAboutUsSectionHeadingVisible() {
		return aboutUsSectionHeading.isDisplayed();
	}
	
	//get about us section heading
	public String getAboutUsHeading() {
		highlightElement.highlightElement(driver, aboutUsSectionHeading);
		return aboutUsSectionHeading.getText();
	}
	
	//highlight about us section content
	public void highlightAboutUsContent() {
		highlightElement.highlightElement(driver, driver.findElement(By.xpath("//section[contains(@id,'about-us')]//div[contains(@class,'about-info')]/h2")));
		highlightElement.highlightElement(driver, driver.findElements(By.xpath("//section[contains(@id,'about-us')]//div[contains(@class,'about-info')]/p")).get(0));
		highlightElement.highlightElement(driver, driver.findElements(By.xpath("//section[contains(@id,'about-us')]//div[contains(@class,'about-info')]/p")).get(1));
		highlightElement.highlightElement(driver, driver.findElements(By.xpath("//section[contains(@id,'about-us')]//div[contains(@class,'about-info')]/h2")).get(1));
		highlightElement.highlightElement(driver, driver.findElements(By.xpath("//section[contains(@id,'about-us')]//div[contains(@class,'about-info')]/ul")).get(0));
		highlightElement.highlightElement(driver, driver.findElements(By.xpath("//section[contains(@id,'about-us')]//div[contains(@class,'about-info')]/h2")).get(2));
		highlightElement.highlightElement(driver, driver.findElements(By.xpath("//section[contains(@id,'about-us')]//div[contains(@class,'about-info')]/ul")).get(1));

	}

	//check if products section visible
	public boolean isproductsSectionVisible() {
		wait.until(ExpectedConditions.visibilityOf(productsSection));
		return productsSection.isDisplayed();
	}
	
	//check if products heading visible
	public boolean isproductsSectionHeadingVisible() {
		wait.until(ExpectedConditions.visibilityOf(productsSectionHeading));
		return productsSectionHeading.isDisplayed();
	}
	
	//get products section heading
	public String getProductsHeading() {
		highlightElement.highlightElement(driver, productsSectionHeading);
		return productsSectionHeading.getText();
	}

	//get products sub heading
	public String getProductsSubHeading() {
		highlightElement.highlightElement(driver, productsSubHeading);
		return productsSubHeading.getText();
	}
	
	//get products size
	public int getProductsCount() {
		return products.size();
	}

	//check if product is visible
	public boolean isProductVisible(int index) {
		wait.until(d-> products.get(index).isDisplayed());
		highlightElement.highlightElement(driver, products.get(index));
		return products.get(index).isDisplayed();
	}
	
	//get product name
	public String getProductName(int index) {
		highlightElement.highlightElement(driver, productName.get(index));
		return productName.get(index).getText();
	}
	
	//get product Image
	public boolean getProductImage(int index) {
		highlightElement.highlightElement(driver, productImage.get(index));
		return productImage.get(index).isDisplayed();
	}
	
	//get product Content
	public String getProductContent(int index) {
		highlightElement.highlightElement(driver, productContent.get(index));
		return productContent.get(index).getText();
	}
	
	//hover product readmore link
	public void hoverProductReadMOreLink(int index) {
		hoverScript.mouseHoverJScript(productReadMoreLink.get(index), driver);
		highlightElement.highlightElement(driver, productReadMoreLink.get(index));
	}
	
	//click product readmore link
	public void clickProductReadMOreLink(int index) {
		productReadMoreLink.get(index).click();
	}
	
	//check if services section visible
	public boolean isServicesSectionVisible() {
		wait.until(ExpectedConditions.visibilityOf(servicesSection));
		return servicesSection.isDisplayed();
	}
	
	//check if services heading visible
	public boolean isServicesSectionHeadingVisible() {
		wait.until(ExpectedConditions.visibilityOf(servicesSectionHeading));
		return servicesSectionHeading.isDisplayed();
	}
	
	//get Services section heading
	public String getServicesHeading() {
		highlightElement.highlightElement(driver, servicesSectionHeading);
		return servicesSectionHeading.getText();
	}
	
	//get services size
	public int getServicesCount() {
		return services.size();
	}

	//check if service is visible
	public boolean isServiceVisible(int index) {
		executor.executeScript("arguments[0].scrollIntoView();", services.get(index));
		wait.until(d-> services.get(index).isDisplayed());
		highlightElement.highlightElement(driver, services.get(index));
		return services.get(index).isDisplayed();
	}
	
	//get service name
	public String getServiceName(int index) {
		highlightElement.highlightElement(driver, serviceName.get(index));
		return serviceName.get(index).getText();
	}
	
	//get service Image
	public void getServiceImage(int index) {
		highlightElement.highlightElement(driver, serviceImage.get(index));
	}
	
	//get service Content
	public String getServiceContent(int index) {
		highlightElement.highlightElement(driver, serviceContent.get(index));
		return serviceContent.get(index).getText();
	}
	
	//hover service readmore link
	public void hoverServiceReadMOreLink(int index) {
		hoverScript.mouseHoverJScript(serviceReadMoreLink.get(index), driver);
		highlightElement.highlightElement(driver, serviceReadMoreLink.get(index));
	}
	
	//click service readmore link
	public void clickServiceReadMOreLink(int index) {
		serviceReadMoreLink.get(index).click();
	}
	
	//check if careers section visible
	public boolean isCareersSectionVisible() {
		wait.until(ExpectedConditions.visibilityOf(careersSection));
		return careersSection.isDisplayed();
	}
	
	//check if careers heading visible
	public boolean isCareersSectionHeadingVisible() {
		wait.until(ExpectedConditions.visibilityOf(careersSectionHeading));
		return careersSectionHeading.isDisplayed();
	}
	
	//get Careers section heading
	public String getCareersHeading() {
		highlightElement.highlightElement(driver, careersSectionHeading);
		return careersSectionHeading.getText();
	}
	
	//get Careers sub heading
	public String getCareersSubHeading() {
		highlightElement.highlightElement(driver, careersSubHeading);
		return careersSubHeading.getText();
	}

	//get Careers contact mail
	public String getCareersContact() {
		highlightElement.highlightElement(driver, careersMail);
		return careersMail.getText();
	}
	
	//get careers size
	public int getCareersCount() {
		return careers.size();
	}

	//check if Career is visible
	public boolean isCareerVisible(int index) {
		executor.executeScript("arguments[0].scrollIntoView();", careers.get(index));
		wait.until(d-> careers.get(index).isDisplayed());
		highlightElement.highlightElement(driver, careers.get(index));
		return careers.get(index).isDisplayed();
	}
	
	//get career name
	public String getCareerName(int index) {
		highlightElement.highlightElement(driver, careerName.get(index));
		return careerName.get(index).getText();
	}
	
	//get career position
	public void getCareerPosition(int index) {
		highlightElement.highlightElement(driver, careerPositionHeading.get(index));
		highlightElement.highlightElement(driver, careerPosition.get(index*4));
		System.out.println(careerPositionHeading.get(index).getText() + " : " + careerPosition.get(index*4).getText());
	}
	
	//get career duration
	public void getCareerDuration(int index) {
		highlightElement.highlightElement(driver, careerDurationHeading.get(index));
		highlightElement.highlightElement(driver, careerDuration.get((index*4) + 1));
		System.out.println(careerDurationHeading.get(index).getText() + " : " + careerDuration.get((index*4) + 1).getText());
	}

	//get career location
	public void getCareerLocation(int index) {
		highlightElement.highlightElement(driver, careerLocationHeading.get(index));
		highlightElement.highlightElement(driver, careerLocation.get((index*4) + 2));
		System.out.println(careerLocationHeading.get(index).getText() + " : " + careerLocation.get((index*4) + 2).getText());
	}

	//get career Education
	public void getCareerEducation(int index) {
		highlightElement.highlightElement(driver, careerEducationHeading.get(index));
		highlightElement.highlightElement(driver, careerEducation.get((index*4) + 3));
		System.out.println(careerEducationHeading.get(index).getText() + " : " + careerEducation.get((index*4) + 3).getText());
	}

	//hover career details link
	public void hoverCareerDetailsLink(int index) {
		hoverScript.mouseHoverJScript(careerDetailsLink.get(index), driver);
		highlightElement.highlightElement(driver, careerDetailsLink.get(index));
	}
	
	//click career details link
	public void clickCareerDetailsLink(int index) {
		careerDetailsLink.get(index).click();
	}
	
	//click model to close it
	public void closeCareerDetailsModel(int index) {
		hoverScript.mouseHoverJScript(modelCareer.get(index*2), driver);
		modelCareer.get(index*2).click();
	}
	
	//check if contact us section visible
	public boolean isContactSectionVisible() {
		wait.until(ExpectedConditions.visibilityOf(contactUsSection));
		return contactUsSection.isDisplayed();
	}
	
	//check if contact us heading visible
	public boolean isContactSectionHeadingVisible() {
		wait.until(ExpectedConditions.visibilityOf(contactUsSectionHeading));
		return contactUsSectionHeading.isDisplayed();
	}
	
	//get Contact section heading
	public String getContactHeading() {
		highlightElement.highlightElement(driver, contactUsSectionHeading);
		return contactUsSectionHeading.getText();
	}
	
	//get contact sub heading
	public String getContactSubHeading() {
		highlightElement.highlightElement(driver, contactUsSubHeading);
		return contactUsSubHeading.getText();
	}
	
	//highlight contact form block
	public void getContactFormBlock() {
		highlightElement.highlightElement(driver, contactFomrBlock);
	}
	
	//highlight contact address block
	public void getContactAddressBlock() {
		highlightElement.highlightElement(driver, addressBlock);
	}
	
	//get contact address
	public String getContactAddress() {
		highlightElement.highlightElement(driver, contactAddress);
		return contactAddress.getText();
	}
	
	//get contact number
	public String getContactNumber() {
		highlightElement.highlightElement(driver, contactNumber);
		return contactNumber.getText();
	}
	
	//get contact email address
	public String getContactEmailAddress() {
		highlightElement.highlightElement(driver, contactEmailAddress);
		return contactEmailAddress.getText();
	}
	
	//get map element
	public WebElement getMapElement() {
		wait.until(d -> mapElement.isDisplayed());
		highlightElement.highlightElement(driver, mapElement);
		return contactAddress;
	}
	
	//get map location address
	public String getLocationAddress() {
		highlightElement.highlightElement(driver, mapLocationAddress);
		return mapLocationAddress.getText();
	}
	
	//click view larger map link
	public void clickMapLocationLink() {
		executor.executeScript("arguments[0].scrollIntoView();", mapLocationLink);
		wait.until(ExpectedConditions.visibilityOf(mapLocationLink));
		hoverScript.mouseHoverJScript(mapLocationLink, driver);
		mapLocationLink.click();
	}
	
	//enter name into contact form input
	public void setName(String name) {
		highlightElement.highlightElement(driver, nameInput);
		nameInput.sendKeys(name);
	}
	
	//enter email into contact form input
	public void setEmail(String email) {
		highlightElement.highlightElement(driver, emailInput);
		emailInput.sendKeys(email);
	}
	
	//enter subject into contact form input
	public void setSubject(String subject) {
		highlightElement.highlightElement(driver, subjectInput);
		subjectInput.sendKeys(subject);
	}
	
	//enter message into contact form input
	public void setMessage(String message) {
		highlightElement.highlightElement(driver, messageInput);
		messageInput.sendKeys(message);
	}
	
	//click submit button in contact form 
	public void clickSubmitButton() {		
		executor.executeScript("arguments[0].scrollIntoView();", submitButton);
		wait.until(d -> submitButton.isDisplayed());
		hoverScript.mouseHoverJScript(submitButton, driver);
		highlightElement.highlightElement(driver, submitButton);
		submitButton.click();
	}
	
	//get success message contact form
	public String getSuccessMessage() {
		executor.executeScript("arguments[0].scrollIntoView();", successMessage);
		executor.executeScript("window.scrollBy(0,150)");
		wait.until(d -> successMessage.isDisplayed());				
		highlightElement.highlightElement(driver, messageInput);
		return successMessage.getText();
	}
	
}
