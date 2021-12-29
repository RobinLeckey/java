//instanceof

    //an operated used for only object variables
    //checks whether the object is of a particular type (class type or interface type)
    //does IS-A check 

    // (Object reference type) instanceof (class/interface type)

//example

class Vehicle{} 

    public class Car extends Vehicle {

        public static void main (String[] args) {

            Vehicle tesla = new Car();
            boolean result = tesla instanceof Car;
            System.out.println(result);

        }
    }



