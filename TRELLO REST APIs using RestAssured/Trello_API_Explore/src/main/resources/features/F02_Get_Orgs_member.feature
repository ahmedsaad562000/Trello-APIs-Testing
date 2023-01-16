@smoke
Feature: F02: Get Member Organizations
  Scenario: use api to get member organizations
    Given Add base path "/1/members/me"
    And Add Token & Key
    And Method = "Get"
    Then Status_code is 200