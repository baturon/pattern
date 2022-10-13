import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*The time is entered from the keyboard (the number of hours
from 0 to 24), and the program displays greeting corresponding
to the entered time (for example, if 15 is entered, the greeting
“good day” is displayed).*/
        System.out.println("Enter what time it is:");
        Scanner scanner=new Scanner(System.in);
        int time= scanner.nextInt();
        if (time>4 && time<12)
        {System.out.printf("Good morning!");}
        if (time>11 && time<17)
            System.out.printf("Good day!");
        if (time>16 && time<4)
            System.out.printf("Good night!");
    }
}
