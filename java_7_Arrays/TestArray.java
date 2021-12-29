public class TestArray {

    public static void main(String[] args) {

        double[] doubleList = {1.9, 2.9, 3.9, 4.9};

        //print all array elements
        System.out.println("Print all array elements from doubleList");
        for (int d = 0; d < doubleList.length; d++) {
            System.out.print(doubleList[d] + " ");
        }
        System.out.println("\n");

        //sum all array elements
        double total = 0;
        System.out.println("Sum of all array elements from doubleList");
        for (int d = 0; d < doubleList.length; d++) {
            total += doubleList[d];
        }
        System.out.println("Total: " + total);
        System.out.print("\n");


        //find largest element
        double max = doubleList[0];
        System.out.println("Find the largest element from doubleList");
        for (int d = 1; d < doubleList.length; d++) {
            if (doubleList[d] > max) {
                max = doubleList[d];
            }
        }
        System.out.println("Max: " + max);
        System.out.print("\n");

        //using for each, to print out elements in doubleList 
        System.out.println("For each in doubleList");
        for (double element : doubleList) {
            System.out.print(element);
        }
        System.out.println("\n");

        //call printArray
        System.out.println("Passing arrays in methods");
        printArray(new int[] {1, 2, 3, 4, 5, 6});
    
    }

        //passing arrays to methods
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
        }

}