public class Day01 {
    public static void main(String[] args) {
        boolean trueOrFalse = true;
        byte tinyNumber = 1;
        short smallNumber = 1;
        int mediumNumber = 1;
        long bigNumber = 1;
        char singleLetter = 'a';
        float mediumDecimal = 1.0f;
        double bigDecimal = 1.0;

        Byte classTiny = 1;
        Short classSmall = 1;
        Integer classMedium = 1;

        Integer PascalCase = 1;
        Integer camelCase = 516;
        Integer snake_case = 546;

        // camelCase = snake_case;

        // System.out.println(PascalCase);

        // System.out.println(classMedium); // 1
        // ++classMedium;
        // System.out.println(classMedium); // 2

        // classMedium++;
        // System.out.println(classMedium); // 3
        // System.out.println();

        // for (int i = 0; i < 5; i++) {
        //     System.out.print(classTiny++ + " ");
        // }

        // System.err.println();

        // for (int i = 0; i < 5; i++) {
        //     System.out.print(++classTiny + " ");
        // }

        // bigNumber += 5; // 6
        // bigNumber += 5; // 11

        // bigNumber = bigNumber + 5;

        String name = "Batch 342";
        String kelas = "Batch 342";
        String nama = "XSIS";

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

        String isTrue = kelas.equals(nama) || nama.contains("A") ? "Yeay" : bigNumber > 5 ? "Yeay" : "Naaah";
        System.out.println(isTrue);
    }
}