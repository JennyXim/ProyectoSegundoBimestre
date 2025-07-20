package CineVentas.funcionario;

import javax.swing.*;

public class VerVenta extends JFrame {
    private JPanel panelVerVenta;

    public VerVenta() {
        setTitle("Ver Ventas");
        setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelVerVenta);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new VerVenta().setVisible(true);
        });
    }
}
