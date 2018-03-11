public class Class1 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int[][] b = {{2, 3, 4}, {3, 4, 5}, {4, 5, 6}};
        caculate(a, b);
    }

    static void
    caculate(int[][] x, int[][] y) {
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int m = 0; m < 3; m++)
                    c[i][j] += x[i][m] * y[m][j];
                }
            }
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++) {
                    System.out.print(c[i][j] + "\t");
                    if ((j + 1) % 3 == 0)
                        System.out.println("\n");
                }
        }


}


