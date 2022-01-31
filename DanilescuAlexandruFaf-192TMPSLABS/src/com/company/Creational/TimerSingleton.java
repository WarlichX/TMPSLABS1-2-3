package com.company.Creational;
import java.util.Timer;
import java.util.TimerTask;

public class TimerSingleton {

    //create an object of TimerSingleton
    private static TimerSingleton instance = new TimerSingleton();

    //make the constructor private so that this class cannot be instantiated
    private TimerSingleton() {
    }

    //Get the only object available
    public static TimerSingleton getInstance() {
        return instance;
    }


    Timer timer;
    public void startCountdown() {
        timer = new Timer();
        timer.schedule(new RemindTask(), 30000);
        System.out.println("30 seconds left");
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up! Random fighter selected");
            timer.cancel(); //Terminate the timer thread
        }
    }
}
