import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (c + b == 0) {
            System.out.println("Division by zero!");
            System.exit(0);
        }
        if (d == 0) {
            System.out.println("Division by zero!");
            System.exit(0);
        }
        int result = a / ((b + c) / d);

        System.out.println(result);
    }
}