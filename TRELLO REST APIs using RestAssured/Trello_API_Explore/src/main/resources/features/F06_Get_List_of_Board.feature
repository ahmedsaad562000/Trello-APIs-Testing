@smoke
Feature: F06: Get Boards in an Organizations
  Scenario: Get Lists of a Board
    Given Add base path "/1/boards"
    When Add Board ID
    And Add "lists" to url
    And Add Token & Key
    And Method = "Get"
    Then Status_code is 200