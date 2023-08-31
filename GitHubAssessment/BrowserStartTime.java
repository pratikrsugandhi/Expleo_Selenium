package com.selenium.GitHubAssessment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BrowserStartTime {

	public static void main(String[] args)  {
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\psugandhi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	        ChromeOptions co = new ChromeOptions(); 
	        co.setBinary("C:\\Users\\psugandhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        co.addArguments("--diable-notifications--");
	        
	        long startTime = System.currentTimeMillis();
	        driver.get("https://omayo.blogspot.com/");
	        driver.findElement(By.className("dropbtn")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	        long endTime = System.currentTimeMillis();
	        System.out.println(((endTime-startTime)/1000.0)+" second..");
	        driver.findElement(By.linkText("Facebook")).click();
	        
	            Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	        	.withTimeout(Duration.ofSeconds(15))
	            .pollingEvery(Duration.ofSeconds(3))
	        	.ignoring(NoSuchElementException.class);
	 

	}

}
