import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String poly = "";
        for (int i = input.length(); i > 0; i--) {
            poly += input.substring(i - 1, i);
        }
        if (input.contains(poly)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}