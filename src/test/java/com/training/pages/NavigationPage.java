package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {
    WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By AdminIcon = By.xpath("//span[text()='Admin']");
    private final By PIMIcon = By.xpath("//span[text()='PIM']");
    private final By LeaveIcon = By.xpath("//span[text()='Leave']");
    private final By TimeIcon = By.xpath("//span[text()='Time']");
    private final By RecruitmentIcon = By.xpath("//span[text()='Recruitment']");
    private final By MyInfoIcon = By.xpath("//span[text()='My Info']");
    private final By PerformanceIcon = By.xpath("//span[text()='Performance']");
    private final By DashBoardIcon = By.xpath("//span[text()='Dashboard']");
    private final By DirectoryIcon = By.xpath("//span[text()='Directory']");
    private final By ClaimIcon = By.xpath("//span[text()='Claim']");
    private final By BuzzIcon = By.xpath("//span[text()='Buzz']");

    public void AdminPage() {
        driver.findElement(AdminIcon).click();
    }

    public void PimPage() {
        driver.findElement(PIMIcon).click();
    }

    public void LeavePage() {
        driver.findElement(LeaveIcon).click();
    }

    public void TimePage() {
        driver.findElement(TimeIcon).click();
    }

    public void RecruitmentPage() {
        driver.findElement(RecruitmentIcon).click();
    }

    public void MyInfoPage() {
        driver.findElement(MyInfoIcon).click();
    }

    public void PerformancePage() {
        driver.findElement(PerformanceIcon).click();
    }

    public void DashboardPage() {
        driver.findElement(DashBoardIcon).click();
    }

    public void DirectoryPage() {
        driver.findElement(DirectoryIcon).click();
    }

    public void ClaimPage() {
        driver.findElement(ClaimIcon).click();
    }

    public void BuzzPage() {
        driver.findElement(BuzzIcon).click();
    }

    public void navigateToModule() throws InterruptedException {

        Thread.sleep(3000);
        AdminPage();
        Thread.sleep(3000);
        PimPage();
        Thread.sleep(3000);
        LeavePage();
        Thread.sleep(3000);
        TimePage();
        Thread.sleep(3000);
        RecruitmentPage();
        Thread.sleep(3000);
        MyInfoPage();
        Thread.sleep(3000);
        // PerformancePage();//
        // Thread.sleep(3000);
        DashboardPage();
        Thread.sleep(3000);
        DirectoryPage();
        Thread.sleep(3000);
        ClaimPage();
        Thread.sleep(3000);
        BuzzPage();
    }
}
