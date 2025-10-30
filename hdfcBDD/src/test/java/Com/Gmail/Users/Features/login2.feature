Feature: Store login
 
This feature deals with the login functionality.
 
@TC3
Scenario Outline: Login with correct username and correct password
 
Given I navigate to Browser
Then I navigate "https://demo.guru99.com/test/newtours/index.php"
When I insert "<userName>" and "<passWord>"
And I clicked the signin button
 
# Then Its navigates the UI "<expected Result>"
Then Its navigated to the "<expected Result>"
 
 
Examples:
 
| userName | passWord | expected Result |
 
| mercury | mercury | Login Successfully |
 
| honey | madhu | Enter data Correctly |
 
| abhinav | 2004 | Enter data Correctly |