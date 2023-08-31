package com.selenium.GitHubAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        Actions action  = new Actions(driver);
		
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.switchTo().frame("frame1");
        WebElement text1= driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
       // System.out.println(text1);
        System.out.println(text1.getText());
        
        
        Thread.sleep(10000);
	}

}
