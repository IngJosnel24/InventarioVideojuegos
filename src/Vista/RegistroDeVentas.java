
package Vista;

import Conexion.Conexion;

import Controlador.Conexion.CRUDConsumible;
import Controlador.Conexion.CRUDElectronico;
import Controlador.Conexion.CRUDVideoJuegos;
import POJOS.POJOConsumible;
import POJOS.POJOElectronico;
import POJOS.POJOVideoJuegos;
import static Vista.RegistroConsumibles.consumibles;
import static Vista.RegistroConsumibles.electronico;
import static Vista.RegistroConsumibles.idproductos;
import static Vista.RegistroConsumibles.jTableProducto;
import static Vista.RegistroConsumibles.jTableVideojuegos;
import static Vista.RegistroConsumibles.jTextArea1;
import static Vista.RegistroConsumibles.jTextFieldIDConsumible1;
import static Vista.RegistroConsumibles.jTextFieldIDElectronico;
import static Vista.RegistroConsumibles.jTextFieldIDVideoJuego1;
import static Vista.RegistroConsumibles.jTextFieldNombre;
import static Vista.RegistroConsumibles.jTextFieldPrecioCompra;
import static Vista.RegistroConsumibles.jTextFieldPrecioVenta;
import static Vista.RegistroConsumibles.tableelectronicos;
import static Vista.RegistroConsumibles.txtFechaVencimiento;
import static Vista.RegistroConsumibles.txtMarca;
import static Vista.RegistroConsumibles.txtPlataforma;
import static Vista.RegistroConsumibles.videojuego;
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
import javax.swing.table.TableColumnModel;

import javax.swing.JOptionPane;

/**
 *
 * @author Oneyker21
 *
 */
public class RegistroDeVentas extends javax.swing.JFrame {
        int datoSeleccionado = -1;

    public RegistroDeVentas() {
        initComponents();
        
//        mostrar();
        JugarConCamposDeTexto();
        mostrarConsumible();

        this.setLocationRelativeTo(null);
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

    public void guardarElectronico() {

        CRUDElectronico cc = new CRUDElectronico();
        POJOElectronico cl = new POJOElectronico(
                txtMarca.getText(),
                jTextFieldNombre.getText(),
                new BigDecimal(jTextFieldPrecioCompra.getText()),
                jTextArea1.getText(),
                new BigDecimal(jTextFieldPrecioVenta.getText()),
                (int) jSpinner1.getValue(),
                comboCategoria.getSelectedItem().toString());

        cc.Guardar(cl);
    }

    public void guardarVideoJuegos() {

        CRUDVideoJuegos cc = new CRUDVideoJuegos();
        POJOVideoJuegos cl = new POJOVideoJuegos(
                txtMarca.getText(),
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
                Integer.parseInt(idproductos.getText()),
                jTextFieldNombre.getText(),
                new BigDecimal(jTextFieldPrecioCompra.getText()),
                jTextArea1.getText(),
                new BigDecimal(jTextFieldPrecioVenta.getText()),
                (int) jSpinner1.getValue(),
                comboCategoria.getSelectedItem().toString());

        cc.ActualizarDatos(cl);

    }

//
    public void mostrarConsumible() {
        try {
            DefaultTableModel modelo;
            CRUDConsumible cli = new CRUDConsumible();
            modelo = cli.mostrarDatos();
            jTableProducto.setModel(modelo);
            ocultartablaConsumibles();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void mostrarElectronico() {
        try {
            DefaultTableModel modelo;
            CRUDElectronico cli = new CRUDElectronico();
            modelo = cli.mostrarDatos2();
            tableelectronicos.setModel(modelo);
            ocultartablaElectronicos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void mostrarVideojuego() {
        try {
            DefaultTableModel modelo;
            CRUDVideoJuegos cli = new CRUDVideoJuegos();
            modelo = cli.mostrarDatos();
            jTableVideojuegos.setModel(modelo);
            ocultartablaVideoJuegos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ocultartablaConsumibles() {
        int columnIndex = 0; // Aquí pones el índice de la columna que deseas ocultar
        int columnIdex1 = 1;

        TableColumnModel columnModel = jTableProducto.getColumnModel();
        columnModel.getColumn(columnIndex).setWidth(0);
        columnModel.getColumn(columnIndex).setMinWidth(0);
        columnModel.getColumn(columnIndex).setMaxWidth(0);
        columnModel.getColumn(columnIndex).setPreferredWidth(0);
        columnModel.getColumn(columnIdex1).setWidth(0);
        columnModel.getColumn(columnIdex1).setMinWidth(0);
        columnModel.getColumn(columnIdex1).setMaxWidth(0);
        columnModel.getColumn(columnIdex1).setPreferredWidth(0);

    }

    public void ocultartablaElectronicos() {
        int columnIndex = 0; // Aquí pones el índice de la columna que deseas ocultar
        int columnIdex1 = 1;

        TableColumnModel columnModel = tableelectronicos.getColumnModel();
        columnModel.getColumn(columnIndex).setWidth(0);
        columnModel.getColumn(columnIndex).setMinWidth(0);
        columnModel.getColumn(columnIndex).setMaxWidth(0);
        columnModel.getColumn(columnIndex).setPreferredWidth(0);
        columnModel.getColumn(columnIdex1).setWidth(0);
        columnModel.getColumn(columnIdex1).setMinWidth(0);
        columnModel.getColumn(columnIdex1).setMaxWidth(0);
        columnModel.getColumn(columnIdex1).setPreferredWidth(0);

    }

    public void ocultartablaVideoJuegos() {
        int columnIndex = 0; // Aquí pones el índice de la columna que deseas ocultar
        int columnIdex1 = 1;

        TableColumnModel columnModel = jTableVideojuegos.getColumnModel();
        columnModel.getColumn(columnIndex).setWidth(0);
        columnModel.getColumn(columnIndex).setMinWidth(0);
        columnModel.getColumn(columnIndex).setMaxWidth(0);
        columnModel.getColumn(columnIndex).setPreferredWidth(0);
        columnModel.getColumn(columnIdex1).setWidth(0);
        columnModel.getColumn(columnIdex1).setMinWidth(0);
        columnModel.getColumn(columnIdex1).setMaxWidth(0);
        columnModel.getColumn(columnIdex1).setPreferredWidth(0);

    }

    public void JugarConCamposDeTexto() {
        //Metodo para jugar con los campos de texto xD.
        if (comboCategoria.getSelectedItem().toString().equals("Comestible")) {
            //Mostrar campos comestibles

            lbVencimiento.setVisible(true);
            txtFechaVencimiento.setVisible(true);
            jTextFieldIDConsumible1.setVisible(true);
            jLabel3.setVisible(true);
            consumibles.setVisible(true);
            TablaConsumibles.setVisible(true);
            tablaElectronico.setVisible(false);
            mostrarConsumible();
            
            //Ocultar

            lbMarca.setVisible(false);
            txtMarca.setVisible(false);
            lbPlataforma.setVisible(false);
            txtPlataforma.setVisible(false);
            electronico.setVisible(false);
            videojuego.setVisible(false);
            labelidelectronico.setVisible(false);
            labelidvideojuego1.setVisible(false);
            jTextFieldIDVideoJuego1.setVisible(false);
            jTextFieldIDElectronico.setVisible(false);
            tablavideojuegos.setVisible(false);
            tablaElectronico.setVisible(true);
            

        } else if (comboCategoria.getSelectedItem().toString().equals("Electronico")) {

            //Mostrar campos Electronicos
            electronico.setVisible(true);
            lbMarca.setVisible(true);
            txtMarca.setVisible(true);
            jTextFieldIDElectronico.setVisible(true);
            labelidelectronico.setVisible(true);
            tableelectronicos.setVisible(true);
            jTextFieldIDElectronico.setVisible(true);
            
            //Ocultar
            
            consumibles.setVisible(false);
            videojuego.setVisible(false);
            lbVencimiento.setVisible(false);
            txtFechaVencimiento.setVisible(false);
            lbPlataforma.setVisible(false);
            txtPlataforma.setVisible(false);
            jTextFieldIDConsumible1.setVisible(false);
            jTextFieldIDVideoJuego1.setVisible(false);
            labelidvideojuego1.setVisible(false);
            jLabel3.setVisible(false);
            mostrarElectronico();
            TablaConsumibles.setVisible(false);
            tablavideojuegos.setVisible(false);
            tablaElectronico.setVisible(true);

        } else if (comboCategoria.getSelectedItem().toString().equals("Videojuego")) {
            //Mostrar campos VideoJuegos
            videojuego.setVisible(true);
            labelidvideojuego1.setVisible(true);
            lbPlataforma.setVisible(true);
            txtPlataforma.setVisible(true);
            jTextFieldIDVideoJuego1.setVisible(true);
            labelidvideojuego1.setVisible(true);
            tablavideojuegos.setVisible(true);
            EditarVideojuego.setVisible(true);
            mostrarVideojuego();

            //Ocultar
            
            consumibles.setVisible(false);
            electronico.setVisible(false);
            lbVencimiento.setVisible(false);
            txtFechaVencimiento.setVisible(false);
            lbMarca.setVisible(false);
            txtMarca.setVisible(false);
            jLabel3.setVisible(false);
            jTextFieldIDConsumible1.setVisible(false);
            TablaConsumibles.setVisible(false);
            tablaElectronico.setVisible(false);
            tableelectronicos.setVisible(false);
            jTextFieldIDConsumible1.setVisible(false);
            jLabel3.setVisible(false);
            labelidelectronico.setVisible(false);
            EditarConsumible.setVisible(false);
            EditarElectronico.setVisible(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelidelectronico = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecioCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        consumibles = new javax.swing.JButton();
        botonmostrar = new javax.swing.JButton();
        TablaConsumibles = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        EditarConsumible = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        comboCategoria = new javax.swing.JComboBox<>();
        lbMarca = new javax.swing.JLabel();
        jTextFieldPrecioVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldIDElectronico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
        idproductos = new javax.swing.JTextField();
        tablaElectronico = new javax.swing.JScrollPane();
        tableelectronicos = new javax.swing.JTable();
        electronico = new javax.swing.JButton();
        videojuego = new javax.swing.JButton();
        tablavideojuegos = new javax.swing.JScrollPane();
        jTableVideojuegos = new javax.swing.JTable();
        EditarElectronico = new javax.swing.JButton();
        EditarVideojuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registro De Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Yu Gothic UI Semibold", 1, 36))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 670));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelidelectronico.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelidelectronico.setText("ID Electronico");
        jPanel2.add(labelidelectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, 20));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 60, 20));

        jTextFieldPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioCompraActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setText("Precio Compra");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 100, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setText("Categoria");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 20));

        consumibles.setText("Guardar");
        consumibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumiblesActionPerformed(evt);
            }
        });
        jPanel2.add(consumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 82, 31));

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
        TablaConsumibles.setViewportView(jTableProducto);

        jPanel2.add(TablaConsumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 880, 340));

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

        EditarConsumible.setText("Editar");
        EditarConsumible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarConsumibleActionPerformed(evt);
            }
        });
        jPanel2.add(EditarConsumible, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 82, 31));

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
        jPanel2.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 130, -1));

        lbMarca.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lbMarca.setText("Marca");
        jPanel2.add(lbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 20));

        jTextFieldPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 130, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setText("Precio venta");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 90, 20));
        jPanel2.add(jTextFieldIDElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setText("Registrar Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, 20));

        jSpinner1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 120, -1));

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, -1));

        try {
            txtFechaVencimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, -1));

        lbVencimiento.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lbVencimiento.setText("Vencimiento");
        jPanel2.add(lbVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, 20));

        txtPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlataformaActionPerformed(evt);
            }
        });
        jPanel2.add(txtPlataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, -1));

        lbPlataforma.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lbPlataforma.setText("Plataforma");
        jPanel2.add(lbPlataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 90, 20));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("ID Consumible");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, 20));

        labelidvideojuego1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelidvideojuego1.setText("ID VideoJuego");
        jPanel2.add(labelidvideojuego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, 20));
        jPanel2.add(jTextFieldIDConsumible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, -1));
        jPanel2.add(jTextFieldIDVideoJuego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, -1));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, 30));
        jPanel2.add(idproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 120, -1));

        tableelectronicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Producto ", "ID Electronico", "Title 3", "Title 4"
            }
        ));
        tableelectronicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableelectronicosMouseClicked(evt);
            }
        });
        tablaElectronico.setViewportView(tableelectronicos);

<<<<<<< HEAD
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jButton3)
                                .addGap(52, 52, 52)
                                .addComponent(jButton4)
                                .addGap(40, 40, 40)
                                .addComponent(jButton5)
                                .addGap(55, 55, 55)
                                .addComponent(jButton6)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton5)
                        .addComponent(jButton4))
                    .addComponent(jButton6))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
=======
        jPanel2.add(tablaElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 880, -1));

        electronico.setText("Guardar");
        electronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electronicoActionPerformed(evt);
            }
        });
        jPanel2.add(electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 82, 31));

        videojuego.setText("Guardar");
        videojuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videojuegoActionPerformed(evt);
            }
        });
        jPanel2.add(videojuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 82, 31));

        jTableVideojuegos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableVideojuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVideojuegosMouseClicked(evt);
            }
        });
        tablavideojuegos.setViewportView(jTableVideojuegos);

        jPanel2.add(tablavideojuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 880, -1));

        EditarElectronico.setText("Editar");
        EditarElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarElectronicoActionPerformed(evt);
            }
        });
        jPanel2.add(EditarElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 82, 31));

        EditarVideojuego.setText("Editar");
        EditarVideojuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarVideojuegoActionPerformed(evt);
            }
        });
        jPanel2.add(EditarVideojuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 82, 31));
>>>>>>> a1a672a2c7c91ce2682f91e4359c1adacf0e164a

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioCompraActionPerformed

    private void consumiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consumiblesActionPerformed

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
                mostrarConsumible();
                ocultartablaConsumibles();

                JOptionPane.showMessageDialog(null, "Datos guardados");

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_consumiblesActionPerformed

    private void botonmostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmostrarMouseClicked
        // TODO add your handling code here:
        // Generar reporte de los clientes
    }//GEN-LAST:event_botonmostrarMouseClicked

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        Producto dialog = new Producto(null, true);
        RegistroConsumibles vv = new RegistroConsumibles();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(vv);
        dialog.setVisible(true);
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void jTableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductoMouseClicked

        datoSeleccionado = jTableProducto.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableProductoMouseClicked

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased

    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

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
            mostrarConsumible();

            JOptionPane.showMessageDialog(null,
                "Dato eliminado correctamente");
        }
        } else {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void EditarConsumibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarConsumibleActionPerformed
        int fila = this.tableelectronicos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla.");
        } else {
            try {
                int IDProducto = Integer.parseInt((String) this.tableelectronicos.getValueAt(fila, 0));
                int IDElectronico = Integer.parseInt((String) this.tableelectronicos.getValueAt(fila, 1));
                String nombreP = (String) this.tableelectronicos.getValueAt(fila, 2).toString();
                BigDecimal Ccompra = BigDecimal.valueOf(Double.parseDouble((String) this.tableelectronicos.getValueAt(fila, 3).toString()));
                BigDecimal Cventa = BigDecimal.valueOf(Double.parseDouble((String) this.tableelectronicos.getValueAt(fila, 4).toString()));
                String descripcion = (String) this.tableelectronicos.getValueAt(fila, 5).toString();
                String marca = (String) this.tableelectronicos.getValueAt(fila, 6).toString();

                idproductos.setText("" + IDProducto);
                jTextFieldIDElectronico.setText(""+IDElectronico);
                jTextFieldNombre.setText(nombreP);
                jTextFieldPrecioCompra.setText("" + Ccompra);
                jTextFieldPrecioVenta.setText("" + Cventa);
                jTextArea1.setText("" + descripcion);
                txtMarca.setText(""+marca);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_EditarConsumibleActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        editarConsumible();
        mostrarConsumible();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void comboCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCategoriaMouseClicked
        // TODO add your handling code here:
        JugarConCamposDeTexto();
    }//GEN-LAST:event_comboCategoriaMouseClicked

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed

        // Obtener la opción seleccionada en el ComboBox
        String opcionSeleccionada = (String) comboCategoria.getSelectedItem();

        // Pasar la opción seleccionada al JTextField
        //        jTextFieldCombomostra.setText(opcionSeleccionada);
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void jTextFieldPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioVentaActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlataformaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlataformaActionPerformed

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
                mostrarConsumible();
            } else {
                jTableProducto.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void tableelectronicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableelectronicosMouseClicked
        datoSeleccionado = tableelectronicos.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tableelectronicosMouseClicked

    private void electronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electronicoActionPerformed
        CRUDElectronico cl = new CRUDElectronico();
        try {
            if ((jTextFieldNombre.getText().equals(""))
                || (jTextFieldPrecioCompra.getText().equals(""))
                || (txtFechaVencimiento.getText().equals(""))
                || (jTextFieldPrecioVenta.getText().equals(""))
                || (comboCategoria.getSelectedItem().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");

            } else {
                guardarElectronico();
                mostrarElectronico();
                ocultartablaElectronicos();

                JOptionPane.showMessageDialog(null, "Datos guardados");

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_electronicoActionPerformed

    private void videojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videojuegoActionPerformed
        CRUDVideoJuegos cl = new CRUDVideoJuegos();
        try {
            if ((jTextFieldNombre.getText().equals(""))
                || (jTextFieldPrecioCompra.getText().equals(""))
                || (txtFechaVencimiento.getText().equals(""))
                || (jTextFieldPrecioVenta.getText().equals(""))
                || (comboCategoria.getSelectedItem().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");

            } else {
                guardarVideoJuegos();
                mostrarVideojuego();
                ocultartablaVideoJuegos();

                JOptionPane.showMessageDialog(null, "Datos guardados");

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_videojuegoActionPerformed

    private void jTableVideojuegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVideojuegosMouseClicked
        datoSeleccionado = jTableVideojuegos.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableVideojuegosMouseClicked

    private void EditarElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarElectronicoActionPerformed
        int fila = this.tableelectronicos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla.");
        } else {
            try {
                int IDProducto = Integer.parseInt((String) this.tableelectronicos.getValueAt(fila, 0));
                int IDElectronico = Integer.parseInt((String) this.tableelectronicos.getValueAt(fila, 1));
                String nombreP = (String) this.tableelectronicos.getValueAt(fila, 2).toString();
                BigDecimal Ccompra = BigDecimal.valueOf(Double.parseDouble((String) this.tableelectronicos.getValueAt(fila, 3).toString()));
                BigDecimal Cventa = BigDecimal.valueOf(Double.parseDouble((String) this.tableelectronicos.getValueAt(fila, 4).toString()));
                String descripcion = (String) this.tableelectronicos.getValueAt(fila, 5).toString();
                String marca = (String) this.tableelectronicos.getValueAt(fila, 6).toString();

                idproductos.setText("" + IDProducto);
                jTextFieldIDElectronico.setText(""+IDElectronico);
                jTextFieldNombre.setText(nombreP);
                jTextFieldPrecioCompra.setText("" + Ccompra);
                jTextFieldPrecioVenta.setText("" + Cventa);
                jTextArea1.setText("" + descripcion);
                txtMarca.setText(""+marca);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditarElectronicoActionPerformed

    private void EditarVideojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarVideojuegoActionPerformed
        int fila = this.jTableVideojuegos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla.");
        } else {
            try {
                int IDProducto = Integer.parseInt((String) this.jTableVideojuegos.getValueAt(fila, 0));
                int IDVideojuego = Integer.parseInt((String) this.jTableVideojuegos.getValueAt(fila, 1));
                String nombreP = (String) this.jTableVideojuegos.getValueAt(fila, 2).toString();
                BigDecimal Ccompra = BigDecimal.valueOf(Double.parseDouble((String) this.jTableVideojuegos.getValueAt(fila, 3).toString()));
                BigDecimal Cventa = BigDecimal.valueOf(Double.parseDouble((String) this.jTableVideojuegos.getValueAt(fila, 4).toString()));
                String descripcion = (String) this.jTableVideojuegos.getValueAt(fila, 5).toString();
                String Plataforma = (String) this.jTableVideojuegos.getValueAt(fila, 6).toString();

                idproductos.setText("" + IDProducto);
                jTextFieldIDVideoJuego1.setText(""+IDVideojuego);
                jTextFieldNombre.setText(nombreP);
                jTextFieldPrecioCompra.setText("" + Ccompra);
                jTextFieldPrecioVenta.setText("" + Cventa);
                jTextArea1.setText("" + descripcion);
                txtPlataforma.setText(""+Plataforma);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditarVideojuegoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarConsumible;
    private javax.swing.JButton EditarElectronico;
    private javax.swing.JButton EditarVideojuego;
    private javax.swing.JScrollPane TablaConsumibles;
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JComboBox<String> comboCategoria;
    public static javax.swing.JButton consumibles;
    public static javax.swing.JButton electronico;
    public static javax.swing.JTextField idproductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTable jTableProducto;
    public static javax.swing.JTable jTableVideojuegos;
    private javax.swing.JTextField jTextFieldBuscar;
    public static javax.swing.JTextField jTextFieldIDConsumible1;
    public static javax.swing.JTextField jTextFieldIDElectronico;
    public static javax.swing.JTextField jTextFieldIDVideoJuego1;
    public static javax.swing.JTextField jTextFieldNombre;
    public static javax.swing.JTextField jTextFieldPrecioCompra;
    public static javax.swing.JTextField jTextFieldPrecioVenta;
    private javax.swing.JLabel labelidelectronico;
    private javax.swing.JLabel labelidvideojuego1;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbPlataforma;
    private javax.swing.JLabel lbVencimiento;
    private javax.swing.JScrollPane tablaElectronico;
    private javax.swing.JScrollPane tablavideojuegos;
    public static javax.swing.JTable tableelectronicos;
    public static javax.swing.JFormattedTextField txtFechaVencimiento;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtPlataforma;
    public static javax.swing.JButton videojuego;
    // End of variables declaration//GEN-END:variables
}
