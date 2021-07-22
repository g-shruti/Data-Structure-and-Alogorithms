import java.util.*;
public class anyBaseToAnyBAse {
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      
      int n2 = baseToDec(n,sourceBase);
      int fans = decimalToBase(n2,destBase);
      
      System.out.print(fans);
      scn.close();
      
   }
   //any base to decimal
   public static int baseToDec(int n , int b){
       int ans  = 0;
       int pow =1;
       while(n>0){
           
           int digit = n%10;
           n = n/10;
           
           ans += digit*pow;
           pow = pow*b;
       }
       return ans;
   }
   
   //decimal to any base
   public static int decimalToBase(int n , int b){
       int ans = 0;
       int pow = 1;
       
       while(n>0){
           int digit = n%b;
           n = n/b;
           
           ans += digit*pow;
           pow *= 10;
       }
       return ans;
       
   }

}
