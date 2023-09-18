import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        // Использование цикла for
        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }

        // Использование цикла while
        int j = 0;
        while (j < array.length) {
            sumWhile += array[j];
            j++;
        }

        // Использование цикла do-while
        int jdx = 0;
        do {
            sumDoWhile += array[jdx];
            jdx++;
        } while (jdx < array.length);

        System.out.println("Сумма чисел массива (for): " + sumFor);
        System.out.println("Сумма чисел массива (while): " + sumWhile);
        System.out.println("Сумма чисел массива (do-while): " + sumDoWhile);

        int i = 0;
        for (String arg : args) {
            System.out.println("Аргумент " + (i + 1) + ": " + arg);
            i++;
        }

        for (i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.println("Число " + i + ": " + harmonicNumber);
            array = generateRandomArray(10); // Генерация массива из 10 случайных чисел

            System.out.println("Массив до сортировки: " + Arrays.toString(array));

            Arrays.sort(array); // Сортировка массива

            System.out.println("Массив после сортировки: " + Arrays.toString(array));
        }

        int number = 5;
        long factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + ": " + factorial);
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
        }

        return array;
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}