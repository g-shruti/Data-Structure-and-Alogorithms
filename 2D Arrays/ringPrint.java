import java.util.*;
public class ringPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        print(arr,s);
    }
    public static void print(int[][] arr , int s){
        int rs = s-1;
        int re = arr[0].length-s;
        int cs = s-1;
        int ce = arr.length - s;

        //left wall
        for(int i = rs ; i< re ; i++){
            System.out.println(arr[i][cs]);
        }
        for(int i =cs ; i<ce  ; i++){
            System.out.println(arr[re][i]);    
        }
        for(int i = re ; i> rs ; i--){
            System.out.println(arr[i][ce]);
        }
        for(int i = ce; i>cs ; i--){
            System.out.println(arr[rs][i]);
        }
    }
    
}
