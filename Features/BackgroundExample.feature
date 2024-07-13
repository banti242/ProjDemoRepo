Feature: I wanr Validate login functionality

 Background: common step
    Given User has launch url "https://www.saucedemo.com/"
    When User has entered username "standard_user" and password "secret_sauce"
    And User has clicked on login button
    
  @sample
  Scenario: Validate product on dachboard
 
    Then User verify "Products" on dasboard
   @sample 
  Scenario: Validate Sauce Labs Backpack on dash board
   
    Then User verify "Sauce Labs Backpack" on dasboard