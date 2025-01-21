import java.util.HashSet;

class HashSetDemo1 {
    void HSetMethod() {
        // We can add any type of element here...
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(100); 
        hashSet.add("Madhav");
        hashSet.add(12345.99);
        System.out.println(hashSet);
        
        // We can use the Object class to read any type of elements
        for (Object x : hashSet) {
            System.out.println(x);
        }
    }
}

public class demo27 {
    public static void main(String[] args) {
        HashSetDemo1 obj = new HashSetDemo1();
        obj.HSetMethod();
    }
}