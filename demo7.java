import java.util.Scanner;
public class demo7 {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your Name:");
        String Name = scan.nextLine();
        System.out.print("Enter Your Age:");
        int Age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your Phno:");
        String Phno = scan.nextLine();

        System.out.println("Hello " + Name + ", you are " + Age + " years old, and your phone number is " + Phno + ".");

        scan.close();
     }
}
