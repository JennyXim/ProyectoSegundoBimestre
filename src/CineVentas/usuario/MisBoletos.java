package CineVentas.usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MisBoletos extends JFrame{
    private JPanel JPanel1;
    private JTextField txtPelicula;
    private JTextField txtFecha;
    private JTextField txtHora;
    private JTextField txtCantidadTickets;
    private JTextField txtSala;
    private JTextField txtPago;
    private JTable table1;
    private JButton MENUButton;
    private JButton REALIZARCOMPRAButton;

    public MisBoletos() {
        setTitle("Mis Compras");
        setSize(850, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel1);
        setLocationRelativeTo(null);
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuUsuario().setVisible(true);
                dispose();
            }
        });
        REALIZARCOMPRAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerFuncionesDisponibles().setVisible(true);
                dispose();
            }
        });
    }
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> {
            new MisBoletos().setVisible(true);
        });
    }
}
