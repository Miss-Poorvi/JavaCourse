/*

Your task is to write a Java program that:
      1.  Declare two integer variables a = 20 and b = 10.
      2.  Perform the following operations:
           a. Add, subtract, multiply, and divide a and b
           b. Compare if a is greater than b and store the result in a boolean variable
           c. Check if a > b and b > 0 using a logical operator and store the result
      3.  Print the results of all operations using System.out.println() in the specified format.

Expected Output:
  Addition:  30
  Subtraction:  10
  Multiplication:  200
  Division:  2
  Is a greater than b?  true
  Is a > b and b > 0?  true

*/

public class Exercise2 {
    public static void main(String[] args){
     
         // write code here
         int a = 20;
         int b = 10;
         int result = a + b;
         int res2 = a - b;
         int res3 = a * b;
         int res4 = a / b;
         boolean res5 = a > b ;
         boolean res6 = a > b && b > 0;
         
         System.out.println("Addition: "+result);
         System.out.println("Subtraction: " +res2);
         System.out.println("Multiplication: " + res3);
         System.out.println("Division: " + res4);
         System.out.println("Is a greater than b? " + res5);
         System.out.println("Is a > b and b > 0? " + res6);
         
    }
}

