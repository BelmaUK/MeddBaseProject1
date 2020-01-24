package pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static utilities.BrowserUtils.*;

public class AbsentMPage {


    public AbsentMPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@ng-show='CanViewAbsences']")
    public WebElement AbsenceManagementDasboardElement;


    @FindBy(xpath = "//input[@placeholder='Search by name or email']")
    public WebElement AbsenceMPSearchByNameElement;


    @FindBy(xpath = "//button[@type=\'submit\']")
    public WebElement SerachElemet;

    @FindBy(xpath = "//button[text()=\'Generate CSV\']")
    public WebElement GenerateCSVElement;

    @FindBy(xpath = "//div[@class=\'loading-content\']")
    public WebElement LoodingElement;

    @FindBy(xpath = "//button[text()='Download CSV']")
    public WebElement DownloadingElement;


    @FindBy(xpath = "//table //thead// th")
    public List<WebElement> TableHeaders;

    @FindBy(xpath = "//table //thead// td")
    public List<WebElement> TableData;


    @FindBy(xpath = "//table//tbody//tr")
    public List<WebElement> TableRowElement;

    @FindBy(xpath = "//span[text()='»']")
    public WebElement NextLocator;

    List<WebElement> TotatlWebElement = new ArrayList<>();

    List<String> AbsenceTableList = new ArrayList<>();

    int TableRowCount;

    public void AbsenceManagementDasboard() {

        AbsenceManagementDasboardElement.click();
    }

    public void SearchByNameAndEmail(String name) {
        AbsenceMPSearchByNameElement.sendKeys(name);

    }

    public void Search() {
        waitPlease(2);
        SerachElemet.click();

    }

    public void CSVDataReport() {
        waitPlease(20);
        GenerateCSVElement.click();
    }

    public void DownloadFile() {
        waitForVisibility(DownloadingElement, 100);
        waitPlease(10);
        DownloadingElement.click();
    }

    public void HeaderList() {
        for (WebElement header : TableHeaders) {
            waitPlease(10);
            System.out.println(header.getText());
        }
    }

    public void AbsenceTable() {

        for (WebElement header : TableHeaders) {
            AbsenceTableList.add(header.getText());
        }
        for (WebElement data : TableData) {
            AbsenceTableList.add(data.getText());
        }

        if (NextLocator.isDisplayed()) {
            NextLocator.click();
            waitPlease(10);
            for (WebElement data : TableData) {
                AbsenceTableList.add(data.getText());
            }

        }
        System.out.println(AbsenceTableList.toString());

    }

    public int RowNumber() {
        Boolean hasNext=true;
        try {
              while(hasNext)   {
            TableRowCount += TableRowElement.size();
                  waitPlease(3);
               NextLocator.click();
               hasNext=true; }

        } catch (NoSuchElementException e) {

        }
        return TableRowCount;

    }

}






