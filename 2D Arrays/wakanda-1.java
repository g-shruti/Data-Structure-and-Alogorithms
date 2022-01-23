import java.io.*;
import java.util.*;

public class wakanda-1{

public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int m = scn.nextInt();
   int[][] arr = new int[n][m];
   for(int i =0; i<n; i++){
       for(int j=0; j<m; j++){
           arr[i][j] = scn.nextInt();
       }
   }
   rowTraversal(arr);
 }
 public static void rowTraversal(int[][] array){
     int row = array.length;
     int col = array[0].length;
     for(int j=0; j<col; j++){
         if(j%2==0){
             for(int i=0; i<row;i++){
                 System.out.println(array[i][j]);
             }
         }
         else{
             for(int i=row-1; i>=0; i--){
                 System.out.println(array[i][j]);
             }
         }
     }
 }

}