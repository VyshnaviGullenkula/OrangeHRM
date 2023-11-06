package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 public class LoginPage {
 @Test
         public void loginToApplication() throws InterruptedException {

          WebDriver driver = new ChromeDriver();
          driver.get("https://opensource-demo.orangehrmlive.com/");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
          driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
          driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
          driver.navigate();

    }
}