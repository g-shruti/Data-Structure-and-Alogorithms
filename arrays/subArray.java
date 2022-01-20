import java.io.*;
import java.util.*;

public class subArray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n ;i++){
        arr[i] = scn.nextInt();
    }
    
    printsubArray(arr);
 }
 
 public static void printsubArray(int[] arr){
     for(int st=0; st<arr.length; st++){
         for(int end= st; end<arr.length; end++){
             for(int i=st; i<=end ; i++){
                 System.out.print(arr[i] +"\t");
             }
             System.out.println();
         }
     }
 }

}