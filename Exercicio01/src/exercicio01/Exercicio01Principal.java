package exercicio01;

import java.awt.EventQueue;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Exercicio01Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio01();
            }
        });
    }
    
}
