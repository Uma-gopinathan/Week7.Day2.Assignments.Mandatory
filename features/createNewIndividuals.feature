@smoke @sanity
Feature: Create Individuals

Background: Positive Login
Given Type the username as 'ramkumar.ramaiah@testleaf.com'
And Type the password as 'Password#123'
When Click on the Log In button
Then Verify the home page is displayed

Scenario Outline: Create Individuals
Given Click on toggle menu button from the left corner 
And Click view All link
And Click the app name as 'Individuals' from the View All Apps page
When Click on the Dropdown icon in the Individuals tab
And Click on New Individual from the Individuals Object page 
And Enter the Last Name as <lastName> 
And Click save in the New Individuals creation page
Then Verify if the new individual is displayed in the Individual page as <lastName>

Examples:
|lastName|
|tim|