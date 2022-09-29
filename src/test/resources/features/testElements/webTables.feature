Feature: Interact with an element of type Web Tables

  Scenario Outline: practice add element on web tables elements
    Given Daniel wants interacting with Elements of type Web Tables
    When he adds a new Registration Form:
      | <fistName> | <lastName> | <email> | <age> | <salary> | <department> |
    Then he should see the record in the table
      | <fistName> | <lastName> | <email> | <age> | <salary> | <department> |
    Examples:
      | fistName | lastName | email              | age | salary | department |
      | Daniel   | Porras   | danielp@correo.com | 30  | 1500   | Antioquia  |