public class AdddaMatrix {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        if(issameSize(matrixA, matrixB)){
        printMatrix(matrixA, "Matrix A");
        printMatrix(matrixB, "Matrix B");
        printMatrix(addMatrices(matrixA, matrixB), "Sum Matrix");
        }

    }

    public static boolean issameSize(int[][] a, int[][] b){
        if (a.length != b.length || a[0].length != b[0].length) return false;
        return true;
    }
    
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) sum[i][j] = a[i][j] + b[i][j];
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix, String name) {
        System.out.println(name + ":");
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }
}
