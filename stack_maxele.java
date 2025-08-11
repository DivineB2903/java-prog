import java.util.*;

public class stack_maxele {


    
    public static int[] getMax(String[] operations, int n) {
        int[] stack = new int[n];
        int[] maxStack = new int[n];
        int top = -1, maxTop = -1;
        int[] result = new int[n];  
        int resIndex = 0;  

        for (int i = 0; i < n; i++) {
            String[] parts = operations[i].split(" ");
            int type = Integer.parseInt(parts[0]);

            if (type == 1) {
                int x = Integer.parseInt(parts[1]);
                top++;
                stack[top] = x;
                
                if (maxTop == -1 || x >= maxStack[maxTop]) {
                    maxTop++;
                    maxStack[maxTop] = x;
                }
            } else if (type == 2) {
                if (top != -1) {
                    int removed = stack[top];
                    top--;
                    if (removed == maxStack[maxTop]) {
                        maxTop--;
                    }
                }
            } else if (type == 3) {
                if (maxTop != -1) {
                    result[resIndex++] = maxStack[maxTop];
                }
            }
        }

        return Arrays.copyOf(result, resIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] operations = new String[n];
        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        int[] result = getMax(operations, n);
        for (int max : result) {
            System.out.println(max);
        }

        sc.close();
    }
}

    
