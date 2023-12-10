package lr1;

import java.time.LocalDate;
import java.util.Scanner;


public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        // Получение текущей даты
        LocalDate currentDate = LocalDate.now();

        // Получение текущего года
        int currentYear = currentDate.getYear();

        // Вычисление возраста пользователя
        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age + " лет.");
    }
}
