package exercicio01;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
    private JComboBox jComboBoxRaca;
    
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
        jFrame.setSize(660, 455);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelRaca);
        jFrame.add(jTextAreaNome);
        jFrame.add(jTextAreaIdade);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelIdade = new JLabel("Idade");
        jLabelRaca = new JLabel("Raça");
        jTextAreaNome = new JTextArea("");
        jTextAreaIdade = new JTextArea("");
        jComboBoxRaca = new JComboBox();
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jLabelIdade.setLocation(430, 10);
        jLabelRaca.setLocation(10, 70);
        jTextAreaNome.setLocation(10, 30);
        jTextAreaIdade.setLocation(430, 30);
        jComboBoxRaca.setLocation(10, 90);
        jButtonSalvar.setLocation(485, 335);
        jButtonCancelar.setLocation(345, 335);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(50, 10);
        jLabelIdade.setSize(50, 10);
        jLabelRaca.setSize(50, 10);
        jTextAreaNome.setSize(370, 20);
        jTextAreaIdade.setSize(205, 20);
        jComboBoxRaca.setSize(150, 20);
        jButtonSalvar.setSize(150, 70);
        jButtonCancelar.setSize(135, 70);
    }

    public void configurarJScrollPane() {

    }

}
