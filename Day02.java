public class Day02 {

    public static void whatGen(int year) {
        if (year >= 1995) {
            System.out.println("Kamu lahir tahun " + year + ". Jadi Kamu Gen Z");
        } else if (year >= 1980 && year < 1995) {
            System.out.println("Kamu lahir tahun " + year + ". Jadi Kamu Gen Millenial");
        } else if (year >= 1965 && year < 1980) {
            System.out.println("Kamu lahir tahun " + year + ". Jadi Kamu Gen X");
        } else if (year >= 1944 && year < 1965) {
            System.out.println("Kamu lahir tahun " + year + ". Jadi Kamu Gen Baby Boomer");
        } else {
            System.out.println("Kamu lahir tahun " + year + ". Jadi Kamu Old Banget AWKOAKOWKAOKWOK");
        }
    }

    public static void body(int weight, float height) {
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("BMI kamu = " + bmi + ". Jadi badanmu kurus");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("BMI kamu = " + bmi + ". Jadi badanmu ideal");
        } else {
            System.out.println("BMI kamu = " + bmi + ". Jadi badanmu gemuk");
        }
    }

    public static void minMax(int a, int b, int c, int d) {
        int min = 0;
        int max = 0;
        if (a > b && a > c && a > d) {
            max = a;
        } else if (b > a && b > c && b > d) {
            max = b;
        } else if (c > a && c > b && c > d) {
            max = c;
        } else if (d > a && d > b && d > c) {
            max = d;
        }

        if (a < b && a < c && a < d) {
            min = a;
        } else if (b < a && b < c && b < d) {
            min = b;
        } else if (c < a && c < b && c < d) {
            min = c;
        } else if (d < a && d < b && d < c) {
            min = d;
        }

        System.out.println("Nilai minimum dari angka " + a + ", " + b + ", " + c + ", " + d + " adalah " + min);
        System.out.println("Nilai maksimum dari angka " + a + ", " + b + ", " + c + ", " + d + " adalah " + max);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        String name = "Batch 342";
        String kelas = "Batch 342";
        String nama = "XSIS";

        // control flow
        if (name == "XSIS") {
            System.out.println("Yeay");
        } else if (name == "342") {
            System.out.println("Hooray");
        } else if (name == "") {
            System.out.println("Naaah");
        } else {

        }

        switch (name) {
            case "Batch 342":
                System.out.println("Yeay");
                break;
            case "342":
                System.out.println("Hooray");
                break;
            case "":
                System.out.println("Naaah");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        /*
         * Buatlah function untuk soal2 berikut
         * 1. menentukan generasi berdasarkan tahun lahir
         * 2. menentukan badan kurus, gemuk atau ideal berdasarkan tinggi dan berat
         * badan. jangan lupa hitung BMI
         * 3. menentukan nilai maksimal dan minimal dari 4 buah angka
         */

        // 1. generation
        whatGen(1998);

        // 2. body
        body(78, 1.74f);

        // 3. minMax
        minMax(1, 2, 3, 4);

        /*
         * 4. Buatlah function yang menentukan apakah 2 buah angka yang menjadi
         * parameter, berada diantara angka 30 - 50, mengembalikan true or false
         */
    }
}
