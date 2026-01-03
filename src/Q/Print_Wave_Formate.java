package Q;

public class Print_Wave_Formate {
    static void main() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        waveDisplay(matrix);

    }

    private static void waveDisplay(int[][] arr) {
        for (int c = 0; c <= arr.length; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int r = arr.length - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println();
        }
    }

}
