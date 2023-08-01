#3. Concept of Test Data Tables - data driven approach in cuccumber 
# Here you only have one set of data
# There is no header name in data table which makes it harder to understand what values are for what

Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
    | lajjacrm | Crm@3794 |
    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then user enters deal details 
    | test deal | 1000 | 50 | 10 |
    #Then close the browser