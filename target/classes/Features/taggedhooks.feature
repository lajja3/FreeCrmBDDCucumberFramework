# Concept of Tagged Hooks
# Mostly two types of hooks : Global and Tagged Hooks

Feature: Test Tagged Hooks

# @First, @Second and @Third are the tags
@First
Scenario: This is First test
    Given this is the first step
    When this is the second step
    Then this is the third step

@Second   
Scenario: This is Second test
    Given this is the first step
    When this is the second step
    Then this is the third step

@Third   
Scenario: This is Third test
    Given this is the first step
    When this is the second step
    Then this is the third step   