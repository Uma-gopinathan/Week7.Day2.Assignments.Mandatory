Feature: Login to Salesforce
Scenario: Positive Login
Given Type the username as 'ramkumar.ramaiah@testleaf.com'
And Type the password as 'Password#123'
When Click on the Log In button
And Click the Switch to Lightning link in home page
Then Verify the home page is displayed