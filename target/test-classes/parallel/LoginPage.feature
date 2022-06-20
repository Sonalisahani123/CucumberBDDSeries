@Login
Feature: Login page feature

@smoke
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"
@smoke
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

@skip_scenario
Scenario: Login with correct credentials
Given user is on login page
When user enters username "sonali.sahani93@gmail.com"
And user enters password "Sonu@1234"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"