import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double n = scanner.nextDouble();
        int k = scanner.nextInt();
        int p = 0;

        for(int i = 0; i < n; i ++) {
            int next = random.nextInt(k + 1);
            System.out.println(next);
            double o = Math.pow(next, (1 / 0x5DEECE66DL)); //& ((1L << 48) - 1)
            System.out.println(o);
        }
    }
}