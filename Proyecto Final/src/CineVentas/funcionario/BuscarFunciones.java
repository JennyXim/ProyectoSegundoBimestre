package CineVentas.funcionario;

import javax.swing.*;

public class BuscarFunciones extends JFrame {
    private JPanel panelBuscarFunciones;
    private JTable table1;
    private JButton cerrarSesionButton;
    private JButton venderButton;
    private JButton buscarButton;
    private JTextField textField1;

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
