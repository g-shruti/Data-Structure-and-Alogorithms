import java.util.Scanner;
 
 public class brokenEconomy {
 
 	 public static void search(int[] ar, int key) {
 
 	 int lo= 0;
 	 int hi = ar.length-1;
 	 int floor =-1;
 	 int ceil = -1;
 	 while(lo<=hi){
 	     int mid = (lo+hi)/2;
 	     if(ar[mid]== key){
 	         ceil=floor=ar[mid];
 	     }
 	     else if(ar[mid]<key){
 	         lo= mid+1;
 	         floor = ar[mid];
 	     }
 	     else if(ar[mid]>key){
 	         hi= mid-1;
 	         ceil= ar[mid];
 	     }
 	 }
 	 System.out.println(ceil);
 	 System.out.println(floor);
 
 	 }
 
 	 public static void main(String[] args) {
 
 	 	 Scanner s = new Scanner(System.in);
 	 	 int n = s.nextInt();
 	 	 int[] ar = new int[n];
 	 	 for (int i = 0; i < ar.length; i++) {
 	 	 	 ar[i] = s.nextInt();
 	 	 }
 	 	 int key = s.nextInt();
 	 	search(ar, key);
 	 }
 }