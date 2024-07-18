package com.novoproso.testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.AIMLPage;
import com.novoproso.pageObject.BigDataPage;
import com.novoproso.pageObject.CloudPage;
import com.novoproso.pageObject.HRAPage;
import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.ITPMPage;
import com.novoproso.pageObject.ITStaffPage;
import com.novoproso.pageObject.IdeaPage;
import com.novoproso.pageObject.NetworkPage;
import com.novoproso.pageObject.SoftwarePage;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.HighlightElementClass;
import com.novoproso.utilities.ReadConfig;

public class ServicesPagesTest extends BaseClass {

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
		logger.info("navbar is displayed!");

	}
		
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickIdeaLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();
		
		Header header = new Header(driver, wait);
		IdeaPage ideaPage = new IdeaPage(driver, wait);
		
		header.hoverClickIdeaLink();
		logger.info("Idea link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/idea.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Idea page is opened!");

		wait.until(d -> ideaPage.isHeadingVisible());
		logger.info(ideaPage.getHeading());
		
		logger.info(ideaPage.getSubHeading());
		
		assertTrue(ideaPage.ishrTagVisible());
		
		assertTrue(ideaPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = ideaPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(ideaPage.isContentVisible(i));
			}
			else {
				assertTrue(ideaPage.isContentVisible(i));
			}			
		}
		
		ideaPage.getPContent(0);
		ideaPage.getPContent(1);
		ideaPage.getUlContent(4);
		ideaPage.getPContent(2);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickSDLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		SoftwarePage softwarePage = new SoftwarePage(driver, wait);
		
		header.hoverClickSDLink();
		logger.info("Software link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/sd.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Software page is opened!");

		wait.until(d -> softwarePage.isHeadingVisible());
		logger.info(softwarePage.getHeading());
		
		logger.info(softwarePage.getSubHeading());
		
		assertTrue(softwarePage.ishrTagVisible());
		
		assertTrue(softwarePage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = softwarePage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(softwarePage.isContentVisible(i));
			}
			else {
				assertTrue(softwarePage.isContentVisible(i));
			}			
		}
		
		softwarePage.getPContent(0);
		softwarePage.getPContent(1);
		softwarePage.getPContent(2);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickITStaffLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		ITStaffPage itStaffPage = new ITStaffPage(driver, wait);
		
		header.hoverClickIStaffLink();
		logger.info("ITStaff link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/itstaff.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("IT Staff page is opened!");

		wait.until(d -> itStaffPage.isHeadingVisible());
		logger.info(itStaffPage.getHeading());
		
		logger.info(itStaffPage.getSubHeading());
		
		assertTrue(itStaffPage.ishrTagVisible());
		
		assertTrue(itStaffPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = itStaffPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(itStaffPage.isContentVisible(i));
			}
			else {
				assertTrue(itStaffPage.isContentVisible(i));
			}			
		}
		
		itStaffPage.getPContent(0);
		itStaffPage.getPContent(1);
		itStaffPage.getPContent(2);
		itStaffPage.getPContent(3);
		
		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}	

	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickCloudLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		CloudPage cloudPage = new CloudPage(driver, wait);
		
		header.hoverClickCloudLink();
		logger.info("Cloud link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/cloud.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Cloud page is opened!");

		wait.until(d -> cloudPage.isHeadingVisible());
		logger.info(cloudPage.getHeading());
		
		logger.info(cloudPage.getSubHeading());
		
		assertTrue(cloudPage.ishrTagVisible());
		
		assertTrue(cloudPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = cloudPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(cloudPage.isContentVisible(i));
			}
			else {
				assertTrue(cloudPage.isContentVisible(i));
			}			
		}
		
		cloudPage.getPContent(0);
		cloudPage.getUlContent(4);
		cloudPage.getPContent(1);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickAILinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		AIMLPage aimlPage = new AIMLPage(driver, wait);
		
		header.hoverClickAILink();
		logger.info("AI link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/ai.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("AI page is opened!");

		wait.until(d -> aimlPage.isHeadingVisible());
		logger.info(aimlPage.getHeading());
		
		logger.info(aimlPage.getSubHeading());
		
		assertTrue(aimlPage.ishrTagVisible());
		
		assertTrue(aimlPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = aimlPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(aimlPage.isContentVisible(i));
			}
			else {
				assertTrue(aimlPage.isContentVisible(i));
			}			
		}
		
		aimlPage.getPContent(0);
		aimlPage.getUlContent(4);
		aimlPage.getPContent(1);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}

	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickBigDataLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		BigDataPage bigDataPage = new BigDataPage(driver, wait);
		
		header.hoverClickBigDataLink();
		logger.info("BigData link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/bigData.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Big data page is opened!");

		wait.until(d -> bigDataPage.isHeadingVisible());
		logger.info(bigDataPage.getHeading());
		
		logger.info(bigDataPage.getSubHeading());
		
		assertTrue(bigDataPage.ishrTagVisible());
		
		assertTrue(bigDataPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = bigDataPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(bigDataPage.isContentVisible(i));
			}
			else {
				assertTrue(bigDataPage.isContentVisible(i));
			}			
		}
		
		bigDataPage.getPContent(0);
		bigDataPage.getUlContent(4);
		bigDataPage.getPContent(1);
		bigDataPage.getUlContent(5);
		bigDataPage.getPContent(2);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickHRALinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		HRAPage hraPage = new HRAPage(driver, wait);
		
		header.hoverClickHRALink();
		logger.info("HRA link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/hra.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("HRA page is opened!");

		wait.until(d -> hraPage.isHeadingVisible());
		logger.info(hraPage.getHeading());
		
		logger.info(hraPage.getSubHeading());
		
		assertTrue(hraPage.ishrTagVisible());
		
		assertTrue(hraPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = hraPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(hraPage.isContentVisible(i));
			}
			else {
				assertTrue(hraPage.isContentVisible(i));
			}			
		}
		
		hraPage.getPContent(0);
		hraPage.getUlContent(4);
		hraPage.getPContent(1);
		hraPage.getUlContent(5);
		hraPage.getPContent(2);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickITPMLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		ITPMPage itpmPage = new ITPMPage(driver, wait);
		
		header.hoverClickITPMLink();
		logger.info("ITPM link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/itpm.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("ITPM page is opened!");

		wait.until(d -> itpmPage.isHeadingVisible());
		logger.info(itpmPage.getHeading());
		
		logger.info(itpmPage.getSubHeading());
		
		assertTrue(itpmPage.ishrTagVisible());
		
		assertTrue(itpmPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = itpmPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(itpmPage.isContentVisible(i));
			}
			else {
				assertTrue(itpmPage.isContentVisible(i));
			}			
		}
		
		itpmPage.getPContent(0);
		itpmPage.getUlContent(4);
		itpmPage.getPContent(1);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}	

	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void hoverClickNetworkLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		NetworkPage networkPage = new NetworkPage(driver, wait);
		
		header.hoverClickNetworkLink();
		logger.info("Network link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/network.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Network page is opened!");

		wait.until(d -> networkPage.isHeadingVisible());
		logger.info(networkPage.getHeading());
		
		logger.info(networkPage.getSubHeading());
		
		assertTrue(networkPage.ishrTagVisible());
		
		assertTrue(networkPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = networkPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(networkPage.isContentVisible(i));
			}
			else {
				assertTrue(networkPage.isContentVisible(i));
			}			
		}
		
		networkPage.getPContent(0);
		networkPage.getUlContent(4);
		networkPage.getPContent(1);

		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");		
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	
}
