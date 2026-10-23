Feature: Product detail page functionalty verification

  Scenario: Verify search same product button on the product detail page
    When User opens Home Page
    And Click on the product from recomendation list on the home page
    And Clck on search similar product button on the product detail page
    And User get name product on the product detail page
    Then Verify name product from the search result list the same as name fist product

