Feature: Store login
This feature deals with the login 

Background: 
   Given I navigate to login page
@TC1
Scenario: Login with correct username and password

	#Given I navigate to login page
	And I entered username and password
	And I clicked signin button
	Then Its navigated to the HomePage
	
@TC2
Scenario: Login with wrong credentials
	#Given I navigate to login page from Homepage
	And I entered username and wrong password
	And I clicked signin button
	Then navigated to the error msg 
	
@datatable
Scenario: Login with datatable

	#Given I navigate to login page
	When I entered following details
	| username | password |
	| mercury  | mercury  |
	| mercury  | asdfksjd |
	And I clicked signin button
	Then Its navigated to the HomePage
	
@TC3
Scenario Outline: Data driven testing using Scenarion Outline
	#Given I navigate to login page
	#And I entered username and password
	When I insert "<userName>" and "<passWord>"
	And I clicked signin button
	Then Its navigated to the homepage "<expected Result>"
	@invalid
	Examples:
	| userName | passWord | expected Result |
	| mercury    | mercury | Login Success |
	| mercury    | aaa | Enter your userName and password correct |
	| bbb    | mercury | Enter your userName and password correct |









