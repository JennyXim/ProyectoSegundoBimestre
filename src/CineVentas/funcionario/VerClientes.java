package CineVentas.funcionario;

import javax.swing.*;

public class VerClientes extends JFrame {
    private JPanel panelVerClientes;
    private JTextField txtVerClientes;
    private JButton btnBuscar;
    private JTable tbVerClientes;

    public VerClientes() {
        setTitle("Ver clientes");
        setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelVerClientes);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new VerClientes().setVisible(true);
        });
    }
}
