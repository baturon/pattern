package Sigarette;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Smoker extends Thread {
    protected final Semaphore smoker;
    protected final Semaphore dealer;

    private final String smokerType;

    public Smoker(Semaphore smoker, Semaphore dealer, String smokerType) {
        this.smoker = smoker;
        this.dealer = dealer;
        this.smokerType = smokerType;
    }

    @Override
    public void run() {
        while (true) {
            try {
                smoker.acquire();
                makeCigarette();
                smokeCigarette();
                dealer.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void makeCigarette() {
        System.out.format("<< %s >> делает сигарету\n", smokerType);
        try {
            Thread.sleep(Constants.sleepTimeMlsMakeCigarette);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.format("<< %s >> закончил делать сигарету - теперь стол чист\n", smokerType);
    }

    private void smokeCigarette() {

        System.out.format("<< %s >> курит\n", smokerType);
        Random rndSmoking=new Random();

        int smokingTime=rndSmoking.nextInt(3)+1;


        try {

            Thread.sleep(smokingTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.format("<< %s >>закончил курить сигарету, %s sec. \n", smokerType,smokingTime);
    }
}