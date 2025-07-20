package CineVentas.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearLogin extends JFrame{
    private JPanel JPanel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JCheckBox mostrarClaveCheckBox;
    private JButton CREARNUEVACUENTAButton;
    private JButton regresarButton;


    public CrearLogin() {
        setTitle("CREAR UNA NUEVA CUENTA ");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel1);
        setLocationRelativeTo(null);
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().setVisible(true);
                dispose();
            }
        });
    }
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> {
            new CrearLogin().setVisible(true);
        });
    }

}
