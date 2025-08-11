import java.util.*;

public class vector{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Vector<Integer> v = new Vector<>(3);

            v.add(10);
            v.add(20);
            v.add(30);
            v.add(40);
            v.add(50);

            for(int i : v) {
                System.out.print(i +" ");
            }

            v.remove(4);

            for(int i : v) {
                System.out.println(i + " ");
            }
            


    }
}
