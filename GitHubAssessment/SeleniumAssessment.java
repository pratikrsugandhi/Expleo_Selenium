package com.selenium.GitHubAssessment;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumAssessment {

    public static void main(String[] args) throws Exception {
    	 
    	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\psugandhi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
         ChromeOptions co = new ChromeOptions(); 
         co.setBinary("C:\\Users\\psugandhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         WebDriver Chromedriver = new ChromeDriver();
         
         co.addArguments("--disable-notifications");
         co.setBinary("C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
        
         WebDriver driver = new ChromeDriver(co);
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7019506324");
         driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Pratik");
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
         Thread.sleep(2000);
         driver.navigate().back();
         driver.navigate().refresh();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[2]/div/table/tbody/tr[2]/td[2]/input")).sendKeys("8495957291",Keys.ENTER);
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[3]/div/div[1]/button")).click();
         Thread.sleep(2000);
         driver.navigate().back();
         driver.navigate().refresh();
         driver.navigate().back();
         driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("");
         driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Pratik");
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
         Thread.sleep(2000);
         driver.navigate().back();
         Thread.sleep(2000);
         driver.navigate().refresh();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("87019506324");
         driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ps@252651#");
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
         Thread.sleep(6000);
         driver.close();    
    }

}
