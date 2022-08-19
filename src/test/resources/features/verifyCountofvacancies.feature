Feature: Veeam UI test case

  @smoke @takeSS
  Scenario: Compare number of jobs found and value of expected result
    Given user is on careers page
    When user choose Research & Development in All Departments select button
    And user choose English language in All Languages list
    Then compare that number of found jobs and number of expected results
