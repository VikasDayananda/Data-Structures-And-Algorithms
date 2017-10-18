public class SequentialSearch {
    
    public static void main(String args[]) {
       System.out.println("Sequential_Search");
       char[] array=new char[]{'a','b','c','d','z','e','u','o'};
       char key='a';
       int pos= search(array,key);
      
       System.out.println("Element present at position"+" " +pos);
    }
    static int search(char[] array,char key){
        int i=0;
       while(i<array.length && array[i]!=key){
           i=i+1;
       }
       if(i>array.length){
           return -1;
       }
           else
           return i;
       }
    }


