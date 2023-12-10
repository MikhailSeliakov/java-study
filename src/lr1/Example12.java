package lr1;

import java.time.LocalDate;
import java.util.Scanner;


public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        // Получение текущей даты
        LocalDate currentDate = LocalDate.now();

        // Получение текущего года
        int currentYear = currentDate.getYear();

        // Вычисление года рождения
        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);
    }
}
