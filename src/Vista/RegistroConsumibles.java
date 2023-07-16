package Vista;

import Conexion.Conexion;
import Controlador.Conexion.CRUDConsumible;
import POJOS.POJOConsumible;
import java.awt.HeadlessException;
import java.io.File;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JDialog;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oneyker21
 */
public class RegistroConsumibles extends javax.swing.JFrame {

    int datoSeleccionado = -1;

    public RegistroConsumibles() {
        initComponents();

//        mostrar();
        JugarConCamposDeTexto();
        mostrar();
    }

    public void guardarConsumible() {
        String strFecha = txtFechaVencimiento.getText();
        java.sql.Date fecha = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(strFecha);
            fecha = new java.sql.Date(utilFecha.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        CRUDConsumible cc = new CRUDConsumible();
        POJOConsumible cl = new POJOConsumible(
                fecha,
                jTextFieldNombre.getText(),
                new BigDecimal(jTextFieldPrecioCompra.getText()),
                jTextArea1.getText(),
                new BigDecimal(jTextFieldPrecioVenta.getText()),
                (int) jSpinner1.getValue(),
                comboCategoria.getSelectedItem().toString());

        cc.Guardar(cl);
    }

    public void editarConsumible() {

        String strFecha = txtFechaVencimiento.getText();
        java.sql.Date fecha = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(strFecha);
            fecha = new java.sql.Date(utilFecha.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        CRUDConsumible cc = new CRUDConsumible();

        POJOConsumible cl = new POJOConsumible(Integer.parseInt(jTextFieldIDConsumible1.getText()),
                fecha,
                Integer.parseInt(jTextFieldIDProducto.getText()),
                jTextFieldNombre.getText(),
                new BigDecimal(jTextFieldPrecioCompra.getText()),
                jTextArea1.getText(),
                new BigDecimal(jTextFieldPrecioVenta.getText()),
                (int) jSpinner1.getValue(),
                comboCategoria.getSelectedItem().toString());

        cc.ActualizarDatos(cl);

    }
//

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDConsumible cli = new CRUDConsumible();
            modelo = cli.mostrarDatos();
            jTableProducto.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void JugarConCamposDeTexto() {
        //Metodo para jugar con los campos de texto xD.
        if (comboCategoria.getSelectedItem().toString().equals("Comestible")) {
            //Mostrar campos comestibles

            lbVencimiento.setVisible(true);
            txtFechaVencimiento.setVisible(true);
            jTextFieldIDConsumible1.setVisible(true);
            jLabel3.setVisible(true);
            //Ocultar

            lbMarca.setVisible(false);
            txtMarca.setVisible(false);
            lbPlataforma.setVisible(false);
            txtPlataforma.setVisible(false);

            labelidelectronico.setVisible(false);
            labelidvideojuego1.setVisible(false);
            jTextFieldIDVideoJuego1.setVisible(false);
            jTextFieldIDElectronico.setVisible(false);

        } else if (comboCategoria.getSelectedItem().toString().equals("Electronico")) {

            //Mostrar campos Electronicos
            lbMarca.setVisible(true);
            txtMarca.setVisible(true);
            jTextFieldIDElectronico.setVisible(true);
            labelidelectronico.setVisible(true);
            //Ocultar
            lbVencimiento.setVisible(false);
            txtFechaVencimiento.setVisible(false);
            lbPlataforma.setVisible(false);
            txtPlataforma.setVisible(false);
            jTextFieldIDConsumible1.setVisible(false);
            jTextFieldIDVideoJuego1.setVisible(false);
            labelidvideojuego1.setVisible(false);
            jLabel3.setVisible(false);

        } else if (comboCategoria.getSelectedItem().toString().equals("Videojuego")) {
            //Mostrar campos VideoJuegos
            lbPlataforma.setVisible(true);
            txtPlataforma.setVisible(true);
            jTextFieldIDVideoJuego1.setVisible(true);
            labelidvideojuego1.setVisible(true);
            //Ocultar
            lbVencimiento.setVisible(false);
            txtFechaVencimiento.setVisible(false);
            lbMarca.setVisible(false);
            txtMarca.setVisible(false);
            jLabel3.setVisible(false);
            jTextFieldIDConsumible1.setVisible(false);
            labelidvideojuego1.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelidelectronico = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecioCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        botonmostrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        comboCategoria = new javax.swing.JComboBox<>();
        lbMarca = new javax.swing.JLabel();
        jTextFieldPrecioVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldIDElectronico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        txtMarca = new javax.swing.JTextField();
        txtFechaVencimiento = new javax.swing.JFormattedTextField();
        lbVencimiento = new javax.swing.JLabel();
        txtPlataforma = new javax.swing.JTextField();
        lbPlataforma = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelidvideojuego1 = new javax.swing.JLabel();
        jTextFieldIDConsumible1 = new javax.swing.JTextField();
        jTextFieldIDVideoJuego1 = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldIDProducto = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registro De Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Yu Gothic UI Semibold", 1, 36))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 670));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelidelectronico.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelidelectronico.setText("ID Electronico");
        jPanel2.add(labelidelectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 100, 20));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 60, 20));

        jTextFieldPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioCompraActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setText("Precio Compra");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 100, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setText("Descripcion");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setText("Categoria");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 20));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 82, 31));

        botonmostrar.setText("Mostrar");
        botonmostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonmostrarMouseClicked(evt);
            }
        });
        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });
        jPanel2.add(botonmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, 30));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Produto", "Producto", "Cantidad", "Precio", "Categoria", "Fecha vencimiento", "Plataforma", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class
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

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 880, 270));

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 550, 30));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 82, 31));

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 82, 31));

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 120, 31));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Electronico", "Videojuego" }));
        comboCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboCategoriaMouseClicked(evt);
            }
        });
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        lbMarca.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lbMarca.setText("Marca");
        jPanel2.add(lbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, 20));

        jTextFieldPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 130, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setText("Precio venta");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 90, 20));
        jPanel2.add(jTextFieldIDElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setText("Registrar Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 120, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 240, 80));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 130, -1));

        try {
            txtFechaVencimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 130, -1));

        lbVencimiento.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lbVencimiento.setText("Vencimiento");
        jPanel2.add(lbVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 90, 20));

        txtPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlataformaActionPerformed(evt);
            }
        });
        jPanel2.add(txtPlataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 130, -1));

        lbPlataforma.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lbPlataforma.setText("Plataforma");
        jPanel2.add(lbPlataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 90, 20));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("ID Consumible");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 100, 20));

        labelidvideojuego1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelidvideojuego1.setText("ID VideoJuego");
        jPanel2.add(labelidvideojuego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 100, 20));
        jPanel2.add(jTextFieldIDConsumible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 120, -1));
        jPanel2.add(jTextFieldIDVideoJuego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 120, -1));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, 30));
        jPanel2.add(jTextFieldIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioVentaActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed

        // Obtener la opción seleccionada en el ComboBox
        String opcionSeleccionada = (String) comboCategoria.getSelectedItem();

        // Pasar la opción seleccionada al JTextField
//        jTextFieldCombomostra.setText(opcionSeleccionada);
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        editarConsumible();
        mostrar();

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        if (datoSeleccionado >= 0) {
            RegistroConsumibles.jTextFieldIDProducto.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 0)));
            RegistroConsumibles.jTextFieldIDConsumible1.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 1)));
            RegistroConsumibles.jTextFieldNombre.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 2)));
            RegistroConsumibles.jTextArea1.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 8)));

            RegistroConsumibles.jTextFieldPrecioCompra.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 3)));

            String fechaTabla = String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 5));

            try {
                // Parsear la fecha de entrada en formato "yyyy-MM-dd" a un objeto LocalDate
                LocalDate fechaLocal = LocalDate.parse(fechaTabla, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));

                // Crear un objeto DateTimeFormatter para el formato de salida "dd/MM/yyyy"
                DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                // Formatear la fecha en el formato deseado "dd/mm/yyyy"
                String fechaFormateada = fechaLocal.format(formatoSalida);

                // Establecer el valor formateado en el JTextField
                RegistroConsumibles.txtFechaVencimiento.setText(fechaFormateada);

            } catch (DateTimeParseException e) {
                // Manejar cualquier error de parsing de la fecha
                e.printStackTrace();
            }

            RegistroConsumibles.jTextFieldPrecioVenta.setText(String.valueOf(jTableProducto.getValueAt(datoSeleccionado, 4)));

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        if (datoSeleccionado >= 0) {
            int dato = Integer.valueOf(jTableProducto.getValueAt(datoSeleccionado, 0).toString());
            CRUDConsumible cli = new CRUDConsumible();
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminará el registro, ¿desea continuar?",
                    "Eliminar Registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {

                cli.Eliminar(dato);
                mostrar();

                JOptionPane.showMessageDialog(null,
                        "Dato eliminado correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased

    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jTableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductoMouseClicked

        datoSeleccionado = jTableProducto.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableProductoMouseClicked

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        Producto dialog = new Producto(null, true);
        RegistroConsumibles vv = new RegistroConsumibles();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(vv);
        dialog.setVisible(true);
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void botonmostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmostrarMouseClicked
        // TODO add your handling code here:
        // Generar reporte de los clientes

    }//GEN-LAST:event_botonmostrarMouseClicked

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        CRUDConsumible cl = new CRUDConsumible();
        try {
            if ((jTextFieldNombre.getText().equals(""))
                    || (jTextArea1.getText().equals(""))
                    || (jSpinner1.getValue().equals(0))
                    || (jTextFieldPrecioCompra.getText().equals(""))
                    || (txtFechaVencimiento.getText().equals(""))
                    || (jTextFieldPrecioVenta.getText().equals(""))
                    || (comboCategoria.getSelectedItem().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");

            } else {
                guardarConsumible();

                JOptionPane.showMessageDialog(null, "Datos guardados");

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioCompraActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlataformaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlataformaActionPerformed

    private void comboCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCategoriaMouseClicked
        // TODO add your handling code here:
        JugarConCamposDeTexto();
    }//GEN-LAST:event_comboCategoriaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JugarConCamposDeTexto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            DefaultTableModel modelo;
            CRUDConsumible cli = new CRUDConsumible();
            modelo = cli.buscarDatosConsumible(jTextFieldBuscar.getText());
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

    private final Conexion con = new Conexion();
    private final Connection cn = con.conectar();

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroConsumibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    public static javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableProducto;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldBuscar;
    public static javax.swing.JTextField jTextFieldIDConsumible1;
    public static javax.swing.JTextField jTextFieldIDElectronico;
    private javax.swing.JTextField jTextFieldIDProducto;
    public static javax.swing.JTextField jTextFieldIDVideoJuego1;
    public static javax.swing.JTextField jTextFieldNombre;
    public static javax.swing.JTextField jTextFieldPrecioCompra;
    public static javax.swing.JTextField jTextFieldPrecioVenta;
    private javax.swing.JLabel labelidelectronico;
    private javax.swing.JLabel labelidvideojuego1;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbPlataforma;
    private javax.swing.JLabel lbVencimiento;
    public static javax.swing.JFormattedTextField txtFechaVencimiento;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtPlataforma;
    // End of variables declaration//GEN-END:variables
}
