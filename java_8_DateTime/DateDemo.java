import java.util.Date;

public class DateDemo {

    public static void main (String[] args) {

        //instantiate a Date constructor
        Date date = new Date();

        System.out.println(date.toString());

        //Date formatting using date and time
        String str = String.format("%tc", date);

        System.out.println(str);
        
    }
}