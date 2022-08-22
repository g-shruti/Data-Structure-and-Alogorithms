import java.util.*;

public class ringRotate {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r  = scn.nextInt();

        rRotate(arr,s,r);
        display(arr);
    }
        
    public static void display(int[][] arr){
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
               System.out.print(arr[i][j]);
            }
            system.out.println();
            
        } 
    }
    public static void rRotate(int[][] arr, int rno, int r){
        
    }

}
