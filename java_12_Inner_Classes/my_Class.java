//nested class: class written within a class
//outer class: class that holds an inner class
//non-static nested class: non-static members of a class
//static-nested class: static members of a class 

class Outer {

    int num; 

    private class Inner {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    //Accessing the inner class from the method within 
    void display_Inner_Class() {
        Inner inner = new Inner();
        inner.print();
    }
}

public class my_Class {
    public static void main(String[] args) {
        //Instantiating the outer class 
        Outer outer = new Outer();

        //Accessing the disiplay_Inner_Class method
        outer.display_Inner_Class();
    }
}