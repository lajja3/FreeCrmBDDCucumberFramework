#4.Improvised Concept of Test Data Tables with Maps- data driven approach in cuccumber 
# Here you have multiple sets of data
# Also you have header/column name which makes it more understandable
Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
    | Username | Password |
    | lajjacrm | Crm@3794 |
   # | naveenk  | test@123 | it will not work
    
    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then user enters deal details 
    |   Title    | Amount | Probability | Commission |
    | test deal1 | 1000   |     50      |     10     |
    | test deal2 | 2000   |     60      |     20     |
    | test deal3 | 3000   |     70      |     30     |
    
    Then user moves to deal page again
    #Then close the browser