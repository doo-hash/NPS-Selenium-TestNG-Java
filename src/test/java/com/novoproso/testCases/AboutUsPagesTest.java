package com.novoproso.testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.CSRPage;
import com.novoproso.pageObject.LocalSportsPage;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.HighlightElementClass;

public class AboutUsPagesTest extends BaseClass {
	
		
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonTest")
	public void hoverClickCsrLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		CSRPage csrPage = new CSRPage(driver, wait);

		header.hoverClickCSRLink();
		logger.info("csr link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/csr.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("csr page is opened!");

		wait.until(d -> csrPage.isHeadingVisible());
		logger.info(csrPage.getHeading());
		
		assertTrue(csrPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = csrPage.getUlElementsSize();
		for (int i = 0; i < size; i++) {
			if(i > 0 && i < 4) {
				assertFalse(csrPage.isContentVisible(i));
			}
			else {
				assertTrue(csrPage.isContentVisible(i));
			}			
		}
		
		csrPage.getContent();
		logger.info("content is displayed!");
		
		highlightElement.footerHighlightElement(driver, wait);
		logger.info("footer is displayed!");
		
		driver.navigate().back();
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("back to main page!");

		wait.until(d -> header.isAboutUsLinkVisible());
	}
	
	@Test(dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonTest")
	public void hoverClickLocalSportsLinkTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HighlightElementClass highlightElement = new HighlightElementClass();

		Header header = new Header(driver, wait);
		LocalSportsPage localSportsPage = new LocalSportsPage(driver, wait);	
		header.hoverClickLocalSportsLink();
		logger.info("local sports link is clicked!");
		
		wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/localSports.html"));
		logger.info(driver.getCurrentUrl());
		logger.info("local sports page is opened!");

		wait.until(d -> localSportsPage.isHeadingVisible());
		logger.info(localSportsPage.getHeading());
		
		assertTrue(localSportsPage.isImageVisible());
		logger.info("image is displayed!");
		
		int size = localSportsPage.getUlElementsSize();
		for (int i = 0; i < size; i++) {
			if(i > 0 && i < 4) {
				assertFalse(localSportsPage.isContentVisible(i));
			}
			else {
				assertTrue(localSportsPage.isContentVisible(i));
			}			
		}
		
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
