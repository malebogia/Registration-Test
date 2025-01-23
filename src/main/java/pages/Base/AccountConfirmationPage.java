package pages.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountConfirmationPage extends BasePage{

    public AccountConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@id='content']/h1")
    WebElement confirmTextElement;

    public boolean VisibilityOfConfirmElement(){
        return confirmTextElement.isDisplayed();

    }
}


