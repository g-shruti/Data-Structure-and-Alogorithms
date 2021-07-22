import java.util.Scanner;
public class digit_frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while(n>=1){
            int isd = n%10;
            n= n/10;
            if(isd == d){
                count++;
            }
        }
        
        return count;
    }
}