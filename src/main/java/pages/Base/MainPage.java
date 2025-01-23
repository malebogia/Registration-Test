package pages.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")
    private WebElement myAccount;

    @FindBy (xpath =  "//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[1]/a")
    private WebElement registerButton;



    private String URLLoginPage = "https://auto.pragmatic.bg/";

    public void goToMainPage(){
        driver.get(URLLoginPage);
    }

   public void goToRegistrationPage(){
        clickMyAccount();
        clickRegisterButton();

   }

  private void clickMyAccount(){
        myAccount.click();
   }

  private void clickRegisterButton(){
      registerButton.click();
   }




}
