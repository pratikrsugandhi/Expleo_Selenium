package com.selenium.GitHubAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class GitHub {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\psugandhi\\\\Downloads\\\\edgedriver-win64\\\\edgedriver-win64\\\\edgedriver.exe");
        EdgeOptions co = new EdgeOptions(); 
        co.setBinary("C:\\Users\\psugandhi\\Downloads\\edgedriver-win64\\edgedriver-win64\\edgedriver.exe");
        
        WebDriver edgeDriver = new EdgeDriver();
        String url = "http://www.google.com";
        
		edgeDriver.get(url);
		
		//edgeDriver.findElement(By.id("")).sendKeys("Shah Rukh Khan",Keys.ENTER);
        Thread.sleep(3000);
        edgeDriver.quit();
       
	}

}
