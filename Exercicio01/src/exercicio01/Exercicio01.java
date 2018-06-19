package exercicio01;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Exercicio01 implements Exercicio01BaseInterface {

    private JFrame jFrame;
    private JButton jButtonSalvar, jButtonCancelar;
    private JLabel jLabelNome, jLabelIdade, jLabelRaca, jLabelApelido, jLabelPreco, jLabelDescricao;
    private JTextArea jTextAreaNome, jTextAreaIdade, jTextAreaApelido, jTextAreapreco, jTextAreaDescricao;
    private JTextField jTextFieldNome;
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
        jFrame.setSize(625, 425);
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
        jButtonSalvar.setLocation(450, 310);
        jButtonCancelar.setLocation(160, 100);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(50, 10);
        jButtonSalvar.setSize(140, 70);
        jButtonCancelar.setSize(130, 70);
        
    }

    public void configurarJScrollPane() {
        
    }

}
