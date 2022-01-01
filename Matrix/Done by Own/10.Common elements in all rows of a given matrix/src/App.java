import java.util.*;

public class App {

    static int N = 4;
    static int M = 5;

    static void printCommonElements(int mat[][]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // initialize 1st row elements with value 1
        for (int j = 0; j < M; j++)
            map.put(mat[0][j], 1);

        // traverse the matrix
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // If element is present in the map and
                // is not duplicated in current row.
                if (map.containsKey(mat[i][j])  && map.get(mat[i][j]) < i) {
                    map.put(mat[i][j],map.get(mat[i][j])+1);
                }
            }
        }

        for (int x : map.keySet()) {
            if (map.get(x) == N-1) {
                System.out.println(x);

            }
        }

    }

    public static void main(String[] args) throws Exception {

        int m[][] = { { 1, 2, 1, 4, 8 }, // n=4 m=5
                { 3, 7, 8, 5, 1 },
                { 8, 7, 7, 3, 1 },
                { 8, 1, 2, 1, 9 },
        };

        printCommonElements(m);
    }
}
