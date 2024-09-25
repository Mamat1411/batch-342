import java.io.IOException;

public class Day07 {
    public static char readChar() throws IOException{
        char c = '\u0000';
        System.out.println(c);
        int input = 0;
        input = System.in.read();
        if (input != -1) {
            c = (char)input;
        }
        return c;
    }
    public static void main(String[] args) throws IOException, Day07Exception {
        int x = 10;
        int y = 0;
        int z;

        z = x / y;
        System.out.println("z = " + z);

        try {
            z = x / y;
            System.out.println("z = " + z); 
        } catch (ArithmeticException e) {
            String msg = e.getMessage();
            System.out.println("An error has occured. The error is " + msg);
        }

        try {
            z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException e) {
            throw new Day07Exception("Nothing can be Divided By Zero");
        }

        try {
            z = x / y;
            System.out.println("z = " + z);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }
}
