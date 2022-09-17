public class LiteralsOperators {
    public static void main(String[] args) {

        // literals
        int i = 100;
        System.out.println(i);
        i = 0144;
        System.out.println(i);
        i = 0X64;
        System.out.println(i);
        char ch = '\144';
        System.out.println(ch);
        ch = 100;
        System.out.println(ch);
        ch = '\u0064';
        System.out.println(ch);
        i = 'd';
        System.out.println(i);
        i = '\144';
        System.out.println(i);
        i = '\u0064';
        System.out.println(i);
        ch = '\ua432';
        i = (int) ch;
        System.out.println(i);
        ch = 0X14;
        System.out.println(ch);

        System.out.println("--------------------------------");

        // Bitwise Operators
        int i1 = 11; // i1 = 1011
        int i2 = 5; // i2 = 101
        int i3 = i1 & i2; // i3 = 1011 & 0101 = 0001 = 1
        System.out.println(i3);
        int i4 = i1 | i2; // i4 = 1011 | 0101 = 1111 = 15
        System.out.println(i4);
        int i5 = i1 ^ i2; // i5 = 1011 ^ 0101 = 1110 = 14
        System.out.println(i5);
        System.out.println(~i1); // NOT i1 = 11110100 = -12
        System.out.println(i1>>2); // i1>>2 = 00000010 = 2
        System.out.println(i1<<2); // i1<<2 = 00101100 = 44

        System.out.println("---------------------------------");

        // Relational Operators
        int in = 10;
        int in1 = 15;
        int in2 = 20;
        boolean b = in == in1; // expected result false
        System.out.println(b);
        boolean b1 = in != in1; // expected result true
        System.out.println(b1);
        boolean b2 = in > in1; // expected result false
        System.out.println(b2);
        boolean b3 = in < in1; // expected result true
        System.out.println(b3);

        System.out.println("---------------------------------");

        // Boolean Logical Operators
        boolean bool = (in2 > in1) && (in1 > in ); // expected result true
        System.out.println(bool);
        boolean bool1 = (in2 < in1) || (in1 > in ); // expected result true
        System.out.println(bool1);
        boolean bool2 = (in2 > in1) ^ (in1 > in ); // expected result false
        System.out.println(bool2);
        boolean bool3 = !(in2 > in1) && (in1 > in ); // expected result false
        System.out.println(bool3);
        boolean bool4 = in2 >= in? true:false; // (ternary operator) expected result true
        System.out.println(bool4);





    }
}
