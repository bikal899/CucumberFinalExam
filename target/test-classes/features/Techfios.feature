Feature: Validate Techfios Page

Background:
Given I am in Techfios WebPage
When I click on the SkyBlueButton button


Scenario: Change Background color to SkyBlue
Given Verify SkyBlue Background button exists
When I click on the SkyBlueButton button
Then the background color will change to sky blue

Scenario: Change Background color to SkyBlue
Given Verify White Background button exists
Then Click on White Background button
Then the background color will change to White
