Feature: Account creation and login functionality on Magento website

  Scenario: User creates a new account
    Given the user is on the Magento homepage
    When the user clicks on createAccount button
    And the user enters "First name" in the First Name field
    And the user enters "Last name" in the Last Name field
    And the user enters "Mail id" in the Email Address field
    And the user enters "password" in the createAccount Password field
    And the user enters "password" in the Confirm Password field
    And the user clicks the "Create an Account" button
    Then the user clicks the signout button


  Scenario: User signs into an existing account
    Given the user is on the Magento homepage
    When the user clicks on signIn button
    And the user enters "Mail id" in the Email field
    And the user enters "password" in the signIn Password field
    Then the user clicks on the "Submit" button
