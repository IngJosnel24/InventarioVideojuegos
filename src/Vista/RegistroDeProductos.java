
package Vista;

import Controlador.Conexion.CRUDProducto;
import POJOS.POJOProducto;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

/**
 *
 * @author Oneyker21
 */
public class RegistroDeProductos extends javax.swing.JFrame {

    int datoSeleccionado = -1;

    public RegistroDeProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar();
        
    }

    public void guardarProducto() {
        CRUDProducto cc = new CRUDProducto();
        POJOProducto ct = new POJOProducto(jTextFieldNombre.getText(),
                jTextFielDescripcion.getText(),
                jTextFieldCantidad.getText(),
                jTextFieldPrecio.getText(),
                comboCategoria.getSelectedItem().toString());

        cc.Guardar(ct);

    }

    public void limpiar() {
        jTextFieldNombre.setText("");
        jTextFielDescripcion.setText("");
        jTextFieldCantidad.setText("");
        jTextFieldPrecio.setText("");
        comboCategoria.setSelectedItem("");

    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDProducto cli = new CRUDProducto();
            modelo = cli.mostrarDatosProducto();
            jTableProducto.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void editarProducto() {

        CRUDProducto cc = new CRUDProducto();

        POJOProducto cl = new POJOProducto(
                Integer.parseInt(jTextFieldIDProducto.getText()),
                jTextFieldNombre.getText(),
                jTextFielDescripcion.getText(),
                jTextFieldCantidad.getText(),
                jTextFieldPrecio.getText(), (String) 
                comboCategoria.getSelectedItem().toString());
                
                
        
                
        

        cc.ActualizarDatosProducto(cl);

    }
    
    
    
    public void Combo() {
    String categoriaSeleccionada = comboCategoria.getSelectedItem().toString();
    
    if (categoriaSeleccionada.equals("Comestible")) {
        RegistroDeVentas vh = new RegistroDeVentas();
        vh.setVisible(true);
    }else if(categoriaSeleccionada.equals("Electronico")){
        RegistroDeVentas vh = new RegistroDeVentas();
        vh.setVisible(true); 
    }else if(categoriaSeleccionada.equals("Videojuego")){
        RegistroDeVentas vh = new RegistroDeVentas();
        vh.setVisible(true); 
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFielDescripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        botonmostrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldIDProducto = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        jButton6.setText("Cerrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Registrar Producto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(764, 764, 764)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(53, 53, 53))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registrar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Yu Gothic UI Semibold", 1, 36))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("Registrar Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 20));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 487, -1));

        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 487, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 70, 20));

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 487, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 50, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setText("Descripcion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, 20));

        jTextFielDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFielDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 487, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setText("Categoria");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 70, 20));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 82, 31));

        botonmostrar.setText("Mostrar");
        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, 20));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Produto", "Producto", "Cantidad", "Precio", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProducto);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 740, 220));

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 550, 40));

        jButtonBuscar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar2.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, 40));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 82, 31));

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 82, 31));

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 120, 31));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jTextFieldIDProducto.setText("jTextField1");
        jPanel1.add(jTextFieldIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Electronico", "Videojuego" }));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 310, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        Cerrar.setBackground(new java.awt.Color(204, 255, 255));
        Cerrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 0, 0));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close.png"))); // NOI18N
        Cerrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFielDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielDescripcionActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        CRUDProducto cl = new CRUDProducto();
        try {
            if ((jTextFieldNombre.getText().equals(""))
                    || (jTextFielDescripcion.getText().equals(""))
                    || (jTextFieldCantidad.getText().equals(""))
                    || (jTextFieldPrecio.getText().equals(""))
                    || (comboCategoria.getSelectedItem().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");
            } else {
                guardarProducto();
                limpiar();
                RegistroDeProductos.botonmostrar.doClick();
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductoMouseClicked
        datoSeleccionado = jTableProducto.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableProductoMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            DefaultTableModel modelo;
            CRUDProducto cli = new CRUDProducto();
            modelo = cli.buscarDatosProducto(jTextFieldBuscar.getText());
            if (jTextFieldBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                mostrar();
            } else {
                jTableProducto.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (datoSeleccionado >= 0) {
            int dato = Integer.valueOf(jTableProducto.getValueAt(datoSeleccionado, 0).toString());
            CRUDProducto cli = new CRUDProducto();
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminará el registro, ¿desea continuar?",
                    "Eliminar Registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {

                cli.EliminarProducto(dato);
                mostrar();
                JOptionPane.showMessageDialog(null,
                        "Dato eliminado correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (datoSeleccionado >= 0) {
            RegistroDeProductos.jTextFieldIDProducto.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 0)));
            RegistroDeProductos.jTextFieldNombre.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 1)));
            RegistroDeProductos.jTextFielDescripcion.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 2)));
            RegistroDeProductos.jTextFieldCantidad.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 3)));
            RegistroDeProductos.jTextFieldPrecio.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 4)));
            int Idcategoria = Integer.parseInt((String)this.jTableProducto.getValueAt(datoSeleccionado, 5));
            
            comboCategoria.setSelectedItem(""+ Idcategoria);

            RegistroDeProductos.jButtonGuardar.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            if (jTextFieldIDProducto.getText().isEmpty()
                    || jTextFieldNombre.getText().isEmpty()
                    || jTextFielDescripcion.getText().isEmpty()
                    || jTextFieldCantidad.getText().isEmpty()
                    || jTextFieldPrecio.getText().isEmpty()
                    || comboCategoria.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacíos");
            } else {
                editarProducto();
                limpiar();
                RegistroDeProductos.jButtonGuardar.setVisible(true);
                RegistroDeProductos.botonmostrar.doClick();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Combo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        try {
            Menuprincipal panel2 = new Menuprincipal()
            ;
            panel2.setVisible(true);
            setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar el panel: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CerrarActionPerformed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    public static javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableProducto;
    public static javax.swing.JTextField jTextFielDescripcion;
    private javax.swing.JTextField jTextFieldBuscar;
    public static javax.swing.JTextField jTextFieldCantidad;
    public static javax.swing.JTextField jTextFieldIDProducto;
    public static javax.swing.JTextField jTextFieldNombre;
    public static javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
