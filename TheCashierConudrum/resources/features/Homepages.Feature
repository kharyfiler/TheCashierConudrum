@topTag @secondTopTag

Feature: HomePage
  Test related home page

  Background:
    Given I am on the Google search page

  
  Scenario: Verify user can navigate to CodeAcademy.com
    Given User clicks chose your location button
    When User updates location by city name
    Then Location is updated
