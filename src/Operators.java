public class Operators {
    public static void main(String[] args) {

        byte b = 10, b1 = 22;
        int i = b + b1;
        int i1 = b1/b;
        int i2 = b1 % b;
        int i3 = b + 5;

        short sh = 36, sh1 = 48;
        short sh2 = sh++;
        short sh3 = ++sh1;
        short sh4 = sh3+=15;
        short sh5 = sh3%=10;

        int i4 = 123, i5 = 10;
        int i6 = 'X' % i5;
        int i7 = 'y' * '#';

        long l = i7 - i4;

        char ch = '6';
        char ch1 = ++ch;

        float f = 10 * 48.5F;
        double d = f % 10;

        System.out.println("i is " + i);
        System.out.println("i1 is " + i1);
        System.out.println("i2 is " + i2);
        System.out.println("i3 is " + i3);
        System.out.println("i4 is " + i4);
        System.out.println("i5 is " + i5);
        System.out.println("i6 is " + i6);
        System.out.println("i7 is " + i7);
        System.out.println("sh2 is " + sh2);
        System.out.println("sh3 is " + sh3);
        System.out.println("sh4 is " + sh4);
        System.out.println("sh5 is " + sh5);
        System.out.println("ch is " + ch);
        System.out.println("ch1 is " + ch1);
        System.out.println("f is " + f);
        System.out.println("d is " + d);
        System.out.println("l is " + l);


    }
}
