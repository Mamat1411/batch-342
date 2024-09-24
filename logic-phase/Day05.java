import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day05 {

    public static void diagonal(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j)) {
                    System.out.print("* ");
                } else if ((i + j == size - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void square(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1 || i == size - 1 || i == 0 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
         * Array
         */
        int[] arrA = { 1, 2, 3, 4, 5 };
        int arrB[] = { 6, 7, 8, 9, 10 };
        String[] arrC = { "Nissan", "Toyota", "Honda" };
        String arrD[] = { "Ferrari", "Lamborghini", "McLaren" };
        char arrE[] = { '3', '4', '2' };

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

        // Diagonal and Square Pattern
        diagonal(5);
        square(5);

        /*
         * 1. Buatlah array dengan size menggunakan scanner, hitunglah mean median modus
         *      min max dari array tsb
         */
        
        System.out.println("Array List");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Esemka");
        cars.add("fufufafa");
        cars.add("omon omon");
        cars.add("ikn");
        cars.add("makan siang");
        cars.add("yntkts");
        cars.add("raja jawa");
        cars.add("blt");
        // cars.remove(0);
        // cars.set(1, "ndeso");
        ArrayList<String> subCars = (ArrayList<String>) cars.subList(2, 6);
        System.out.println(cars.get(cars.size()-1));
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
        for (String string : subCars) {
            System.out.println(string);
        }
    }
}
