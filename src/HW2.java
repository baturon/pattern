
/*Создать метод, принимающий на вход число. В случае,
если число отрицательное, в методе должно быть брошено
проверяемое исключение. Если число больше 100, должно
быть брошено непроверяемое исключение. Создать свои ис-
ключения для данного примера.*/


import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) throws MyСheckedException {
        try {
            System.out.println("Введите число от 0 до 100: ");
            Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.nextLine());
            myMethod(a);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!");
        }

    }

    public static void myMethod(int a) throws MyСheckedException {
        if (a > 100)
            throw new MyUncheckedException("Введено число больше 100!");
        else if (a < 0)
            throw new MyСheckedException("Введено число меньше 0!");
        else System.out.println(a);

    }
}

class MyСheckedException extends Exception {
    public MyСheckedException(String message){
        super(message);
    }
}

class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message){
        super(message);
    }
}

