@new_user_create
Feature: new_user_create
  Scenario Outline: TC01_<PositiveTest>_new_user_create
    Given user on the application "https://editor.datatables.net/"
    And user clicks on the new button
    And user enters the "<firstname>" and "<lastname>" and "<position>" and "<startdate>" and "<salary>"
    And click on create button
    And search for the first name "<firstname>"
    Then verify the name field contains the first name "<firstname>"

    Examples:



      | firstname | lastname | position | startdate  | salary |
      | serdar    | ortac    | QA       | 2023-06-15 | 3000   |







