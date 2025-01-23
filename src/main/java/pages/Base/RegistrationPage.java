package pages.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    WebElement typeFirstName;

    @FindBy(id = "input-lastname")
    WebElement typeLastName;

    @FindBy(id = "input-email")
    WebElement typeEmail;

    @FindBy(id = "input-password")
    WebElement typePassword;

    @FindBy(id = "input-newsletter")
    WebElement subscribeCheck;

    @FindBy(xpath = "//input[@type='checkbox'][@name='agree']")
    WebElement privacyPolicyCheck;

    @FindBy(xpath = "//*[@id='form-register']//button[@type='submit']")
    WebElement continueButton;


    public void typeNamesAndPassword(String firstName, String lastName, String password) {
        typeFirstName.sendKeys(firstName);
        typeLastName.sendKeys(lastName);
        typePassword.sendKeys(password);

    }

    public void typeEmailAddress(String email) {
        typeEmail.sendKeys(email);


    }

    public void CheckboxesAndContinueButton(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        waitElementToBeClickable(subscribeCheck,2);
        if (subscribeCheck.isSelected()){
            js.executeScript("arguments[0].click();", subscribeCheck);
        }

        waitElementToBeClickable(privacyPolicyCheck,2);
        if (!privacyPolicyCheck.isSelected()){
            js.executeScript("arguments[0].click();", privacyPolicyCheck);
        }

        js.executeScript("arguments[0].click();", continueButton);
    }
}






