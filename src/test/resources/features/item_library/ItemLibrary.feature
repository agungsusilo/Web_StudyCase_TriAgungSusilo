@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "agung.smp1@gmail.com" on backoffice login page
    And User input password "takawur27" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    And User click create item button on backoffice item library page
    And User input random item name on create item form
    And User input random price on create item form
    And User input random SKU name on create item form
    And User click save button on create item form
    Then User see newly created item

