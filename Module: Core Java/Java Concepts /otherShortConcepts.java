/*
========================
INHERITANCE IN JAVA
========================

1) Single Inheritance (Supported):
   One child class inherits from one parent class.
   A (Parent) <- B (Child)
   B extends A

2) Multilevel Inheritance (Supported):
   A class inherits from another class, which itself inherits from a parent.
   A <- B <- C
   C extends B, B extends A
   => C indirectly extends A

3) Multiple Inheritance (Not Supported):
   A class cannot inherit from multiple classes to avoid ambiguity.
   A, B <- C   (Not supported)


========================
POLYMORPHISM
========================

1) Method Overloading (Compile-time Polymorphism):
   Same method name with different parameter lists
   (different type / number / order of parameters)

2) Method Overriding (Run-time Polymorphism):
   Same method name and signature
   Requires inheritance
   Child class method has priority at runtime


========================
FINAL KEYWORD
========================

The final keyword is used to restrict modification.

1) Final Variable:
   Makes the variable constant; its value cannot be changed.

2) Final Class:
   Prevents inheritance; the class cannot be extended.

3) Final Method:
   Prevents method overriding in child classes.


========================
ABSTRACT KEYWORD
========================

- Used to create abstract classes and abstract methods.
- Abstract classes cannot be instantiated.
- Can contain abstract methods (no body) and concrete methods (with body).
- Subclasses must implement all abstract methods or be abstract themselves.
- Abstract classes can have constructors, variables, and non-abstract methods.
- Abstract methods cannot be private, final, or static.
- Supports inheritance and runtime polymorphism.

One-line definition:
An abstract class provides a blueprint for subclasses by defining mandatory
methods while preventing direct object creation.


========================
INNER CLASSES
========================

1) Inner Class (Non-static Inner Class):
   - A class defined inside another class.
   - Has access to all members (including private) of the outer class.
   - Requires an object of the outer class to be created.

   Syntax:
   class Outer {
       class Inner { }
   }


========================
ANONYMOUS INNER CLASS
========================

2) Anonymous Inner Class:
   - An inner class without a name.
   - Used to override methods of a class or interface on the spot.
   - Created at the time of object creation.
   - Cannot have a constructor.
   - Used when the class is needed only once.

   Syntax:
   Parent p = new Parent() {
       // method implementation
   };


========================
ABSTRACT CLASS & ANONYMOUS INNER CLASS
========================

3) Abstract Class with Anonymous Inner Class:
   - Anonymous inner classes can be used to provide implementation
     of abstract methods without creating a separate subclass.
   - Commonly used for quick implementations.

   Syntax:
   AbstractClass obj = new AbstractClass() {
       void method() {
           // implementation
       }
   };


========================
KEY DIFFERENCES (Quick View)
========================

Inner Class:
- Has a name
- Reusable
- Requires outer class object

Anonymous Inner Class:
- No name
- Used only once
- Created at object creation time
- Common with abstract classes and interfaces

*/
