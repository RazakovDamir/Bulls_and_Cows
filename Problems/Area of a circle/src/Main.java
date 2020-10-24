import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = scanner.nextDouble();
        System.out.println(rad * rad * Math.PI);
    }
}