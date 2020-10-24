import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int n = scanner.nextInt();
        int x = Math.abs(n);
        String a = "";
        String b = "";
        if (n < s.length()) {
            for (int i = 0; i < x; i++) {
                a += s.charAt(i);
            }
            for (int i = x; i < s.length(); i++) {
                b += s.charAt(i);
            }
            System.out.println(b + a);
        } else {
            System.out.println(s);
        }
    }
}