
import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] a = new int[r][c];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {  // Loop for rows
            for (int j = 0; j < c; j++) {  // Loop for columns
                a[i][j] = scanner.nextInt();
                if (a[i][j] > max) max = a[i][j];  
                if (a[i][j] < min) min = a[i][j];  
            }
        }

        System.out.println("The matrix is : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }

        // diagonal elements (1, 5, 9)
        System.out.println("left to right diagonal elements:");
        for (int i = 0; i < r; i++) {
            System.out.print(a[i][i] + " ");
        }
        System.out.println();

        //  diagonal elements (3, 5, 7)
        System.out.println("right to left diagonal elements:");
        for (int i = 0; i < r; i++) {
            System.out.print(a[i][r - 1 - i] + " ");
        }
        System.out.println();

        // **Print Min and Max Values**
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        scanner.close();
    }
}

