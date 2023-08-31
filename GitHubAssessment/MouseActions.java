package com.selenium.GitHubAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.browserstack.com/");
//		driver.manage().window().maximize();
		
		
		Actions a = new Actions(driver);
		/*
		WebElement moveTo = driver.findElement(By.xpath(""));
		a.moveToElement(moveTo).perform();
		WebElement rightClc = driver.findElement(By.xpath(""));
		a.contextClick(rightClc).perform();
		WebElement doubleClc = driver.findElement(By.xpath(""));
		driver.close();
		*/
		
		/*
		 * driver.get("https://demoqa.com/droppable");
		
		/*
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        WebElement srcElement = driver.findElement(By.id("draggable"));
        WebElement dstElement = driver.findElement(By.id("droppable"));
        a.clickAndHold(srcElement).release(dstElement).build().perform();
       // OR a.dragAndDrop(srcElement, dstElement).build().perform();
        */
		
		//Keyboard Actions;
		
		/*
		 * driver.get("https://www.google.com");
		/*
		WebElement txt = driver.findElement(By.name("q"));
		a.keyDown(Keys.SHIFT);
		*/
		
		driver.get("https://demoqa.com/frames");    
		    
        
        
		
		
//		driver.close();
		

	}

}
