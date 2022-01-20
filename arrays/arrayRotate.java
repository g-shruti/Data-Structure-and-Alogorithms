import java.util.Scanner;
 
 public class arrayRotate {
 
 	 public static void rotate(int[] a, int k) {
 	 	 // Write your code here
 	 	 reverse(a,0,a.length-1);
 	 	 reverse(a,0,k-1);
 	 	 reverse(a,k,a.length-1);
 
 	 }
 	 public static void reverse(int[] a, int lo , int hi){
 	     while(lo<hi){
 	         int temp = a[lo];
 	         a[lo] = a[hi];
 	         a[hi] = temp;
 	         lo++;
 	         hi--;
 	     }
 	 }
 
 	 // Don't make any changes here
 	 public static void main(String[] args) {
 	 	 Scanner s = new Scanner(System.in);
 	 	 int n = s.nextInt();
 	 	 int k=s.nextInt();
 	 	 int[] ar = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 ar[i] = s.nextInt();
 	 	 }
 	 	 rotate(ar, k);
 	 	 for (int v : ar)
 	 	 	 System.out.print(v + " ");
 	 }
 
 }
