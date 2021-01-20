package by.mts.brest.java;

import javax.swing.*;
import javax.xml.stream.events.Namespace;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.Scanner;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;


public class Potoki {
    public static int symbol;
    public static int speed = 0;
    private static int pozicion = 5;

    public static void main(String[] args) {
        inKeis readKeys = new inKeis();
        readKeys.start();
        // readKeys.keyPressed();

     //   Gogo gogo = new Gogo();
       // gogo.run();
    }

    static class Gogo implements Runnable {

        @Override
        public void run() {
            while (symbol != 32) {
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
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("----------FINICH----------");
        }
    }

    static class inKeis extends Thread implements KeyListener {

        @Override
        public void run() {
            //this.addKeyListener(this) ;
            while (symbol != 32) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException r) {
                    r.printStackTrace();
                }
                System.out.println(symbol);
                switch (symbol) {
                    case 32 -> {
                        break;
                    }
                    case 37 -> {
                        if (speed > 0 && speed < 9) speed++;
                    }
                    case 38 -> {
                        if (speed > 0 && speed < 9) speed--;
                    }
                    case 39 -> {
                        if (pozicion > 0 && pozicion < 10) pozicion++;
                    }
                    case 40 -> {
                        if (pozicion > 0 && pozicion < 10) pozicion--;
                    }
                }
            }

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            while (symbol == KeyEvent.VK_SPACE) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException d) {
                    d.printStackTrace();
                }
                System.out.println(symbol);
                System.out.println(e.getSource());
                System.out.println("karkesjasfekjksfd");
                symbol = e.getKeyCode();
                switch (symbol) {
                    case KeyEvent.VK_SPACE -> {
                        break;
                    }
                    case KeyEvent.VK_UP -> {
                        if (speed > 0 && speed < 9) speed++;
                    }
                    case KeyEvent.VK_DOWN -> {
                        if (speed > 0 && speed < 9) speed--;
                    }
                    case KeyEvent.VK_RIGHT -> {
                        if (pozicion > 0 && pozicion < 10) pozicion++;
                    }
                    case KeyEvent.VK_LEFT -> {
                        if (pozicion > 0 && pozicion < 10) pozicion--;
                    }
                }

            }
        }
            @Override
            public void keyReleased (KeyEvent e){

            }


    }
}

