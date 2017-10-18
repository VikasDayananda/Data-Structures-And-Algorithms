public class BubbleSort {
    public static void main(String args[]) {
      
        System.out.println("Bubble Sort");
        int[] array=new int[]{4,6,1,7,9,5,2,9,0,11};
        bubble(array);
        for(int i=0;i<array.length;i++){
             System.out.println(array[i]);
        }
    }

    static void bubble(int[] array){
        boolean swapped=false;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped=true;
                }
                }
                if(swapped==false){
                    break;
            }
        }
    }
}

