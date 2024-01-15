/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.app.poo.vista.cliente;

import ec.edu.ups.app.poo.controlador.ClienteControlador;
import ec.edu.ups.app.poo.modelo.Cliente;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class VentanaBuscarCliente extends javax.swing.JInternalFrame {
     private ClienteControlador clienteControlador;
    /**
     * Creates new form VentanaBuscarCliente
     */
    public VentanaBuscarCliente(ClienteControlador clienteControlador) {
        initComponents();
        this.clienteControlador = clienteControlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        identificacionBuscar = new javax.swing.JLabel();
        txtIdentificacionBuscar = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        lbNombreCliente = new javax.swing.JLabel();
        txtNombreClienteBuscar = new javax.swing.JTextField();
        lbCorreoCliente = new javax.swing.JLabel();
        txtCorreoClienteBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Cliente");

        jPanel1.setBackground(new java.awt.Color(195, 172, 133));
        jPanel1.setToolTipText("");

        identificacionBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        identificacionBuscar.setText("Identificación");

        txtIdentificacionBuscar.setBackground(new java.awt.Color(143, 119, 65));

        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        lbNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNombreCliente.setText("Nombre");

        txtNombreClienteBuscar.setEditable(false);
        txtNombreClienteBuscar.setBackground(new java.awt.Color(143, 119, 65));
        txtNombreClienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteBuscarActionPerformed(evt);
            }
        });

        lbCorreoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCorreoCliente.setText("Correo");

        txtCorreoClienteBuscar.setEditable(false);
        txtCorreoClienteBuscar.setBackground(new java.awt.Color(143, 119, 65));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(identificacionBuscar)
                        .addGap(43, 43, 43)
                        .addComponent(txtIdentificacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnBuscarCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreCliente)
                            .addComponent(lbCorreoCliente))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoClienteBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtNombreClienteBuscar))))
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identificacionBuscar)
                    .addComponent(btnBuscarCliente))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCliente)
                    .addComponent(txtNombreClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCorreoCliente))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteBuscarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        String identificacion = txtIdentificacionBuscar.getText();
        Cliente cliente = clienteControlador.read(identificacion);
        if (cliente==null){
            JOptionPane.showMessageDialog(this, "El cliente no existe!");
        }else{
            txtIdentificacionBuscar.setText(cliente.getIdentificacion());
            txtNombreClienteBuscar.setText(cliente.getNombre());
            txtCorreoClienteBuscar.setText(cliente.getCorreo());
            
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        ResourceBundle titulos = ResourceBundle.getBundle("titulos.titulos", locale); 
            this.setTitle(titulos.getString("BuscarC"));
        identificacionBuscar.setText(mensajes.getString("idCliente"));
        lbNombreCliente.setText(mensajes.getString("nombre"));
        lbCorreoCliente.setText(mensajes.getString("correoCliente"));
        btnBuscarCliente.setText(mensajes.getString("buscarBibliotecaMenu"));        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JLabel identificacionBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCorreoCliente;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JTextField txtCorreoClienteBuscar;
    private javax.swing.JTextField txtIdentificacionBuscar;
    private javax.swing.JTextField txtNombreClienteBuscar;
    // End of variables declaration//GEN-END:variables
}