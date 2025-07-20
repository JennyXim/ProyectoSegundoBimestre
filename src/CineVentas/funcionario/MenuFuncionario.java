package CineVentas.funcionario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        btnBuscarFunciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarFunciones buscarFunciones = new BuscarFunciones();
                buscarFunciones.setVisible(true);
                setVisible(false);
            }
        });
        btnVenderBoletos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VenderBoletos venderBoletos = new VenderBoletos();
                venderBoletos.setVisible(true);
                setVisible(false);
            }
        });
        btnModificarVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerVenta verVenta = new VerVenta();
                verVenta.setVisible(true);
                setVisible(false);
            }
        });
        btnVerClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerClientes verClientes = new VerClientes();
                verClientes.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new MenuFuncionario().setVisible(true);
        });
    }
}
