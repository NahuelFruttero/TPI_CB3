package org.example.Vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarInspeccion extends JFrame {

    private JPanel pnlRegistrarInscripcion;

    private JButton registrarInscripciónButton;

    private JTextField txtPatente;
    private JTextField txtModelo;
    private JLabel lblaFab;
    private JTextField txtaFab;
    private JTextField txtMarca;
    private JLabel lblChasis;
    private JTextField txtChasis;
    private JComboBox cbTipo;
    private JComboBox cbCom;
    private JLabel lblTipo;
    private JLabel lblCom;
    private JLabel lblPatente;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JTextField INGRESELOSDATOSDELTextField;

    private void createUIComponents() {


    }

    public RegistrarInspeccion() {
        setContentPane(pnlRegistrarInscripcion);
        setTitle("Registrar Inspección Técnica Vehicular");
        setSize(600, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        registrarInscripciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Inspección Técnica Registrada");
            }
        });
    }
}
