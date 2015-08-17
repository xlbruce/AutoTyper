package br.gilson.model;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 * Essa classe representa o conjunto de uma checkbox, e 2 text fields, para
 * facilitar a organização do menu principal
 * @author BRUCE
 */
public class TaskConfig {
    
    JCheckBox checkbox;
    JTextField iniciarEm, delay;

    public TaskConfig(JCheckBox checkbox, JTextField iniciarEm, JTextField delay) {
        this.checkbox = checkbox;
        this.iniciarEm = iniciarEm;
        this.delay = delay;
    }

    public JCheckBox getCheckbox() {
        return checkbox;
    }

    public JTextField getIniciarEm() {
        return iniciarEm;
    }

    public JTextField getDelay() {
        return delay;
    }

    public void setCheckbox(JCheckBox checkbox) {
        this.checkbox = checkbox;
    }

    public void setIniciarEm(JTextField iniciarEm) {
        this.iniciarEm = iniciarEm;
    }

    public void setDelay(JTextField delay) {
        this.delay = delay;
    }
    
    public boolean isValid() {
        try {
           int iniciar =  Integer.parseInt(this.delay.getText());
           int delay = Integer.parseInt(this.iniciarEm.getText());
           if (iniciar >= 0 && delay >= 0) return true;
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }    
}
