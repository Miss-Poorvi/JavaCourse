/*

1. Jagged Arrays: 
A jagged array is an array of arrays in which each inner array can have a different length.
Unlike a rectangular (2D) array, rows in a jagged array are not required to be the same size.

int[][] jagged = {
    {0, 0, 0},              ✔ Row 1 has 3 elements
    {0, 0},                 ✔ Row 2 has 2 elements
    {0, 0, 0, 0}            ✔ Row 3 has 4 elements
};

2. Enhanced For Loop Concept (Typically known as the For-Each loop)
*/

public class JaggedArrays{
    public static void main(String[] args) {

        // Declaration of Jagged Array.
    
        int nums [][] = new int [3][];  //Jagged
        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];

        // Adding random values to the Jagged Arrays

        for(int i=0;i<3;i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        // (Printing a Jagged Array) + (For-Each Loop/Enhanced FOR Loop)

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}


