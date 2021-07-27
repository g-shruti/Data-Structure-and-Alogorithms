import java.io.*;
import java.util.*;

public class findElement{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    int e = scn.nextInt();
    scn.close();
     System.out.print(find(arr,n,e));
 }
 
 public static int find(int[] arr, int n, int e){
     int found = -1;
     for(int i =0; i<n; i++){
         if(arr[i]==e){
             found = i;
         }
     }
     return found;
 }

}