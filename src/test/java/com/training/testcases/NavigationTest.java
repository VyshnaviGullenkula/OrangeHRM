package com.training.testcases;

import com.training.pages.LoginPage;
import com.training.pages.NavigationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationTest {
    @Test
    public void navigate() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIntoApp();

        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.navigateToModule();
        driver.close();
    }

}

