package com.ruslantest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.ruslantest.config.Credentials;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class AuthPage {
    private final SelenideElement buttonProfileLogin = $("[data-locator='Button profileLogin']");
    private final SelenideElement authSigningFormTitle = $("[data-locator='ModalContent title']");
    private final SelenideElement authSigningFormText = $("[data-locator='SigninForm']");
    private final SelenideElement authSigningFormIconVk = $("[data-locator='social-icon-vkontakte']");
    private final SelenideElement authSigningFormIconTwitter = $("[data-locator='social-icon-twitter']");
    private final SelenideElement authSigningFormIconOk = $("[data-locator='social-icon-odnoklassniki']");
    private final SelenideElement authSigningFormIconMail = $("[data-locator='social-icon-mailru']");
    private final SelenideElement authSigningFormEmail = $("[data-locator='SigninForm--email']");
    private final SelenideElement authSigningFormPwd = $("[data-locator='SigninForm--pwd']");
    private final SelenideElement authSigningFormForgotPwd = $("[data-locator='SigninForm--forgotPwd']");
    private final SelenideElement authSigningFormAgreement = $("[data-locator='SigninForm--agreement']");
    private final SelenideElement authSigningFormSubmit = $("[data-locator='Button SigninForm--submit']");
    private final SelenideElement authSigningFormFirstTime = $(".fayKg");
    private final SelenideElement authSigningFormGoToRegister = $("[data-locator='SigninForm--goToRegister']");
    private final SelenideElement authSigningFormClose = $("[data-locator='ModalContent closer']");
    private final SelenideElement authSigningFormError = $("[data-locator='SigninForm--error']");
    private final SelenideElement authIcon = $("[data-locator='authLabel desktopAuthLabelAuthorized no-status-badge']");
    private final SelenideElement recoveryFormEmail = $("[name=passwordRecoveryEmail]");
    private final SelenideElement recoveryFormButton = $(".ae-Ci");
    private final SelenideElement recoveryFormText = $("[data-locator='ModalContent body']");
    private final SelenideElement recoveryFormClose = $("[data-locator='Button ForgotPasswordForm--close']");
    private final SelenideElement registrationFormTitle = $("[data-locator='ModalContent title']");
    private final SelenideElement registrationFormTextUp = $(".tkK0O");
    private final SelenideElement registrationFormEmail = $("[data-locator='SignupForm--email']");
    private final SelenideElement registrationFormPwd = $("[data-locator='SignupForm--pwd']");
    private final SelenideElement registrationFormPwdTwo = $("[data-locator='SignupForm--pwd2']");
    private final SelenideElement registrationFormTextDown = $(".V1amm");
    private final SelenideElement registrationFormButton = $("[data-locator='Button SignupForm--submit']");
    private final SelenideElement registrationFormExistAccount = $(".tdvXE");
    private final SelenideElement registrationFormGoToAuth = $("[data-locator='SignupForm--goToAuth']");
    private final SelenideElement registrationFormClose = $("[data-locator='ModalContent closer']");
    private final SelenideElement vkForm = $(".box_msg_gray.box_msg_padded");
    private final SelenideElement twitterForm = $(".auth");
    private final SelenideElement okForm = $(".ext-widget_h_tx");
    private final SelenideElement mailForm = $(".content");
    String urlVk = "https://oauth.vk.com/";
    String vkFormCheck = "Для продолжения вам необходимо войти ВКонтакте.";
    String urlOk = "https://connect.ok.ru/";
    String okFormCheck = "Одноклассники";
    String urlMail = "https://connect.mail.ru/";
    String mailFormCheck = "Необходим доступ к вашим данным";
    String urlTwitter = "https://api.twitter.com/";
    String twitterFormCheck = "Разрешить приложению OneTwoTrip! доступ к вашей учетной записи?";
    String email = Credentials.config.email();
    String password = Credentials.config.passwordOneTwoTrip();
    public String recoveryFormTextCheck = "На адрес " + email + " отправлен новый пароль. Пожалуйста, проверьте почту.";
    public String authSigningFormTitleCheck = "Вход в личный кабинет";
    public String authSigningFormTextCheck = "Войдите с помощью социальной сети или используйте электронную почту.";
    public String authSigningFormForgotPwdCheck = "Забыли пароль?";
    public String authSigningFormAgreementCheck = "Нажимая кнопку «Войти», я соглашаюсь c политикой конфиденциальности и обработкой персональных данных.";
    public String authSigningFormFirstTimeCheck = "Впервые у нас?";
    public String authSigningFormErrorCheck = "Произошел сбой системы. Мы уже занимаемся устранением проблемы, и это займёт некоторое время. Пожалуйста, воспользуйтесь системой чуть позже.";
    public String registrationFormTitleCheck = "Регистрация";
    public String registrationFormTextUpCheck = "Укажите электронную почту и придумайте пароль для входа";
    public String registrationFormTextDownCheck = "Нажимая кнопку «Зарегистрироваться», я соглашаюсь c политикой конфиденциальности и обработкой персональных данных.";
    public String registrationFormExistAccountCheck = "Уже есть аккаунт?";
    public String authSigningFormSubmitCheck, registrationFormGoToAuthCheck = "Войти";
    public String authSigningFormGoToRegisterCheck = "Регистрация";
    public String registrationFormButtonCheck = "Зарегистрироваться";


    public void openAuthSigningForm() {
        buttonProfileLogin.click();
    }

    public void checkAuthSigningFormTitle() {
        authSigningFormTitle.shouldHave(Condition.text(authSigningFormTitleCheck));
    }

    public void checkAuthSigningFormText() {
        authSigningFormText.shouldHave(Condition.text(authSigningFormTextCheck));
    }

    public void checkAuthSigningFormIconTwitter() {
        authSigningFormIconTwitter.shouldBe(Condition.visible);
    }

    public void clickAuthSigningFormIconTwitter() {
        authSigningFormIconTwitter.click();
    }

    public void checkAuthSigningFormIconVk() {
        authSigningFormIconVk.shouldBe(Condition.visible);
    }

    public void clickAuthSigningFormIconVk() {
        authSigningFormIconVk.click();
    }

    public void checkAuthSigningFormIconOk() {
        authSigningFormIconOk.shouldBe(Condition.visible);
    }

    public void clickAuthSigningFormIconOk() {
        authSigningFormIconOk.click();
    }

    public void checkAuthSigningFormIconMail() {
        authSigningFormIconMail.shouldBe(Condition.visible);
    }

    public void clickAuthSigningFormIconMail() {
        authSigningFormIconMail.click();
    }

    public void checkAuthSigningFormEmail() {
        authSigningFormEmail.shouldBe(Condition.visible);
    }

    public void setAuthSigningFormEmail() {
        authSigningFormEmail.setValue(email);
    }

    public void checkAuthSigningFormPwd() {
        authSigningFormPwd.shouldBe(Condition.visible);
    }

    public void setAuthSigningFormPwd() {
        authSigningFormPwd.setValue(password);
    }

    public void checkAuthSigningFormForgotPwd() {
        authSigningFormForgotPwd.shouldHave(Condition.text(authSigningFormForgotPwdCheck));
    }

    public void clickAuthSigningFormForgotPwd() {
        authSigningFormForgotPwd.click();
    }

    public void checkAuthSigningFormAgreement() {
        authSigningFormAgreement.shouldHave(Condition.text(authSigningFormAgreementCheck));
    }

    public void checkAuthSigningFormSubmit() {
        authSigningFormSubmit.shouldBe(Condition.visible);
    }

    public void clickAuthSigningFormSubmit() {
        authSigningFormSubmit.click();
    }

    public void checkAuthSigningFormFirstTime() {
        authSigningFormFirstTime.shouldHave(Condition.text(authSigningFormFirstTimeCheck));
    }

    public void checkAuthSigningFormGoToRegister() {
        authSigningFormGoToRegister.shouldBe(Condition.visible);
    }

    public void clickAuthSigningFormGoToRegister() {
        authSigningFormGoToRegister.click();
    }

    public void checkAuthIcone() {
        authIcon.shouldBe(Condition.visible);
    }

    public void checkAuthSigningFormClose() {
        authSigningFormClose.shouldBe(Condition.visible);
    }

    public void checkAuthSigningFormError() {
        authSigningFormError.shouldHave(Condition.text(authSigningFormErrorCheck));
    }

    public boolean displayedAuthSigningFormError() {
        return authSigningFormError.isDisplayed();
    }

    public void setRecoveryFormEmail() {
        recoveryFormEmail.setValue(email);
    }

    public void clickRecoveryFormButton() {
        recoveryFormButton.click();
    }

    public void checkRecoveryFormText() {
        recoveryFormText.shouldHave(Condition.text(recoveryFormTextCheck));
    }


    public void checkRegistrationFormTitle() {
        registrationFormTitle.shouldHave(Condition.text(registrationFormTitleCheck));
    }


    public void checkRegistrationFormTextUp() {
        registrationFormTextUp.shouldHave(Condition.text(registrationFormTextUpCheck));
    }

    public void checkRegistrationFormEmail() {
        registrationFormEmail.shouldBe(Condition.visible);
    }

    public void checkRegistrationFormPwd() {
        registrationFormPwd.shouldBe(Condition.visible);
    }

    public void checkRegistrationFormPwdTwo() {
        registrationFormPwdTwo.shouldBe(Condition.visible);
    }


    public void checkRegistrationFormTextDown() {
        registrationFormTextDown.shouldHave(Condition.text(registrationFormTextDownCheck));
    }

    public void checkRegistrationFormButton() {
        registrationFormButton.shouldHave(Condition.text(registrationFormButtonCheck));
    }

    public void checkRegistrationFormExistAccount() {
        registrationFormExistAccount.shouldHave(Condition.text(registrationFormExistAccountCheck));
    }

    public void checkRegistrationFormGoToAuth() {
        registrationFormGoToAuth.shouldHave(Condition.text(registrationFormGoToAuthCheck));
    }

    public void checkRegistrationFormClose() {
        registrationFormClose.shouldBe(Condition.visible);
    }

    public void checkVkForm() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlVk));
        vkForm.shouldHave(Condition.text(vkFormCheck));
        closeWindow();
        switchTo().window(0);
    }

    public void checkOkForm() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlOk));
        okForm.shouldHave(Condition.text(okFormCheck));
        closeWindow();
        switchTo().window(0);
    }

    public void checkMailForm() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlMail));
        mailForm.shouldHave(Condition.text(mailFormCheck));
        closeWindow();
        switchTo().window(0);
    }

    public void checkTwitterForm() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlTwitter));
        twitterForm.shouldHave(Condition.text(twitterFormCheck));
        closeWindow();
        switchTo().window(0);
    }

}
