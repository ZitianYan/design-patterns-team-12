package command;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    public StopWatch(){};

    public void  countDownOneMin(){
        int minutes = 0;
        int seconds = 59;
        while (seconds != 0) {
            System.err.println("0"+minutes+":"+seconds);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(seconds != 0){
                seconds--;
            }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            

    }

    public void  countDownFiveMin(){
        int minutes = 4;
        int seconds = 59;
        while (minutes != 0 && seconds != 0) {
            System.err.println("0"+minutes+":"+seconds);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds--;
            if(seconds == 0 && minutes != 0){
                minutes--;
                seconds = 59;
            }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

    }

    public void  countDownThirtySec(){
        int minutes = 0;
        int seconds = 29;
        while (seconds != 0) {
            System.err.println("0"+minutes+":"+seconds);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(seconds != 0){
                seconds--;
            }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

    }

}