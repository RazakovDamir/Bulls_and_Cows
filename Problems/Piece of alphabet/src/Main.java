import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(abc.contains(input));
    }
}