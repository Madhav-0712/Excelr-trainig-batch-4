public class LTcode002{
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

           
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && digit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && digit < -8)) return 0;

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        LTcode002 ri = new LTcode002();
        
       
        System.out.println(ri.reverse(123)); 
        
     
        System.out.println(ri.reverse(-123)); 
        
        
        System.out.println(ri.reverse(120)); 
    }
}