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
/*2. Номиналы белорусских монет: 1,2,5,10,20,50.
Дана сумма сдачи: 51..99 копеек.
Выдать сдачу минимальным количеством монет.*/
        System.out.println("Введите сумму сдачи:");
        Scanner scanner1 = new Scanner(System.in);
        int sumCoins = scanner1.nextInt();
        int[] smallCoin = {1, 2, 5, 10, 20, 50};
        for (int i = 5; i >= 0; i--) {
            if (sumCoins >= smallCoin[i]) {
                System.out.println(smallCoin[i]);
                sumCoins -= smallCoin[i];
                if (sumCoins >= smallCoin[i])
                    i++;
            }
        }
    }
}


