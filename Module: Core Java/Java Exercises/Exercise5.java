/*

Initialize two numbers (e.g., double num1 = 7;, double num2 = 3;) and an operator (e.g., char operator = '+').
    1. Use a while loop controlled by a String again = "y". Inside the loop, perform exactly one calculation and then set again = "n" so the loop ends after the first run.
    2. Use if-else statements to handle the operator: +, -, *, /.
    3. For division, if num2 is 0, print Cannot divide by zero. and do not perform the division.
    4. Print the result using the exact format:
        Result: <value>
    5. After the loop ends, print a closing message:
        Thank you for using the calculator.

Expected Output
    Result: 10.0
    Thank you for using the calculator.

*/

public class Exercise5 {
    public static void main(String[] args) {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 

        while(again =="y"){
            if(operator == '+'){
                System.out.println("Result: " + (num1 + num2));
            }else if(operator == '-'){
                System.out.println("Result: " + (num1 - num2));
            }else if(operator == '*'){
                System.out.println("Result: " + (num1 * num2));
            }else if(operator == '/' && num2 != 0){
                System.out.println("Result: " + (num1 / num2));
            }
            again = "n";
            System.out.println("Thank you for using the calculator.");
        }

    }
}
