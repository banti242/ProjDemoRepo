Feature: validate Dashboard functionality

  Scenario: Validate login functionality with valid credentials
    Given User has launch url "https://www.saucedemo.com/"
    When User has entered credentials
    | Username     | Password     |
    | standard_user| secret_sauce |
    And User has clicked on login button
    Then User verify "Products" on dasboard 