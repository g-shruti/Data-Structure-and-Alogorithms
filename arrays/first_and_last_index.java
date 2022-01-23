import java.util.Scanner;
 
 public class first_and_last_index {

 	 public static void main(String[] args) {
 
 	 	 Scanner s = new Scanner(System.in);
 	 	 int n = s.nextInt();
 	 	 int[] ar = new int[n];
 	 	 for (int i = 0; i < ar.length; i++) {
 	 	 	 ar[i] = s.nextInt();
 	 	 }
 	 	 int data = s.nextInt();
 	 	int fi = firstIndex(ar,data);
 	 	int li = lastIndex(ar,data);
 	 	System.out.println(fi);
 	 	System.out.println(li);
 	 }
 	 
 	public static int firstIndex(int[] ar, int key){
 	 int fi =-1;   
 	 int lo= 0;
 	 int hi = ar.length-1;
 	 while(lo<=hi){
 	     int mid = (lo+hi)/2;
 	     if(ar[mid]== key){
 	         fi =mid;
 	         hi= mid-1;
 	     }
 	     else if(ar[mid]<key){
 	         lo= mid+1;
 	     }
 	     else if(ar[mid]>key){
 	         hi= mid-1;
 	     }
 	 }
 	 return fi;
 	}
 	
 	public static int lastIndex(int[]ar,int key){
 	    int li = -1;
 	 int lo= 0;
 	 int hi = ar.length-1;
 	 while(lo<=hi){
 	     int mid = (lo+hi)/2;
 	     if(ar[mid]== key){
 	         li= mid;
 	         lo= mid+1;
 	     }
 	     else if(ar[mid]<key){
 	         lo= mid+1;
 	     }
 	     else if(ar[mid]>key){
 	         hi= mid-1;
 	     }
 	 }
 	 return li;
 	    
 	}
 }