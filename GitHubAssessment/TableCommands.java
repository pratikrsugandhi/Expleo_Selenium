package com.selenium.GitHubAssessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
        List<WebElement>allDataElements = driver.findElements(By.xpath("//table[@id='table1']"));
       for(WebElement element : allDataElements) {
        	System.out.println(element.getText());
        }
        
        for(WebElement element: allDataElements) {
        	
        	System.out.println(element.getText());
        }
        
//       WebElement a1 = driver.findElement(By.xpath("//table[@id='table1']"));
//       WebElement a2 = driver.findElement(By.xpath("//table[@id='table1']//tbody"));
//       WebElement a3 = driver.findElement(By.xpath("//table[@id='table1']//tbody//td"));
//       System.out.println(a1.getText());
           
        
      
        
        
        
        Thread.sleep(3000);

	}

}
