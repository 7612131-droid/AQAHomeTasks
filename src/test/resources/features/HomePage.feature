Feature: Home page functionality verification

  Scenario: Verify that the new location is displayed correctly
    Given User opens Home Page
    When User click location button on the home page
    And User select new location "Харків" on the pop-up window
    Then Verify new location is displayed

