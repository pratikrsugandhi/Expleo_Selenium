package com.selenium.GitHubAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dates {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        WebElement from = driver.findElement(By.id("source"));
		from.sendKeys("Pune");
        WebElement to = driver.findElement(By.xpath("//input[@id='destination']"));
        		to.sendKeys("Vijayapura");
       
        		  WebElement date = driver.findElement(By.xpath("//input[@id=\"datepicker1\"]"));
        	        JavascriptExecutor js = (JavascriptExecutor) driver;
        	        js.executeScript("arguments[0].setAttribute('value','30/10/23')",date);
        	        driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();
        Thread.sleep(110000);
        
	}

}
