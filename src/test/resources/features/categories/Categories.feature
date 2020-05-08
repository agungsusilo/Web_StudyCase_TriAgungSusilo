@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "agung.smp1@gmail.com" on backoffice login page
    And User input password "takawur27" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click create category button on categories page
    And User input Cateogry name "Coffee" on name form
    And User click save button on category page
    Then User see "Coffee" category added


