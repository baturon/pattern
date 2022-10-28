import java.util.Scanner;

public class Test {
    /*1. Вывести паттерн в виде треугольника заданной высоты:
     *
     *  *
     *    *
     ******** */
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n * 2; j++) {
                if (j == n - i || j == n + i || i == n - 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}








