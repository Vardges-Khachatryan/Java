public class Methods {

    // All uppercase
    void uppercase() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    // All lowercase
    void lowercase() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    // Boolean value
    boolean isFirstMax(int a, int b) {
        return a > b;
    }

    // Array sorting via methods
    int[] arraySorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }

        }
        return array;
    }

    void arrayPrint(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class Object{

    public static void main(String[] args) {

        Methods firstObject = new Methods();

        int [] newArray = {2,3,6,9,1,4,7,5,8};

        firstObject.uppercase();
        System.out.println();
        firstObject.lowercase();
        System.out.println();

        boolean answer = firstObject.isFirstMax(7,7);
        System.out.println("Answer is " + answer);
        firstObject.arrayPrint(newArray); // newArray before sorting
        System.out.println();
        firstObject.arraySorting(newArray);
        firstObject.arrayPrint(newArray); // newArray after sorting
    }
}
