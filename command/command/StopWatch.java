package command;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    public StopWatch(){};

    public void  countDownOneMin(){
        int i = 60;
        
        while (i > 0) {
            System.err.println(i);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
            
            e.printStackTrace();
            }
            i--;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            

    }

    public void  countDownFiveMin(){
        int i = 300;
        
        while (i > 0) {
            System.err.println(i);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
            
            e.printStackTrace();
            }
            i--;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

    }

    public void  countDownThirtySec(){
        int i = 30;
        while (i > 0) {
            System.err.println(i);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
            
            e.printStackTrace();
            }
            i--;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

    }

}
