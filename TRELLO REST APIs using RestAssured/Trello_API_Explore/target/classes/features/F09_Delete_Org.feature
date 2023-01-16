@smoke
Feature: F09: Delete Organization
  Scenario: use api to delete organizations
    Given Add base path "/1/organizations"
    When Add Organization ID
    And Add Token & Key
    And Method = "Delete"
    Then Status_code is 200