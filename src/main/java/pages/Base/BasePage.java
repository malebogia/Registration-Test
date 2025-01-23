package pages.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
protected WebDriver driver;
protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

protected WebElement waitForVisibility(WebElement element, int timeoutInSeconds){
    wait.withTimeout(Duration.ofSeconds(timeoutInSeconds));
    return wait.until(ExpectedConditions.visibilityOf(element));
}

protected WebElement waitForPresenceOfElement(By locator, int timeoutInSeconds){
        wait.withTimeout(Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}

protected WebElement waitElementToBeClickable(WebElement element, int timeoutInSeconds){
        wait.withTimeout(Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
}




protected void clickElement(WebElement element){
    element.click();
}

protected void typeText(WebElement element,String text){
    element.clear();
    element.sendKeys(text);
}

protected String getText(WebElement element){
    return element.getText();
}


}
