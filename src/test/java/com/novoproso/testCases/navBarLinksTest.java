package com.novoproso.testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.ReadConfig;

public class navBarLinksTest extends BaseClass {

	@Test
	public void clickStartNowButtonTest() throws InterruptedException {

		ReadConfig readConfig = new ReadConfig();

		driver.get(readConfig.getBaseURL());
		logger.info(driver.getCurrentUrl());
		logger.info("Novoproso main page opened!");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);

		HomePage homePage = new HomePage(driver, wait);
		wait.until(d -> homePage.isCookieVisible());
		Thread.sleep(2000);
		homePage.closeCookieButton();
		logger.info("cookie button is closed!");
		
		wait.until(d -> header.isStartNowVisible());
		
		header.clickStartNowButton();
		logger.info("startNow button is clicked!");
		
		wait.until(d -> header.isHomeLinkVisible());
		wait.until(d -> header.isAboutUsLinkVisible());
		wait.until(d-> homePage.isAboutUsSectionHeadingVisible());

		logger.info("navbar is displayed!");

	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void clickHomeLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.clickHomeLink();
		logger.info("home link is clicked!");
		
		wait.until(d -> header.isStartNowVisible());
		logger.info("start now is displayed!");

	}
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverAboutUsLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverAboutUsLink();
		logger.info("hovered over About Us link and its dropdown is visible!");
		
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void clickAboutUsLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickAboutUsLink();
		logger.info("About Us link is clicked!");
		
		wait.until(d -> homePage.isAboutUsSectionVisible());
		logger.info("about us section is displayed!");

	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickCsrLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickCSRLink();
		logger.info("csr link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/csr.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("csr page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickLocalSportsLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickLocalSportsLink();
		logger.info("local sports link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/localSports.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("local sports page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverProductsLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverProductsLink();
		logger.info("hovered over Products link and its dropdown is visible!");
		
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void clickProductsLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickProductsLink();
		logger.info("Products link is clicked!");
		
		wait.until(d -> homePage.isproductsSectionVisible());
		logger.info("products section is displayed!");

	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickDANLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickDANLink();
		logger.info("DAN link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/DAN.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("DAN page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickBDIngensionLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickBDIngensionLink();
		logger.info("BDIngension link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/BDIngension.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Big data ingension page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverServicesLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverServicesLink();
		logger.info("hovered over Services link and its dropdown is visible!");
		
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void clickServicesLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickServicesLink();
		logger.info("Services link is clicked!");
		
		wait.until(d -> homePage.isServicesSectionVisible());
		logger.info("services section is displayed!");

	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickIdeaLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickIdeaLink();
		logger.info("Idea link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/idea.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Idea page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickSDLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickSDLink();
		logger.info("Software link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/sd.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Software page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickITStaffLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickIStaffLink();
		logger.info("ITStaff link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/itstaff.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("IT Staff page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}	

	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickCloudLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickCloudLink();
		logger.info("Cloud link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/cloud.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Cloud page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickAILinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickAILink();
		logger.info("AI link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/ai.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("AI page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}

	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickBigDataLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickBigDataLink();
		logger.info("BigData link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/bigData.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Big data page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickHRALinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickHRALink();
		logger.info("HRA link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/hra.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("HRA page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickITPMLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickITPMLink();
		logger.info("ITPM link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/itpm.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("ITPM page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}	

	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickNetworkLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		
		header.hoverClickNetworkLink();
		logger.info("Network link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/network.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Network page is opened!");

		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void clickCareersLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickCareersLink();
		logger.info("careers link is clicked!");
		
		wait.until(d -> homePage.isCareersSectionVisible());
		logger.info("careers section is displayed!");

	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void clickContactLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickContactLink();
		logger.info("contact us link is clicked!");
		
		wait.until(d -> homePage.isContactSectionVisible());
		logger.info("contact us section is displayed!");

	}
	
}
