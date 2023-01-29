import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*Создать метод, который выводит в консоль результат це-
лочисленного деления числа, введенного с клавиатуры, на
значения элементов одномерного массива целых чисел, за-
полненный случайным образом – от -10 до 10. Длина масси-
ва случайная – от 1 до 10.
Обработать все возможные исключительные ситуации в
данном методе.*/




public class HW1 {
    public static void main(String[] args) {
        numberEntry();
    }

    public static void numberEntry() {

        try {
            System.out.println("Введите целое число: ");

            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());

            int[] mass = new int[random(1, 10)];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = random(-10, 10);
                if (mass[i] == 1 || mass[i] == -1 || mass[i] == number || mass[i] == -number)
                    System.out.println(Math.round(div(number, mass[i])));
                else System.out.println(div(number, mass[i]));

            }
            System.out.println("Массив случаных чисел: " + Arrays.toString(mass));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Вы ничего не ввели!");
            numberEntry();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели дробное число. Введите целое число: ");
        } catch (ArithmeticException e) {
            System.out.println("Было деление на ноль. Делить на ноль нельзя!");
        } finally {
            System.out.println("Желаете повторить? y/n");
            Scanner scanner1 = new Scanner(System.in);
            try {
                char i = scanner1.nextLine().charAt(0);
                if (i == 'y' || i == 'Y')
                    numberEntry();
                else if (i != 'y' || i != 'Y' && i != 'n' || i != 'N') {
                    System.out.println("Некорректный ввод!");
                    return;
                } else {
                    return;
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Вы ничего не ввели!");
                numberEntry();
            }

        }

    }

    public static int random(int a, int b) {
        Random random = new Random();
        return a + random.nextInt((b - a) + 1);
    }

    public static double div(int a, int b) {

        if (b != 0) {
            return (double) a / b;
        }
        return a / b;
    }
}
