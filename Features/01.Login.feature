Feature: Login

@sanity
Scenario: Successful Login With Valid Credentials
Given user Launch Chrome browser
When User opens URL "https://katalon-demo-cura.herokuapp.com/"
And click on "Make Appointment"
And user enters Username as "John Doe" and Password as "ThisIsNotAPassword"
And click on login
Then page title Should be "CURA Healthcare Service"
And close browser








