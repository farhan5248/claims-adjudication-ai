Feature: Convert Step Definitions

  # TODO read in layer 2 java files and specify how they're merged
  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
          Given The blah2 service, Json request is executed with
                | i1 | i2 |
                | v5 | v6 |
          Given The blah2 service, Json request is invalid
          Given The blah application, DataTable page, Top section is as follows
                | h1 | h2 |
                | v1 | v2 |
                | v3 | v4 |
          Given The blah application, DocString page is as follows
                \"\"\"
                text1
                text2
                \"\"\"
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The claim project, target/uml/pst.uml file is present

  Scenario: Non existing UML class creation
    And The target/uml/pst.uml file, Class section is as follows
      | Class Name                             |
      | stepdefs::blah::blahObjectPageSteps    |
      | stepdefs::blah::blahDataTablePageSteps |
      | stepdefs::blah::blahDocStringPageSteps |
      | stepdefs::blah2::blah2JsonRequestSteps |

  Scenario: Non existing UML interaction creation
    And The target/uml/pst.uml file, Class Interactions section is as follows
      | Class Name                             | Interaction Name                                     |
      | stepdefs::blah::blahObjectPageSteps    | theBlahApplicationObjectPageIsEmpty                  |
      | stepdefs::blah::blahDataTablePageSteps | theBlahApplicationDataTablePageTopSectionIsAsFollows |
      | stepdefs::blah::blahDocStringPageSteps | theBlahApplicationDocStringPageIsAsFollows           |
      | stepdefs::blah2::blah2JsonRequestSteps | theBlah2ServiceJsonRequestIsExecutedWith             |
      | stepdefs::blah2::blah2JsonRequestSteps | theBlah2ServiceJsonRequestIsInvalid                  |

  Scenario: Non existing UML interaction annotation creation
    And The target/uml/pst.uml file, Interaction Annotations section is as follows
      | Interaction Name                                                         | Annotation Name                            |
      | stepdefs::blah::blahObjectPageSteps::theBlahApplicationObjectPageIsEmpty | The blah application, Object page is empty |

  Scenario: Non existing UML interaction parameter creation
    And The target/uml/pst.uml file, Interaction Parameters section is as follows
      | Interaction Name                                                                             | Parameter Name |
      | stepdefs::blah::blahObjectPageSteps::theBlahApplicationObjectPageIsEmpty                     | has none       |
      | stepdefs::blah::blahDataTablePageSteps::theBlahApplicationDataTablePageTopSectionIsAsFollows | dataTable      |
      | stepdefs::blah::blahDocStringPageSteps::theBlahApplicationDocStringPageIsAsFollows           | docString      |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith             | dataTable      |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsInvalid                  | has none       |

  Scenario: Non existing UML interaction messages creation
    And The target/uml/pst.uml file, Interaction Messages section is as follows
      | Interaction Name                                                                             | Message          |
      | stepdefs::blah::blahObjectPageSteps::theBlahApplicationObjectPageIsEmpty                     | assertIsEmpty    |
      | stepdefs::blah::blahDataTablePageSteps::theBlahApplicationDataTablePageTopSectionIsAsFollows | assertAttributes |
      | stepdefs::blah::blahDocStringPageSteps::theBlahApplicationDocStringPageIsAsFollows           | assertAttributes |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith             | sendJsonRequest  |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith             | setAttributes    |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsInvalid                  | sendJsonRequest  |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsInvalid                  | setIsInvalid     |

  Scenario: Non existing UML interaction messages argument creation
    Need to verify table headers as passed through to create layer 3 objects

    And The target/uml/pst.uml file, Interaction Messages section is as follows
      | Interaction Name                                                                             | Message          | Argument Name | Annotation Detail |
      | stepdefs::blah::blahDataTablePageSteps::theBlahApplicationDataTablePageTopSectionIsAsFollows | assertAttributes | keyMap        | 0 -> h1 \|h2 \|   |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith             | setAttributes    | keyMap        | 0 -> i1 \|i2 \|   |