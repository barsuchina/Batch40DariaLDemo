Feature: Automation Exercise Login testing
#Description: write some requirements
#Background: Common step (optional)
@smoke
Scenario: As a user, I want to login to Automation Exercise with valid credential
Given Open the browser
And pass the Automation Exercise URL

|https://automationexercise.com/|
When Click on Login button in the home page
And Enter the email in the email field

|barsuchina@gmail.com|
And Enter the password in the password field

|Barsuchina|
And Click on Login button in the Login page
And Click on Logout button
Then Validate logout is successful
And Quit all browsers

@regression

Scenario Outline: As a user, I want to login to Automation Exercise with valid credential

Given Open the browser
And pass the Automation Exercise URL "<URL>"
When Click on Login button in the home page
And Enter the email in the email field "<email>"
And Enter the password in the password field "<password>"
And Click on Login button in the Login page
Then Validate login is successful


Examples:
|URL                            |email               |password  |
|https://automationexercise.com/|barsuchina@gmail.com|Barsuchina|
|https://automationexercise.com/|barsuchina@gmail.com|Barsuch   |