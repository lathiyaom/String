package Q;

public class Multiplications_matrix {
    static void main() {

    }

    private static int[][] multiply(int[][] a, int[][] b) {
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if (c1 != r2) {
            throw new IllegalArgumentException("Invalid matrix");
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return ans;
    }
}
