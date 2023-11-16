package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    WebDriver driver;
    private final By PIMIcon = By.xpath("//span[text()='PIM']");
    private final By addEmployee = By.xpath("//a[text()=\"Add Employee\"]");
    private final By firstName = By.xpath("//input[@name=\"firstName\"]");
    private final By lastName = By.xpath("//input[@name=\"lastName\"]");
    private final By createLoginButton = By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]");
    private final By createUserName = By.xpath("//label[text()=\"Username\"]");
    private final By createPassword = By.xpath("//*[contains(@type,'Password')]");
    private final By saveButton = By.xpath("//button[@type=\"submit\"]");
    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmployeeDetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(PIMIcon).click();
        Thread.sleep(3000);
        driver.findElement(addEmployee).click();
        Thread.sleep(3000);
        driver.findElement(firstName).sendKeys("Vyshnavi");
        Thread.sleep(3000);
        driver.findElement(lastName).sendKeys("gullenkula");
        Thread.sleep(3000);
        driver.findElement(createLoginButton).click();
        Thread.sleep(3000);
        driver.findElement(createUserName).click();
        Thread.sleep(3000);
        driver.findElement(saveButton);



    }
}
