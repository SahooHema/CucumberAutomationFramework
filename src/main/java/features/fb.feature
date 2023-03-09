Feature:  Application Test


@Smoke
Scenario: Login 

Given user launch browser
Then user entered username and password
Then user click login button

@Smoke
Scenario: Validate home page title
Given: user check title
