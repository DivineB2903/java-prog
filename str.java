import java.util.*;

public class str{
    public static void main(String[] args) {

        //1Dstring

        // String[] str = {"Hello"};
        // String[] str2 = {"hello","Hello", "HELLO"};
        // for(int i = 0; i<3; i++) {
        //     System.out.println(" "+ str2[i]);
        // }

        //2Dstring
        // String[3][20] str = {"hello", "Hello", "HELLO"};
        // System.err.println(" " + str[0]);
        // System.out.println(str[2]);

        //user input 2D string

        Scanner sc = new Scanner(System.in);

        String[][] str = new String[3][3]; 

        for (int i = 0; i < 3; i++) {
            str[i] = sc.nextLine().split(" "); 
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(String.join(" ", str[i]));
        }

        sc.close();

    }
}
