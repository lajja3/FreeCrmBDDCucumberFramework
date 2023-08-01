#2. Concept of Scenario Outline with Examples keyword

Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user moves to new contact page
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    #Then close the browser
    
Examples:
    | username | password | firstname | lastname | position |
    | lajjacrm | Crm@3794 | Tom       | Peter    | Manager  |
    | lajjacrm | Crm@3794 | David     | Dsouza   | Director |

  