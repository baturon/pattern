package HomeWork12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class DataStructure {

    public static void main(String[] args) {
        System.out.println(generateString(3, 6));

        HashSet<ArrayList<String>> bigBox = new HashSet<>();

        for (int i = 0; i < 5; i++) {


            ArrayList<String> smallBox = new ArrayList<>();
            for (int j = 0; j < 5; j++)
                smallBox.add(generateString(3, 6));
            System.out.println(smallBox);
            bigBox.add(smallBox);

        }
        System.out.println(bigBox);

    }

    public static String generateString(int minCount, int maxCount) {
        Random random = new Random();
        int count = random.nextInt(maxCount - minCount) + minCount;
        StringBuilder sb = new StringBuilder();


        int digit = random.nextInt(10);
        sb.append(digit);

        for (int i = 0; i < count; i++) {
            char c = (char) (random.nextInt((int) 'z' - (int) 'a') + 'a');
            sb.append(c);

        }
        return sb.toString();
    }
}