package CineVentas.funcionario;

import javax.swing.*;

public class VenderBoletos extends JFrame {
    private JPanel panelVenderBoletos;

    public VenderBoletos() {
        setTitle("Venda boletos");
        setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelVenderBoletos);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new VenderBoletos().setVisible(true);
        });
    }
}
