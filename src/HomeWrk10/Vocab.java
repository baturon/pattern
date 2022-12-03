package HomeWrk10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Vocab {
    public static void main(String[] args) {
        int count = 'z' - 'a' + 1;
        int count1;
        //System.out.println(count);

        List<String> vocab = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/HomeWrk10/Vocab.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocab.add(s);
            }
            while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        vocab.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        //for (String s : vocab) System.out.println(s);

        for (char l = 'a'; l <= 'z'; l++) {
            count = 0;
            count1 = 0;
            for (String s1 : vocab) {
                char[] arr = s1.toCharArray();
                for (char c : arr)
                    if (c == l)
                        count++;
                if (arr[0] == l)
                    count1++;
            }
            System.out.println("Буква " + "\"" + l + "\"" + "-встречаетя " + count + "-раз");
        }
        System.out.println();
        for (char l = 'a'; l <= 'z'; l++) {
            count1 = 0;
            for (String s1 : vocab) {
                char[] arr = s1.toCharArray();
                for (char c : arr)
                    if (arr[0] == l)
                        count1++;
            }
            System.out.println("На букву " + "\"" + l + "\"" + " начинается " + count1 + " слов");
        }
    }
}

