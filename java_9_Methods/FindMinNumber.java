
public class FindMinNumber {

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

    public static void main (String[] args) {

        int a = 10;
        int b = 11;

        //calls the method Min_Method to find the min 
        int c = Min_Method(a, b);

        System.out.println("Min is: " + c);

    }

}

// how to create your own methods

//syntax: 

// public static int methodName (int a, int b) {
        //body 
//}


//syntax:

// modifer returnType nameOfMethod (Parameter List) {

    //method body 

//}