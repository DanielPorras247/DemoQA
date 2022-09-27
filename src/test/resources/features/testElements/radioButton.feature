Feature: Interact with an element of type Radio Button

  Scenario Outline: practice interacting with radio button elements
    Given Daniel wants interacting with Elements of type Radio Button
    When he select the radio button:
         | <like> |
    Then he should see the message with the option  that selected:
         | <like> |
    Examples:
    |like|
    |yes|
    |impressive|