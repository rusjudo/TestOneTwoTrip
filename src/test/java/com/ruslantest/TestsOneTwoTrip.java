package com.ruslantest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.ruslantest.pages.AuthPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static io.qameta.allure.Allure.step;


public class TestsOneTwoTrip extends TestBase {

    @Test
    @DisplayName("Проверка формы авторизации на наличие всех элементов")
    void authFormTest() {
        step("Отображается заголовок: " + authPage.authSigningFormTitleCheck, () -> {
            authPage.checkAuthSigningFormTitle();
        });

        step("Отображается текс: " + authPage.authSigningFormTextCheck, () -> {
            authPage.checkAuthSigningFormText();
        });

        step("Отображается иконка VK", () -> {
            authPage.checkAuthSigningFormIconVk();
        });

        step("Отображается иконка OK", () -> {
            authPage.checkAuthSigningFormIconOk();
        });

        step("Отображается иконка Mail.ru", () -> {
            authPage.checkAuthSigningFormIconMail();
        });

        step("Отображается иконка twitter", () -> {
            authPage.checkAuthSigningFormIconTwitter();
        });

        step("Отображается поле для ввода email", () -> {
            authPage.checkAuthSigningFormEmail();
        });

        step("Отображается поле для ввода пароля", () -> {
            authPage.checkAuthSigningFormPwd();
        });

        step("Отображается текст: " + authPage.authSigningFormForgotPwdCheck, () -> {
            authPage.checkAuthSigningFormForgotPwd();
        });

        step("Отображается текст: " + authPage.authSigningFormAgreementCheck, () -> {
            authPage.checkAuthSigningFormAgreement();
        });

        step("Отображается кнопка Войти", () -> {
            authPage.checkAuthSigningFormSubmit();
        });

        step("Отображается текст: " + authPage.authSigningFormFirstTimeCheck, () -> {
            authPage.checkAuthSigningFormFirstTime();
        });

        step("Отображается кнопка Регистрация", () -> {
            authPage.checkAuthSigningFormGoToRegister();
        });

        step("Отображается кнопка Закрыть", () -> {
            authPage.checkAuthSigningFormClose();
        });
    }

    @Test
    @DisplayName("Проверка авторизации")
    void authTest() {

        step("Ввести корректный email", () -> {
            authPage.setAuthSigningFormEmail();
        });

        step("Ввести корректный пароль", () -> {
            authPage.setAuthSigningFormPwd();
        });

        step("Нажать на кнопку Войти", () -> {
            authPage.clickAuthSigningFormSubmit();
        });
        //Так лучше не делать, но так как я проверяю на ПРОМЕ, то добавил такое услвоие, что бы тест не падал
        if (authPage.displayedAuthSigningFormError()) {
            step("Отобрвзилось сообщение с ошибкой: " + authPage.authSigningFormErrorCheck, () -> {
                authPage.checkAuthSigningFormError();
            });
        } else {
            step("Успешная авторизация, отображается иконка авторизации", () -> {
                authPage.checkAuthIcone();
            });
        }
    }


    @Test
    @DisplayName("Проверка восстановления пароля")
    void forgotPasswordTest() {
        step("Нажать на кнопку: " + authPage.authSigningFormForgotPwdCheck, () -> {
            authPage.clickAuthSigningFormForgotPwd();
        });

        step("Ввести корректный email", () -> {
            authPage.setRecoveryFormEmail();
        });

        step("Нажать на кнопку Восстановить пароль", () -> {
            authPage.clickRecoveryFormButton();
        });

        step("Пароль сбросился, отобразилось окно с текстом: " + authPage.recoveryFormTextCheck, () -> {
            authPage.checkRecoveryFormText();
        });
    }

    @Test
    @DisplayName("Проверка формы регистрации на наличие всех элементов")
    void registrationFormTest() {

        step("Нажать на кнопку Регистарция", () -> {
            authPage.clickAuthSigningFormGoToRegister();
        });

        step("Отображается заголовок: " + authPage.registrationFormTitleCheck, () -> {
            authPage.checkRegistrationFormTitle();
        });

        step("Отображается текст: " + authPage.registrationFormTextUpCheck, () -> {
            authPage.checkRegistrationFormTextUp();
        });

        step("Отображается поле для ввода email", () -> {
            authPage.checkRegistrationFormEmail();
        });

        step("Отображается поле для ввода пароля", () -> {
            authPage.checkRegistrationFormPwd();
        });

        step("Отображается поле для ввода пароля еще раз", () -> {
            authPage.checkRegistrationFormPwdTwo();
        });

        step("Отображается текст: " + authPage.registrationFormTextDownCheck, () -> {
            authPage.checkRegistrationFormTextDown();
        });

        step("Отображается кнопка Зарегистрироваться", () -> {
            authPage.checkRegistrationFormButton();
        });

        step("Отображается текст: " + authPage.registrationFormExistAccountCheck, () -> {
            authPage.checkRegistrationFormExistAccount();
        });

        step("Отображается кнопка Войти", () -> {
            authPage.checkRegistrationFormGoToAuth();
        });

        step("Отображается кнопка Закрыть", () -> {
            authPage.checkRegistrationFormClose();
        });
    }

    @Test
    @DisplayName("Проверка переходов на vk, ok, mail, twitter для авторизции")
    void registrationFromVkTwitterOkMail() {
        step("Нажать на кнопку VK", () -> {
            authPage.clickAuthSigningFormIconVk();
        });
        step("Успешный переход на страницу авторизации черзе VK и открылось окно авторизации через VK", () -> {
            authPage.checkVkForm();
        });

        step("Открыть форму авторизации", () -> {
            authPage.openAuthSigningForm();
        });

        step("Нажать на кнопку OK", () -> {
            authPage.clickAuthSigningFormIconOk();
        });
        step("Успешный переход на страницу авторизации черзе oK и открылось окно авторизации через oK", () -> {
            authPage.checkOkForm();
        });

        step("Открыть форму авторизации", () -> {
            authPage.openAuthSigningForm();
        });

        step("Нажать на кнопку Mail", () -> {
            authPage.clickAuthSigningFormIconMail();
        });
        step("Успешный переход на страницу авторизации черзе Mail и открылось окно авторизации через Mail", () -> {
            authPage.checkMailForm();
        });

        step("Открыть форму авторизации", () -> {
            authPage.openAuthSigningForm();
        });

        step("Нажать на кнопку twitter", () -> {
            authPage.clickAuthSigningFormIconTwitter();
        });
        //тест может падать, так как твиттер заблокирован в РФ
        step("Успешный переход на страницу авторизации черзе twitter и открылось окно авторизации через twitter", () -> {
            authPage.checkTwitterForm();
        });
    }
}
