public class HomeWork4 {
    public static void main(String[] args) {
        /*Fibonacci numbers are a sequence of numbers, in which the first
two numbers of the sequence are 0 and 1, and each successive
number is equal to the sum of two preceding ones.
Output all Fibonacci numbers in the range from 0 to 10,000,000
to the screen.*/
        int f0 = 0;
        int f1 = 1;
        System.out.print(f0 + " " + f1 + " ");
        for (int i = 0; i < 10_000_000; i++) {
            int f2 = f0 + f1;
            System.out.print(f2 + " ");
            f0 = f1;
            f1 = f2;
        }
        System.out.println();
        /*A perfect number is a natural number that is equal to the sum
of all its own divisors (that is, all positive divisors different from
the number itself).
Display all the perfect numbers in the range from 0 to 1,000,000.
Examples:
The 1st perfect number, 6, has the following own divisors: 1, 2,
3; their sum is 6.
The 2nd perfect number, 28, has the following own divisors: 1,
2, 4, 7, 14; their sum is 28.*/
        int num, div;
        for (num = 1; num < 1_000_000; num++) {
            int r = 0;
            for (div = 1; div < num; div++) {
                if (num % div == 0) {
                    r += div;
                }
            }
            if (r == num) {
                System.out.print(num + " ");
            }
        }
    }
}

