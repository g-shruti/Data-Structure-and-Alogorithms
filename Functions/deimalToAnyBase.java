import java.util.Scanner;

public class deimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
     }
    
     public static int getValueInBase(int n, int b){
         int ans = 0;
         int pow = 1;
         while(n>0){
             int digit = n%b;
             n = n/b;
             
             ans = ans + (digit * pow);
             pow = pow * 10;
         }
         return ans;
     }
}
