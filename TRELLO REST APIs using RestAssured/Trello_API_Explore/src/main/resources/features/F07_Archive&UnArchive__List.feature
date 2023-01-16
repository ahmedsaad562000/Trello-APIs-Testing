@smoke
Feature: F07: Archive & Unarchive List
  Background:
    Given Add base path "/1/lists"
    When  Add List ID
    And Add "closed" to url
    And  Add Token & Key

  Scenario: use api to Archive List
    And Make value = "True"
    And  Method = "Put"
    Then  Status_code is 200

  Scenario: use api to Unarchive List
    And Make value = "False"
    And  Method = "Put"
    Then  Status_code is 200