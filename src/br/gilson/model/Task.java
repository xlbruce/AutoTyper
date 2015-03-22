package br.gilson.model;

import java.util.TimerTask;

/**
 * Tipo generico para as classes dos botoes de função
 * @author bruce
 */
public abstract class Task {
    
    public abstract void start (int delay, int period);
    
    public abstract void stop ();

    
}
