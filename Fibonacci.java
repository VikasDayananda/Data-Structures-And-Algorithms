public class Fibonacci {
    public static void main(String args[]) {
     int[] fibo=new int[100];
      System.out.println("Fibonacci series using Recurssion");
     for(int i=0;i<=20;i++){
     fibo[i]=recurssionFibo(i);
      System.out.println(fibo[i]);
     }
     
     iterationFibo(fibo);
    }
    static int recurssionFibo(int i){
        int value;
        if(i==0||i==1){
            value=1;
        }
        else{
            value=recurssionFibo(i-1)+recurssionFibo(i-2);
        }
     
       return value;
        
    }
   static void iterationFibo(int[] fibo){
          System.out.println("Fibonacci series using Iteration");
        for(int i=0;i<=20;i++){
           if(i==0 || i==1){
               fibo[i]=1;
               System.out.println(fibo[i]);
           }
           else{
               fibo[i]=fibo[i-1]+fibo[i-2];
               System.out.println(fibo[i]);
               
           }
        
        }
        
    }
}

