package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static utilities.BrowserUtils.*;

public class MIReports {

    public MIReports() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//span[text()='MI reports']")
    public WebElement MIReportsElement;

    @FindBy(xpath = "//td[text()='Absence Overview']")
    public WebElement AbsenceOverviewElement;

    @FindBy(xpath = "//input[@name='date'][1]")
    public WebElement StartDateElement;

    @FindBy(xpath = "(//input[@name='date'])[2]")
    public WebElement EndDateElement;

    @FindBy(xpath = "//button[text()='Update data']")
    public WebElement UpdateDataElement;

    @FindBy(xpath = "//td[@class='ng-scope'][17]")
    public List<WebElement> LastNameList;



    public void  NavigateAbsenceOverviewPage() {
        waitForVisibility(MIReportsElement,5);
        MIReportsElement.click();
        waitForVisibility(  AbsenceOverviewElement,5);
        AbsenceOverviewElement.click();

    }


    public void setStartDateandEndDate(String StartDate,String EndDate) {
        waitForVisibility(StartDateElement,5);
        StartDateElement.clear();
        waitPlease(10);
        EndDateElement.clear();
        waitPlease(10);
        waitForClickablility(StartDateElement, 5);
        StartDateElement.sendKeys(StartDate, Keys.ENTER);
        waitForClickablility(EndDateElement,5);
        EndDateElement.sendKeys(EndDate,Keys.ENTER);
    }


    public void UpDateData() {

        UpdateDataElement.click();
    }



    public List<String> getLastNameText() {
        List<String> LastNameTextList = new ArrayList<>();
        for (WebElement LastName : LastNameList) {
            LastNameTextList.add(LastName.getText());
        }
        return LastNameTextList;
    }




}
