@debug
Feature: UML Background To Code

  Scenario: No statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is valid |

  Scenario: One statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Desc line 1
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background section will be as follows
          |  Name | Description |
          | Setup | Desc line 1 |

  Scenario: No statement, one step, two scenarios

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be as follows
          |     Name |                            Step |
          | Submit 1 | Given The Object1 page is valid |
          | Submit 2 | Given The Object2 page is valid |

  Scenario: No statement, one step, three scenarios

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid

            Scenario: Submit 3
               Given The Object3 page is valid
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be as follows
          |     Name |                            Step |
          | Submit 1 | Given The Object1 page is valid |
          | Submit 2 | Given The Object2 page is valid |
          | Submit 3 | Given The Object3 page is valid |

  Scenario Outline: No statement, two steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background Steps section will be as follows
          |   Name |                                  Step |
          |  Setup | Given The Object<Index> page is valid |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |

  Scenario Outline: No statement, three steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
              Given The Object3 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background Steps section will be as follows
          |   Name |                                  Step |
          |  Setup | Given The Object<Index> page is valid |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |
          |     3 |

