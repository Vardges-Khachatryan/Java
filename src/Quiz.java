public class Quiz {

        // Find the biggest number between four numbers.
        public static int maxNumber(int a, int b, int c, int d){
            int max;
            int temp = a > b ? a : b;
            int temp1 = c > d ? c : d;
            max = temp > temp1 ? temp : temp1;
            return max;
        }

        // Write a Java program to find smallest element of a given array
        public static int minValueArray(int [] array){
            int minValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i] < minValue){
                    minValue = array[i];
                }
            }
            return minValue;
        }

        // Write a Java program to find second smallest element of a given array.

        public static int secondSmallestValue(int [] array){
            int secondMin = array[0];
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > minValueArray(array) && array[i] < secondMin){
                    secondMin = array[i];
                }
            }
            return secondMin;
        }



        //    Write a method that will count how many members of an array are greater than the first member.
        public static int countOfMembers(int [] array){
            int count = 0;
            for (int i = 1; i < array.length; i++) {
                if(array[i] > array[0]){
                    count++;
                }

            }
            return count;
        }

        // Write a Java program to count how many time is the specific number is repeting






    }

    class QuizDemo{
        public static void main(String[] args) {


            int [] array = {6,1,5,9,8,7};
            System.out.println(Quiz.maxNumber(1, 2, 3, 4));
            System.out.println(Quiz.minValueArray(array));
            System.out.println(Quiz.countOfMembers(array));
            System.out.println(Quiz.secondSmallestValue(array));


        }


    }

