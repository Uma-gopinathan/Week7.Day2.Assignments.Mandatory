Feature: Create a new Opportunity
Background: Positive Login
Given Type the username as 'ramkumar.ramaiah@testleaf.com'
And Type the password as 'Password#123'
When Click on the Log In button
Then Verify the home page is displayed

@regression @smoke
Scenario Outline: Create new Opportunity with all fields
Given Click on toggle menu button from the left corner 
And Click view All link
And Click the app name as 'Sales' from the View All Apps page
When Click the 'Opportunities' tab from the Sales Console home page
And Click on New button in the Opportunities object page
And Enter Opportunity name as <opportunityName>
And Select Stage in the new Opportunity creation page as <opportunityStage>
And Enter the opportunity close date in the new Opportunity creation page as <closeDate>
And Click Save in the new Opportunity creation page
Then Opportunity is created as <opportunityName>

Examples:
|opportunityName|opportunityStage|closeDate|
|Salesforce Automation by Uma|Needs Analysis|9/3/2022|

Scenario Outline: Create Opportunity without mandatory fields
Given Click on toggle menu button from the left corner 
And Click view All link 
And Click the app name as 'Sales' from the View All Apps page
When Click the 'Opportunities' tab from the Sales Console home page
And Click on New button in the Opportunities object page 
And Enter the opportunity close date in the new Opportunity creation page as <tomorrowDate>
And Click Save in the new Opportunity creation page  
Then Verify the Alert message is displayed for Name and Stage as <verifyMessage>

Examples:
|tomorrowDate|verifyMessage|
|8/27/2022|Complete this field.|