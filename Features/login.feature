Feature: validate login functionality
  
 @DataTable
  Scenario: Validate login functionality with valid credentials
    Given User has launch url "https://www.saucedemo.com/"
    When User has entered credentials
    | Username     | Password     |
    | standard_user| secret_sauce |
    | problem_user| secret_sauce |
    And User has clicked on login button
    Then User verify "Products" on dasboard 
    
   @firstTestcase
  Scenario: Validate login functionality with valid credentials
    Given User has launch url "https://www.saucedemo.com/"
    When User has entered username "standard_user" and password "secret_sauce"
    And User has clicked on login button
    Then User verify "Products" on dasboard
    
  Scenario: Validate login functionality with valid credentials
    Given User has launch url "https://www.saucedemo.com/"
    When User has entered username "standard_user" and password "secre"
    And User has clicked on login button
    Then User verify "Products" on dasboard
   
   @ScenarioOtline 
  Scenario Outline: Validate login functionality
    Given User has launch url "https://www.saucedemo.com/"
    When User has entered username "<Username>" and password "<Password>"
    And User has clicked on login button
    Then User verify "Products" on dasboard
  
  
  Examples:
  | Username      |Password    |
  | standard_user |secret_sauce|
  | standard_user |secret_sauce       |
   
