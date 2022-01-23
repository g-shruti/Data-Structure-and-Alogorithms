import java.util.*;
 
 public class max_subarays {

 	 public static int maxSum(int[] ar) {
 	 	 int cs = ar[0];
 	 	 int ms= ar[0];
 	 	 for(int i=1; i<ar.length;i++){
 	 	     if(cs<0){
 	 	         cs = ar[i];
 	 	     }
 	 	     else{
 	 	         cs += ar[i];
 	 	     }
 	 	     if(cs>ms){
 	 	         ms = cs;
 	 	     }
 	 	 }
 	 	 return ms;
 	 	 
     }
 
 	 public static void main(String[] args) {
 	 	 Scanner sc = new Scanner(System.in);
 	 	 int N = sc.nextInt();
 	 	 int[] arr = new int[N];
 	 	 for (int i = 0; i < arr.length; i++) {
 	 	 	 arr[i] = sc.nextInt();
 	 	 }
 
 	 	 System.out.println(maxSum(arr));
 	 	 
 	 }
 
 }