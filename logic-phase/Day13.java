import java.util.Random;
import java.util.Scanner;

public class Day13 {
    public static void judolSimulation(int spin, int depo){
    Random random = new Random();
        int player = 0;
        int com = 0;
        int betCount = 0;
        int smallPrize = random.nextInt(10000, 50000);
        int bigPrize = random.nextInt(50001, 100000);
        System.out.println("Times you want to spin: " + spin);
        System.out.println("Your initial balance: " + depo);
        System.out.println();
        for (int i = 1; i <= spin; i++) {
            System.out.println("Attempt No." + i);
            betCount++;
            depo -= 10000;
            System.out.println("Bet count: " + betCount);
            if (betCount <= 10) {
                player = random.nextInt(1,6);
                com = random.nextInt(6, 21);
                System.out.println("Your Number is " + player);
                System.out.println("Computer Number is " + com);
            } else if (betCount > 10 && betCount <= 50) {
                player = random.nextInt(1, 16);
                com = random.nextInt(6, 21);
                System.out.println("Your Number is " + player);
                System.out.println("Computer Number is " + com);
                if (player > com) {
                    depo += smallPrize;
                    System.out.println("Congrats!!!!! You won " + smallPrize);
                }
            } else {
                player = random.nextInt(1, 21);
                com = random.nextInt(1, 21);
                System.out.println("Your Number is " + player);
                System.out.println("Computer Number is " + com);
                if (player > com) {
                    depo += bigPrize;
                    System.out.println("Congrats!!!!! You won " + bigPrize);
                }
            }
            System.out.println("Current Balance: " + depo);
            System.out.println();
        }
        System.out.println("Balance after you play this: " + depo);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Online Gambling Simulation");
        System.out.println("Please tell us how many spins you want and How much you want to Deposit");
        System.out.print("Spins: ");
        int spins = sc.nextInt();
        System.out.print("Deposit: ");
        int deposit = sc.nextInt();
        System.out.println();
        judolSimulation(spins, deposit);
    }
}
