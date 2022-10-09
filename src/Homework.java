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

class HomeworkDemo{
    public static void main(String[] args) {

        Homework firstObject = new Homework();

        int [] array = {1,3,6,9,8,5,4,1,2,5,8,7};

        firstObject.getNumber(array,15);
        firstObject.sortArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }
}
