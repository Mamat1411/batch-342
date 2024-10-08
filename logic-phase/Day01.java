public class Day01 {
    public static int sumDouble(int a, int b) {
        int total;
        if (a == b) {
            total = (a + b) * 2;
        } else {
            total = a + b;
        }
        return total;
    }

    public static int diff21(int n) {
        int diff;
        diff = 21 - n;
        return diff;
    }

    public static boolean nearHundred(int n) {
        int oneHundred = 100;
        int twoHundred = 200;
        int diff100 = oneHundred - n;
        int diff200 = twoHundred - n;
        if (diff100 <= 10 || diff200 <= 10) {
            return true;
        }
        return false;
    }

    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }

        String middleString = new StringBuilder(str).deleteCharAt(0).deleteCharAt(str.length() - 2).toString();
        return str.charAt(str.length() - 1) + (str.length() == 2 ? "" : middleString) + str.charAt(0);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // primitive data types
        boolean trueOrFalse = true;
        byte tinyNumber = 1;
        short smallNumber = 1;
        int mediumNumber = 1;
        long bigNumber = 1;
        char singleLetter = 'a';
        float mediumDecimal = 1.0f;
        double bigDecimal = 1.0;

        // non-primitive data types
        Byte classTiny = 1;
        Short classSmall = 1;
        Integer classMedium = 1;

        Integer PascalCase = 1;
        // variable declaration
        Integer camelCase;
        Integer snake_case = 546;

        // variable assignment
        camelCase = snake_case;

        System.out.println(PascalCase);

        // increment
        System.out.println(classMedium); // 1
        ++classMedium;
        System.out.println(classMedium); // 2

        classMedium++;
        System.out.println(classMedium); // 3
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(classTiny++ + " ");
        }

        System.err.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(++classTiny + " ");
        }

        // arithmatic compound assignment
        bigNumber += 5; // 6
        bigNumber += 5; // 11

        bigNumber = bigNumber + 5;

        String name = "Batch 342";
        String kelas = "Batch 342";
        String nama = "XSIS";

        // control flow
        if (kelas.equals(name) || nama.contains("A")) {
            System.out.println("Yeay");
            if (bigNumber < 5 && bigDecimal != 0) {
                System.out.println("Yeay");
                if (kelas.equals(name) && nama.contains("A")) {
                    System.out.println("Yeay");
                }
            } else {
                System.out.println("Naah");
            }
        }

        // ternary operator
        String isTrue = kelas.equals(nama) || nama.contains("A") ? "Yeay" : bigNumber > 5 ? "Yeay" : "Naaah";
        System.out.println(isTrue);

        // sumDouble
        System.out.println(sumDouble(3, 3));

        // near21
        System.out.println(diff21(15));

        // nearHundred
        System.out.println(nearHundred(190));

        // frontBack
        System.out.println(frontBack("code"));
    }
}