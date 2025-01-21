import java.util.Scanner;

public class demo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a participant:");
        String reply = sc.nextLine();

        if (reply.equalsIgnoreCase("yes")) {
            System.out.println("Happy Sankranthi To All");
        }

        sc.close();
    }
}
