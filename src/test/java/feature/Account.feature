Feature: Application Account
Background:
Given validate the browser
When Browser is triggered
Then check if browser is started

@portalTest
Scenario: Home page default login1
Given User is on Netbanking landing page
When User login into application with "jin" and "pwd"
Then Home page is populated
And Cards are displayed

@portalTest
Scenario: Home page default login2
Given User is on Netbanking landing page
When User login into application with "dev" and "pwd"
Then Home page is populated
And Cards are not displayed

@portalTest
Scenario Outline: Home page default login4
Given User is on Netbanking landing page
When User login in to application with <userName> and <password>
Then Home page is populated
And Cards are not displayed

Examples:
|userName|password|
|Dev1    |pwd     |
|Dev2    |pwd     |
|Dev3    |pwd     |
