public class assignment {
    public static void main(String[] args) {        
        int[][] A = {{2, 3, 4}, {3, 4, 5}};
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};
        if (A[0].length != B.length) {
            System.out.println("Matrices cannot be multiplied due to incompatible dimensions.");
            return;
        }
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Result for (A * B):");
        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
} 