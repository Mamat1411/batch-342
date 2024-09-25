public class Day07 {
    
    // variable arguments
    public static int sum(int... values){
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return result;
    }
    public static void main(String[] args) throws Day07Exception {
        // int x = 10;
        // int y = 0;
        // int z;

        // z = x / y;
        // System.out.println("z = " + z);

        // try {
        //     z = x / y;
        //     System.out.println("z = " + z); 
        // } catch (ArithmeticException e) {
        //     String msg = e.getMessage();
        //     System.out.println("An error has occured. The error is " + msg);
        // }

        // try {
        //     z = x / y;
        //     System.out.println("z = " + z);
        // } catch (ArithmeticException e) {
        //     throw new Day07Exception("Nothing can be Divided By Zero");
        // }

        // try {
        //     z = x / y;
        //     System.out.println("z = " + z);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("End");
        // }

        System.out.println(sum(1,2,3,4,5,6,7));
    }
}
