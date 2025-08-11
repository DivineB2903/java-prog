import java.util.Scanner;

public class valid_paranthesis {
    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                stack[top] = ch;
            } else {
                if (top == -1) return false;
                
                char last = stack[top];
                if ((ch == ')' && last == '(') ||
                    (ch == '}' && last == '{') ||
                    (ch == ']' && last == '[')) {
                    top--;
                } else {
                    return false;
                }
            }
        }
        return top == -1;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
        sc.close();
    }
}

}
