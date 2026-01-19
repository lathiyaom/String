package Q;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_54 {
    static void main() {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int sr = 0;
        int er = m - 1;
        int sc = 0;
        int ec = n - 1;
        int count = m * n;
        while (count > 0) {
            //sr
            for (int i = sc; i <= ec; i++) {
                ans.add(matrix[sr][i]);
                count--;
            }
            sr++;
            if (count == 0) break;
            //ec
            for (int i = sr; i <= er; i++) {
                ans.add(matrix[i][ec]);
                count--;
            }
            ec--;
            if (count == 0) break;
            //er
            for (int i = ec; i >= sc; i--) {
                ans.add(matrix[er][i]);
                count--;
            }
            er--;
            if (count == 0) break;
            //sc
            for (int i = er; i >= sr; i--) {
                ans.add(matrix[i][sc]);
                count--;
            }
            sc++;
            if (count == 0) break;


        }
        return ans;
    }
}
