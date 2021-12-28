class Juice {

    //enumerated list
    enum JuiceSize {SMALL, MEDIUM, LARGE}; //declare enumerlated list
    JuiceSize size; //declare variable size 
}


public class JuiceTest {

    public static void main (String[] args) {

        Juice juice = new Juice();
        juice.size = Juice.JuiceSize.SMALL;
        System.out.println("Size: " + juice.size);

    }


}