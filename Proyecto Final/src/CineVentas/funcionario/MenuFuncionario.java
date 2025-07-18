package CineVentas.funcionario;

import javax.swing.*;

public class MenuFuncionario extends JFrame {
    private JPanel panelMenuFuncionario;
    private JButton btnBuscarFunciones;
    private JButton btnVenderBoletos;
    private JButton btnModificarVenta;
    private JButton btnVerClientes;
    private JButton btnCerrarSesion;

    public MenuFuncionario() {
        setTitle("Menú");
        setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelMenuFuncionario);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new MenuFuncionario().setVisible(true);
        });
    }
}
