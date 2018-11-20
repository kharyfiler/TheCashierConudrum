@topTag @secondTopTag

Feature: HomePage
  Test related home page

  Background:
    Given I am on the Google search page

  
  Scenario: Verify user can navigate to CodeAcademy.com
    Given User types Code Academy into the search bar
    And User presses Enter
    When User selects the top search result
    Then User is redirected to CodeAcademy.com
