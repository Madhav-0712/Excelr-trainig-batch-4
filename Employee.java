package PS_001;

public class Employee {
    int id = 10;
    String FirstName = "Yenamala";
    String LastName = "Madhav";
    String Address = "SMPT";
    public void ID(){
    }
    public void Details(int id,String FirstName,String LastName,String Address){
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;

    }
    void getFullName(){
       String res = FirstName+LastName;
       System.out.println("The FullName is "+res); 

    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getFullName();
    }
    
    
}
