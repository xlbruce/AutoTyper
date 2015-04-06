package br.gilson.controller;

import br.gilson.model.FFactory;
import br.gilson.model.Task;
import br.gilson.view.PrincipalForm;
import java.awt.AWTException;
import java.util.ArrayList;
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

    public AutoTyper() throws AWTException {
        tasks = new Task[12];
        init();
    }

    /**
     * @param args the command line arguments
     */
    public static synchronized void main(String[] args) {
        try {
            new AutoTyper();
        } catch (AWTException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível iniciar a aplicação");
            e.printStackTrace();
        }
    }

    public final void init() {
        form = new PrincipalForm();
        form.setVisible(true);

    }

    public static synchronized void start(ArrayList<String> botoes, int delay, int period) {
        //Verificar quais teclas devem ser acionadas
        //somente f5 (temporário)
        ArrayList<String> fs = new ArrayList<>();
        fs.add("F1");
        fs.add("F2");
        fs.add("F3");
        fs.add("F4");
        fs.add("F5");
        fs.add("F6");
        fs.add("F7");
        fs.add("F8");
        fs.add("F9");
        fs.add("F10");
        fs.add("F11");
        fs.add("F12");
        for (String botao : botoes) {
            if (fs.contains(botao)) {
                tasks[fs.indexOf(botao)] = FFactory.getTask(botao);
                tasks[fs.indexOf(botao)].start(delay, period);
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
