import java.util.*;
public class App {

    //Ref: https://www.youtube.com/watch?v=JkWDKg_pNME

    public static ArrayList<Integer> spiralMatrix(int matrix[][],int r,int c){
         
        ArrayList<Integer> ar = new ArrayList<>();

        int left=0,right=c-1,top=0,buttom=r-1,d=0;

        while(left <= right && top <= buttom){

            if(d == 0){
                for(int i=left;i<=right;i++) ar.add(matrix[left][i]);
                top++;d=1;
            }
            else if(d==1){
                for(int i=top;i<=buttom;i++) ar.add(matrix[i][right]);
                right--;d=2;
            }
             else if(d==2){
                for(int i=right;i>=left;i--) ar.add(matrix[buttom][i]);
                buttom--;d=3;
            } else if(d==3){
                for(int i=buttom;i>=top;i--) ar.add(matrix[i][left]);
                left++;d=0;
            }
        }
        return ar;

    }
    public static void main(String[] args) throws Exception {
        
       int r = 4, c = 4;
       int m[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15,16}};

                       System.out.println(spiralMatrix(m, r, c));   

    }
}
