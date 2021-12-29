public class Puppy {

    String breed;
    String color;
    int puppyAge;

    void barking(){

    }

    void hungry() {

    }

    void sleeping(){

    }


    public Puppy(String name) {
        //constructor has one parameter of "name"
        System.out.println("Passed name is: " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age: " + puppyAge);
        return puppyAge;
    }


    public static void main (String[] args) {

        //Object creation 
        //Object reference = new Constructor 
        Puppy myPuppy = new Puppy("Lexi");

        //Call class method to set puppy's age 
        //Objectreference.methodName
        myPuppy.setAge(1);

        //Call class method to get puppy's age 
        //Objectreference.methodName
        myPuppy.getAge();

        //Access instance variable 
        //Objectreference.variableName 
        System.out.println("Variable value: " + myPuppy.puppyAge);

    }


}
