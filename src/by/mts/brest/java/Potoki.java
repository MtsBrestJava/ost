package by.mts.brest.java;

import javax.xml.stream.events.Namespace;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;



public class Potoki {
    static int symbol;
    static int pozicion = 10;
    static int speed = 50;
    static int s = 5;
    static int p = 5;

    public static void main(String[] args) {

        inKeis readKeys = new inKeis();
        readKeys.start();

        Stopper stopper = new Stopper();
        stopper.start();

        Gogo gogo = new Gogo();
        gogo.run();



    }


    static class Gogo implements Runnable {

        @Override
        public void run() {
            while (symbol != 1) {

                System.out.printf("%5d", speed);
                System.out.print("  |");
                int i = 0;
                while (i < pozicion) {
                    System.out.print(" ");
                    i++;
                }
                System.out.print("O");
                int j = 0;
                while (j < 22 - pozicion) {
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

            while (symbol != 1) {
                p = 1 + (int) (Math.random() * 2);
                s = 1 + (int) (Math.random() * 2);
                try {
                    Thread.sleep(10 * speed);
                } catch (InterruptedException r) {
                    r.printStackTrace();
                }
                switch (s) {

                    case 1 -> {
                        if (speed > 1 && speed < 99) speed += 10;
                    }
                    case 2 -> {
                        if (speed > 1 && speed < 99) speed -= 10;
                    }
                }
                switch (p) {
                    case 1 -> {
                        if (pozicion > 0 && pozicion < 19) pozicion += 1;
                    }
                    case 2 -> {
                        if (pozicion > 0 && pozicion < 19) pozicion -= 1;
                    }
                }
            }
        }
    }

    static class Stopper extends Thread implements KeyListener {
        //  Scanner in = new Scanner(System.in);

        @Override
        public void start() {
//          while (symbol != 1) {
//              try {
//                  symbol = in.nextInt();
//                  in.nextLine();
                  System.out.println(symbol);
//              } catch (Exception e) {
//                  e.printStackTrace();
//              }
            for (symbol = 1000; symbol > 1; symbol--) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException r) {
                    r.printStackTrace();
                }
            }
        }
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("jbgljkbgflajkjkjk");
            while (e.getKeyChar() == 'a')
//            switch (e.getKeyChar()) {
//                case 'd':
                    symbol = 1;
                    System.out.println("STOP");
//                    break;
//            }
        }
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyChar()) {
                case 'd':
                    symbol = 1;
                    System.out.println("STOP");
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e){
                switch (e.getKeyChar()) {
                    case 'd':
                        symbol = 1;
                        System.out.println("STOP");
                        break;
                }
//            in.close();
            }
        }
    }


