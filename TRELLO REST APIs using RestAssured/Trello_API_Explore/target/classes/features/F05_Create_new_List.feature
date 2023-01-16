@smoke
Feature: F05: Create New List
  Scenario: use api to Create New List
    Given Add base path "/1/lists"
    When  Add List name "Test_List"
    And  Add Token & Key
    And  Method = "Post"
    Then  Status_code is 200
    Then Save id of the returned List