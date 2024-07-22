package com.novoproso.testCases;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;

public class CloseCookieTest extends BaseClass {

	@Test
	public void closeCookieTest() throws InterruptedException {

		logger.info(driver.getCurrentUrl());
		logger.info("Novoproso main page opened!");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		HomePage homePage = new HomePage(driver, wait);

		wait.until(d -> homePage.isCookieVisible());
		Point currentLocation = homePage.getCookieLocation();
		Dimension cookieDimension = homePage.getCookieSize();
		logger.info("Cookie current location: " + currentLocation);
		logger.info("size of cookie container: " + cookieDimension);
		homePage.closeCookieButton();
		logger.info("cookie button is clicked!");
		Point newLocation = homePage.getCookieLocation();
		logger.info("Cookie current location: " + newLocation);
		assertFalse(newLocation.equals(currentLocation));
		logger.info("cookie button is closed!");

	}
	
}
