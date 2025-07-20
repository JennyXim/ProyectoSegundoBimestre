package CineVentas.usuario;

import CineVentas.login.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUsuario extends JFrame {
    private JPanel JPanel1;
    private JButton comprarBoletosButton;
    private JButton misBoletosButton;
    private JButton verFuncionesDisponiblesButton;
    private JButton salirButton;

    public MenuUsuario() {
        setTitle("Menu Usuario ");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel1);
        setLocationRelativeTo(null);
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().setVisible(true);
                dispose();
            }
        });
        comprarBoletosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ComprarBoletos().setVisible(true);
                dispose();
            }
        });
        verFuncionesDisponiblesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerFuncionesDisponibles().setVisible(true);
                dispose();
            }
        });
        misBoletosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MisBoletos().setVisible(true);
                dispose();
            }
        });
    }
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> {
            new MenuUsuario().setVisible(true);
        });
    }
}
