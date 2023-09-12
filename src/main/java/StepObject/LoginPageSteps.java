package StepObject;

import DataObject.LoginPageData;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import PageObject.LoginPage;

public class LoginPageSteps extends LoginPage{
    @Step("პროფილის ღილაკზე დაჭერა")
    public LoginPageSteps ClickProfileIcon(){
        profileIcon.click();
        return this;
    }

    @Step("შესვლა ღილაკზე დაჭერა")
    public LoginPageSteps goToLoginAccount(){
        accountLoginButton.click();
        return this;
    }
    @Step("მობილურით შესვლა")
    public LoginPageSteps loginWithMobile(){
        loginWithMobile.click();
        return this;
    }
    @Step("მობილურის შეყვანა - {mobile}")
    public LoginPageSteps inputMobile(String mobile) {
        mobileInput.setValue(LoginPageData.mobile);
        return this;
    }
    @Step("მეილით შესვლა")
    public LoginPageSteps loginWithEmail(){
        loginWithEmail.click();
        return this;
    }
    @Step("მეილის შეყვანა - {email}")
    public LoginPageSteps inputEmail(String email) {
        emailInput.setValue(LoginPageData.email);
        return this;
    }
    @Step("პაროლის შეყვანა - {password}")
    public LoginPageSteps inputPassword(String password){
        passwordInput.setValue(LoginPageData.password);
        return this;
    }
    @Step("შესვლა ღილაკზე დაჭერა")
    public LoginPageSteps enterLoginButton(){
        loginButton.click();
        return this;
    }
    @Step("დამახსოვრებას მონიშვნა")
    public LoginPageSteps checkRememberMe(){
        rememberMeCheckBox.click();
        return this;
    }
    @Step("წარმატებულის შესვლის მესიჯის გათიშვა")
    public LoginPageSteps closeSuccessNotification(){
        closeSuccessNotification.click();
        return this;
    }


}