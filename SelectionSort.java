public class SelectionSort {
    public static void main(String args[]) {
      
        System.out.println("Selection Sort");
        int[] array=new int[]{4,6,1,7,9,5,2,9,0,11};
        selection(array);
        for(int i=0;i<array.length;i++){
             System.out.println(array[i]);
        }
    }

    static void selection(int[] array){
        int min=0;
        int n=array.length;
        for(int i=0;i<n-2;i++){
              min=i;
            for(int j=i;j<n-1;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            if(min!=i){
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
            }
        }
    }
}


