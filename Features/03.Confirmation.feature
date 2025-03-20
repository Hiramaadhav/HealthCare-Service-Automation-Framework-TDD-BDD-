Feature: Confirmation Page
Background: Steps common for all scanerios
Given user Launch Chrome browser
When User opens URL "https://katalon-demo-cura.herokuapp.com/"
And click on "Make Appointment"
And user enters Username as "John Doe" and Password as "ThisIsNotAPassword"
And click on login
Then user is redirected to appointment page
When user click on Facility
And select the Type of Facility
And select the type of healthcare program
And click on visit date icon
And select the visit date
And click on comment
And enters comment "Cardiac Medical Emergency"
And click on book appointment
Then user is redirected to confirmation page

@regression @functional
Scenario: User Verifies the confirmation page
When user is redirected to confirmation page
And verifies page title as "Appointment Confirmation"
And verifies facility as "Seoul CURA Healthcare Center"
And verifies hospitalreadmission as "No"
And verifies healthcareprogram as "Medicaid"
And verifies visitdate as "31/03/2025"
And verifies comment as "Cardiac Medical Emergency"
And close browser
