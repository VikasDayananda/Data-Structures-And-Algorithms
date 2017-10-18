
   public class ifPrime {
    static int flag=0;
     public static void main(String[] args){
         int m=97;
        System.out.println("Prime number Test "+m);
        
        int n=m/2;
        
       for(int j=2;j<=n;j++){
           
                if(m%j==0){
                    flag=1;
                    break;
                }
                
            }
            if(flag==0){
                 System.out.println("Its prime");
                 
            }
            else
            {
              System.out.println("Not prime");  
            }
            flag=0;
        
        
        
    }
}



