package Sigarette;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Dealer extends Thread {
    private final Random rnd = new Random();
    private final Table table;
    private final Semaphore dealer;

    public Dealer(Table table, Semaphore dealer) {
        this.table = table;
        this.dealer = dealer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                dealer.acquire();
                provideIngredients();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void provideIngredients() {
        int temp = rnd.nextInt(3);
        if (temp == 0) {
            System.out.println("Бармен кладет на стол спички и бумагу");
            table.putPaper();
            table.putMatches();
        }
        if (temp == 1) {
            System.out.println("Бармен кладет на стол спички и табак");
            table.putTobacco();
            table.putMatches();
        }
        if (temp == 2) {
            System.out.println("Бармен кладет на стол табак и бумагу");
            table.putTobacco();
            table.putPaper();
        }
    }

}