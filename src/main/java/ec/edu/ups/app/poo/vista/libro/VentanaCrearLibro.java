/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.app.poo.vista.libro;

import ec.edu.ups.app.poo.DAO.BibliotecaDAO;
import ec.edu.ups.app.poo.IDAO.BibliotecaIDAO;
import ec.edu.ups.app.poo.controlador.BibliotecaControlador;
import ec.edu.ups.app.poo.controlador.LibroControlador;
import ec.edu.ups.app.poo.modelo.Biblioteca;
import ec.edu.ups.app.poo.modelo.Libro;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class VentanaCrearLibro extends javax.swing.JInternalFrame {
    
     private LibroControlador libroControlador;
     private BibliotecaControlador bibliotecaControlador;
     private BibliotecaIDAO bibliotecaDAO;
    /**
     * Creates new form VentanaCrearLibro
     */
    public VentanaCrearLibro(LibroControlador libroControlador, BibliotecaControlador bibliotecaControlador,BibliotecaIDAO bibliotecaDAO ) {
        initComponents();
        this.libroControlador = libroControlador;
        this.bibliotecaControlador = bibliotecaControlador;
        this.bibliotecaDAO = bibliotecaDAO;
        agregarAlCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTituloLibro = new javax.swing.JLabel();
        lbAutorLibro = new javax.swing.JLabel();
        lbAñoLibro = new javax.swing.JLabel();
        txtLibroTitulo = new javax.swing.JTextField();
        txtLibroAutor = new javax.swing.JTextField();
        txtLibroAño = new javax.swing.JTextField();
        txtGuardarLibro = new javax.swing.JButton();
        generoLibro = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        bibliotecaBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Libro"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(195, 172, 133));
        jPanel1.setToolTipText("");

        lbTituloLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTituloLibro.setText("Titulo");

        lbAutorLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAutorLibro.setText("Autor");

        lbAñoLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAñoLibro.setText("Año");

        txtLibroTitulo.setBackground(new java.awt.Color(143, 119, 65));
        txtLibroTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroTituloActionPerformed(evt);
            }
        });

        txtLibroAutor.setBackground(new java.awt.Color(143, 119, 65));

        txtLibroAño.setBackground(new java.awt.Color(143, 119, 65));
        txtLibroAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroAñoActionPerformed(evt);
            }
        });

        txtGuardarLibro.setText("Guardar");
        txtGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarLibroActionPerformed(evt);
            }
        });

        generoLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generoLibro.setText("Género");

        jComboBoxGenero.setBackground(new java.awt.Color(143, 119, 65));
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Romance", "Ficción", "Misterio", "Terror" }));
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });

        bibliotecaBox.setBackground(new java.awt.Color(143, 119, 65));
        bibliotecaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Bibliotecas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTituloLibro)
                                .addComponent(lbAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbAñoLibro)
                                .addComponent(generoLibro))
                            .addGap(71, 71, 71)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGuardarLibro)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLibroTitulo)
                                    .addComponent(txtLibroAutor)
                                    .addComponent(txtLibroAño)
                                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(48, 48, 48)
                            .addComponent(bibliotecaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTituloLibro)
                            .addComponent(txtLibroTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bibliotecaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbAutorLibro))
                    .addComponent(txtLibroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAñoLibro)
                    .addComponent(txtLibroAño, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generoLibro)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(txtGuardarLibro)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLibroTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibroTituloActionPerformed

    private void txtGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarLibroActionPerformed
        // TODO add your handling code here:
        String titulo = txtLibroTitulo.getText();
        String autor = txtLibroAutor.getText();
        int año = Integer.parseInt(txtLibroAño.getText());
        String genero = (String) jComboBoxGenero.getSelectedItem();
       
         // Código para recuperar información y crear el libro
         if(libroControlador.read(titulo)== null){
            libroControlador.create(titulo, autor, año, genero, "SI");
            Libro libro = libroControlador.read(titulo);
            Biblioteca biblioteca = bibliotecaControlador.read(String.valueOf(bibliotecaBox.getSelectedItem()));
            biblioteca.agregarLibros(libro);
            JOptionPane.showMessageDialog(this, "Se ha creado exitosamente");
            agregarAlCombo();
            // Limpiar campos de texto
            
         }else{
             JOptionPane.showMessageDialog(this, "El libro ya existe!");
         }
        txtLibroTitulo.setText("");
        txtLibroAutor.setText("");
        txtLibroAño.setText("");
       
       
    }//GEN-LAST:event_txtGuardarLibroActionPerformed

    private void txtLibroAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibroAñoActionPerformed

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGeneroActionPerformed

    private void bibliotecaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaBoxActionPerformed
        // TODO add your handling code here:
   
    
    }
    public void agregarAlCombo(){
    bibliotecaBox.removeAllItems();
    //bibliotecaDAO = new BibliotecaDAO();
    //bibliotecaControlador = new BibliotecaControlador(bibliotecaDAO);
    List<Biblioteca> bibliotecas = bibliotecaControlador.list();
    for (Biblioteca biblioteca : bibliotecas) {
        bibliotecaBox.addItem(biblioteca.getNombre());
    }
    
          
    }//GEN-LAST:event_bibliotecaBoxActionPerformed

    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        ResourceBundle titulos = ResourceBundle.getBundle("titulos.titulos", locale); 
            this.setTitle(titulos.getString("CrearL"));
        lbTituloLibro.setText(mensajes.getString("tituloLibro"));
        lbAutorLibro.setText(mensajes.getString("autorLibro"));
        lbAñoLibro.setText(mensajes.getString("anoLibro"));
        generoLibro.setText(mensajes.getString("Genero"));
        txtGuardarLibro.setText(mensajes.getString("crearBibliotecaMenu"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bibliotecaBox;
    private javax.swing.JLabel generoLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAutorLibro;
    private javax.swing.JLabel lbAñoLibro;
    private javax.swing.JLabel lbTituloLibro;
    private javax.swing.JButton txtGuardarLibro;
    private javax.swing.JTextField txtLibroAutor;
    private javax.swing.JTextField txtLibroAño;
    private javax.swing.JTextField txtLibroTitulo;
    // End of variables declaration//GEN-END:variables
}