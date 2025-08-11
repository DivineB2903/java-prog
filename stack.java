import java.util.*;

public class stack {

    public static void push(int[] stk, int n, int[] index1, Scanner sc) { 
        if (index1[0] == n - 1) {
            System.out.println("Stack is overflow");
        } else {
            System.out.println("Insert any element in the stack: ");
            int element = sc.nextInt();
            index1[0]++;
            stk[index1[0]] = element;  
        }
    }

    public static void print(int[] index1, int[] stk) { 
        if (index1[0] == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = 0; i <= index1[0]; i++) { 
                System.out.println(stk[i]);
            }
        }
    }

    public static void pop(int[] index1) { 
        if (index1[0] == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Deleted element: " + index1[0]);
            index1[0]--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 100;
        int[] stk = new int[n]; 
        int[] index1 = {-1}; 
        int choice;

        while(true) {
            System.out.println("\n1. Insert element\n2. Delete element\n3. Display elements\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

             if (choice == 1) {
                 push(stk, n, index1, sc);
             } else if (choice == 2) {
                 pop(index1);
             } else if (choice == 3) {
                 print(index1, stk);
             } else if (choice == 4) {
                 break;
             } else {
                 System.out.println("Invalid choice. Try again.");
             }
        }

        sc.close();
    }
}
