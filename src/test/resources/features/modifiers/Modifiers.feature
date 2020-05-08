@Web @Modifiers
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "agung.smp1@gmail.com" on backoffice login page
    And User input password "takawur27" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click Create Modifier button on Modifiers page
    And User input "Topping" Set name on create modifier form
    And User click add or manage options button
    And User click Add options button
    And User input modifier name with "Boba"
    And User input random price on add options
    And User click save button on modifier add or manage options
    And User click save on create modifier
    Then User see "Topping" modifier added


