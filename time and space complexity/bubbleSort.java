
import java.util.*;

public class bubbleSort{
    //bubbleSort
    public static void Sort(int[] arr){
        int n = arr.length;
        for(int i =1; i<n;i++){
            for(int j=0; j<n-i; j++){
                if(compare(arr,j+1,j)== true){
                    swap(arr,j+1,j);
                }
            }
        }
    }
    //compare jth and j+1th element
    public static boolean compare(int[] arr, int i , int j){
        System.out.println("Comparing " + arr[i] +" and "+ arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }else{
            return false;
        }
        
    }
    //swapping jth and j+1th element
    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping "+arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    //printing the array
    public static void print(int[] arr){

        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int[] arr  = new int[n];
          for ( int i=0 ; i<n; i++){
              arr[i] = scn.nextInt();
          }
          scn.close();
          Sort(arr);
          print(arr);
        
    }
}