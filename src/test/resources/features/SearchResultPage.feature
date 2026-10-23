Feature: Search result page functionality verification

  Scenario: Verify search product by manufacturer's name in the filter
    Given User opens Home Page
    When User enter "Laptop" on the search field on the Home page
    And User click search button on the Home Page
    And User select laptop manufacturer on the filter on the Search Rasult Page
    Then Verify founded products are displayed correctly


