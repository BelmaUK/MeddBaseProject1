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
  "name": "Update the logged-in-user\u0027s details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@practical3"
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
  "name": "I navigate to the Logged-In-User\u0027s Profile page",
  "keyword": "When "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_navigate_to_the_Logged_In_User_s_Profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update the work address details",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_update_the_work_address_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update the contact options",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_update_the_contact_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirm that an error occurs upon attempting to save without populating the required fields",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_confirm_that_an_error_occurs_upon_attempting_to_save_without_populating_the_required_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I save the changes",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_save_the_changes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My changes should have successfully applied",
  "keyword": "Then "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.my_changes_should_have_successfully_applied()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});