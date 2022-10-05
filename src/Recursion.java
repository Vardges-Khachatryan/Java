public class Recursion {

    // Sum by recursion
    int sumByRec(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return sumByRec(n - 1) + n;
    }
    // Number of Fibonacci by recursion
    int fibonacciByRec(int a) {
        if (a == 0 || a == 1) {
            return a;
        }
        return fibonacciByRec(a - 1) + fibonacciByRec(a - 2);
    }

    // Matrix as method argument
    int[][] matrix(int[][] matrix) {
        int num = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[2 * matrix.length];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ++num;
            }

        }
        return matrix;
    }

    // Method to print matrix
    void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class RecursionDemo {
    public static void main(String[] args) {
        Recursion firstObject = new Recursion();

        int newSum = firstObject.sumByRec(3);
        System.out.println(newSum);
        System.out.println("-----------------------------------");
        int fibonacciNum = firstObject.fibonacciByRec(8);
        System.out.println(fibonacciNum);
        System.out.println("-----------------------------------");
        int[][] newMatrix = new int[5][];
        firstObject.matrix(newMatrix);
        firstObject.printMatrix(newMatrix);
        System.out.println();


    }


}