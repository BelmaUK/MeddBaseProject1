$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/practical-test-.feature");
formatter.feature({
  "name": "Practical Test",
  "description": "\tIn order to test the AUT\n\tAs a registered user\n\tI want to run the following tests",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Compare absence data with local file",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@practical2"
    }
  ]
});
formatter.step({
  "name": "I have navigated to the AUT",
  "keyword": "Given "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_have_navigated_to_the_AUT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in with valid credentials",
  "rows": [
    {
      "cells": [
        "EMAIL",
        "PASSWORD"
      ]
    },
    {
      "cells": [
        "njF83mf@jN7p.z7B",
        "3K4Mq*S%1ejqV0iu^glcK\u0026o$m4q^D157"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_log_in_with_valid_credentials(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Absence Management page",
  "keyword": "When "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_navigate_to_the_Absence_Management_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I use \"Y\" as the search criteria",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_use_as_the_search_criteria(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I perform the search",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_perform_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I generate the CSV containing the search results",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_generate_the_CSV_containing_the_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I download the spreadsheet to a predefined directory on the local machine",
  "keyword": "When "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_download_the_spreadsheet_to_a_predefined_directory_on_the_local_machine()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The data in the spreadsheet should be consistent with the data displayed on screen *",
  "keyword": "Then "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.the_data_in_the_spreadsheet_should_be_consistent_with_the_data_displayed_on_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});