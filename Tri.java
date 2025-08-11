public class Tri {
    public static void main(String[] args) {
        for(int i= 0; i<5; i++) {
            for(int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        System.out.println("the reverse triangle : ");
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
