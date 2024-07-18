package com.novoproso.testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.ReadConfig;

public class contactDataDrivenTest extends BaseClass {

	@Test(priority = 1)
	public void clickStartNowButtonTest() throws InterruptedException {

		ReadConfig readConfig = new ReadConfig();

		driver.get(readConfig.getBaseURL());
		logger.info(driver.getCurrentUrl());
		logger.info("Novoproso main page opened!");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);

		HomePage homePage = new HomePage(driver, wait);
		wait.until(d -> homePage.isCookieVisible());
		Thread.sleep(1000);
		homePage.closeCookieButton();
		logger.info("cookie button is closed!");

		
		wait.until(d -> header.isStartNowVisible());
		
		header.clickStartNowButton();
		logger.info("startNow button is clicked!");
		
		wait.until(d -> header.isHomeLinkVisible());
		wait.until(d -> header.isAboutUsLinkVisible());
		logger.info("navbar is displayed!");


	}
	
	@Test(dataProvider = "ContactFormTestData", priority = 2)
	public void contactFormTest(String name, String email, String subject, String message) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);

		header.clickContactLink();
		logger.info("contact us link is clicked!");
		
		wait.until(d -> homePage.isContactSectionVisible());
		logger.info("contact us section is displayed!");

		wait.until(d -> homePage.isContactSectionVisible());
		wait.until(d -> homePage.isContactSectionHeadingVisible());
		logger.info("contact us section is displayed!");

		homePage.getContactFormBlock();

		homePage.setName(name);
		logger.info("Entered name");

		homePage.setEmail(email);
		logger.info("Entered email");
		
		homePage.setSubject(subject);
		logger.info("Entered subject");
		
		homePage.setMessage(message);
		logger.info("Entered message");
		
		homePage.clickSubmitButton();
		logger.info("submit button clicked!");
		
		homePage.getSuccessMessage();
		logger.info("success message displayed!");
	}
	
	
	@DataProvider(name = "ContactFormTestData")
	public String[][] getContactFormTestData(){
		String[][] testData = new String[1][4];
		
		testData[0][0] = "test name";
		testData[0][1] = "test@test.com";
		testData[0][2] = "test subject";
		testData[0][3] = "test message";
		return testData;
		
	}
}
