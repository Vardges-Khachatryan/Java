public class LiteralsOperators {
    public static void main(String[] args) {

        // literals
        int i = 100;
        System.out.println("i is " + i);
        int i1 = 0144;
        System.out.println("i1 is " + i1);
        int i2 = 0X64;
        System.out.println("i2 is " + i2);
        char ch = '\144';
        System.out.println("ch is " + ch);
        char ch1 = 100;
        System.out.println("ch1 is " + ch1);
        char ch2 = '\u0064';
        System.out.println("ch2 is " + ch2);
        int i3 = 'd';
        System.out.println("i3 is " + i3);
        int i4 = '\144';
        System.out.println("i4 is " + i4);
        int i5 = '\u0064';
        System.out.println("i5 is " + i5);
        char ch3 = '\ua432';
        int i6 = (int) ch3;
        System.out.println("i6 is " + i6);
        char ch4 = 0X14;
        System.out.println("ch4 is " + ch4);

        System.out.println("----------------------------------");

        // Bitwise Operators
        int in1 = 11; // in1 = 1011
        int in2 = 5; // in2 = 101
        int in3 = in1 & in2; // in3 = 1011 & 0101 = 0001 = 1
        System.out.println("in3 is " + in3);
        int in4 = in1 | in2; // in4 = 1011 | 0101 = 1111 = 15
        System.out.println("in4 is " + in4);
        int in5 = in1 ^ in2; // in5 = 1011 ^ 0101 = 1110 = 14
        System.out.println("in5 is " + in5);
        System.out.println("~in1 is " + ~in1); // NOT in1 = 11110100 = -12
        System.out.println(in1>>2); // i1>>2 = 00000010 = 2
        System.out.println(in1<<2); // i1<<2 = 00101100 = 44

        System.out.println("---------------------------------");

        // Relational Operators
        int in6 = 10;
        int in7 = 15;
        int in8 = 20;
        boolean b = in6 == in7; // expected result false
        System.out.println(b);
        boolean b1 = in6 != in7; // expected result true
        System.out.println(b1);
        boolean b2 = in6 > in7; // expected result false
        System.out.println(b2);
        boolean b3 = in6 < in7; // expected result true
        System.out.println(b3);

        System.out.println("---------------------------------");

        // Boolean Logical Operators
        boolean bool = (in8 > in7) && (in7 > in6 ); // expected result true
        System.out.println(bool);
        boolean bool1 = (in8 < in7) || (in1 > in6 ); // expected result true
        System.out.println(bool1);
        boolean bool2 = (in8 > in7) ^ (in7 > in1 ); // expected result false
        System.out.println(bool2);
        boolean bool3 = !(in8 > in7) && (in7 > in6 ); // expected result false
        System.out.println(bool3);
        boolean bool4 = in8 >= in6? true:false; // (ternary operator) expected result true
        System.out.println(bool4);





    }
}
