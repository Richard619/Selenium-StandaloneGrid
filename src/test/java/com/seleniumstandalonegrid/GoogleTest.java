package com.seleniumstandalonegrid;

import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    @Test
    public void launchGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Google launched");
    }
}
