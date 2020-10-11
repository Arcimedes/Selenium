Feature: Login to page

Scenario: Login to page
  Given I navigate to the login page
  And I enter to username as admin and password as admin
  And I click login button
  Then I should see the userform page


