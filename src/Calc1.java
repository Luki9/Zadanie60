import java.util.Scanner;

public class Calc1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pierwsza liczba");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Druga liczba");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        scanner.close();


        if (number1 > number2) {
            int sum = number1 + number2;
            System.out.println("Suma liczb:" + sum);

        } else if (number1 < number2) {
            int numbers = number1 * number2;
            System.out.println("Iloczyn:" + numbers);
        } else {
            int square = number1 * number2;
            System.out.println("Kwadrat: " + square);

        }


    }
}

