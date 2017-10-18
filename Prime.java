public class Prime {
    static int flag=0;
     public static void main(String[] args){
        System.out.println("Prime number");
        int[] a=new int[101];
        for(int i=1;i<=100;i++){
            a[i]=i;
        }
    
        
       for(int i=1;i<=a.length;i++){
           int m=i/2;
            for(int j=2;j<=m;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
                
            }
            if(flag==0){
                 System.out.println(i);
                 
            }
            flag=0;
        }
        
        
    }
}

