import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LojaDoces loja = new LojaDoces();
        loja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loja.setSize(500, 500);
        loja.setVisible(true);
        loja.setResizable(false);
    }
}