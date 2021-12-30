import java.io.*;


public class ReadConsole {

    public static void main (String[] args) throws IOException {

        InputStreamReader console_in = null;

        try {
            console_in = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit");
            char c;

            do {
                c = (char) console_in.read();
            } while (c != 'q');

        } finally {

            if (console_in != null) {
                console_in.close();
            }
        }
    }
}