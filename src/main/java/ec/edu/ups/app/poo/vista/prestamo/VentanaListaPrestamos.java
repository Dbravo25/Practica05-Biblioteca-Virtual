/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.app.poo.vista.prestamo;

import ec.edu.ups.app.poo.controlador.PrestamoControlador;
import ec.edu.ups.app.poo.modelo.Prestamo;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class VentanaListaPrestamos extends javax.swing.JInternalFrame {
    private PrestamoControlador prestamoControlador;
    /**
     * Creates new form VentanaListaPrestamos
     */
    public VentanaListaPrestamos(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador =prestamoControlador;
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
        btListar = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        tbPrestamo = new javax.swing.JTable();

        setBackground(new java.awt.Color(188, 147, 92));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar Prestamos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(195, 172, 133));

        btListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btListar.setText("Listar");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        tbPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero Prestamo", "Libros", "Cliente", "Fecha Prestamo", "Fecha Devolución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(tbPrestamo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btListar)
                .addContainerGap(441, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btListar)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        // TODO add your handling code here:
        cargarDatos();
        }
    public void cargarDatos() {
        List<Prestamo> prestamos = prestamoControlador.list();
        DefaultTableModel tabla = (DefaultTableModel) tbPrestamo.getModel();
        tabla.setNumRows(0);
        for (Prestamo prestamo : prestamos) {
             SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
           String fechaP= fecha.format(prestamo.getFechaPrestamo());
           String fechaD = fecha.format(prestamo.getFechaDevolucion());
            Object[] rowData = {prestamo.getNumeroPrestamo(), prestamo.getLibros(), prestamo.getCliente().getNombre(), fechaP,
                fechaD};
            tabla.addRow(rowData);
        } 
        
    }//GEN-LAST:event_btListarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        cargarDatos();
    }//GEN-LAST:event_formInternalFrameActivated

    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        ResourceBundle titulos = ResourceBundle.getBundle("titulos.titulos", locale); 
        ResourceBundle tablas = ResourceBundle.getBundle("tablas.tablas", locale); 
        String Nprestamo = tablas.getString("tablaNprestamo");
        String Libros = tablas.getString("tablaLibro");
        String Cliente = tablas.getString("tablaCliente");
        String Fprestamo = tablas.getString("tablaFprestamo"); 
        String Fdevolucion = tablas.getString("tablaFdevolucion");               
        DefaultTableModel tabla = (DefaultTableModel) tbPrestamo.getModel();
        tabla.setColumnIdentifiers(new String [] {Nprestamo, Libros,Cliente,Fprestamo,Fdevolucion});
            this.setTitle(titulos.getString("ListarP"));
        btListar.setText(mensajes.getString("listarBiblioteca"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTable tbPrestamo;
    // End of variables declaration//GEN-END:variables
}
