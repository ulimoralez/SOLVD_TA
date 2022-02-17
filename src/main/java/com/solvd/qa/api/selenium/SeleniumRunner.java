package com.solvd.qa.api.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class SeleniumRunner {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);

        sleep(3000);
        driver.quit();
    }
}
