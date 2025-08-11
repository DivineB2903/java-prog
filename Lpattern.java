import java.util.*;

public class Lpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int r =sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {  // Loop for rows
            for (int j = 0; j < c; j++) {  // Loop for columns
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println(" "+a[i][j]);
            }
            System.out.print(" ");
        }

        System.out.println("the L-pattern : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) {
                if(j == 0 || i == r-1)
                {
                    System.out.print(" "+a[i][j]);

                }
                else {
                    System.out.print("   ");
                }
                
            }
            System.out.println("  ");
        }
        



    }
    
}
