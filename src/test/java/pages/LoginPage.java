package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import java.time.Duration;

public class LoginPage extends PageObject{
    private static final String LOGIN_URL = "https://qastaging.siigo.com/#/login";
    private static final Duration WAIT_TIME = Duration.ofSeconds(30);

    @FindBy(name = "username-input")
    private WebElementFacade usernameSiigo;

    @FindBy(name = "password-input")
    private WebElementFacade passwordSiigo;

    @FindBy(id = "login-submit")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//div[@class='menu-tab-title-label mr-10']")
    private WebElementFacade welcomeMessage;

    public void openLoginPage() {
        openUrl(LOGIN_URL);
        waitForAngularRequestsToFinish();
        withTimeoutOf(WAIT_TIME).waitFor(usernameSiigo);
    }

    public void enterUsername(String username) {
        withTimeoutOf(WAIT_TIME).waitFor(usernameSiigo);
        usernameSiigo.click();
        usernameSiigo.sendKeys(username);
    }

    public void enterPassword(String password) {
        withTimeoutOf(WAIT_TIME).waitFor(passwordSiigo);
        passwordSiigo.click();
        passwordSiigo.sendKeys(password);
    }
    public void clickLogin() {
        withTimeoutOf(WAIT_TIME).waitFor(loginButton);
        loginButton.click();
        waitForAngularRequestsToFinish();
    }
    public void verifyWelcomeMessage(String message) {
        withTimeoutOf(Duration.ofSeconds(60)).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu-tab-title-label mr-10']")));
        element(welcomeMessage).shouldBePresent();
        element(welcomeMessage).shouldBeVisible();
        element(welcomeMessage).shouldContainText("Inicio");
    }
}