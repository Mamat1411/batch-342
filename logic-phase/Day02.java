import java.util.Scanner;

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

    public static boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) || (b >= 30 && b <= 40)) {
            return true;
        }

        if ((a >= 40 && a <= 50) || (b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }

    public static void fibonacciSequence(int length) {
        int first = 1;
        int second = 1;
        int sumOfFirstAndSecond = 0;
        for (int i = 0; i < length; i++) {
            System.out.print(first + " ");
            sumOfFirstAndSecond = first + second;
            first = second;
            second = sumOfFirstAndSecond;
        }
    }

    public static void factorial(int number) {
        System.out.print("Faktorial dari angka " + number);
        if (number <= 1) {
            number = 1;
        }

        for (int i = number - 1; i >= 1; i--) {
            number *= i;
        }
        System.out.println(" adalah " + number);
    }

    public static void matrix(int size){
        int begin = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // String name = "Batch 342";
        // String kelas = "Batch 342";
        // String nama = "XSIS";

        // // control flow
        // if (name == "XSIS") {
        // System.out.println("Yeay");
        // } else if (name == "342") {
        // System.out.println("Hooray");
        // } else if (name == "") {
        // System.out.println("Naaah");
        // } else {

        // }

        // switch (name) {
        // case "Batch 342":
        // System.out.println("Yeay");
        // break;
        // case "342":
        // System.out.println("Hooray");
        // break;
        // case "":
        // System.out.println("Naaah");
        // break;
        // default:
        // System.out.println("Invalid");
        // break;
        // }

        // /*
        // * Buatlah function untuk soal2 berikut
        // * 1. menentukan generasi berdasarkan tahun lahir
        // * 2. menentukan badan kurus, gemuk atau ideal berdasarkan tinggi dan berat
        // * badan. jangan lupa hitung BMI
        // * 3. menentukan nilai maksimal dan minimal dari 4 buah angka
        // */

        // // 1. generation
        // whatGen(1998);

        // // 2. body
        // body(78, 1.74f);

        // // 3. minMax
        // minMax(1, 2, 3, 4);

        // /*
        // * 4. Buatlah function yang menentukan apakah 2 buah angka yang menjadi
        // * parameter, berada diantara angka 30 - 50, mengembalikan true or false
        // */
        // int a = 40;
        // int b = 50;
        // System.out.println("Apakah angka " + a + " dan " + b + " berada dalam range
        // 30 - 50? " + in3050(a, b));

        // // for loop
        // int[] arr = {1, 2, 3, 4};
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // // foreach loop
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // System.out.println();

        // // while loop
        // int i = 0;
        // while (i < arr.length) {
        // System.out.print(arr[i] + " ");
        // i++;
        // }
        // System.out.println();

        // // do while loop
        // i = 0;
        // do {
        // System.out.print(arr[i] + " ");
        // i++;
        // } while (i < arr.length);

        Scanner inputScanner = new Scanner(System.in);
        // System.out.print("Tentukan panjang Array yang diinginkan: ");
        // int size = inputScanner.nextInt();
        // int[] arrays = new int[size];
        // for (int j = 0; j < size; j++) {
        // System.out.print("Masukkan array ke - " + j + ": ");
        // arrays[j] = inputScanner.nextInt();
        // }

        // for (int j = 0; j < arrays.length; j++) {
        // System.out.print(arrays[j] + " ");
        // }
        // inputScanner.close();

        /*
         * 5. Buatlah fungsi deret fibonaci. paramter merupakan panjang deret angka yang
         * tercetak
         * 6. buatlah fungsi faktorial
         * 
         * fibonacci adalah deret angka yang menjumlahkan angka pertama dan angka kedua
         * menjadi angka ketiga dan seterusnya. contoh = 1 1 2 3 5 8 13 21 34
         * 
         * faktorial adalah perkalian deret dimana N dikalikan dengan N-1. contoh 5*4*3*2*1
         * 
         * 7. Buatlah fungsi generate matrix dengan size sebagai argument nya
         */

        fibonacciSequence(5);
        System.out.println();
        factorial(5);
        System.out.println();
        System.out.print("Tentukan ukuran matrix yang diinginkan: ");
        int size = inputScanner.nextInt();
        matrix(size);
    }
}
