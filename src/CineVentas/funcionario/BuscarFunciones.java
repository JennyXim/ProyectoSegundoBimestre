package CineVentas.funcionario;

import javax.swing.*;

public class BuscarFunciones extends JFrame {
    private JPanel panelBuscarFunciones;
    private JTable tbBuscarFunciones;
    private JButton btnCerrarSesion;
    private JButton btnVender;
    private JButton btnBuscar;
    private JTextField txtBuscar;

    public BuscarFunciones() {
        setTitle("Buscar Funciones");
        setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelBuscarFunciones);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new BuscarFunciones().setVisible(true);
        });
    }
}
