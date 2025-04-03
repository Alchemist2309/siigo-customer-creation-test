package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CustomerPage extends PageObject {

    public void clickButtonInsideShadowDom() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("siigo-button-atom")));
        wait.until(driver -> shadowHost.getShadowRoot() != null);
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement button = shadowRoot.findElement(By.cssSelector("div > div > button"));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }
}