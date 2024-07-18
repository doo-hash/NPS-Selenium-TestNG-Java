package com.novoproso.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HighlightElementClass {

	public HighlightElementClass() {
		
	}
	
	public void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid yellow;')", element);
	}
	
	public void footerHighlightElement(WebDriver driver, WebDriverWait wait) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,document.body.scrollHeight);");

		wait.until(d -> driver.findElement(By.xpath("//div[contains(@class,'footer-logo')]")).isDisplayed());
		WebElement footerLogoLink = driver.findElement(By.xpath("//div[contains(@class,'footer-logo')]"));
		WebElement footerSocialIcons = driver.findElement(By.xpath("//div[contains(@class,'social-icons')]/ul"));
		WebElement policyLink = driver.findElement(By.xpath("//div/p/a[contains(@href,'policy.html')]"));
		WebElement footerbottomCopyright = driver.findElement(By.xpath("//div[contains(@id,'md')]/p"));
		WebElement footerbottomDesignedBy = driver.findElement(By.xpath("//p[contains(@class,'pull-right')]"));

		highlightElement(driver, footerLogoLink);
		highlightElement(driver, footerSocialIcons);
		highlightElement(driver, policyLink);
		highlightElement(driver, footerbottomCopyright);
		highlightElement(driver, footerbottomDesignedBy);
	}
}
