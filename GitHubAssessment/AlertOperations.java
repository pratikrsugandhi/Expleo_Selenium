package com.selenium.GitHubAssessment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertOperations {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement textBox = driver.findElement(By.xpath(""));
        textBox.sendKeys("301");
        Thread.sleep(30000);
        driver.findElement(By.xpath(""));
        Alert a = driver.switchTo().alert();
        a.sendKeys("101");
        
        
        
        
        
	}

}
