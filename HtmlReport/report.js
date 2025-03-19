$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Lenovo/eclipse-workspace/1-2-taste/src/test/resources/FeatureFiles/Quote.feature");
formatter.feature({
  "name": "To Check then 1-2 taste Application Request a Quote Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Request a Quote for a product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to the product listing pages",
  "keyword": "Given "
});
formatter.match({
  "location": "Quote.user_navigate_to_the_product_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the Request a Quote button",
  "keyword": "When "
});
formatter.match({
  "location": "Quote.user_click_on_the_Request_a_Quote_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to the quote details page",
  "keyword": "And "
});
formatter.match({
  "location": "Quote.user_should_be_redirected_to_the_quote_details_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please select some product options before adding this product to your quote list.}\n  (Session info: chrome\u003d133.0.6943.143): Please select some product options before adding this product to your quote list.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-AOJIHBP7\u0027, ip: \u0027192.168.1.185\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002723.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 133.0.6943.143, chrome: {chromedriverVersion: 133.0.6943.141 (2a5d6da0d61..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:55657}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: cbca375d7e910fd8e9d421e8f0b30967\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:287)\r\n\tat org.base.BaseClass.getCurrentURL(BaseClass.java:209)\r\n\tat org.stepdefinitions.Quote.user_should_be_redirected_to_the_quote_details_page(Quote.java:40)\r\n\tat ✽.User should be redirected to the quote details page(file:/C:/Users/Lenovo/eclipse-workspace/1-2-taste/src/test/resources/FeatureFiles/Quote.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User fill in the quote request form with valid details",
  "keyword": "And "
});
formatter.match({
  "location": "Quote.user_fill_in_the_quote_request_form_with_valid_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on the Send Your Request button",
  "keyword": "And "
});
formatter.match({
  "location": "Quote.user_click_on_the_Send_Your_Request_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "an email should be triggered with an order number",
  "keyword": "And "
});
formatter.match({
  "location": "Quote.an_email_should_be_triggered_with_an_order_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be redirected to the order confirmation page with the Order ID",
  "keyword": "Then "
});
formatter.match({
  "location": "Quote.user_should_be_redirected_to_the_order_confirmation_page_with_the_Order_ID()"
});
formatter.result({
  "status": "skipped"
});
});