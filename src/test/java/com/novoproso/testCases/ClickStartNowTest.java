package com.novoproso.testCases;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Header;

public class ClickStartNowTest extends BaseClass {

	@Test
	public void clickStartNowButtonTest() throws InterruptedException {

		logger.info(driver.getCurrentUrl());
		logger.info("Novoproso main page opened!");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);

		wait.until(d -> header.isStartNowVisible());
		Thread.sleep(2000);
		homePage.closeCookieButton();
		logger.info("cookie button is closed!");		
		
		header.clickStartNowButton();
		logger.info("startNow button is clicked!");
		
		wait.until(d -> header.isHomeLinkVisible());
		wait.until(d -> header.isAboutUsLinkVisible());
		wait.until(d-> homePage.isAboutUsSectionHeadingVisible());

		logger.info("navbar is displayed!");

	}
	
	@Test
	public void clickStartNowButtonMobileViewTest() throws InterruptedException {
		driver.manage().window().setSize(new Dimension(673,690));

		logger.info(driver.getCurrentUrl());
		logger.info("Novoproso main page opened!");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);

		wait.until(d -> header.isStartNowVisible());
		wait.until(d -> homePage.isCookieVisible());
		Thread.sleep(2000);
		homePage.closeCookieButton();
		logger.info("cookie button is closed!");		
		
		header.clickStartNowButton();
		logger.info("startNow button is clicked!");
		
		wait.until(d -> header.isBrandLinkVisible());
		wait.until(d -> header.isToggleVisible());
		wait.until(d-> homePage.isAboutUsSectionHeadingVisible());

		logger.info("navbar is displayed!");

	}
	
}
