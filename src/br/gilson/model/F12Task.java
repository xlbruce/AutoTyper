package br.gilson.model;

import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Gilson de Paula
 * @version 1.0
 */
public class F12Task extends Task{
    Timer t;
    TimerTask task;
    Robot robot;

    public F12Task() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        t = new Timer();
        task = new TimerTask() {

            @Override
            public void run() {
                robot.keyPress(123);
                robot.keyRelease(123);
            }
        };
    }

    @Override
    public void start(int iniciarEm, int delay) {
        t.schedule(task, iniciarEm, delay);
    }

    @Override
    public void stop() {
        t.cancel();
    }
    
}
