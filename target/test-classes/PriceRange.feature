Feature: Price Range Functionalities
  Background:
    Given User is on the web page of the Argos website
    When user Search for the any products
    Then User should be able to get the selected products
  Scenario: Price range Selection £10-£15
    Given user is on the ResultPage of Homepage click on showmore  Argos Website
    When User click on £10 -£15 Price Range
    Then User should be able to get all the product with in the selected Price Range


