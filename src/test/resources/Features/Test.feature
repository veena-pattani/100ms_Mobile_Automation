
@Test

Feature: Verify the App functions

  Background: Launch the 100ms App
    Given Launch the App


  Scenario: User joining to the room
    Then Verify the "Splash" Page
    Then Verify the "Home" Page
    And User enters the "Name"
    And User enters the "Joining Link"
    And User clicks on "Join Now" button
    Then Verify the "Preview" Page
    And User clicks on "Join Now Room" button
    Then Verify the "Meeting" Page
    And User clicks on "End Call" button
    Then Verify the "Leave Session" Page
    And User clicks on "Leave Session" button
    Then Verify the "Home" Page
