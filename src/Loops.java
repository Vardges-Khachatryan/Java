public class Loops {
    public static void main(String[] args){

        // Find even numbers between 0 and 100
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        // Find odd numbers between 0 and 100
        int i = 0;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        // Find all numbers between 0 and 100 that are divisible by three
        for (int j = 0; j < 100; j++) {
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        // Find the factorial of all numbers between 1 and 100
        long f = 1L;
        int i1 = 1;
        while (i1 < 100) {
            f *= i1;
            System.out.println("Factorial of " + i1 + " is " + f);
            i1++;
        }
        System.out.println();
        System.out.println("-------------------------------------------");

        // Find the sum of all numbers between 0 and 100
        int sum = 0;
        for (int a = 0; a < 100; a++) {
            sum += a;
        }
        System.out.println(sum);
        System.out.println("-------------------------------------------");

        // Figures
        int l = 5;

        for (int k = 0; k < l; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = l - 1; j > k; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = 0; j < k; j++) {
                System.out.print("  ");
            }
            for (int j = l; j > k; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = l; j > k; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = l - 1; j > k; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = l - 1; j > k; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 0; k < l - 1; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print(" ");
            }
            for (int j = l - 1; j > k; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = 0; j < l * 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = l - 1; j > k; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < l * 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int k = 0; k < l; k++) {
            for (int j = l - 1; j > k; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < l + k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        // while in while
        int in = 1;
        while (in < 11) {
            System.out.println("in is " + in);
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            int j = 1;
            while (j < 11) {
                System.out.println("j is " + j);
                j++;
            }
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            in++;
        }

        // while in for
        for (int n = 1; n < 11; n++) {
            System.out.println("n is " + n);
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            int a = 1;
            while (a < 11) {
                System.out.println("a is " + a);
                a++;
            }
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        }

        //for if while
        int in1 = 1;
        while (in1 < 11) {
            System.out.println("in1 is " + in1);
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            for (int j = 1; j < 11; j++) {
                System.out.println("j is " + j);
            }
            in1++;
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        }

        }
    }
















