/*
Inheritance:
    Single Inheritance: supported in Java. 
        A(Parent) <- B(Child)   [B extends to A]
    Multi-level Inheritance: Supported in Java.
        A(Parent to B) <- B(Child to A / Parent to C) <- C(Child to B)  [C extends to B, B extends to A => C extends to A]
    Multiple Inheritance: Not Supported in Java, to avoid ambiguity. 
        A(Parent to C): B(Parent to C) <- C(Child to A and B both)  [Not supported]


Method Overloading (Compile-time Polymorphism): Same method with different parameters.
Method Overriding (Run-time Polymorphism): Same method with Inheritance priority.

Final Keyword(Works like constant keyword from Cpp): 
    1. Variable: Makes variable constant, value cannot be changed.
    2. Class: Makes inheritance of that class stop. That means a class with final keyword cannot be inheritted.
    3. Method: Maked method overriding stop. this means we cannot have a same method for using method overriding.
*/

