import java.util.Scanner;

public class MultiDimensionInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] [] arr = new int [3] [3]; 
        // System.out.println(arr.length); // no of rows


        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
    }
    
}
