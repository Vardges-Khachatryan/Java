public class Arrays {
    public static void main(String[] args) {

        // Sorting min to max
        int[] array = {3, 6, 5, 9, 8, 7, 1, 2, 4};
        boolean cond = true;
        while (cond) {
            cond = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    cond = true;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");


        // Sorting max to min
        int[] array1 = {3, 6, 5, 9, 8, 7, 1, 2, 4};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");


        // Sorting matrix min to max
        // Լավ տարվերակ չի, բայց մտքովս ուրիշ բան չանցավ
        int[][] matrix = {{6, 7, 9, 11}, {1, 5, 8, 10}, {2, 3, 4, 12}};
        int[] temp = new int[matrix.length * matrix[0].length];
        int index = 0;
        for (int k = 0; k < matrix.length; k++) {
            for (int j = 0; j < matrix[k].length; j++) {
                temp[index++] = matrix[k][j];
            }
        }
        boolean cond1 = true;
        while (cond1) {
            cond1 = false;
            for (int k = 1; k < temp.length; k++) {
                if (temp[k] < temp[k - 1]) {
                    int var = temp[k];
                    temp[k] = temp[k - 1];
                    temp[k - 1] = var;
                    cond1 = true;
                }
            }
        }
        index = 0;
        for (int k = 0; k < matrix.length; k++) {
            for (int j = 0; j < matrix[k].length; j++) {
                matrix[k][j] = temp[index++];
            }
        }
        for (int k = 0; k < matrix.length; k++) {
            for (int j = 0; j < matrix[k].length; j++) {
                System.out.print(matrix[k][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------------------------------");

        // Sorting matrix max to min
        int[][] matrix1 = {{6, 7, 9, 11}, {1, 5, 8, 10}, {2, 3, 4, 12}};
        int[] temp1 = new int[matrix1.length * matrix1[0].length];
        int index1 = 0;
        for (int k = 0; k < matrix1.length; k++) {
            for (int j = 0; j < matrix1[k].length; j++) {
                temp1[index1++] = matrix1[k][j];
            }
        }
        boolean cond2 = true;
        while (cond2) {
            cond2 = false;
            for (int k = 1; k < temp1.length; k++) {
                if (temp1[k] > temp1[k - 1]) {
                    int var = temp1[k];
                    temp1[k] = temp1[k - 1];
                    temp1[k - 1] = var;
                    cond2 = true;
                }
            }
        }
        index1 = 0;
        for (int k = 0; k < matrix1.length; k++) {
            for (int j = 0; j < matrix1[k].length; j++) {
                matrix1[k][j] = temp1[index1++];
            }
        }
        for (int k = 0; k < matrix1.length; k++) {
            for (int j = 0; j < matrix1[k].length; j++) {
                System.out.print(matrix1[k][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------------------------------");

        // Calculate sum of diagonal lines for matrix
        int[][] matrix2 = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int sum = 0;
        for (int i = 0; i < matrix2.length; i++) {
            sum += matrix2[i][i] + matrix2[i][matrix2.length - 1 - i];
        }
        if (matrix2.length % 2 != 0) {
            sum -= matrix2[matrix2.length / 2][matrix2.length / 2];
        }

        System.out.print(sum);
    }
}

