Feature: Create an Account

Background: Positive Login
Given Type the username as 'ramkumar.ramaiah@testleaf.com'
And Type the password as 'Password#123'
When Click on the Log In button
Then Verify the home page is displayed

@smoke @sanity
Scenario Outline: Create an Account
Given Click on toggle menu button from the left corner
And Click view All link
And Click the app name as 'Sales' from the View All Apps page
Given Click the 'Accounts' tab from the Sales Console home page
When Click on New button in the Accounts Object page
And Type the account name in the new account creation page as <accountName>
And Select the ownership in the new account creation page as <ownership>
And click the save button in the new account creation page
Then the account name is displayed in the Account Details page as <accountName>

Examples:
|accountName|ownership|
|NewBestCompany|Public|