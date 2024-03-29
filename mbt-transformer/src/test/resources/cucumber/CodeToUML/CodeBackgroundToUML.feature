@debug
Feature: Code Background To UML

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            Background: Setup
              Given The blah1 application, Object1 page is valid
          
            @tag1
            Scenario: Submit
              And The Object2 page is empty
              And The blah2 application, Object3 page is empty
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Create background steps

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                      Message |
          |  specs::Process::Setup | The blah1 application, Object1 page is valid |
          | specs::Process::Submit |                    The Object2 page is empty |
          | specs::Process::Submit | The blah2 application, Object3 page is empty |

