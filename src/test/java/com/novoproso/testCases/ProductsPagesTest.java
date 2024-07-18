package com.novoproso.testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.BigDataIngensionPage;
import com.novoproso.pageObject.DANPage;
import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.HighlightElementClass;
import com.novoproso.utilities.ReadConfig;

public class ProductsPagesTest extends BaseClass {

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
	public void hoverClickDANLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		DANPage danPage = new DANPage(driver, wait);
		
		header.hoverClickDANLink();
		logger.info("DAN link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/DAN.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("DAN page is opened!");

		wait.until(d -> danPage.isHeadingVisible());
		logger.info(danPage.getHeading());
		
		logger.info(danPage.getSubHeading());
		
		assertTrue(danPage.ishrTagVisible());
		
		assertTrue(danPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = danPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(danPage.isContentVisible(i));
			}
			else {
				assertTrue(danPage.isContentVisible(i));
			}			
		}
		
		danPage.getPContent(0);
		danPage.getUlContent(4);
		danPage.getPContent(1);
		danPage.getUlContent(5);
		danPage.getPContent(2);

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
	public void hoverClickBDIngensionLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();
		Header header = new Header(driver, wait);
		BigDataIngensionPage ingensionPage = new BigDataIngensionPage(driver, wait);

		header.hoverClickBDIngensionLink();
		logger.info("BDIngension link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/BDIngension.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("Big data ingension page is opened!");

		wait.until(d -> ingensionPage.isHeadingVisible());
		logger.info(ingensionPage.getHeading());
		
		logger.info(ingensionPage.getSubHeading());
		
		assertTrue(ingensionPage.ishrTagVisible());
		
		assertTrue(ingensionPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = ingensionPage.getUlElementsSize();
		for (int i = 0; i < (size - 1); i++) {
			if(i > 0 && i < 4) {
				assertFalse(ingensionPage.isContentVisible(i));
			}
			else {
				assertTrue(ingensionPage.isContentVisible(i));
			}			
		}
		
		ingensionPage.getPContent(0);
		ingensionPage.getUlContent(4);
		ingensionPage.getPContent(1);
		ingensionPage.getUlContent(5);
		ingensionPage.getPContent(2);

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
