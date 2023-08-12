// Обучающийся: ШИТОВ Олег Владимирович, "Разработчик Python", поток 4544, будни, утро.  12.08.2023.
// Исключения в программировании и их обработка (семинары)

// Урок 2. Исключения и их обработка

// 2. Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        try {
            int d = 0;
            int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}