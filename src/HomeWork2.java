public class HomeWork2 {
    //Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
    public static void main(String[] args) {
        int num = 385;
        int a = num / 100, b = num / 10 % 10, c = num % 10;
        System.out.println("Дано число: " + num);
        System.out.println("Число наоборот: " + (c * 100 + b * 10 + a));


        //Способ 2
        int num1 = 385;
        int a1 = num / 100, b1 = num / 10 % 10, c1 = num % 10;
        String num2 = Integer.toString(c1) + Integer.toString(b1) + Integer.toString(a1);
        System.out.println("Дано число: " + num);
        System.out.println("Число наоборот: " + num2);
/*
Две клетки на шахматной доске определены своими координатами (x1,y1) и (x2,y2).
1. Может ли конь переместиться с первой на вторую клетку?
 */
        int x1 = 3, y1 = 3, x2 = 5, y2 = 2;
        int dx1 = Math.abs(x2 - x1);
        int dx2 = Math.abs(y2 - y1);
        boolean horse = dx1 == 2 && dx2 == 1 || dx1 == 1 && dx2 == 2;
        System.out.println(horse);

        //Может ли король переместиться с первой на вторую клетку
        int x11 = 3, y11 = 3, x21 = 4, y21 = 7;
        int dx11 = Math.abs(x21 - x11);
        int dx21 = Math.abs(y21 - y11);
        boolean king = dx11 == 1 && dx21 == 0 || dx11 == 0 && dx21 == 1 || dx11 == 1 && dx21 == 1;
        System.out.println(king);
    }

}