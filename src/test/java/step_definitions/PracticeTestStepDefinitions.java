package step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.*;

import java.util.List;
import java.util.Map;

public class PracticeTestStepDefinitions  {

    Pages pages = new Pages();

    @Given("I have navigated to the AUT")
    public void i_have_navigated_to_the_AUT() {
        pages.loginPage().goToLandingPage();

    }


    @Given("I log in with valid credentials")
    public void i_log_in_with_valid_credentials(List<Map<String, String>> values) {
        System.out.println(values);
        for (Map<String, String> value : values) {
            pages.loginPage().login(value.get("EMAIL"), value.get("PASSWORD"));
        }
    }

    @When("I navigate to the Absence Overview page")
    public void i_navigate_to_the_Absence_Overview_page() {
        pages.MIReports().NavigateAbsenceOverviewPage();

    }

    @When("I set the time window")
    public void i_set_the_time_window(List<Map<String, String>> values) {
        System.out.println(values);
        for (Map<String, String> value : values)
            pages.MIReports().setStartDateandEndDate((value.get("START DATE")), (value.get("END DATE")));
    }

    @When("I update the data")
    public void i_update_the_data() {
        pages.MIReports().UpDateData();
    }


    @Then("The employee surnames on the first {int} pages should include {string}, {string} and {string}, but not {string} or {string}")
    public void the_employee_surnames_on_the_first_pages_should_include_and_but_not_or(Integer int1, String string, String string2, String string3, String string4, String string5) {


        Assert.assertTrue(pages.MIReports().getLastNameText().contains(string));
        Assert.assertTrue(pages.MIReports().getLastNameText().contains(string2));
        Assert.assertTrue(pages.MIReports().getLastNameText().contains(string3));
        Assert.assertFalse(pages.MIReports().getLastNameText().contains(string4));
        Assert.assertFalse(pages.MIReports().getLastNameText().contains(string5));


    }

    @Then("Print the number of occurrences to the browser console")
    public void print_the_number_of_occurrences_to_the_browser_console() {
        System.out.println(pages.MIReports().getLastNameText());


    }

    @When("I navigate to the Absence Management page")
    public void i_navigate_to_the_Absence_Management_page() {
       pages.AbsentMPage().AbsenceManagementDasboard();
    }

    @When("I use {string} as the search criteria")
    public void i_use_as_the_search_criteria(String name) {
        pages.AbsentMPage().SearchByNameAndEmail(name);
    }

    @When("I perform the search")
    public void i_perform_the_search() {
        pages.AbsentMPage().Search();
    }

    @When("I generate the CSV containing the search results")
    public void i_generate_the_CSV_containing_the_search_results() {
        pages.AbsentMPage().CSVDataReport();
    }
    @When("I download the spreadsheet to a predefined directory on the local machine")
    public void i_download_the_spreadsheet_to_a_predefined_directory_on_the_local_machine() {
        pages.AbsentMPage().DownloadFile();
    }

    @Then("The data in the spreadsheet should be consistent with the data displayed on screen *")
    public void the_data_in_the_spreadsheet_should_be_consistent_with_the_data_displayed_on_screen() {
     pages.AbsentMPage().HeaderList();
    }

    @When("I navigate to the Logged-In-User's Profile page")
    public void i_navigate_to_the_Logged_In_User_s_Profile_page() {
    pages.AvatarPage().Profil();
    }

    @When("I update the work address details")
    public void i_update_the_work_address_details() {
    pages.AvatarPage().address();
    }

    @When("I update the contact options")
    public void i_update_the_contact_options() {
        pages.AvatarPage().ContactOption();
    }

    @When("I confirm that an error occurs upon attempting to save without populating the required fields")
    public void i_confirm_that_an_error_occurs_upon_attempting_to_save_without_populating_the_required_fields() {
    pages.AvatarPage().ErrorMessage();
    }

    @When("I save the changes")
    public void i_save_the_changes() {
      pages.AvatarPage().SuccessSave();
    }

    @Then("My changes should have successfully applied")
    public void my_changes_should_have_successfully_applied() {
        pages.AvatarPage().SuccessMessage();
    }

    }