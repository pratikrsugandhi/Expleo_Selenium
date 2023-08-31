package com.selenium.GitHubAssessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelcectMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=pd.name&order=DESC");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(3000);
        
        //Select Object for sortby dropdown;
        Select s = new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
//        List<WebElement> list1 = s.getOptions();
//        List<String> printList = new ArrayList();
//        for(String wb : printList) {
//        	System.out.println(wb.getText());
        
        /*
         * List<WebElement> list1 = s.getOptions();
         
        List<String> list2 = new ArrayList();
        for(int i = 0; i<list1.size(); i++) {
        	list2.add(list1.get(i).getText());
        }
        	s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=rating&order=DESC");
            //s.selectByIndex(3);
        	
         	Collections.sort(list2);
        	
        	System.out.println("---------Sorted-------");
        	for(String sorted: list2) {
        		System.out.println(sorted);
        	}
        */
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement d = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select s1 = new Select(d);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		s1.selectByIndex(3);
		
		
		List<WebElement> list1 = new ArrayList<WebElement>();
        	list1=s1.getAllSelectedOptions();
        	for(WebElement element: list1 ) {
        		System.out.println(element.getText());
        	}
        	s1.deselectAll();
        	
        	Thread.sleep(11000);
            driver.close();
	    }
	}



