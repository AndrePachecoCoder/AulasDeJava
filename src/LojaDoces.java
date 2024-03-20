import java.awt.*;
import javax.swing.*;
public class LojaDoces extends JFrame{
    private JTextField brigadeiroField;
    private JTextField cookieField;
    private JTextField pudimField;
    private JLabel label;
    private JLabel cookieLabel;
    //private JLabel pudimLabel;
    private JButton pedir;
    private ImageIcon icon;

    public LojaDoces() {
        super("Loja de Doces");
        JPanel painel = new JPanel(null);

        icon = new ImageIcon(getClass().getResource("1200px-Brigadeiro.jpg"));
        label = new JLabel(icon);
        label.setBounds(20, 20, 100, 75);
        painel.add(label);

        icon = new ImageIcon(getClass().getResource("cookie.jpg"));
        label = new JLabel(icon);
        label.setBounds(20, 140, 100, 100);
        painel.add(label);

        icon = new ImageIcon(getClass().getResource("pudim.jpg"));
        label = new JLabel(icon);
        label.setBounds(20, 270, 100, 100);
        painel.add(label);

        label = new JLabel("R$ 10");
        label.setBounds(135, 50, 60,40);
        painel.add(label);

        label = new JLabel("R$ 10");
        label.setBounds(135, 170, 60,40);
        painel.add(label);

        label = new JLabel("R$ 10");
        label.setBounds(135, 300, 60,40);
        painel.add(label);

        add(painel);
    }

}
