Feature: Interact with an element of type Links

  Scenario Outline: practice interacting with links elements
    Given Daniel wants interacting with Elements of type Links
    When he select the link that open new tab:
      | <linkType> |
    Then he should see a new window opened
    Examples:
      |linkType |
      |simple   |
      |dynamic  |
