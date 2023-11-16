package com.training.testcases;

import com.training.pages.LoginPage;
import com.training.pages.NavigationPage;
import com.training.pages.PIMPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PIMModule {
    @Test
    public void createEmployeeDetails() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIntoApp();

        PIMPage pimPage = new PIMPage(driver);
        pimPage.enterEmployeeDetails();
        driver.close();
    }

}
