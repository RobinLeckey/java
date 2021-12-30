//exeptions occur because:


//Definition: occurs when normal flow of the prgram is disrupted program terminates abnormally 
// user entered invalid data 
// file that needs to be opened, but cannot be found
// network connection lost in the middle of communication 


public class Exception_Test {

    public static void main(String[] args) {

        int[] a = new int [2]; 

        try {
            
            System.out.println("Access element 3 " + a[3]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }
        finally {
            a[0] = 6;
            System.out.println("First element value is: " + a[0]);
            System.out.println("The finally statement is executed");
        }

    }


}