package CineVentas.funcionario;

import javax.swing.*;

public class VenderBoletos extends JFrame {
    private JPanel panelVenderBoletos;
    private JButton btnCalcularTotal;
    private JButton btnRegistrarVenta;
    private JButton btnLimpiar;
    private JComboBox comboBox1;
    private JTextField txtNombre;
    private JTextField txtCedula;
    private JTextField txtCantidadBoletos;
    private JLabel txtPrecioUnitario;
    private JLabel txtTotal;

    public VenderBoletos() {
        setTitle("Venda boletos");
        setSize(500, 300);

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
