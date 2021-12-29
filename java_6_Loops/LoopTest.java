public class LoopTest {

    public static void main (String[] args) {

        int [] nums = {1, 2, 3, 4, 5};

        //loops through int array 
        for (int i : nums) {
            System.out.println(i);
            System.out.println(",");
        }
        System.out.println("\n");
        String [] names = {"Zoey", "Angel", "Oscar", "Oliver", "Lexi"};

        //loops through string array 
        for (String name : names) {
            System.out.println(name);
            System.out.println(",");
        }
        
    }

}