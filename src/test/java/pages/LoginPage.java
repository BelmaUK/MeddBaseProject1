package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.BrowserUtils.waitForVisibility;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(id = "inputEmail")
   public WebElement EmailElement;

   @FindBy(id = "inputPassword")
   public WebElement passwordElement;

   @FindBy(xpath = "//div[text()='Sign in']")
    public WebElement SignInElement;


    public void goToLandingPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void login(String EMAIL, String PASSWORD)  {

        EmailElement.sendKeys(EMAIL);
       waitForVisibility(passwordElement,5);
        passwordElement.sendKeys(PASSWORD);
       waitForVisibility(SignInElement,5);
        SignInElement.click();

    }

}
