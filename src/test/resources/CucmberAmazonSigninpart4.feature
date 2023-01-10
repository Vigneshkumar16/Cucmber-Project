Feature: Amazon Sign in
  As a user, I want to be able to sign in to my Amazon account so that I can access my account information and make purchases.

  @AmazonSign
  Scenario: To create new account in Amazon
    Given To launch the browser and maximise window
    When To lanch the URL of the amazon application
    And To click the signin button and click create new account button
    And To pass Firstname in firstname text box
      | firstname1 | Vignesh  |
      | firstname2 | Python   |
      | fristname3 | Selenium |
      | fristname4 | java     |
    And To pass mobileno text box
      | moblieno1 | moblieno2  | moblieno3   |
      | 789456123 | 4577986512 | 45431329410 |
      | 468431534 | 5464365684 | 84684346314 |
    And To email in email text box
      | mail1             | mail2             |
      | abc@gmail.com     | vign@gmao.com     |
      | hbsjcfj@gmail.com | hzcvsaj@gmail.com |
    And To pass new password using new password text box
    Then To closeEntrie the browser
