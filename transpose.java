import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of row and column : ");
        int r = sc.nextInt();
        int c= sc.nextInt();
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
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("The transpose of matrix is : ");
        for(int j=0; j<r; j++) {
            for(int i=0; i<c; i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
}
