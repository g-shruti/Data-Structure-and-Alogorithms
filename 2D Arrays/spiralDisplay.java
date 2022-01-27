import java.io.*;
import java.util.*;

public class spiralDisplay {

    public static void main(String[] args) throws Exception {
       Scanner scn =  new Scanner(System.in);
       int n = scn.nextInt();
       int m = scn.nextInt();
       int[][] array = new int[n][m];
       for(int i=0; i<n; i++){
           for(int j=0 ; j<m; j++){
               array[i][j] = scn.nextInt();
           }
       }
       spiralDisplay(array);
    }
    
    public static void spiralDisplay(int[][]arr){
        int rs =0;
        int re = arr.length-1;
        int cs=0;
        int ce = arr[0].length-1;
        int te =(arr.length* arr[0].length);
        int count =0;
        while(count<te){
            //left wall
            for(int i =rs; i<=re && count<te; i++){
                System.out.println(arr[i][cs]);
                count++;
            }
            cs++;
            //bootom wall
            for(int j=cs; j<=ce &&count<te; j++){
                System.out.println(arr[re][j]);
                count++;
            }
            re--;
            //right wall
            for(int i = re; i>=rs && count<te; i--){
                System.out.println(arr[i][ce]);
                count++;
            }
            ce--;
            //top wall
            for(int j =ce; j>=cs &&count<te; j--){
                System.out.println(arr[rs][j]);
                count++;
            }
            rs++;
        }
    }

}