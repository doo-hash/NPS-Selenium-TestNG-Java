package com.novoproso.testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.HighlightElementClass;
import com.novoproso.utilities.MouseHoverScript;
import com.novoproso.utilities.ReadConfig;

public class homePageTest extends BaseClass {

	@Test
	public void clickStartNowButtonTest() {

		ReadConfig readConfig = new ReadConfig();

		driver.get(readConfig.getBaseURL());
		logger.info(driver.getCurrentUrl());
		logger.info("Novoproso main page opened!");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);

		wait.until(d -> header.isStartNowVisible());
		
		header.clickStartNowButton();
		logger.info("startNow button is clicked!");
		
		wait.until(d -> header.isHomeLinkVisible());
		wait.until(d -> header.isAboutUsLinkVisible());
		logger.info("navbar is displayed!");

	}
		
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void aboutUsSectionTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickAboutUsLink();
		logger.info("About Us link is clicked!");
		
		wait.until(d -> homePage.isAboutUsSectionVisible());
		logger.info("about us section is displayed!");
		
		wait.until(d -> homePage.isAboutUsSectionHeadingVisible());
		System.out.println(homePage.getAboutUsHeading());
		logger.info("about us section heading is displayed!");
		
		assertEquals("rgba(252, 208, 93, 1)", driver.findElement(By.linkText("ABOUT US")).getCssValue("background-color"));
		assertEquals("rgba(255, 255, 255, 1)", driver.findElements(By.cssSelector("h2")).get(0).getCssValue("color"));
		assertEquals("rgba(255, 255, 255, 1)", driver.findElements(By.cssSelector("h2")).get(1).getCssValue("color"));
		assertEquals("rgba(255, 255, 255, 1)", driver.findElements(By.cssSelector("h2")).get(2).getCssValue("color"));
		logger.info("about us section styles checked!");

		homePage.highlightAboutUsContent();
		logger.info("about us section content highlighted!");
	}
		
		
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void productsSectionTest() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);

		homePage.isCookieVisible();
		Thread.sleep(2000);
		homePage.closeCookieButton();
		logger.info("cookie button is closed!");
		
		header.clickProductsLink();
		logger.info("Products link is clicked!");
		
		wait.until(d -> homePage.isproductsSectionVisible());
		logger.info("products section is displayed!");

		wait.until(d -> homePage.isproductsSectionHeadingVisible());

		System.out.println(homePage.getProductsHeading());
		logger.info("products section heading is displayed!");
		
		System.out.println(homePage.getProductsSubHeading());
		logger.info("products sub heading is displayed!");
		
		int productsCount = homePage.getProductsCount();
		logger.info("total " + productsCount + " products avaliable!");
		
		String[] productPages = {"BDIngension.html", "DAN.html"};

		
		for (int i = 0; i < productsCount; i++) {
			assertTrue(homePage.isProductVisible(i));
			System.out.println(homePage.getProductName(i));
			assertTrue(homePage.getProductImage(i));
			System.out.println(homePage.getProductContent(i));
			homePage.hoverProductReadMOreLink(i);
			String name = homePage.getProductName(i); 
			
			homePage.clickProductReadMOreLink(i);
			logger.info(name + " readmore link is clicked!");
			String url = "https://novoproso.com/"+productPages[i];
			
			wait.until(d -> driver.getCurrentUrl().equals(url));
			logger.info(driver.getCurrentUrl());
			logger.info(name + " page is opened!");
			
			driver.navigate().back();
			wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
			logger.info(driver.getCurrentUrl());
			logger.info("back to main page!");

			wait.until(d -> header.isAboutUsLinkVisible());

		}
		logger.info("each product content is displayed!");
		
		
	}
	
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void servicesSectionTest() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);

//		homePage.isCookieVisible();
		Thread.sleep(2000);
//		homePage.closeCookieButton();
//		logger.info("cookie button is closed!");
		
		header.clickServicesLink();
		logger.info("Services link is clicked!");
		
		wait.until(d -> homePage.isServicesSectionVisible());
		logger.info("Services section is displayed!");

		wait.until(d -> homePage.isServicesSectionHeadingVisible());

		System.out.println(homePage.getServicesHeading());
		logger.info("Services section heading is displayed!");
				
		int servicesCount = homePage.getServicesCount();
		logger.info("total " + servicesCount + " Services avaliable!");
		
		String[] servicePages = {"idea.html", "sd.html","itstaff.html","cloud.html","ai.html","bigData.html","hra.html","itpm.html","network.html"};

		System.out.println(servicesCount);
		for (int i = 0; i < servicesCount; i++) {
			assertTrue(homePage.isServiceVisible(i));
			Thread.sleep(1000);
			System.out.println(i);
						
			String name = homePage.getServiceName(i); 
			System.out.println(name);
			
			System.out.println(homePage.getServiceContent(i));
			
			homePage.hoverServiceReadMOreLink(i);			
			homePage.clickServiceReadMOreLink(i);
			logger.info(name + " readmore link is clicked!");

			String url = "https://novoproso.com/"+servicePages[i];
			
			wait.until(d -> driver.getCurrentUrl().equals(url));
			logger.info(driver.getCurrentUrl());
			logger.info(name + " page is opened!");
			
			driver.navigate().back();
			
			wait.until(d -> driver.getCurrentUrl().equals("https://novoproso.com/"));
			logger.info(driver.getCurrentUrl());
			logger.info("back to main page!");

			wait.until(d -> header.isAboutUsLinkVisible());

		}
		logger.info("each product content is displayed!");

	}
	
	
	@Test(dependsOnMethods = "clickStartNowButtonTest")
	public void careersSectionTest() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		MouseHoverScript hoverScript = new MouseHoverScript();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		HighlightElementClass highlightElementClass = new HighlightElementClass();

		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);

//		homePage.isCookieVisible();
		Thread.sleep(2000);
//		homePage.closeCookieButton();
//		logger.info("cookie button is closed!");
		
		header.clickCareersLink();
		logger.info("Careers link is clicked!");
		
		wait.until(d -> homePage.isCareersSectionVisible());
		logger.info("Careers section is displayed!");

		wait.until(d -> homePage.isCareersSectionHeadingVisible());

		System.out.println(homePage.getCareersHeading());
		logger.info("Careers section heading is displayed!");
				
		int careersCount = homePage.getCareersCount();
		logger.info("total " + careersCount + " Services avaliable!");
		

		System.out.println(careersCount);
		for (int i = 0; i < careersCount; i++) {
			assertTrue(homePage.isCareerVisible(i));
			Thread.sleep(1000);
			System.out.println(i);
						
			String name = homePage.getCareerName(i); 
			System.out.println(name);
			
			homePage.getCareerPosition(i);
			homePage.getCareerDuration(i);
			homePage.getCareerLocation(i);
			homePage.getCareerEducation(i);
			
			homePage.hoverCareerDetailsLink(i);			
			homePage.clickCareerDetailsLink(i);
			logger.info(name + " details link is clicked!");

			String[] jobIDArray = {"AIML", "PEGA5","QASEL7","SD241","SD242","NSE18"};
			hoverScript.mouseHoverJScript(driver.findElement(By.xpath("//div[contains(@id,'"+jobIDArray[i]+"')]")), driver);
			WebElement jobName = driver.findElement(By.xpath("//div[contains(@id,'"+jobIDArray[i]+"')]/div/div/h2"));
			WebElement jobBasicInfo = driver.findElements(By.xpath("//div[contains(@class,'job-basic-info')]")).get((i));
			WebElement jobMessage = driver.findElement(By.xpath("//div[contains(@id,'"+jobIDArray[i]+"')]/div/div/p"));
			WebElement jobQualification = driver.findElements(By.xpath("//div[contains(@class,'job-qualification')]")).get(i);
			WebElement jobApplyInfo = driver.findElements(By.xpath("//div[contains(@class,'job-apply-info')]")).get(i);
			
			System.out.println("Job Name : "+ jobName.getText());
			highlightElementClass.highlightElement(driver, jobName);
			System.out.println("Job Basic Info : "+ jobBasicInfo.getText());
			highlightElementClass.highlightElement(driver, jobBasicInfo);
			System.out.println("Job Qualifications heading: "+ jobQualification.getText());
			highlightElementClass.highlightElement(driver, jobQualification);
			System.out.println("Job ApplyInfo : "+ jobApplyInfo.getText());
			highlightElementClass.highlightElement(driver, jobApplyInfo);
			executor.executeScript("arguments[0].scrollIntoView();",jobMessage);
			wait.until(ExpectedConditions.visibilityOf(jobMessage));
			System.out.println("Job message : "+ jobMessage.getText());
			highlightElementClass.highlightElement(driver, jobMessage);
			
			homePage.closeCareerDetailsModel(i);
		}
		logger.info("each product content is displayed!");


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
