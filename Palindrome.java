public class Palindrome {
    public static void main(String args[]) {
       
        System.out.println("Palindrome");
        isPali("abbbccddccbbba");
        
    }
    static void isPali(String str){
        
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
           reverse=reverse+str.charAt(i);
           
        }
       
        if(reverse.equals(str)){
           System.out.println(str+" is Palindrome");
        }
        else
         System.out.println(str+" is not a Palindrome");
    }
}

