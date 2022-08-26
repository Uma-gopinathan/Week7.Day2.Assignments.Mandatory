Feature: Create a new Dashboard

Background: Positive Login
Given Type the username as 'ramkumar.ramaiah@testleaf.com'
And Type the password as 'Password#123'
When Click on the Log In button
Then Verify the home page is displayed

@dryrun
Scenario Outline:
Given Click on toggle menu button from the left corner
And Click view All link
And Click the app name as 'Dashboards' from the View All Apps page
When Click on the New Dashboard option
And Enter Name in the dashboard creation page as <dashboardName>
And Click on Create in the dashboard creation page
Then Verify Dashboard is created and Dashboard name is displayed as <dashboardName>

Examples:
|dashboardName|
|Dashboard by Uma|