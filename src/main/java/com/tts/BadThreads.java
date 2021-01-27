package com.tts;

public class BadThreads {
    static String message;

    private  static class CorrectorThread extends Thread {
        public void run() {

            try {
            sleep(1000);
            } catch (InterruptedException e) {}
            message = "Mares do eat oats.";
        }
    }

    public static void main(String args[]) throws InterruptedException {
            (new CorrectorThread()).start();
            message = "Mares do not eat oats.";
            Thread.sleep(1000);
            System.out.println(message);
        }

    }


