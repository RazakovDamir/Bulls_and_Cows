package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = 0;
        System.out.println("Please, enter the secret code's length:");
        String v = scanner.next();
        if (!v.matches(".*\\d.*")) {
            System.out.println("Error: " + v + " isn't a valid number.");

        }
        try {
            int volume = Integer.parseInt(v);
            if (volume <= 0) {
                System.out.println("Error: " + volume + " isn't a valid number.");
                System.exit(0);

            }

            if (volume > 10) {
                System.out.println("error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
                z = 1;
            }

            System.out.println("Input the number of possible symbols in the code:");
            int abc = scanner.nextInt();

            if (z == 1) {
                System.out.println("error");
                System.exit(0);
            }

            if (abc < volume) {
                System.out.println("Error: it's not possible to generate a code with a length of " + volume + " with " + abc + " unique symbols.");
                System.exit(0);
            }
            if (abc > 36) {
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
                System.exit(0);
            }
            String alphabet = "0123456789abcdefghijkmnopqrlstuvwxyz";
            StringBuilder alphabet2 = new StringBuilder();
            for (int j = 0; j < abc; j++) {
                alphabet2.append(alphabet.charAt(j));
            }
            int randomNum;
            String strRandomNum;
            StringBuilder secretNum = new StringBuilder();
            boolean incorrectNum = true;
            while (incorrectNum) {
                randomNum = 1 + (int) (Math.random() * 10000000);
                strRandomNum = String.valueOf(randomNum);
                for (int i = 0; i < strRandomNum.length(); i++) {
                    if (String.valueOf(secretNum).contains(String.valueOf(strRandomNum.charAt(i)))) {
                        continue;
                    } else {
                        secretNum.append(strRandomNum.charAt(i));
                    }
                    if (Integer.valueOf(volume) == secretNum.toString().length()) {
                        incorrectNum = false;
                        break;
                    }
                }
            }
            String start = "";
            String end = "";
            if (abc > 10) {
                start = start.concat(", ").concat(alphabet2.substring(10, 11));
                end = end.concat("-").concat(alphabet2.substring(alphabet2.length() - 1, alphabet2.length())).concat(").");
            } else {
                start = ").";
            }
            if (abc - 9 == 1) {
                end = "";
            }
            String length = "";
            for (int i = 0; i < volume; i++) {
                length = length.concat("*");
            }
            System.out.println("The secret is prepared: " + length + " (0-9" + start + end);
            System.out.println("Okay, let's start a game!");

            String answer;
            int turn = 1;
            do {
                System.out.println("Turn " + turn);
                turn++;
                answer = scanner.next();
                int bulls = 0;
                int cows = 0;
                for (int i = 0; i < volume; i++) {
                    if (secretNum.substring(i, i + 1).equals(answer.substring(i, i + 1))) {
                        bulls += 1;
                        if (bulls == volume) {
                            System.out.println("Grade: " + bulls + " bulls.");
                            System.out.println("Congratulations! You guessed the secret code.");
                            System.exit(0);
                        }
                    }
                }
                if (bulls < volume && bulls != 0) {

                    for (int i = 0; i < volume; i++) {
                        if (answer.contains(secretNum.substring(i, i + 1))) {
                            cows += 1;
                        }
                    }
                    System.out.println("Grade: " + bulls + " bulls and " + (cows - bulls) + "cows.");
                } else if (bulls == 0) {
                    for (int i = 0; i < volume; i++) {
                        if (answer.contains(secretNum.substring(i, i + 1))) {
                            cows += 1;
                            System.out.println("Grade: " + cows + " cows.");
                            break;
                        }
                    }
                    if (cows == 0) {
                        System.out.println("Grade: None.");
                    }
                }
            } while (!secretNum.toString().equals(answer));
        }catch (NumberFormatException e) {
            System.out.println("error");
            System.exit(0);
        }
    }
}
