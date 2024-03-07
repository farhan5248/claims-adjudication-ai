Feature: Convert Graph To Class

  Background: Create a graph text file

    Given The mbt-transformer plugin, target/Graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:tag1,tag2
          	description:
          		Desc
          		Line 2
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:The Search application, Home page is empty
          	edges:
          		Edge
          			label:
          			tag:
          			description:
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:The Search application, Home page is empty
          			value:
          		Edge
          			label:Story One
          			tag:tag1,tag2
          			description:
          				Desc
          				Line 2
          			source:
          				Vertex
          					label:The Search application, Home page is empty
          			target:
          				Vertex
          					label:end
          			value:
          				The Search application, Home page is empty
          """
    Given The mbt-transformer plugin, target/Graphs/stepdefs/The Search application Home page is empty.graph file is as follows
          """
          Graph
          	name:The Search application, Home page is empty
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:ins
          	edges:
          		Edge
          			label:
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:ins
          			tag:
          			value:
          
          		Edge
          			label:5
          			source:
          				Vertex
          					label:ins
          			target:
          				Vertex
          					label:end
          			tag:
          			value:
          				5
          		Edge
          			label:4
          			source:
          				Vertex
          					label:ins
          			target:
          				Vertex
          					label:end
          			tag:
          			value:
          				4
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Create a class from a graph

      And The target/uml/pst.uml file, Class section will be as follows
          |     Class Name |
          | specs::Process |
      And The target/uml/pst.uml file, Class Comments section will be as follows
          |     Class Name |      Comment |
          | specs::Process | Desc\nLine 2 |
      And The target/uml/pst.uml file, Class Annotations section will be as follows
          |     Class Name | Annotation Name | Annotation Detail |
          | specs::Process |            tags |              tag1 |
          | specs::Process |            tags |              tag2 |

