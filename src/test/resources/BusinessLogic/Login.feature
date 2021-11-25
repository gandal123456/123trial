Feature: Login Functionality

Background: User is successfully logged in
When user open "Chrome" browser with exe "G:\\Automation Support\\chromedriver.exe"
When user enter url as "https://flipkart.com"
Given user cancle the initial login window
Given user move on Login button

@SmokeTest
Scenario: Login functionality with valid username and valid password
When user click on my profile
When user enter "9168313434" as  username
When user enter "DDDD@1234" as  password
When user click on Login button
Then validate Login page




