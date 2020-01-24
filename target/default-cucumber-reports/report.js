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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027»\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BELMAs-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:e1:2ecc:ddfb:57f1%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/b4/tvtzb15n5nx...}, goog:chromeOptions: {debuggerAddress: localhost:54568}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 971d9b3e9ebbd7cf2371baad9e94e79b\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027»\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\n\tat pages.AbsentMPage.RowNumber(AbsentMPage.java:122)\n\tat step_definitions.PracticeTestStepDefinitions.the_data_in_the_spreadsheet_should_be_consistent_with_the_data_displayed_on_screen(PracticeTestStepDefinitions.java:105)\n\tat ✽.The data in the spreadsheet should be consistent with the data displayed on screen *(src/test/resources/practical-test-.feature:45)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});