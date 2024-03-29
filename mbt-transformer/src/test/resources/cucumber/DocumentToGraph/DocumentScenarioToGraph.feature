@debug
Feature: Document Scenario To Graph

  Scenario: Convert tags and description

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          :tags: tag1,tag2
          = Process 

          Desc
          Line 2
          
          [tags="tag1,tag2"]
          == Story One
          
          Desc
          Line 2
          
          === Step 1
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Graph section will be as follows
          |    Name |       Tag |  Description |
          | Process | tag1,tag2 | Desc\nLine 2 |
      And The Process.graph file, Paths section will be as follows
          |      Name |       Tag |  Description |
          | Story One | tag1,tag2 | Desc\nLine 2 |

  Scenario: Convert a section to a vertex each with a single edge

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process 
          
          == Story One
          
          === Step 1
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |      Step 1 |
      And The Process.graph file, Edges section will be as follows
          |           Edge Name |
          | start ->  -> Step 1 |
          |   Step 1 ->  -> end |

  Scenario: Convert multiple sections to multiple vertices each with a single edge

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          === Step 1
          
          === Step 2
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |      Step 1 |
          |      Step 2 |
      And The Process.graph file, Edges section will be as follows
          |            Edge Name |
          |  start ->  -> Step 1 |
          | Step 1 ->  -> Step 2 |
          |    Step 2 ->  -> end |

  Scenario: Convert multiple sections to just one vertex and edge

    The goal here is to not have duplicate vertices or edges

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          === Step 1
          
          == Story Two
          
          === Step 1
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |      Step 1 |
      And The Process.graph file, Edges section will be as follows
          |           Edge Name |
          | start ->  -> Step 1 |
          |   Step 1 ->  -> end |

