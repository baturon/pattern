import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork6 {

    public static void main(String[] args) {
        /*Fill an array of 30 elements with random numbers from -70
to +50. Find the minimum element and output it to the console.
Find the maximum element and output it to the console.*/

        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 121) - 70);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальный элемент:" + arr[0]);
        System.out.println("Максимальный элемент:" + arr[29]);

/*Fill an array of 15 elements with Fibonacci numbers. Output
only the even elements of the array to the console.*/
        int[] arrFib = new int[15];
        ArrayList<Integer> arrRes = new ArrayList<>();
        int f0 = 0;
        int f1 = 1;
        arrFib[0] = f0;
        arrFib[1] = f1;
        for (int i = 2; i < arrFib.length - 1; i++) {
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            arrFib[i] = f2;
            if (arrFib[i] % 2 == 0) {
                arrRes.add(arrFib[i]);
            }
        }
        System.out.println(arrRes);
    }
}
