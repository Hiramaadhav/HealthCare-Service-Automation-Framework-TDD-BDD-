Feature: Booking Page
Background: Steps common for all scanerios
Given user Launch Chrome browser
When User opens URL "https://katalon-demo-cura.herokuapp.com/"
And click on "Make Appointment"
And user enters Username as "John Doe" and Password as "ThisIsNotAPassword"
And click on login

@regression @functional
Scenario: User Fills the Booking Page

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
And close browser

