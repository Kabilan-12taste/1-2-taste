$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Lenovo/eclipse-workspace/1-2-taste/src/test/resources/FeatureFiles/LoginwithValid.feature");
formatter.feature({
  "name": "To Check the 1-2 Taste Application Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user can log in with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginWithValid.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid email",
  "keyword": "When "
});
formatter.match({
  "location": "LoginWithValid.the_user_enters_a_valid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginWithValid.the_user_enters_a_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginWithValid.the_user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be redirected to the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginWithValid.the_user_should_be_redirected_to_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
});