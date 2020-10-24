import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        while (a != 0) {
            if(a > 0) {
                b++;
                a = scanner.nextInt();
            } else {
                a = scanner.nextInt();
            }
        }
        System.out.println(b);
    }
}