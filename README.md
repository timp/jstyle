# Illustration of Object creation and member management styles 

There are two conflicting requirements in object creation: 
the need for Objects never to exist in incoherent states and 
the need for them to be testable. 

Doing work in the constructor, such as creating other objects, 
ensures that the object is not in an incoherent state but it means 
that the object is more difficult to test 
as the creation of required objects is hidden and is forced onto 
clients and mocks. 

The functional style with dependency injection ensures that 
objects are always coherent and that they are testable. 
  
