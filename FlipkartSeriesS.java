package com.selenium.pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSeriesS {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\psugandhi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions(); 
        co.setBinary("C:\\Users\\psugandhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String url = "https://www.flipkart.com";
        driver.get(url);
        try {
            WebElement loginPopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
            if (loginPopup.isDisplayed()) {
                loginPopup.click();
            }
        } catch (Exception e) {
           
        }
        
        Thread.sleep(2000);

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Samsung mobiles");

        
        searchInput.submit();

       
        java.util.List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        for (WebElement result : searchResults) {
            System.out.println(result.getText());
        }

        Thread.sleep(4000);
        // Close the browser
        driver.quit();
        

        

       
        
	}
}
