package br.gilson.controller;

import br.gilson.model.Task;
import br.gilson.model.TaskConfig;
import br.gilson.model.TaskFactory;
import br.gilson.view.PrincipalForm;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Este programa tem por finalidade automatizar o processo de repetição das
 * teclas de função (F1 - F12) pré-configurando o delay entre os pressionamentos
 * e o tempo em que o programa deve iniciar.
 *
 * @author Gilson de Paula
 * @version 1.0
 */
public final class AutoTyper {

    PrincipalForm form;
    private int delay;
    private int iniciarEm;
    static Task[] tasks;

    public AutoTyper() {
        tasks = new Task[12];
        init();
    }

    /**
     * @param args the command line arguments
     */
    public static synchronized void main(String[] args) {
        new AutoTyper();
    }

    public final void init() {
        form = new PrincipalForm();
        form.setVisible(true);

    }

    public static synchronized void start(Task[] tasks) {
        AutoTyper.tasks = tasks;
        for (Task task : AutoTyper.tasks) {
            if (task != null) {
                task.start();
            }
        }
    }

    public synchronized static void stop() {
        for (Task task : tasks) {
            if (task != null) {
                task.stop();
            }
        }
    }
}
