package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.BrowserUtils.scroll;
import static utilities.BrowserUtils.waitPlease;

public class AvatarPage {

    public AvatarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='Your account']")
    public WebElement ProfilElement;

    @FindBy(xpath = "//a[@class='ng-scope'][1]" )
    public WebElement MyaccountElement;


    @FindBy(xpath = "(//input[@placeholder='Address 1'])[2]" )
    public WebElement Address1Element;

    @FindBy(xpath = "(//input[@ng-model='option.Email'])[1]" )
    public WebElement GeneralConcatEmailCheckBox;

    @FindBy(xpath = "(//input[@ng-model='option.Email'])[2]" )
    public WebElement ReferralConfirmationCheckBox;

    @FindBy(xpath = "(//input[@ng-model='option.Email'])[3]" )
    public WebElement MarketingCheckBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement PasswordElement;

    @FindBy(xpath = "//button[@ng-click='saveChanges()']")
    public WebElement SaveChangesElement;

    @FindBy(xpath = "//div[@ng-show='receivedError']")
    public WebElement ErrorMessageElement;

    @FindBy(xpath = "//div[@ng-if='showAlert']")
    public WebElement SuceessMessageElement;


    @FindBy(xpath = "//h1[text()='My Account']")
    public WebElement MyAccountElement;



    public void Profil(){
        waitPlease(2);
        ProfilElement.click();
        waitPlease(2);
        MyaccountElement.click();

    }

    public void address(){
        Address1Element.clear();
        Address1Element.sendKeys("4 Warwick Road");

    }


    public void ContactOption(){
        if(!GeneralConcatEmailCheckBox.isSelected()) {
           waitPlease(10);
            GeneralConcatEmailCheckBox.click();
        }
        if(!ReferralConfirmationCheckBox.isSelected()) {
            waitPlease(10);
            ReferralConfirmationCheckBox.click();
        }

        if(!MarketingCheckBox.isSelected()) {
            waitPlease(10);
            MarketingCheckBox.click();
        }
    }


    public void ErrorMessage(){
        scroll(MyAccountElement);
        PasswordElement.clear();
        waitPlease(10);
        SaveChangesElement.click();
        waitPlease(10);
        System.out.println(ErrorMessageElement.getText());
        waitPlease(10);
       Assert.assertEquals("password isn't set.",ErrorMessageElement.getText());

    }

    public void SuccessSave() {
        PasswordElement.sendKeys("3K4Mq*S%1ejqV0iu^glcK&o$m4q^D157");
        waitPlease(10);
        SaveChangesElement.click();
    }

    public void SuccessMessage() {
        waitPlease(10);
        Assert.assertEquals("Account updated successfully",SuceessMessageElement.getText());
    }



}
