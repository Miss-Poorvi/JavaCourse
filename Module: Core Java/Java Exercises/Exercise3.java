/*

1. You are given the following:
    An integer variable score = 75
    A character variable grade = 'B'

2. Your task is to:
    Use if-else to check if the student passed or failed.
    A score of 50 or above is considered a pass.
    Print "Passed" or "Failed" accordingly.

3. Use else-if conditions to assign and print a grade based on the score:
    A for 90 and above
    B for 75 to 89
    C for 60 to 74
    D for below 60

Expected Output:
    Passed
    Grade:  B

*/

public class Exercise3 {
   public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        if (score > 50){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        
        if (score >= 90){
            System.out.println("Grade: A");
        }
        else if (score >= 75 && score <= 89){
            System.out.println("Grade: B");
        }
        else if (score >= 60 && score <= 74){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: D");
        }
   }
}