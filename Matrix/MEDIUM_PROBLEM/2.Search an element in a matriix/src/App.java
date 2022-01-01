public class App {

    //Ref:  https://www.youtube.com/watch?v=ZYpYur0znng&t=306s

    //Ref: https://www.youtube.com/watch?v=5vP0-g94xEA      "This video code is implemented below"

    public static boolean searchMatrix(int[][] matrix, int target) {
        
        int i=0;
        int j=matrix[0].length - 1;
        
        while(i < matrix.length && j>=0){
            if(target == matrix[i][j]) return true;
            else if( target < matrix[i][j])  j--;
            
            else i++;
                
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        
       int matrix[][] = {{1,3,5,7},
                         {10,11,16,20},
                         {23,30,34,60}};

                         if(searchMatrix(matrix, 5)){
                             System.out.println("True");
                         }else{
                             System.out.println("False");

                         }
    }
}
