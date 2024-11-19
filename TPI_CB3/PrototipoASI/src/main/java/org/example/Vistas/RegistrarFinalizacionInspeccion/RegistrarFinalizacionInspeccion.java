package org.example.Vistas.RegistrarFinalizacionInspeccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarFinalizacionInspeccion extends JFrame {

    private JPanel getPnlRegistrarFinalizacionInspeccion;

    private JButton registrarFinalizacionBoton;

    private JPanel pnlRegistrarFinalizacionInspeccion;
    private JComboBox comboBox1;
    private JTextField datosDeMedicionesTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField registrarLaFinalizaciónDeTextField;

    public RegistrarFinalizacionInspeccion() {
        setContentPane(pnlRegistrarFinalizacionInspeccion);

        setTitle("Registrar Finalización de Inspección");
        setSize(600, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        registrarFinalizacionBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Se registró correctamente la Finalización de la Inspección Técnica");
            }
        });
}


}