/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.poo.guiapp.vista.biblioteca;

import ec.edu.ups.poo.guiapp.controlador.BibliotecaControlador;
import ec.edu.ups.poo.guiapp.controlador.LibroControlador;
import ec.edu.ups.poo.guiapp.controlador.PrestamoControlador;
import ec.edu.ups.poo.guiapp.controlador.UsuarioControlador;
import ec.edu.ups.poo.guiapp.modelo.Libro;
import ec.edu.ups.poo.guiapp.modelo.Prestamo;
import ec.edu.ups.poo.guiapp.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author kelly
 */
public class VentanaCrearBiblioteca extends javax.swing.JInternalFrame {
    private BibliotecaControlador bibliotecaControlador;
    private LibroControlador libroControlador;
    private UsuarioControlador usuarioControlador;
    private PrestamoControlador prestamoControlador;
    private DefaultListModel listModelLibro;
    private DefaultListModel listModelUsuario;
    private DefaultListModel listModelPrestamo;
    private TitledBorder TBIngresar;
    private Locale idiomaSeleccionado = Locale.getDefault();
    
    /**
     * Creates new form VentanaCrear
     */
    public VentanaCrearBiblioteca(BibliotecaControlador bibliotecaControlador, LibroControlador libroControlador, UsuarioControlador usuarioControlador, PrestamoControlador prestamoControlador ) {
        initComponents();
        this.bibliotecaControlador = bibliotecaControlador;
        this.libroControlador = libroControlador;
        this.usuarioControlador = usuarioControlador;
        this.prestamoControlador = prestamoControlador;
        listModelLibro = new DefaultListModel();
        lstLibros.setModel(listModelLibro);
        listModelUsuario = new DefaultListModel();
        lstUsuarios.setModel(listModelUsuario);
        listModelPrestamo = new DefaultListModel();
        lstPrestamos.setModel(listModelPrestamo);
        TBIngresar = BorderFactory.createTitledBorder("Ingresar Datos");
        this.setBorder(TBIngresar);
    }
    public void cambiarIdioma(Locale locale){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        idiomaSeleccionado = locale;
       
       TBIngresar.setTitle(mensajes.getString("TBIngresar"));
       this.setTitle(mensajes.getString("window.title"));
       lblNombre.setText(mensajes.getString("lblNombre"));
       lblCode.setText(mensajes.getString("lblCode"));
       lblDireccion.setText(mensajes.getString("lblDireccion"));
       lblTelef.setText(mensajes.getString("lblTelef"));
       lblLibros.setText(mensajes.getString("lblLibros"));
       lblUsuarios.setText(mensajes.getString("lblUsuarios"));
       lblPrestamos.setText(mensajes.getString("lblPrestamos"));
       btnMostrarPrestamos.setText(mensajes.getString("btnMostrarPrestamos"));
       btnMostrarLibros.setText(mensajes.getString("btnMostrarLibros"));
       btnMostrarUsuarios.setText(mensajes.getString("btnMostrarUsuarios"));
       btnGuardar.setText(mensajes.getString("btnGuardar"));
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
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelef = new javax.swing.JLabel();
        txtTelef = new javax.swing.JTextField();
        lblLibros = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstLibros = new javax.swing.JList<>();
        btnMostrarLibros = new javax.swing.JButton();
        lblUsuarios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();
        btnMostrarUsuarios = new javax.swing.JButton();
        lblPrestamos = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPrestamos = new javax.swing.JList<>();
        btnGuardar = new javax.swing.JButton();
        btnMostrarPrestamos = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Biblioteca"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        lblCode.setText("Código");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblDireccion.setText("Dirección");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        lblTelef.setText("Teléfono");

        txtTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefActionPerformed(evt);
            }
        });

        lblLibros.setText("Libros");

        jScrollPane3.setViewportView(lstLibros);

        btnMostrarLibros.setText("Mostrar");
        btnMostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosActionPerformed(evt);
            }
        });

        lblUsuarios.setText("Usuarios");

        jScrollPane2.setViewportView(lstUsuarios);

        btnMostrarUsuarios.setText("Mostrar");
        btnMostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuariosActionPerformed(evt);
            }
        });

        lblPrestamos.setText("Prestamos");

        jScrollPane4.setViewportView(lstPrestamos);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostrarPrestamos.setText("Mostrar");
        btnMostrarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPrestamosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCode)
                                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDireccion))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblTelef))))
                                .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnGuardar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLibros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarLibros))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMostrarUsuarios))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrestamos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarPrestamos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarLibros, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLibros, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuarios)
                            .addComponent(btnMostrarUsuarios))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnGuardar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrestamos)
                            .addComponent(btnMostrarPrestamos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefActionPerformed

    private void btnMostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuariosActionPerformed
        List<Usuario> usuarios = usuarioControlador.listarUsuario();
        DefaultListModel modelo = (DefaultListModel) lstUsuarios.getModel();
        modelo.clear();
        for (Usuario usuario : usuarios) {
            modelo.addElement(usuario.getNombre());
        }
    }//GEN-LAST:event_btnMostrarUsuariosActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnMostrarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPrestamosActionPerformed
        List<Prestamo> prestamos = prestamoControlador.listarPrestamos();
        DefaultListModel modelo = (DefaultListModel) lstPrestamos.getModel();
        modelo.clear();
        for (Prestamo prestamo : prestamos) {
            modelo.addElement(prestamo.getId());
        }
    }//GEN-LAST:event_btnMostrarPrestamosActionPerformed

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
        List<Libro> libros = libroControlador.listarLibro();
        DefaultListModel modelo = (DefaultListModel) lstLibros.getModel();
        modelo.clear();
        for (Libro libro : libros) {
            modelo.addElement(libro.getTitulo());
        }
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int codigo = Integer.parseInt(txtCode.getText());
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelef.getText();

        List<String> librosSeleccionadosComoString = lstLibros.getSelectedValuesList();
        List<String> usuariosSeleccionadosComoString = lstUsuarios.getSelectedValuesList();
        List<String> prestamosSeleccionadosComoString = lstPrestamos.getSelectedValuesList();

        List<Libro> librosSeleccionados = new ArrayList<>();
            for (String libroString : librosSeleccionadosComoString) {
                Libro libro = libroControlador.buscarLibroPorTitulo(libroString);
                if (libro != null) {
                    librosSeleccionados.add(libro);
                }
            }
            
        List<Usuario> usuariosSeleccionados = new ArrayList<>();
            for (String usuarioString : usuariosSeleccionadosComoString) {
                Usuario usuario = usuarioControlador.buscarUsuarioPorNombre(usuarioString);
                if (usuario != null) {
                    usuariosSeleccionados.add(usuario);
                }
            }

        List<Prestamo> prestamosSeleccionados = new ArrayList<>();
            for (String prestamoString : prestamosSeleccionadosComoString) {
                Prestamo prestamo = prestamoControlador.buscarPrestamoPorId(prestamoString);
                if (prestamo != null) {
                    prestamosSeleccionados.add(prestamo);
                }
            }

            bibliotecaControlador.crearBiblioteca(
                codigo,
                nombre,
                direccion,
                telefono,
                librosSeleccionados,
                prestamosSeleccionados,
                usuariosSeleccionados
            );
            
            String mensajeBiblioteca = ResourceBundle.getBundle("mensajes.mensajes", idiomaSeleccionado).getString("mensajeExitoBiblioteca");
            JOptionPane.showMessageDialog(this, mensajeBiblioteca);

            txtCode.setText("");
            txtNombre.setText("");
            txtDireccion.setText("");
            txtTelef.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JButton btnMostrarPrestamos;
    private javax.swing.JButton btnMostrarUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrestamos;
    private javax.swing.JLabel lblTelef;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JList<String> lstLibros;
    private javax.swing.JList<String> lstPrestamos;
    private javax.swing.JList<String> lstUsuarios;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables
}
