package lr1;

import java.util.Scanner;


public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int numberMinusOne = number - 1;
        int numberPlusOne = number + 1;
        int numberSquared = (number + numberMinusOne + numberPlusOne) * (number + numberMinusOne + numberPlusOne);

        System.out.println("Последовательность: " + numberMinusOne + ", " + number + ", " + numberPlusOne + ", " + numberSquared);
    }
}
