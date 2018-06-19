package exercicio01;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Exercicio01 implements Exercicio01BaseInterface {

    private JFrame jFrame;
    private JButton jButtonSalvar, jButtonCancelar;
    private JLabel jLabelNome, jLabelIdade, jLabelRaca, jLabelApelido, jLabelPreco, jLabelDescricao;
    private JTextArea jTextAreaNome, jTextAreaIdade, jTextAreaApelido, jTextAreapreco, jTextAreaDescricao;

    public Exercicio01() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(600, 400);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
    }

    @Override
    public void instanciarComponentes() {
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        jLabelNome = new JLabel();
        
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jButtonSalvar.setLocation(50, 100);
        jButtonCancelar.setLocation(100, 100);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(50, 50);
        jButtonSalvar.setSize(50, 50);
        jButtonCancelar.setSize(50, 50);
        
    }

    public void configurarJScrollPane() {
        
    }

}
