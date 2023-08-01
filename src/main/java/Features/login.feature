#Author: LAJJA PATEL
#Keywords Summary : BDD = Behavioral driven development
#               -> Here you are defining behaviour of your framework
#               -> Gherkin(given,when,then,as,but,and,etc) is the language use to define BDD framework
#               -> Cucumber + Java is the best tool for BDD framework
#               -> you can use cucumber with selenium(automation or UI or frontend) or with API(backend)
#               -> BDD has 3 components : Feature file, Step Definition file, Test runner file
#               -> You can write multiple scenarios in Feature Page or you can create another feature file for another scenario both are correct way
#               -> But the step definition file will be different for each scenarios
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
# To comment anything in feature file just put # at the beginning
#Sample Feature Definition Template
  
  Feature: Free CRM Login Feature
 
 
 #Passing Hard coded values 
  #Scenario: Free CRM Login Test Scenario
   # Given user is already on Login Page
   # When title of login page is Free CRM
   # Then user enters username and password
   # Then user clicks on login button
   # Then user is on home page
   
#1.Data driven without examples keyword  
  #Scenario: Free CRM Login Test Scenario
   # Given user is already on Login Page
   # When title of login page is Free CRM
   # Then user enters "lajjacrm" and "Crm@3794"
   # Then user clicks on login button
   # Then user is on home page
 
 #2. Data driven with examples keyword   
Scenario Outline: Free CRM Login Test Scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    # Then close the browser  -- giving error
 Examples:
           | username | password |
           | lajjacrm | Crm@3794 |
           | tom      | test456  |