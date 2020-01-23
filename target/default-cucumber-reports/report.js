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
  "name": "Assert management information report results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@practical1"
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
  "name": "I navigate to the Absence Overview page",
  "keyword": "When "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_navigate_to_the_Absence_Overview_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the time window",
  "rows": [
    {
      "cells": [
        "START DATE",
        "END DATE"
      ]
    },
    {
      "cells": [
        "30/04/2019",
        "30/10/2019"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_set_the_time_window(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update the data",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.i_update_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The employee surnames on the first 5 pages should include \"Streater\", \"Acland\" and \"De la Yglesia\", but not \"Graddon\" or \"Shoobridge\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.the_employee_surnames_on_the_first_pages_should_include_and_but_not_or(Integer,String,String,String,String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat step_definitions.PracticeTestStepDefinitions.the_employee_surnames_on_the_first_pages_should_include_and_but_not_or(PracticeTestStepDefinitions.java:55)\n\tat ✽.The employee surnames on the first 5 pages should include \"Streater\", \"Acland\" and \"De la Yglesia\", but not \"Graddon\" or \"Shoobridge\"(src/test/resources/practical-test-.feature:29)\n",
  "status": "failed"
});
formatter.step({
  "name": "Print the number of occurrences to the browser console",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeTestStepDefinitions.print_the_number_of_occurrences_to_the_browser_console()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});