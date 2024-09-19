import java.util.Scanner;

public class Day03 {

    public static int factorial(int num) {
        if (num <= 1) {
            num = 1;
        }
        for (int i = num - 1; i >= 1; i--) {
            num *= i;
        }
        return num;
    }

    public static void matrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j) {
                    System.out.print((i + 1) + " ");
                } else if (i > j) {
                    System.out.print((j + 1) + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void matrixIndex(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] ");
            }
            System.out.println();
        }
    }

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

    public static void oddMatrix(int size) {
        int oddNumber = 1;
        for (int i = 0; i < size * size; i++) {
            oddNumber += 2;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                oddNumber -= 2;
                System.out.print(oddNumber + " ");
            }
            System.out.println();
        }
    }

    public static void oddEvenMatrix(int size) {
        int oddNumber = 1;
        int evenNumber = 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    System.out.print(oddNumber + " ");
                    oddNumber += 2;
                } else {
                    System.out.print(evenNumber + " ");
                    evenNumber += 2;
                }
            }
            System.out.println();
        }
    }

    public static String dayName(int number) {
        String day = "";
        switch (number) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid";
                break;
        }
        return day;
    }

    public static Object dayNumber(String day) {
        Object dayNum;
        switch (day) {
            case "Sunday":
                dayNum = 1;
                break;
            case "Monday":
                dayNum = 2;
                break;
            case "Tuesday":
                dayNum = 3;
                break;
            case "Wednesday":
                dayNum = 4;
                break;
            case "Thursday":
                dayNum = 5;
                break;
            case "Friday":
                dayNum = 6;
                break;
            case "Saturday":
                dayNum = 7;
                break;
            default:
                dayNum = "Invalid";
                break;
        }
        return dayNum;
    }

    public static void main(String[] args) {
        // Scanner Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number : ");
        int inputNumber = sc.nextInt();
        sc.close();

        /*
        * Looping
        *
        * for loop structure:
        * for(initial; condition; expression){
        * statement;
        * }
        */

        // even number
        System.out.println("This is even number loop");
        int evenNumber = 0;
        for (int i = 0; i < 10; i++) {
        System.out.print(evenNumber + " ");
        evenNumber += 2;
        if (evenNumber > 10) {
        break;
        }
        }
        System.out.println();
        System.out.println();

        // 500 - 520 by 5
        System.out.println("This is 500-520 with 5 multiplier");
        int number500 = 500;
        for (int i = 0; i < number500; i++) {
        System.out.print(number500 + " ");
        number500 += 5;
        if (number500 > 520) {
        break;
        }
        }
        System.out.println();
        System.out.println();

        // leap year
        System.out.println("This is leap year");
        int year = 2000;
        for (int i = 0; i < year; i++) {
        if (year % 4 == 0) {
        if (year % 100 == 0) {
        if (year % 400 == 0) {
        System.out.print(year + " ");
        }
        } else {
        System.out.print(year + " ");
        }
        }
        year++;
        if (year > 2024) {
        break;
        }
        }
        System.out.println();
        System.out.println();

        // odd + even Numbers
        System.out.println("This is odd + even numbers");
        int odd = 1;
        int even = 0;
        for (int i = 0; i < inputNumber; i++) {
        even += 2;
        System.out.println(odd + " + " + even + " = " + (odd + even));
        odd += 2;
        }
        System.out.println();

        // factorial
        System.out.println("This is factorial");
        int factorial = inputNumber;
        for (int i = 1; i <= factorial; i++) {
        System.out.println(i + " factorial = " + factorial(i));
        }
        System.out.println();

        // Nested Loop
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
        System.out.print((j + 1) + " ");
        }
        System.out.println();
        }
        System.out.println();

        // Matrix
        System.out.println("This is matrix");
        matrix(inputNumber);
        System.out.println();
        System.out.println("This is matrix index");
        matrixIndex(inputNumber);
        System.out.println();

        // Stars
        System.out.println("This is diagonal stars");
        diagonal(inputNumber);
        System.out.println();
        System.out.println("This is square stars");
        square(inputNumber);
        System.out.println();

        // Odd Number Matrix Challenge
        System.out.println("This is Odd Number Matrix");
        oddMatrix(inputNumber);
        System.out.println();

        // Odd and Even Number Matrix Challange
        System.out.println("This is odd even matrix");
        oddEvenMatrix(inputNumber);
        System.out.println();

        /*
        * While Loop
        * while loop structures:
        * init;
        * while(condition){
        * statement;
        * expression;
        * }
        */
        System.out.println("This is while loop");
        int i = 100;
        int hundred = 0;
        while (i <= 500) {
        hundred += i;
        i += 100;
        }
        System.out.print(hundred + " ");
        // System.out.println(hundred);

        /*
        * Do While Loop
        * do while loop structures:
        * init;
        * do{
        * statement;
        * expression;
        * } while (condition);
        */

        /*
         * Dengan Menggunakan Switch Case buatlah 2 fungsi berikut
         * 1. dayName(int number). fungsi ini menerima inputan angka dan mengembalikan
         * hari apa sesuai urutan angka tersebut
         * 2. dayNumber(String day). fungsi ini menerima inputan nama hari dan
         * mengembalikan angka hari ke berapa
         * hari dimulai dari senen
         */

        System.out.print("Input Number : ");
        inputNumber = sc.nextInt();
        System.out.println(dayName(inputNumber));
        sc.nextLine();

        System.out.print("Input Day: ");
        String dayString = sc.nextLine();
        System.out.println(dayNumber(dayString));
        sc.close();
    }
}
