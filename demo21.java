import java.util.Scanner;

public class demo21 {

    private double basePay;
    private int hoursWorked;

    public demo21(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public demo21() {
        this.basePay = 8.00;
        this.hoursWorked = 0;
    }

    public void computeSalary() {
        if (basePay < 8.00) {
            System.out.println("Error: Base pay cannot be less than the minimum wage of $8.00.");
            return;
        }

        if (hoursWorked > 60) {
            System.out.println("Error: The number of hours worked cannot exceed 60 in a week.");
            return;
        }

        double totalPay = 0.0;
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        } else {
            totalPay = (40 * basePay) + ((hoursWorked - 40) * basePay * 1.5);
        }

        System.out.println(
                "Total pay for " + hoursWorked + " hours worked at a base pay of $" + basePay + ": $" + totalPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base pay: ");
        double basePay = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        demo21 employee = new demo21(basePay, hoursWorked);
        employee.computeSalary();

        scanner.close();
    }
}