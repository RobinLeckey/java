// definition: methods that have the same name, but different parameters 

//method overriding: same method name, type, number of parameters (identical)


public class Overloading {

    public static int Min_Method(int num1, int num2) {
        int min = 0;
        if (num1 > num2) {
            min = num2;
        }
        else {
            min = num1;
        }

        return min;
    }

    public static double Min_Method(double num1, double num2) {
        double min = 0;
        if (num1 > num2) {
            min = num2;
        }
        else {
            min = num1;
        }

        return min;
    }

    public static void main (String[] args) {

        int a = 10;
        int b = 11;

        double a2 = 13.1;
        double b2 = 26.2;

        //calls the method Min_Method to find the min 
        int c = Min_Method(a, b);

        System.out.println("Min is: " + c);

        double d = Min_Method(a2, b2);

        System.out.println("Min is: " + d);

    }
    
}
