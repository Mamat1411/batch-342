import java.util.Date;

public class Day09 {
    public static void main(String[] args) {
        
        // Epoch Date
        Long epoch = System.currentTimeMillis();
        System.out.println("Current UNIX Epoch: " + epoch);

        Date epochDate = new Date(0);
        System.out.println("Epoch Date = " + epochDate);

        Date currentDate = new Date(epoch);
        System.out.println("Current Epoch Date: " + currentDate);
    }
}
