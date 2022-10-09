public class Homework {

    // Find number in array
    void getNumber(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                System.out.println("Yes " + a + " is in array");
                break;
            }
        }
        System.out.println("No " + a + " is not in array");
    }

    // Java program to sort a numeric array
    int[] sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            while (i > 0 && (array[i] < array[i - 1])) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }

        }
        return array;
    }

}
