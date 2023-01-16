@smoke
Feature: F08: Delete Board
  Scenario: use api to delete Board
    Given Add base path "/1/boards"
    When Add Board ID
    And Add Token & Key
    And Method = "Delete"
    Then Status_code is 200