package CineVentas.usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComprarBoletos extends JFrame {
    private JPanel JPanel1;
    private JTextField txtPelicula;
    private JTextField txtSala;
    private JTextField txtFecha;
    private JTextField txtHora;
    private JComboBox boxTipoSala;
    private JTextField txtAsiento;
    private JComboBox boxCantidad;
    private JTextField txtDuracion;
    private JTextField txtCategoria;
    private JButton CONFIRMARCOMPRARButton;
    private JTextField txtPrecioUnitario;
    private JTextField txtSubtotal;
    private JTextField txtTotal;
    private JButton verOtraFuncionButton;
    private JButton menuButton;

    public ComprarBoletos() {
        setTitle("COMPRA DE BOLETOS");
        setSize(850, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel1);
        setLocationRelativeTo(null);
        verOtraFuncionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerFuncionesDisponibles().setVisible(true);
                dispose();
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuUsuario().setVisible(true);
                dispose();
            }
        });
    }
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> {
            new ComprarBoletos().setVisible(true);
        });
    }
}
