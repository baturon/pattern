import java.util.Scanner;

public class HomeWork9 {


    public static void main(String[] args) {
        System.out.println("Введите число: ");

    Scanner scanner=new Scanner(System.in);
    int rows= scanner.nextInt();
    // Pattern 4
        System.out.println("Pattern 4");
        for (int i = 0; i <rows ; i++) {
            for(int j=1; j<=rows-i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        for (int i = rows-1; i >=0 ; i--) {
            for(int j=1; j<=rows-i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();
//Patter n 17
        System.out.println("Pattern 17");
        for (int i = rows; i >0 ; i--) {
            for(int j=0; j<rows-i; j++) {
                System.out.print(" ");
            }
               for(int l=rows+1-i;l<=rows;l++)
                   System.out.print(l+" ");
                System.out.println();
        }
        for (int i = 1; i <=rows ; i++) {
            for (int j =rows-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for(int l=rows+1-i;l<=rows;l++)
                System.out.print(l+" ");
            System.out.println();
        }
    }
}
