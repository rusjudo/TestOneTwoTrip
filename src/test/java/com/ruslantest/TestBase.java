package com.ruslantest;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.ruslantest.config.Credentials;
import com.ruslantest.helpers.Attachments;
import com.ruslantest.helpers.DriverSettings;
import com.ruslantest.pages.AuthPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {

    AuthPage authPage = new AuthPage();


    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        DriverSettings.configure();
    }

    @BeforeEach
    void openMainPage() {
        step("Открыть https://www.onetwotrip.com/", () -> {
            open("");
        });
        step("Открыть форму авторизации", () -> {
            authPage.openAuthSigningForm();
        });
    }
    @AfterEach
    void addAttachments() {
        Attachments.takeScreenshot("Final screenshot");
        Attachments.pageSource();
        Attachments.browserConsoleLogs();
        if (Credentials.isVideoOn()) {
            Attachments.addVideo();
        }
        closeWebDriver();
    }


}
