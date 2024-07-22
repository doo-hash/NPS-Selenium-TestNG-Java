package com.novoproso.testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Header;

public class navBarLinksMobileViewTest extends BaseClass {

	@BeforeClass
	public void clickToggleTest() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickToggleButton();
		logger.info("toggle button is clicked!");
		wait.until(d -> homePage.isAboutUsSectionVisible());
		
	}
			
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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
		
		wait.until(d -> header.isBrandLinkVisible());



	}
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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

		wait.until(d -> header.isBrandLinkVisible());
		


	}
	
		
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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

		wait.until(d -> header.isHomeLinkVisible());



	}
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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

		wait.until(d -> header.isHomeLinkVisible());
		

	}
	
		
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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

	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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

	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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

	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonMobileViewTest")
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
	
	
}
