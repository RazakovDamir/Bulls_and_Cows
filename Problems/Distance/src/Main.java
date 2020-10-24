import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double range = scanner.nextDouble();
        double hours = scanner.nextDouble();
        System.out.println(range / hours);
    }
}