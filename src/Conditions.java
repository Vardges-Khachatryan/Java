public class Conditions {
    public static void main(String[] args) {

        // Find week day
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
            case 7:
                System.out.println("The day is from the weekend");
                break;
            default:
                System.out.println("There is no such day in the week");
        }


        // To get a triangle with three sides, it is necessary that the sum of any two sides of the triangle is greater than the third side.
        int side = 5;
        int side1 = 10;
        int side2 = 15;

        if (side + side1 >= side2 && side + side2 >= side1 && side1 + side2 >= side) {
            System.out.println("It's possible to get triangle");
        } else {
            System.out.println("It's  impossible to get triangle");
        }

        // or
        String str;
        str = side + side1 >= side2 && side + side2 >= side1 && side1 + side2 >= side ? "possible" : "impossible";
        System.out.println("It's " + str + " to get triangle");


        int var = 7;
        int var1 = 2;
        int var2 = 8;
        int var3 = 4;

        // Determine the maximum value of the var, var1, var2
        int max;

        if (var > var1) {
            if (var > var2) {
                max = var;
            } else {
                max = var2;
            }
        } else {
            if (var1 > var2) {
                max = var1;
            } else {
                max = var2;
            }
        }
        System.out.println("max value is " + max);

        // Determine the minimum value of the var, var1, var2
        int min;

        if (var < var1) {
            if (var < var2) {
                min = var;
            } else {
                min = var2;
            }
        } else {
            if (var1 < var2) {
                min = var1;
            } else {
                min = var2;
            }
        }
        System.out.println("min value is " + min);

        // Determine the maximum value of the var, var1, var2, var3
        int max1;
        int temp = var > var1 ? var : var1;
        int temp1 = var2 > var1 ? var2 : var3;
        max1 = temp > temp1 ? temp : temp1;

        System.out.println("max value is " + max1);

        // Determine the minimum value of the var, var1, var2, var3
        int min1;

        int temp2 = var < var1 ? var : var1;
        int temp3 = var2 < var3 ? var2 : var3;
        min1 = temp2 < temp3 ? temp2 : temp3;

        System.out.println("min value is " + min1);

    }

}
