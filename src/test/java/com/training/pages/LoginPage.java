package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

    private final By txtUserEmailID = By.name("username");
    private final By txtUserPassword = By.name("password");
    private final By btnLogin = By.xpath("//button[@type=\"submit\"]");

    private WebDriver driver;

    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserId() {
        driver.findElement(txtUserEmailID).sendKeys("admin");
    }

    public void enterPwd() {
        driver.findElement(txtUserPassword).sendKeys("admin123");

    }
    public void clickSubmit() {
        driver.findElement(btnLogin).click();
    }

    public void loginIntoApp(){
        enterUserId();
        enterPwd();
        clickSubmit();
    }

}