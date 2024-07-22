package com.novoproso.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.novoproso.pageObject.HomePage;
import com.novoproso.pageObject.blocks.Header;
import com.novoproso.utilities.HighlightElementClass;
import com.novoproso.utilities.MouseHoverScript;

public class HomePageTest extends BaseClass {
	
	@Test(priority = 1, dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonTest")
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
		
		
	@Test(priority = 2, dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonTest")
	public void productsSectionTest() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
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
	
	
	@Test(priority = 3, dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonTest")
	public void servicesSectionTest() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
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
	
	
	@Test(priority = 4, dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonTest")
	public void careersSectionTest() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		MouseHoverScript hoverScript = new MouseHoverScript();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		HighlightElementClass highlightElementClass = new HighlightElementClass();

		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);

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
		logger.info("each career content is displayed!");


	}
	
	@Test(priority = 5, dependsOnMethods = "com.novoproso.testCases.ClickStartNowTest.clickStartNowButtonTest")
	public void contactSectionTest() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Actions actions = new Actions(driver);
		Header header = new Header(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		header.clickContactLink();
		logger.info("contact us link is clicked!");
		
		wait.until(d -> homePage.isContactSectionVisible());
		logger.info("contact us section is displayed!");

		wait.until(d -> homePage.isContactSectionHeadingVisible());
		System.out.println(homePage.getContactHeading());
		logger.info("contact us section is displayed!");
		
		System.out.println(homePage.getContactSubHeading());
		logger.info("contact us sub heading is displayed!");
	
		homePage.getContactFormBlock();
		homePage.getContactAddressBlock();
		logger.info("contact us form and address block are displayed!");
		
		homePage.getContactAddress();
		logger.info("contact us address is displayed!");
		
		homePage.getContactNumber();
		logger.info("contact us number is displayed!");
		
		homePage.getContactEmailAddress();
		logger.info("contact us email address is displayed!");
		
		WebElement mapIframe = driver.findElement(By.xpath("//div[contains(@class, 'contact-info')]/ul/li/iframe"));
		logger.info("go to map iframe!");
		Thread.sleep(2000);
		driver.switchTo().frame(mapIframe);
		logger.info("switched to map iframe!");
		
		actions.moveByOffset(150, 150);
		logger.info("move by some offset!");

		actions.clickAndHold().moveByOffset(30, 30);
		logger.info("click and  hold then move by some offset!");
		actions.release();
		
		homePage.getLocationAddress();
		logger.info("location address found!");

		homePage.clickMapLocationLink();
		logger.info("view larger map link clicked!");

		Object[] windowHandles = driver.getWindowHandles().toArray();
		driver.switchTo().window(windowHandles[1].toString());
		wait.until(ExpectedConditions.urlToBe("https://www.google.com/maps/place/Novo+ProSo,+Inc./@38.773721,-93.718164,16z/data=!4m6!3m5!1s0x87c3e3c7a0f17e3f:0x473a9fd575ad87a5!8m2!3d38.773721!4d-93.7181643!16s%2Fg%2F11fl5qn7dn?hl=en&entry=ttu"));
		logger.info(driver.getCurrentUrl());
		logger.info("switched to map page");

		driver.close();
		logger.info("closed map page");

		driver.switchTo().window(windowHandles[0].toString());
		wait.until(ExpectedConditions.urlToBe("https://novoproso.com/"));
		logger.info(driver.getCurrentUrl());
		logger.info("switched to main page");

		
	}
	
	
}
