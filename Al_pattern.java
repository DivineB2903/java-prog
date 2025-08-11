import java.util.*;

public class Al_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        char ch = 'A';
        System.out.println("The alphabet triangle :");

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("   "); // Space for alignment
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%3c ", ch++); // Proper formatting for alignment
            }
            System.out.println();
        }

        System.out.println("The reverse alphabet triangle :");
        
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("   "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%3c ", ch++); 
            }
            System.out.println();
        }

        sc.close();
    }
}
