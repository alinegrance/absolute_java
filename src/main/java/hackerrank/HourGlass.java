package hackerrank;

public class HourGlass {

    private static int N_ROW = 6;
    private static int N_COL = 6;

    public static boolean canBuildHourGlass(int i, int j) {
        return j < (N_COL - 2) && (i < N_ROW - 2);
    }

    public static int[][] getHourGlassIndices(int i, int j) {
        int[][] hourGlassIndices = new int[7][2];

        hourGlassIndices[0] = new int[]{i, j};
        hourGlassIndices[1] = new int[]{i, j+1};
        hourGlassIndices[2] = new int[]{i, j+2};
        hourGlassIndices[3] = new int[]{i+1, j+1};
        hourGlassIndices[4] = new int[]{i+2, j};
        hourGlassIndices[5] = new int[]{i+2, j+1};
        hourGlassIndices[6] = new int[]{i+2, j+2};

        return hourGlassIndices;
    }

    public static int[] buildHourGlass(int[][] m, int[][] indices) {
        int[] values = new int[7];

        int x;
        int y;

        for (int i = 0; i <= 6; i++) {
            x = indices[i][0];
            y = indices[i][1];

            values[i] = m[x][y];
        }

        return values;
    }

    public static int sumHourGlass(int[] values) {
        int sum = 0;

        for (int i = 0; i <= 6; i++) {
            sum = sum + values[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] input = new int[N_ROW][N_COL];

        for (int i = 0; i < N_ROW; i++) {
            for (int j = 0; j < N_COL; j++) {
                input[i][j] = i + j;
            }
        }

        for (int i = 0; i < N_ROW; i++) {
            for (int j = 0; j < N_COL; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < N_ROW; i++) {
//            for (int j = 0; j < N_COL; j++) {
//                System.out.println("HourGlass starting at (" + i + "," + j + ") can be built:" + canBuildHourGlass(i, j));
//            }
//        }

//        int[][] hourGlass00 = getHourGlassIndices(0, 0);
//
//        for (int i = 0; i <= 6; i++) {
//            System.out.println("[" + hourGlass00[i][0] + ", " + hourGlass00[i][1] + "]");
//        }

        int max = -64;
        for (int i = 0; i < N_ROW; i++) {
            for (int j = 0; j < N_COL; j++) {
                if (canBuildHourGlass(i, j)) {
                    int sum = sumHourGlass(buildHourGlass(input, getHourGlassIndices(i, j)));

                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
