import java.util.Arrays;

public class Day05 {
    public static void main(String[] args) {
        /*
         * Array
         */
        int[] arrA = {1, 2, 3, 4, 5};
        int arrB[] = {6, 7, 8, 9, 10};
        String[] arrC = {"Nissan", "Toyota", "Honda"};
        String arrD[] = {"Ferrari", "Lamborghini", "McLaren"};
        char arrE[] = {'3', '4', '2'};

        System.out.println(arrA); // tidak bisa print isi dari arraynya

        // print array using for i
        System.out.println("Printing Array A");
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println();

        // print array using foreach
        System.out.println("Printing Array B");
        for (int b : arrB) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println("Printing Array D");
        for (String d : arrD) {
            System.out.print(d + " ");
        }
        System.out.println();

        // print array using Arrays.toString()
        System.err.println("Printing Array C");
        System.out.println(Arrays.toString(arrC));
        System.out.println("Printing Array E");
        String e = Arrays.toString(arrE);
        System.out.println(e);
        System.out.println(e.charAt(0));

        String[] batch342 = new String[5];
        batch342[0] = "SCH";
        batch342[1] = "Ali Pusing";
        batch342[2] = "Faisal Array";
        batch342[3] = "Qosam Bom";
        batch342[4] = "Ruri Bekasi";
        for (String str : batch342) {
            System.out.println(str);
        }
    }
}
