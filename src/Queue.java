public class Queue {

    int[] array;
    int indexToInput;
    int indexToOutput;

    Queue(int n) {
        array = new int[n];
        indexToInput = -1;
        indexToOutput = -1;
    }

    void addItem(int item) {
        if (indexToInput == array.length - 1) {
            System.out.println("Array is full");
        } else {
            array[++indexToInput] = item;
        }
    }

    int getItem() {
        if (indexToOutput == indexToInput) {
            System.out.println("Array is empty");
            return 0;
        }
        return array[++indexToOutput];
    }
}

class QueueDemo {

    public static void main(String[] args) {

        Queue firstObject = new Queue(5);


        firstObject.addItem(1);
        firstObject.addItem(2);
        firstObject.addItem(3);
        firstObject.addItem(4);
        firstObject.addItem(5);



        System.out.println(firstObject.getItem());
        System.out.println(firstObject.getItem());
        System.out.println(firstObject.getItem());
        System.out.println(firstObject.getItem());
        System.out.println(firstObject.getItem());
        System.out.println(firstObject.getItem());


    }
}
