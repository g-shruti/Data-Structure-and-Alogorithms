import java.io.*;
import java.util.*;

public class subset{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    
    printSubsets(arr,n);
 }
 public static void printSubsets(int[] arr, int n){
     
     int ts = (int)Math.pow(2,n);
     for(int d=0; d<ts; d++){
         
         int[] bin = decToBinary(d,n);
         
         for(int i = 0; i<n; i++){
             if(bin[i]==0){
                 System.out.print("-\t");
             }
             else{
                 System.out.print(arr[i] +"\t");
             }
         }
         System.out.println();
     }
 }
 
 public static int[] decToBinary(int digit, int num){
     int[] arr = new int[num];
     num =num-1;
     int rem = 0;
     while(digit>=0 && num>=0){
         rem = digit%2;
         arr[num] = rem;
         digit= digit/2;
         num--;
     }
     return arr;
 }
 

}