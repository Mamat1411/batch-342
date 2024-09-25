public class Day07 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z;
        // z = x / y;
        // System.out.println("z = " + z); 
        try {
            z = x / y;
            System.out.println("z = " + z); 
        } catch (ArithmeticException e) {
            String msg = e.getMessage();
            System.out.println("An error has occured. The error is " + msg);
        }
        System.out.println("End");
    }
}
