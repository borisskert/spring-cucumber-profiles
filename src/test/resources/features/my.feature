Feature: My Feature

  Scenario: Get my text with default profile
    Given The application is running
    And No profile is active
    When I ask for my text
    Then I should get 'This is default'

  Scenario: Get my text with debug profile
    Given The application is running
    Given Profile 'debug' is active
    When I ask for my text
    Then I should get 'This is for debug'

  Scenario: Get my text with real profile
    Given The application is running
    Given Profile 'real' is active
    When I ask for my text
    Then I should get 'This is for real!'
