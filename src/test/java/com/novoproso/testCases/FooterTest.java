package com.novoproso.testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Footer;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.ReadConfig;

public class FooterTest extends BaseClass {

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

		header.clickContactLink();
		logger.info("contact us link is clicked!");
		
		wait.until(d -> homePage.isContactSectionVisible());
		wait.until(d -> homePage.isContactSectionHeadingVisible());
		Thread.sleep(2000);

	}
	
	@Test(priority = 2)
  public void footerTest() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		Footer footer = new Footer(driver, wait);
		
		footer.scrollToBottom();
		logger.info("Scrolled down to footer");
		
		footer.clickFooterLogoLink();
		logger.info("footer logo link is clicked!");
		
		wait.until(d -> header.isStartNowVisible());
		logger.info(driver.getCurrentUrl());
		logger.info("main page opened!");
		
		driver.navigate().back();
		wait.until(d-> footer.isFooterVisible());
		wait.until(d -> footer.isFooterLinksVisible());
		logger.info("back to the same!");
		
		footer.clickTwitterLink();
		logger.info("twitter link is clicked!");
		
		Object[] twitterwindowHandles = driver.getWindowHandles().toArray(); 
		driver.switchTo().window((String) twitterwindowHandles[1]);
		
		System.out.println(driver.getCurrentUrl());
		wait.until(d -> driver.getCurrentUrl().equals("https://x.com/i/flow/login?redirect_after_login=%2Fnovoproso"));
		logger.info("Switched to Url: " + driver.getCurrentUrl());
		
		driver.switchTo().window((String) twitterwindowHandles[0]);
		wait.until(d -> footer.isFooterLinksVisible());
		logger.info("Back to Url: " + driver.getCurrentUrl());
		
		footer.clickFacebookLink();
		logger.info("facebook link is clicked!");

		Object[] facebookwindowHandles = driver.getWindowHandles().toArray(); 
		driver.switchTo().window((String) facebookwindowHandles[2]);
		wait.until(d -> driver.getCurrentUrl().equals("https://www.facebook.com/novoproso"));
		logger.info("Switched to Url: " + driver.getCurrentUrl());

		driver.switchTo().window((String) facebookwindowHandles[0]);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("linkedin")));
		logger.info("Back to Url: " + driver.getCurrentUrl());

		footer.clickLinkedInLink();
		logger.info("linkedin link is clicked!");

		wait.until(d -> driver.getCurrentUrl().equals("https://www.linkedin.com/company/novo-proso-inc"));
		logger.info("Switched to Url: " + driver.getCurrentUrl());

		Object[] currentWindowHandles = driver.getWindowHandles().toArray(); 
		assertEquals(3, currentWindowHandles.length);

		driver.navigate().back();
		wait.until(d -> footer.isFooterLinksVisible());
		logger.info("Back to Url: " + driver.getCurrentUrl());		

		driver.switchTo().window((String) currentWindowHandles[2]);
		driver.close();
		assertEquals(2, driver.getWindowHandles().toArray().length);
		
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
		driver.close();
		assertEquals(1, driver.getWindowHandles().toArray().length);

		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
		assertEquals("https://novoproso.com/", driver.getCurrentUrl());

		driver.navigate().refresh();
		Thread.sleep(3000);
		
		wait.until(d -> footer.isFooterLinksVisible());
		footer.clickPolicyLink();
		logger.info("policy link is clicked!");

		wait.until(d -> driver.findElement(By.xpath("//h1")).isDisplayed());		
		logger.info("navigated to Url: " + driver.getCurrentUrl());

		driver.navigate().back();
		wait.until(d -> footer.isFooterLinksVisible());
		logger.info("Back to Url: " + driver.getCurrentUrl());		
		
		HomePage homePage = new HomePage(driver, wait);
		wait.until(d -> homePage.isCookieVisible());
		Thread.sleep(2000);
		homePage.closeCookieButton();
		logger.info("cookie button is closed!");
		
		footer.clickCopyrightLink();
		logger.info("copyright link is clicked!");

		wait.until(d -> header.isStartNowVisible());
		logger.info("navigated to Url: " + driver.getCurrentUrl());

		driver.navigate().back();
		wait.until(d -> footer.isFooterLinksVisible());
		logger.info("Back to Url: " + driver.getCurrentUrl());		
		
		footer.clickDesignedByLink();
		logger.info("designed by link is clicked!");

		wait.until(d -> header.isStartNowVisible());
		logger.info("navigated to Url: " + driver.getCurrentUrl());

		driver.navigate().back();
//		wait.until(d -> footer.isFooterLinksVisible());
		logger.info("Back to Url: " + driver.getCurrentUrl());		
		
	}
}
