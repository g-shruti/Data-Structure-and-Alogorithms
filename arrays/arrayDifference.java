import java.io.*;
import java.util.*;

public class arrayDiiference{

public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   // Enter array 1
   int n1 = scn.nextInt();
   int a1[] = new int[n1];
   for(int i=0; i<n1; i++){
        a1[i] = scn.nextInt();
   }
   
   //Enter array 2
   int n2 = scn.nextInt();
   int a2[] = new int[n2];
   for(int i=0; i<n2; i++){
        a2[i] = scn.nextInt();
   }
   
   int[] diff = diffOfArray(a1,a2);
   
   int idx =0;
   while(idx< diff.length-1 && diff[idx] ==0){
       idx++;
   }
   int fnz =idx;
   for(int i= fnz; i<diff.length; i++){
       System.out.print(diff[i] +" ");
   }
   System.out.println();
 }
 
 public static int[] diffOfArray(int[] a1 , int[] a2){
     int borrow = 0;
     
     int i = a1.length -1;
     int j = a2.length-1;
     int k = a2.length-1;
     
     int[] res = new int[k+1];
     while(j>=0){
         
         int sub = (a2[j]+ borrow);
         if(i>=0){
             sub -= a1[i];
         }
         
         if(sub<0){
             borrow = -1;
             sub += 10;
         }
         else{
             borrow =0;
         }
         res[k] = sub;
         i--;
         j--;
         k--;
     }
     return res;
     
 }

}