@tag
Feature: Login Action

@tag1 @RegressionTest
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User clicks button
	Then Message displayed Login Successfully
	

@tag2 @SmokeTest @RegressionTest
Scenario Outline: The user should be able to login
    Given User is on Insurance Project Page
    When the user enter "<username>" and "<password>" and login
    Then User login succesfully
    
  
Examples:
	| username 			| password |
	| abc123@gmail.com  | abc123 |
	
	@tag3 @RegressionTest
Scenario: Successful Logout
	Given User has successfully signed in
	When User clicks logout button
	Then Message displayed Logout Successfully
	
	@tag4 @RegressionTest
Scenario: Opening agile project
    Given User is on home page
	When User click on agile project
	Then Message displayed page opened Successfully
	
	@tag5 @SmokeTest @RegressionTest
Scenario Outline: The user should be able to login using given credentials
    Given User is on Agile Project Page
    When the user will enter "<userid>" and "<pwd>" and login
    Then User login successful
    
  
Examples:
	| userid	| pwd |
	| 1303  | Guru99 |
	
	
	@tag6 @RegressionTest
Scenario: Print mini statement
    Given User should click on mini statement
	When User should select an id
	Then Mini Statement page will display
	
		@tag7 @RegressionTest
Scenario: user should logout from agile project
    Given User should click logout button
	When User should handle alert box
	Then user should be able to logout
	
	
	@tag8 @NegativeTest
	Scenario Outline: User should not be able to login with invalid credentials
	Given User is on Bank Project Page
	When User enters "<usename>" and "<pasword>" and login 
	Then Message displayed that user is not valid
	
	Examples:
	| usename 			| pasword |
	| abc123@gmail.com  | abc123 |
	
		@tag9 @SmokeTest
	Scenario Outline: User should be able to click the reset button
	Given User entered "<ue>" and "<pd>" 
	When User clicks reset button
	Then User name and password is reset
	
	Examples:
	| ue 			| pd |
	| abc123@gmail.com  | abc123 |
	
	@tag10 @SmokeTest
	Scenario Outline: User should be able to login with correct credentials
	Given User is on Bank Project Page
	When User enters "<usename>" and "<pasword>" and login 
	Then User has logged in
	
		Examples:
	| usename 		| pasword |
	| mngr281677  | aqadEbY  |
 	
          	