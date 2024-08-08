package com.seleniumstandalonegrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

	protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (browser.equalsIgnoreCase("chrome")) {
            capabilities.setBrowserName("chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            capabilities.setBrowserName("firefox");
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
