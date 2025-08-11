import java.util.*;

public class no_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("The star triangle pattern:");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("   "); // Space for alignment
            }
            for (int k = 1; k <= i; k++) {
                System.out.println("%3d ", num++); // Proper formatting for alignment
            }
            System.out.println();
        }
        

        System.out.println("The reverse number pyramid pattern:");
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("   "); // Space for alignment
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%3d ", num++); // Proper formatting for alignment
            }
            System.out.println();
        }

        sc.close();
    }
}
