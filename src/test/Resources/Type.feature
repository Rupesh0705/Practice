Feature:
  Background:
    Given User is on the web page of the Argos website
    When user Search for the any products
    Then User should be able to get the selected products
    Given user is on the ResultPage of Homepage click on showmore  Argos Website
    When User click on £10 -£15 Price Range
    Then User should be able to get all the product with in the selected Price Range
    Given User is on the ResultPage of the Argos Website
    When  User click on the selcted Brand button
    Then  User should be able to get the all products of the selected Brand
  Scenario: Select Type Option for nike
      Given User is on the ResultPage of HomePage of Argos WebSite
      When User click on Type option
      Then User should be able to get all the products of the selected option.