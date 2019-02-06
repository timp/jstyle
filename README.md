# Illustration of Object creation and membership styles 

There are two conflicting requirements in object creation: the need for Objects never to exist in incoherent states and 
the need for them to be testable. 

Doing work in the constructor, such as creating other objects, 
ensures that the object is not in an incoherent state but means that 
the object is more difficult to test as required objects are not passed in and so are difficult to mock. 

The functional style with dependency injection ensures that objects are always coherent and that they are testable. 
  
