import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Base.AccountConfirmationPage;
import pages.Base.MainPage;
import pages.Base.RegistrationPage;

public class RegistrationAsUserTest extends BaseTest {

    @Test
    public void TestRegistrationNewUser(){
        MainPage mainPage = new MainPage(driver);
        mainPage.goToMainPage();
        mainPage.goToRegistrationPage();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.typeNamesAndPassword("Kiril" , "Kiril", "Kiril");
        registrationPage.typeEmailAddress("kiril7@gmail.com"); //After every attempt the number of email has to increase!
        registrationPage.CheckboxesAndContinueButton();
        AccountConfirmationPage accountConfirmationPage = new AccountConfirmationPage(driver);
        Assert.assertTrue(accountConfirmationPage.VisibilityOfConfirmElement());





    }

}
