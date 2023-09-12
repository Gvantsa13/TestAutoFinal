package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            profileIcon = $(".ut2-icon-outline-account-circle"),
            accountLoginButton = $(byText("ანგარიშზე შესვლა")),
            createAccountButton = $(byText("შექმნა")),
            loginWithMobile = $(byText("ტელეფონით")),
            loginWithEmail = $(byText("ელ. ფოსტით")),
            mobileInput = $(byId("login_phone_popup101")),
            emailInput = $(byId("login_email_popup101")),
            passwordInput =$(byId("psw_popup101")),
            loginButton = $(".ty-btn__login"),
            rememberMeCheckBox = $("#remember_me_popup101"),
            nameActual = $(".ty-account-info__name"),
            closeSuccessNotification = $(".cm-notification-close");




}
