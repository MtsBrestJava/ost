package by.mts.brest.java;

import java.util.Scanner;



public class Potoki {
    static String symbol;
    static int pozicion=5;
    static int speed=5;
    static int s=5;
    static int p=5;

    public static void main(String[] args)  {

        Stopper stopper = new Stopper();
        stopper.start();

        inKeis readKeys = new inKeis();
        readKeys.start();
        Gogo gogo = new Gogo();
        gogo.run();


    }

    static class Gogo implements Runnable {

        @Override
        public void run() {
            while (symbol != "q") {

                System.out.print(speed + "|");
                int i = 0;
                while (i < pozicion) {
                    System.out.print(" ");
                    i++;
                }
                System.out.print("O");
                int j = 0;
                while (j < 20 - pozicion) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("| \n");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("----------FINICH----------");
        }
    }

    static class inKeis extends Thread {

        @Override
        public void run() {

            while (symbol != "q") {
                p = 1 + (int) ( Math.random() * 2 );
                s = 1 + (int) ( Math.random() * 2 );
                try {
                    Thread.sleep(100 * speed);
                } catch (InterruptedException r) {
                    r.printStackTrace();
                }
                 switch (s) {

                    case 1 -> {
                        if (speed > 0 && speed < 20) speed++;
                    }
                    case 2 -> {
                        if (speed > 0 && speed < 20) speed--;
                    }
                }
                switch (p) {
                    case 1 -> {
                        if (pozicion > 0 && pozicion < 20) pozicion++;
                    }
                    case 2 -> {
                        if (pozicion > 0 && pozicion < 20) pozicion--;
                    }
                }
            }
        }
    }

    static class Stopper extends Thread {
             Scanner in = new Scanner(System.in);

        @Override
        public void start() {
          while (symbol != "q") {
                symbol = in.nextLine();
               // in.nextLine();
              System.out.println(symbol);
              in.close();
            }

        }

    }
}

