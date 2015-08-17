package br.gilson.model;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 * Essa classe representa as tarefas (pressionamento da tecla). * 
 * @author bruce
 */
public class Task extends TimerTask {

    private final int tecla;
    long iniciarEm, delay;
    TimerTask timerTask;
    Timer timer;
    Robot robot;

    /**
     * 
     * @param tecla KeyCode da tecla que deve ser pressionada
     * @param iniciarEm Tempo de ociosidade antes de iniciar os pressionamentos
     * @param delay Intevalo de tempo em que a tecla deve ser pressionada
     */
    public Task(int tecla, long iniciarEm, long delay) {
        this.tecla = tecla;
        this.iniciarEm = iniciarEm;
        this.delay = delay;
        
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            System.err.println("Não foi possível instanciar a classe Robot");
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro!\nVerifique a saída padrão para detalhes");
            System.exit(0);
        }
        
        timer = new Timer();
    }

    public void start() {
        timer.schedule(this, iniciarEm, delay);
    }
    
    public void stop() {
        timer.cancel();
    }
       
    @Override
    public void run() {
        robot.keyPress(tecla);
        robot.keyRelease(tecla);
    }
}