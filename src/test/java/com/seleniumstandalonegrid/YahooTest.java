package com.seleniumstandalonegrid;


import org.testng.annotations.Test;

public class YahooTest extends BaseTest {
    @Test
    public void launchYahoo() {
        driver.get("https://www.yahoo.com");
        System.out.println("Yahoo launched");
    }
}

