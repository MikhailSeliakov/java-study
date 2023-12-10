package lr1;

import java.time.LocalDate;
import java.util.Scanner;


public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш год рождения: ");
        int birthYear = scanner.nextInt();

        // Получение текущей даты
        LocalDate currentDate = LocalDate.now();

        // Получение текущего года
        int currentYear = currentDate.getYear();

        // Вычисление возраста пользователя
        int age = currentYear - birthYear;

        System.out.println("Привет, " + name + "! Ваш возраст: " + age + " лет.");
    }
}
