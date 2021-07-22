import java.util.*;

public class mergeTwoSortedArray {

  public static int[] Sort(int[] a, int[] b){
    //write your code here
    int n = a.length + b.length;
    int[] arr = new int[n];
    
    int i = 0;
    int j = 0;
    int k = 0;
    
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            arr[k] = a[i];
            i++;
            k++;
        }
        else{
            arr[k] = b[j];
            k++;
            j++;
        }  
    }
    while(i< a.length){
        arr[k] = a[i];
        i++;
        k++;
    }
    while(j<b.length){
        arr[k] = b[j];
        j++;
        k++;
    }
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    scn.close();
    int[] mergedArray = Sort(a,b);
    print(mergedArray);
  }

}