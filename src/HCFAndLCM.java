import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int hcf = calculateHCF(number1, number2);
        int lcm = calculateLCM(number1, number2);

        System.out.println("HCF of " + number1 + " and " + number2 + " is: " + hcf);
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
    }

    public static int calculateHCF(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static int calculateLCM(int number1, int number2) {
        int hcf = calculateHCF(number1, number2);
        return (number1 * number2) / hcf;
    }
}

