Feature: Validation of facebook Login page

Scenario: TC01_Validation of Login page with valid userName and valid passWord

Given when user launch the facebook application
When user Enter the valid userName "manimekalai0609@gmail.com" and valid passWord "Desika@2018"
And then click on the submit button
Then verify the Title and home page URL