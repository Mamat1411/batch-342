import java.util.Scanner;

public class Day04 {

    public static void matrixIndex(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] ");
            }
            System.out.println();
        }
    }

    public static void matrixSizable(int column, int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] ");
            }
            System.out.println();
        }
    }

    public static void starMatrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void sizableStarMatrix(int column, int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
         * 1. Dengan menggunakan scanner, Buatlah function untuk mencetak matrix dengan parameter sebagai size
         *      matrix nya(kotak). munculkan index nya.
         * 2. Dengan menggunakan scanner, Buatlah function untuk mencetak matrix dengan parameter column and row
         *      sebagai ukuran matrix nya. munculkan index nya.
         * 3. Sama seperti soal nomer 1 dan 2, tetapi cetak bintang(*)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Size Matrix: ");
        int size = sc.nextInt();
        matrixIndex(size);
        System.out.println();
        starMatrix(size);
        System.out.println();
        
        System.out.print("Masukkan Size Column Matrix: ");
        int col = sc.nextInt();
        System.out.print("Masukkan Size Row Matrix: ");
        int row = sc.nextInt();
        matrixSizable(col, row);
        System.out.println();
        sizableStarMatrix(col, row);
    }
}
