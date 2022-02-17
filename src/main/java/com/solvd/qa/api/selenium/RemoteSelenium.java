package com.solvd.qa.api.selenium;

import com.qaprosoft.carina.core.foundation.webdriver.core.capability.impl.desktop.ChromeCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteSelenium {
    @Test
    public void testRemoteSelenium() throws MalformedURLException, InterruptedException {
        //java -jar selenium-server-standalone-3.5.3.jar
        DesiredCapabilities capabilities = new ChromeCapabilities().getCapability("RemoteSelenium");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.get("www.google.com.ar");
        Thread.sleep(3000);
        driver.quit();
    }
}
