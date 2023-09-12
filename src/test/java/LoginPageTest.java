import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import StepObject.LoginPageSteps;

import static DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selenide.sleep;


public class LoginPageTest extends ChromeRunner {
        LoginPageSteps loginPageSteps = new LoginPageSteps();

        @Test
        @Description("მობილურის ნომრით შესვლა - წარმატებით")
        @Severity(SeverityLevel.CRITICAL)
        public void successfulLoginViaMobile() {
            loginPageSteps.ClickProfileIcon()
                    .goToLoginAccount()
                    .inputMobile(mobile)
                    .inputPassword(password)
                    .enterLoginButton()
                    .closeSuccessNotification()
                    .ClickProfileIcon();

            Assert.assertEquals(loginPageSteps.nameActual.getText(),nameExpected,
                    "შევამოწმოთ,რომ ნამდვილად შევიდა მომხმარებელი");



        }
        @Test
        @Description("იმეილით შესვლა - წარმატებით")
        @Severity(SeverityLevel.CRITICAL)
        public void successfulLoginViaEmail() {
            loginPageSteps.ClickProfileIcon()
                    .goToLoginAccount()
                    .loginWithEmail()
                    .inputEmail(email)
                    .inputPassword(password)
                    .checkRememberMe()
                    .enterLoginButton()
                    .closeSuccessNotification()
                    .ClickProfileIcon();


            Assert.assertEquals(loginPageSteps.nameActual.getText(),nameExpected,
                    "შევამოწმოთ,რომ ნამდვილად შევიდა მომხმარებელი");

        }
}

