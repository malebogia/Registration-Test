package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
 protected WebDriver driver;

 @BeforeMethod
 public void setUp(){
     driver = new ChromeDriver();
     driver.manage().window().maximize();

 }


}
