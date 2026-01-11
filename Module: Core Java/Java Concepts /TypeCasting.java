// Type-casting is of two types: 1. Upcasting 2. Downcasting

// Parent class
class A {
    public void show1() {
        System.out.println("In A show1()");
    }
}

// Child class
class B extends A {
    public void show2() {
        System.out.println("In B show2()");
    }
}

// Main class
public class TypeCasting {
    public static void main(String[] args) {

        // ---------------- UPCASTING ----------------
        // Parent reference holding a Child object
    
        A obj = new B();
        obj.show1();   // Allowed: method of parent class

        // ---------------- DOWNCASTING ----------------
        // Converting parent reference back to child reference
        B obj1 = (B) obj;
        obj1.show2();  // Allowed: method of child class
    }
}

