package inversorstring;



public class ReverseString {

 
    
    
    public static void main(String[] args) {
        String hello = "hello world";
        String newString = "";
        for (int i = hello.length()-1; i>=0; i--) {
           newString = newString +  hello.charAt(i);
        }
        
        System.out.println(""+newString);
    }
    
}
