package com.selenium.GitHubAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssessment2 {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\psugandhi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions(); 
        co.setBinary("C:\\Users\\psugandhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver Chromedriver = new ChromeDriver();
     
        Chromedriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Chromedriver.manage().window().maximize();

//        Rirecting to link logging in with id & pass, then clicking profile and logging out using Implicit;

        Chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
        Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
        
        WebDriverWait web = new WebDriverWait(Chromedriver, Duration.ofSeconds(20));
        WebElement webwl =Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
        web.until(ExpectedConditions.elementToBeClickable(webwl));

     

        webwl.click();
        
       Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();  
        Chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).sendKeys("Log out", Keys.ENTER);
        Chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
//        // same procedure no clicking Admin;
        
      Chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
     Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
     Chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     Chromedriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
     
        
        
        
        Thread.sleep(3000);
      Chromedriver.close();
      
        
	}

}
