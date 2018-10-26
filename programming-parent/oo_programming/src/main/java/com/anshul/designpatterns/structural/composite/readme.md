Composite pattern should be applied only when the group of objects should 
behave as the single object.
Composite design pattern can be used to create a tree like structure.

Composite design pattern is used when we have to represent a part-whole hierarchy.



Composite Pattern consists of following objects.

Base Component – Base component is the interface for all objects in the composition, client 
program uses base component to work with the objects in the composition. It can be an interface 
or an abstract class with some methods common to all the objects.

Leaf – Defines the behaviour for the elements in the composition. It is the building block for 
the composition and implements base component. It doesn’t have references to other Components.

Composite – It consists of leaf elements and implements the operations in base component.





What problems can the Composite design pattern solve? [3]

A part-whole hierarchy should be represented so that clients can treat part and whole objects 
uniformly.
A part-whole hierarchy should be represented as tree structure.
When defining (1) Part objects and (2) Whole objects that act as containers for Part objects, 
clients must treat them separately, which complicates client code.

What solution does the Composite design pattern describe?

Define a unified Component interface for both part (Leaf) objects and whole (Composite) objects.
Individual Leaf objects implement the Component interface directly, and Composite objects 
forward requests to their child components.
This enables clients to work through the Component interface to treat Leaf and Composite objects 
uniformly: Leaf objects perform a request directly, and Composite objects forward the request to 
their child components recursively downwards the tree structure. This makes client classes easier 
to implement, change, test, and reuse.
