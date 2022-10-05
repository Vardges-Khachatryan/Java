public class Methods {

    // All uppercase
    void uppercase(char firstLetter, char lastLetter) {
        if (firstLetter > lastLetter) {
            System.out.println("It is wrong");
            return;
        }
        for (char ch = firstLetter; ch <= lastLetter; ch++) {
            System.out.print(ch + " ");
        }

    }

    // All lowercase
    void lowercase(char firstLetter, char lastLetter) {
        if (firstLetter > lastLetter) {
            System.out.println("It is wrong");
            return;
        }
        for (char ch = firstLetter; ch <= lastLetter; ch++) {
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

    void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class Object {

    public static void main(String[] args) {

        Methods firstObject = new Methods();

        int[] newArray = {2, 3, 6, 9, 1, 4, 7, 5, 8};

        System.out.println("Armenian letters");
        firstObject.uppercase('Ա', 'Ֆ'); // Armenian
        System.out.println();
        firstObject.lowercase('ա', 'ֆ'); // Armenian
        System.out.println();
        System.out.println("English letters");
        firstObject.uppercase('A', 'Z'); // English
        System.out.println();
        firstObject.lowercase('a', 'z'); // English
        System.out.println();
        System.out.println("Russian letters");
        firstObject.uppercase('А', 'Я'); // Russian
        System.out.println();
        firstObject.lowercase('а', 'я'); // Russian
        System.out.println();


        boolean answer = firstObject.isFirstMax(7, 7);
        System.out.println("Answer is " + answer);
        firstObject.arrayPrint(newArray); // newArray before sorting
        System.out.println();
        firstObject.arraySorting(newArray);
        firstObject.arrayPrint(newArray); // newArray after sorting
    }
}
