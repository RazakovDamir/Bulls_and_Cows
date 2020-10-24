import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double k = scanner.nextDouble();
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        double x = random.nextDouble();

        for(int i = 0; i <= k; i++) {
            if(x >= k) {
                System.out.println("opo");
                break;
            } else {
                x = random.nextDouble();
            }
        }
    }
}