import java.util.Arrays;

public class Anagram {
    public static void main(String args[]) {
       
        System.out.println("Anagram Program");
        isAnagram("sak iv","vikas");
        
    }
    static void isAnagram(String str1, String str2){
        
        String word1=str1.replaceAll("\\s","");
         String word2=str2.replaceAll("\\s","");
       
         char[] array1=word1.toCharArray();
           char[] array2=word2.toCharArray();
        
        Arrays.sort(array1);
         Arrays.sort(array2);
         boolean status= Arrays.equals(array1,array2);
       
        if(status){
           System.out.println(str1+ " and "+ str2 + " are Anagram");
        }
        else
           System.out.println(str1+ " and "+ str2 + " are not Anagram");
    }
}

