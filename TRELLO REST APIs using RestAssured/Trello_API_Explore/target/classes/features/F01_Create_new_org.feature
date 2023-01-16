@smoke
Feature: F01: Create New Organization
  Scenario: use api to create new org
    Given Add base path "/1/organizations"
    When  Add Organization name "Test_Org"
    And  Add Token & Key
    And  Method = "Post"
    Then  Status_code is 200
    Then Save id of the returned org