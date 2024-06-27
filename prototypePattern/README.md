### Explanation
* Document class: This class implements the Cloneable interface. It has fields for title and content, along with getter and setter methods.
* DocumentCloneDemo class: This class creates an original Document object and then clones it.

### Notes
The Prototype Pattern is a creational design pattern that facilitates the copying or cloning of existing objects. It allows you to create new objects by copying a prototype rather than creating new instances from scratch.

Copying an exact copy of another object have some complications,
* Not all objects can be copied by going through all the fields and copying to another object because some of the object’s fields may be private and not visible from outside of the object itself.
* Since you have to know the object’s class to create a duplicate, your code becomes dependent on that class. For example, you have to provide all the dependencies of that class to create a new object. 
* Sometimes you only know the interface that the object follows, but not its concrete class, when, for example, a parameter in a method accepts any objects that follow some interface.

The prototype pattern solves these issues. In Java, the Prototype pattern is available out of the box with a Cloneable interface. Any class can implement this interface to become cloneable.