public class HomeWork5 {
    public static void main(String[] args) {
        /* Дано целое число N (> 0). Найти сумму
1 + 1/2 + 1/3 + . . . + 1/N
(вещественное число).*/
        int n = 10;
        double sum = 0;
        for (int i = 2; i <= n; i++)
            sum += 1 / (double) i;
        System.out.println(1 + sum);
        /* Дано целое число N (> 0). Найти произведение
1.1 · 1.2 · 1.3 · . . .
(N сомножителей).*/
        double product = 1.1, a = 1.2;
        for (int i = 1; i < n; i++) {
            product *= a;
            a += 0.1;
        }
        System.out.println(product);

    }
}
