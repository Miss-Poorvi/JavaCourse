/*

Instructions:
    Use a for loop when the number of iterations is fixed (1 to 5).
    Use a while loop to repeat the same logic with a counter.
    Use a do-while loop to show that it runs at least once.
    Each loop's output should be labeled (e.g., "For Loop: 1 2 3 4 5").
    Use System.out.print() to format the output properly.

Expected Output:
    For Loop:  1  2  3  4  5
    While Loop:  1  2  3  4  5
    Do-While Loop:  1  2  3  4  5

*/

public class Exercise4 {
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop:");
        for(int i=1;i<6;i++){
            System.out.print(" " + (i));
        }
        System.out.println();
        // TODO: Print numbers 1 to 5 using while loop
        System.out.print("While Loop:");
        int i=1;
        while(i<6){
            System.out.print(" " + (i));
            i++;
        }
        System.out.println();
        // TODO: Print numbers 1 to 5 using do-while loop
        System.out.print("Do-While Loop:");
        i=1;
        do{
            System.out.print(" " + (i));
            i++;
        }while(i<6);
    }
}
