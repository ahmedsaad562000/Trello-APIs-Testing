@smoke
Feature: F04: Get Boards in an Organizations
  Scenario: Get Boards in an Organizations
    Given Add base path "/1/organizations"
    When Add Organization ID
    And Add Token & Key
    And Method = "Get"
    Then Status_code is 200