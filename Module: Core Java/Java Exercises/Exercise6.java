/*

Instructions:
    Use the following array in your program:
    int[] numbers = {45, 22, 89, 16, 90, 33};

Declare two variables:
    One to keep track of the smallest number (initialize with the first element).
    One to keep track of the largest number (also initialize with the first element).
Use a for-each loop to iterate over the array.
Update the smallest and largest variables as you compare each element.

Expected Output:
    Smallest:  16
    Largest:  90

*/

public class Exercise6 {
    public static void main(String[] args) {
        
        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
        int[] numbers = {45, 22, 89, 16, 90, 33};

        // TODO: Initialize min and max with the first element
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // TODO: Use an enhanced for loop to find min and max
        for(int n : numbers){
            if(n > max){
                max=n;
            }
            if(n < min){
                min = n;
            }
        }
        
        // TODO: Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}


