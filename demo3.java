import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a :");
        int a = scan.nextInt();
        System.out.print("Give b :");
        int b = scan.nextInt();
        System.out.print("Give c :");
        int c = scan.nextInt();



        if (a > b && b > c) {
            System.out.print("A and B are greater then C");
        } else {
            System.out.print("A and C are greater then B");
        }
        scan.close();

    
}
}
