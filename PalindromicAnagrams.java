public class PalindromicAnagrams {
    static int[] count=new int[256];
    public static void main(String args[]) {
       
        System.out.println("Check whether the anagram of word  is Palindromic or not");
        isPaliAna("loopp");
    }
    static void isPaliAna(String str){
        int odd=0;
        char[] word=str.toCharArray();
        for(char c:word){
            count[c]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)] == 1){
                odd++;
            }
           
        }
         if(odd>1){
                 System.out.println("It is not Palindromic Anagram");
            }
            else{
                 System.out.println("It is Palindromic Anagram");
            }
    }
}
