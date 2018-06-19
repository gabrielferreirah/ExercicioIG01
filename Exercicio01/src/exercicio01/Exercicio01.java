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
        jFrame.add(jLabelNome);
    }

    @Override
    public void instanciarComponentes() {
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        jLabelNome = new JLabel("Nome");
        
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jButtonSalvar.setLocation(10, 100);
        jButtonCancelar.setLocation(100, 100);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(50, 35);
        jButtonSalvar.setSize(100, 100);
        jButtonCancelar.setSize(100, 100);
        
    }

    public void configurarJScrollPane() {
        
    }

}
