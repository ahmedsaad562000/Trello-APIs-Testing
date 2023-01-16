@smoke
Feature: F03: Create New Board
  Scenario: use api to Create New Board
    Given Add base path "/1/boards"
    When  Add Board name "Test_Board"
    And  Add Token & Key
    And  Method = "Post"
    Then  Status_code is 200
    Then Save id of the returned Board