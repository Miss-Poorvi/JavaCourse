/*
Inheritance:
    Single Inheritance: Supported in Java.
        A (Parent) <- B (Child)   [B extends A]

    Multi-level Inheritance: Supported in Java.
        A (Parent of B) <- B (Child of A / Parent of C) <- C (Child of B)
        [C extends B, B extends A ⇒ C indirectly extends A]

    Multiple Inheritance: Not supported in Java to avoid ambiguity.
        A (Parent of C), B (Parent of C) <- C (Child of both A and B)
        [Not supported]


Method Overloading (Compile-time Polymorphism):
    Same method name with different parameters.

Method Overriding (Run-time Polymorphism):
    Same method name with inheritance and parent–child priority.


Final Keyword (Works like the const keyword in C++):
    1. Variable: Makes the variable constant; its value cannot be changed.
    2. Class: Prevents inheritance. A class declared as final cannot be inherited.
    3. Method: Prevents method overriding; the method cannot be overridden in child classes.
*/