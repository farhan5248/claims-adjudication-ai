Feature: Create Step Objects

  # TODO read in layer 3 java files and specify how they're merged
  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
          Given The blah2 service, Json request is executed with
                | i1 | i2 |
                | v5 | v6 |
          Given The blah2 service, Json request is invalid
          Given The blah application, DataTable page, Top section will be as follows
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
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Non existing UML class creation
    And The target/uml/pst.uml file, Class section will be as follows
      | Class Name                       |
      | objects::blah::blahObjectPage    |
      | objects::blah::blahDataTablePage |
      | objects::blah::blahDocStringPage |
      | objects::blah2::blah2JsonRequest |

  Scenario: Non existing UML interaction creation
    And The target/uml/pst.uml file, Class Interactions section will be as follows
      | Class Name                       | Interaction Name |
      | objects::blah::blahObjectPage    | setIsEmpty       |
      | objects::blah::blahDataTablePage | assertToph1      |
      | objects::blah::blahDataTablePage | assertToph2      |
      | objects::blah::blahDocStringPage | setContent       |
      | objects::blah2::blah2JsonRequest | seti1            |
      | objects::blah2::blah2JsonRequest | seti2            |
      | objects::blah2::blah2JsonRequest | execute          |
      | objects::blah2::blah2JsonRequest | setIsInvalid     |

  Scenario: Non existing UML interaction parameter creation
    And The target/uml/pst.uml file, Interaction Parameters section will be as follows
      | Interaction Name                               | Parameter Name |
      | objects::blah::blahObjectPage::setIsEmpty      | has none       |
      | objects::blah::blahDataTablePage::assertToph1  | keyMap         |
      | objects::blah::blahDataTablePage::assertToph2  | keyMap         |
      | objects::blah::blahDocStringPage::setContent   | contents       |
      | objects::blah2::blah2JsonRequest::seti1        | keyMap         |
      | objects::blah2::blah2JsonRequest::seti2        | keyMap         |
      | objects::blah2::blah2JsonRequest::execute      | has none       |
      | objects::blah2::blah2JsonRequest::setIsInvalid | has none       |
