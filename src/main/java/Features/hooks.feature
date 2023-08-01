#Concept of Hooks in Cucumber

Feature: Free CRM app test

Scenario:  free CRM create deal test
    Given user is on deal page
    When user fills the deals form
    Then deal is created
    
Scenario: free CRM create contact test
    Given user is on contact page
    When user fills the contact form
    Then contact is created
    
Scenario Outline: free CRM create mail test
    Given user is on mail page
    When user fills the mail form
    Then mail is created
    Examples:
         | mail1 |
         | mail2 |
         | mail3 |