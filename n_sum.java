import java.util.*;

public class n_sum {
    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for N : ");
        int n = sc.nextInt(); 
        System.out.println(sumN(n)); 
    }
}
