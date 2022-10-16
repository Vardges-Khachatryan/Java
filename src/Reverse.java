public class Reverse {

    public static int[] ReverseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    public static void printArray(int [] array){
        for (int x:array){
            System.out.print(x + " ");
        }
    }
}

class ReverseDemo{

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};
        Reverse.printArray(array); // array before reverse
        System.out.println();
        Reverse.printArray(Reverse.ReverseArray(array));
        System.out.println();
        Reverse.printArray(array); // array after reverse

    }
}

