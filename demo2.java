import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a :");
        int a = scan.nextInt();
        System.out.print("Give b :");
        int b = scan.nextInt();

        if (a > b) {
            System.out.print("A is greater");
        } else {
            System.out.print("b is greater");
        }
        scan.close();

    }
}
