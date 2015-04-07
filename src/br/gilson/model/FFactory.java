package br.gilson.model;

/**
 *
 * @author bruce
 */
public class FFactory {

    public FFactory() {
    }

    public static Task getTask(String nome) {
        switch (nome) {
            case "F1":
                return new F1Task();
            case "F2":
                return new F2Task();
            case "F3":
                return new F3Task();
            case "F4":
                return new F4Task();
            case "F5":
                return new F5Task();
            case "F6":
                return new F6Task();
            case "F7":
                return new F7Task();
            case "F8":
                return new F8Task();
            case "F9":
                return new F9Task();
            case "F10":
                return new F10Task();
            case "F11":
                return new F11Task();
            case "F12":
                return new F12Task();
        }
        return null;
    }
}
