package practice.arrays;

public class ArrayExample {

    // http://math.hws.edu/javanotes/c7/s5.html check the draw for understanding

    public static void main(String[] args) {
        int[][] myArray = {
                {236, 189, 189,   0},
                {236,  80, 189, 189},
                {236,   0, 189,  80},
                {236, 189, 189,  80}
        };
        int cols = 4;
        int rows = 4;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%d ", myArray[i][j]);
            }
            System.out.println();
        }

        int[][] myArray2 = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
    }

}
