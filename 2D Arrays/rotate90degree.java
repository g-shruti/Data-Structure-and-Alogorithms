import java.util.*;
public class rotate90degree {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j =0 ; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        rotate(arr);
        display(arr);
    }    
    public static void rotate(int[][] arr){
        transpose(arr);
       
        colRev(arr);
    }
    public static void transpose(int[][] arr){
        for(int i= 0 ; i< arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] =  arr[j][i];
                arr[j][i] = temp;
            }
        }  
    }
    public static void colRev(int[][] arr){
        int lo =0;
        int hi = arr.length-1;
        while(lo<hi){
            for(int i = 0; i<arr.length; i++){
                int temp = arr[i][lo];
                arr[i][lo] = arr [i][hi];
                arr[i][hi] = temp;
            }
            lo++;
            hi--;
        }
    }
    public static void display(int[][] arr){
        for(int i= 0 ; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }

    }
}
