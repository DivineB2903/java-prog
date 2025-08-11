import java.util.*;

public class star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("The star triangle pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("The reverse triangle pattern:");
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
}
