package com.selenium.GitHubAssessment;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RelativeLocatorsSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		
		driver.get("https://www.facebook.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(RelativeLocator.with(By.xpath("//a[@title = 'Bengali']")).near(By.xpath("//a[@title = 'Telugu']")))).click();
		
//		WebElement toLeftOf = driver.findElement(RelativeLocator.with(By.xpath("//a[@title = 'Bengali']")).toLeftOf(By.xpath("//a[@title = 'Telugu']")));
//		toLeftOf.click();
		
		
		
		

        Thread.sleep(3000);
        driver.close();
		
		
        
	}

}
