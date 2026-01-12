package Main;

import Telas.Login;

/**
 *
 * @author Pedro
 */
public class MainApp {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

}
