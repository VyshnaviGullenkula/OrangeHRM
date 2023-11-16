package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver ;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By txtUserEmailID = By.name("username");
    private final By txtUserPassword = By.name("password");
    private final By btnLogin = By.xpath("//button[@type=\"submit\"]");
    private final By profileIcon = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");
    private final By logoutBtn = By.xpath("//a[text()=\"Logout\"]");

    public void enterUserId() {

        driver.findElement(txtUserEmailID).sendKeys("Admin");
    }

    public void enterPwd() {
        driver.findElement(txtUserPassword).sendKeys("admin123");
    }

    public void clickSubmit() {
        driver.findElement(btnLogin).click();
    }

    public void applicationProperties() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void logout() {
        driver.findElement(profileIcon).click();
        driver.findElement(logoutBtn).click();
    }

    public void logIntoApp() throws InterruptedException {

        applicationProperties();
        Thread.sleep(3000);
        enterUserId();
        enterPwd();
        clickSubmit();
    }

}