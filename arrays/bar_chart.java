import java.io.*;
import java.util.*;

public class bar_chart{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i]= scn.nextInt();
    }
    scn.close();
    barchart(arr,n);
 }
 public static void barchart(int[] arr, int n){
     int r= n;
     int c = arr[0];
     for(int i=0;i<n;i++){
         if(arr[i]>c){
             c= arr[i];
         }
     }
     for(int j = c-1; j>=0;j--){
         for(int i=0; i<r; i++){
             if(arr[i]>j){
                 System.out.print("*\t");
             }
             else{
                 System.out.print("\t");
             }
         }
         System.out.println();
     }
 }

}