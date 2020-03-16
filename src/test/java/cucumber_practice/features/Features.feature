Feature: cucumber_practice
  Login on the Linkedin

  Background: User open the home page at https://www.linkedin.com/home


  Scenario: Login with invalid data on the Linkedin
    When I fill in Email with empty email field
    And I fill in Password with empty password field
    And I click on the Log In button
    Then I should see Warning message



  Scenario: Successful login on the Linkedin
    When I fill in Email with valid email
    And I fill in Password with valid password
    And I click on the Log In button
    Then I successfully logged in

