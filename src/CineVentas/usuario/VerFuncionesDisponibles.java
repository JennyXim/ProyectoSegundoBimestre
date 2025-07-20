package CineVentas.usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerFuncionesDisponibles extends JFrame{
    private JPanel JPanel1;
    private JTextField txtPelicula;
    private JComboBox boxCategoria;
    private JTextField txtNombre;
    private JTextField txtSala;
    private JTextField txtPrecio;
    private JTextField txtAsientoDisponible;
    private JTextField txtFecha;
    private JTextField txtHora;
    private JTable table1;
    private JButton BUSCARButton;
    private JButton COMPRARButton;
    private JButton MENUButton;

    public VerFuncionesDisponibles() {
        setTitle("FUNCIONES DISPONIBLES");
        setSize(850, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel1);
        setLocationRelativeTo(null);
        COMPRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ComprarBoletos().setVisible(true);
                dispose();
            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuUsuario().setVisible(true);
                dispose();
            }
        });
    }
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> {
            new VerFuncionesDisponibles().setVisible(true);
        });
    }

}
