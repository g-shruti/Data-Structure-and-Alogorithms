import java.util.*;

public class endPointMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr  = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        arrayExit(arr);

    }
    public static void arrayExit(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int dir =0;
        int r=0;
        int c= 0;
       while(r>=0 && r<row && c>=0 && c<col){
        dir = (arr[r][c] + dir) % 4;
        //east0
        if(dir == 0){
            c++;  
            if(c == col){
                c--;
                break;
            }  
        }
        //south1
        if(dir == 1){
            r++;  
            if(r == row){
                r--;
                break;
            }  
        }
       
        //west2
        else if(dir == 2){
            c--;  
            if(c == -1){
                c++;
                break;
            }  
        }
        //north3
        if(dir == 3){
            r--;  
            if(r == -1){
                r++;
                break;
            }  
        }
       }
      System.out.print(r + "\n" + c);
    }
    
}
