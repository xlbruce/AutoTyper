package br.gilson.model;

import java.awt.event.KeyEvent;

/**
 *
 * @author bruce
 */
public class TaskFactory {

    private TaskFactory() {
    }

    public static Task getTask(String nome, int iniciarEm, int delay) {
        switch (nome) {
            case "F1":
                return new Task(KeyEvent.VK_F1, iniciarEm, delay);
            case "F2":
                return new Task(KeyEvent.VK_F2, iniciarEm, delay);
            case "F3":
                return new Task(KeyEvent.VK_F3, iniciarEm, delay);
            case "F4":
                return new Task(KeyEvent.VK_F4, iniciarEm, delay);
            case "F5":
                return new Task(KeyEvent.VK_F5, iniciarEm, delay);
            case "F6":
                return new Task(KeyEvent.VK_F6, iniciarEm, delay);
            case "F7":
                return new Task(KeyEvent.VK_F7, iniciarEm, delay);
            case "F8":
                return new Task(KeyEvent.VK_F8, iniciarEm, delay);
            case "F9":
                return new Task(KeyEvent.VK_F9, iniciarEm, delay);
            case "F10":
                return new Task(KeyEvent.VK_F10, iniciarEm, delay);
            case "F11":
                return new Task(KeyEvent.VK_F11, iniciarEm, delay);
            case "F12":
                return new Task(KeyEvent.VK_F12, iniciarEm, delay);
        }
        return null;
    } 
    
    public static Task getTask(TaskConfig taskConfig) {
        String nome = taskConfig.getCheckbox().getText();
        int iniciarEm = Integer.parseInt(taskConfig.getIniciarEm().getText());
        int delay = Integer.parseInt(taskConfig.getDelay().getText());
        
        return getTask(nome, iniciarEm, delay);        
    }
}
