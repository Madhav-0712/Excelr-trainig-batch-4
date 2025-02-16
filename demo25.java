public class demo25 {
    public static void main(String[] args) {
       
        String arr[][] = {
            {"Yaswanth", "9876543210", "New York, USA"},
            {"Raghu", "8765432109", "Los Angeles, USA"},
            {"Raaju", "7654321098", "Chicago, USA"},
            {"Ramesh", "6543210987", "Houston, USA"},
            {"Suresh", "5432109876", "San Francisco, USA"}
        };

        
        for (String[] friend : arr) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println("----------------------");
        }
    }
}
