public class demo14 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping (using temp variable):");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping (using temp variable):");
        System.out.println("a = " + a + ", b = " + b);
    }
}
