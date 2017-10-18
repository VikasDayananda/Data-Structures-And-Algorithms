public class InsertionSort {
    public static void main(String args[]) {
       System.out.println("Insertion Sort");
       int key;
       int[] a=new int[]{7,5,8,3,1,6,2,4,9,0};
        for( int j=1;j<=9;j++){
           int i=j-1;
           key=a[j];
           while(i>=0 && a[i]>key){
               a[i+1]=a[i];
               i=i-1;
               
           }
           a[i+1]=key;
           
       }
       for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
     
    }
}

