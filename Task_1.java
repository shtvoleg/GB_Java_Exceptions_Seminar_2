// Обучающийся: ШИТОВ Олег Владимирович, "Разработчик Python", поток 4544, будни, утро.  12.08.2023.
// Исключения в программировании и их обработка (семинары)

// Урок 2. Исключения и их обработка

// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Введите дробное число: ");
                number = Float.parseFloat(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите дробное число.");
            }
        }
        System.out.println("Введенное число: " + number);
    }
}