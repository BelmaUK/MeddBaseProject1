package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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


   @FindBy(xpath="//button[@type=\'submit\']")
   public WebElement SerachElemet;

    @FindBy(xpath="//button[text()=\'Generate CSV\']")
    public WebElement GenerateCSVElement;

    @FindBy(xpath="//div[@class=\'loading-content\']")
    public WebElement LoodingElement;

    @FindBy(xpath="//button[text()='Download CSV']")
    public WebElement DownloadingElement;


    @FindBy(xpath = "//table //thead// th")
    public List<WebElement> TableHeaders;


    public void AbsenceManagementDasboard() {

           AbsenceManagementDasboardElement.click();
       }

     public void SearchByNameAndEmail(String name ) {
         AbsenceMPSearchByNameElement.sendKeys(name);

     }
    public void Search() {
        SerachElemet.click();

    }

    public void CSVDataReport() {
    waitPlease(20);
        GenerateCSVElement.click();
    }

    public void DownloadFile (){
    waitForVisibility(DownloadingElement,100);
        DownloadingElement.click();
    }

   public void HeaderList() {
        for(WebElement header: TableHeaders){
            System.out.println(header.getText());
        }

   }

}
