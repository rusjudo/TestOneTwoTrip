package com.ruslantest.helpers;

import com.codeborne.selenide.Configuration;
import com.ruslantest.config.Credentials;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {

    public static void
    configure() {
        Configuration.baseUrl = "https://www.onetwotrip.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "110");


        if (Credentials.isRemoteWebDriver()) {
            String user = Credentials.config.user();
            String password = Credentials.config.password();
            String remote = Credentials.config.remote();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = "https://" + user + ":" + password + "@" + remote;
        }
    }
}