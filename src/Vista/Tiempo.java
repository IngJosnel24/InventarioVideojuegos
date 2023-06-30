/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
/**
 *
 * @author mr540
 */
public class Tiempo extends javax.swing.JFrame {
    private Timer timer;
    private int hora, minuto, segundo;
    
    private Timer timer2;
    private int hora2, minuto2, segundo2;
    
    private Timer timer3;
    private int hora3, minuto3, segundo3;
    
    private Timer timer4;
    private int hora4, minuto4, segundo4;
    /**
     * Creates new form Tiempo
     */
    public Tiempo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void Cronometro() {

        hora = 0;
        minuto = 0;
        segundo = 0;
        
        lbCronometro1.setFont(new Font("Verdana", Font.BOLD, 24));
    }
    
    public void run() {
        new Tiempo().setVisible(true);
    }
    
    public void Limpiartxt() {
        txtHora.setText("");
        txtMinuto.setText("");
        txtSegundo.setText("");
    }
    
    private void iniciarCronometro() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundo--;
                if (segundo == -1) {
                    segundo = 59;
                    minuto--;
                    if (minuto == -1) {
                        minuto = 59;
                        hora--;
                        if (hora == -1) {
                            reiniciarCronometro();
                            if (minuto == -1) {
                                reiniciarCronometro();
                                if (segundo == -1) {
                                    juegoBTN();
                                    reiniciarCronometro();

                                }
                            }
                        }
                    }
                }
                actualizarTiempoLB();
            }
        });
        timer.start();
    }
    
    private void detenerCronometro() {
        if (timer != null) {
            timer.stop();
        }
    }
    
    public void juegoBTN() {
        this.btnIniciar.setEnabled(true);
        this.btnPausar.setEnabled(false);
        this.btnReiniciar.setEnabled(false);
    }
    
    private void reiniciarCronometro() {
        detenerCronometro();
        hora = 0;
        minuto = 0;
        segundo = 0;
        actualizarTiempoLB();
    }
    
    private void actualizarTiempoLB() {
        String horasString = String.format("%02d", hora);
        String minutosString = String.format("%02d", minuto);
        String segundosString = String.format("%02d", segundo);
        lbCronometro1.setText(horasString + " : " + minutosString + " : " + segundosString);
    }
    
    public void DeterminarCRN() {
        String tHora = txtHora.getText();
        String tMinuto = txtMinuto.getText();
        String tSegundo = txtSegundo.getText();

        hora = Integer.parseInt(tHora);
        minuto = Integer.parseInt(tMinuto);
        segundo = Integer.parseInt(tSegundo);
    }
    
    /**
     * Creates new form Tiempo
     */
    // Aqui inicia el tempo2
    public void Cronometro2() {

        hora2 = 0;
        minuto2 = 0;
        segundo2 = 0;
        
        lbCronometro2.setFont(new Font("Verdana", Font.BOLD, 24));
    }
    
    public void Limpiartxt2() {
        txtHora2.setText("");
        txtMinuto2.setText("");
        txtSegundo2.setText("");
    }
    
    private void iniciarCronometro2() {
        timer2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundo2--;
                if (segundo2 == -1) {
                    segundo2 = 59;
                    minuto2--;
                    if (minuto2 == -1) {
                        minuto2 = 59;
                        hora2--;
                        if (hora2 == -1) {
                            reiniciarCronometro();
                            if (minuto2 == -1) {
                                reiniciarCronometro();
                                if (segundo2 == -1) {
                                    juegoBTN();
                                    reiniciarCronometro();

                                }
                            }
                        }
                    }
                }
                actualizarTiempoLB2();
            }
        });
        timer2.start();
    }
    
    private void detenerCronometro2() {
        if (timer2 != null) {
            timer2.stop();
        }
    }
        public void juegoBTN2() {
        this.btnIniciar2.setEnabled(true);
        this.btnPausar2.setEnabled(false);
        this.btnReiniciar.setEnabled(false);
    }
        
        private void reiniciarCronometro2() {
        detenerCronometro2();
        hora2 = 0;
        minuto2 = 0;
        segundo2 = 0;
        actualizarTiempoLB2();
    }

    private void actualizarTiempoLB2() {
        String horasString = String.format("%02d", hora2);
        String minutosString = String.format("%02d", minuto2);
        String segundosString = String.format("%02d", segundo2);
        lbCronometro2.setText(horasString + " : " + minutosString + " : " + segundosString);
    }

    public void DeterminarCRN2() {
        String tHora = txtHora2.getText();
        String tMinuto = txtMinuto2.getText();
        String tSegundo = txtSegundo2.getText();

        hora2 = Integer.parseInt(tHora);
        minuto2 = Integer.parseInt(tMinuto);
        segundo2 = Integer.parseInt(tSegundo);
    }
    
    /**
     * Creates new form Tiempo
     */
    // Aqui inicia el tempo3
    public void Cronometro3() {

        hora3 = 0;
        minuto3 = 0;
        segundo3 = 0;
        
        lbCronometro3.setFont(new Font("Verdana", Font.BOLD, 24));
    }
    
    public void Limpiartxt3() {
        txtHora3.setText("");
        txtMinuto3.setText("");
        txtSegundo3.setText("");
    }
    
    private void iniciarCronometro3() {
        timer3 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundo3--;
                if (segundo3 == -1) {
                    segundo3 = 59;
                    minuto3--;
                    if (minuto3 == -1) {
                        minuto3 = 59;
                        hora3--;
                        if (hora3 == -1) {
                            reiniciarCronometro3();
                            if (minuto3 == -1) {
                                reiniciarCronometro3();
                                if (segundo3 == -1) {
                                    juegoBTN3();
                                    reiniciarCronometro3();

                                }
                            }
                        }
                    }
                }
                actualizarTiempoLB3();
            }
        });
        timer3.start();
    }
    
    private void detenerCronometro3() {
        if (timer3 != null) {
            timer3.stop();
        }
    }
        public void juegoBTN3() {
        this.btnIniciar3.setEnabled(true);
        this.btnPausar3.setEnabled(false);
        this.btnReiniciar3.setEnabled(false);
    }
        
        private void reiniciarCronometro3() {
        detenerCronometro3();
        hora3 = 0;
        minuto3 = 0;
        segundo3 = 0;
        actualizarTiempoLB3();
    }

    private void actualizarTiempoLB3() {
        String horasString = String.format("%02d", hora3);
        String minutosString = String.format("%02d", minuto3);
        String segundosString = String.format("%02d", segundo3);
        lbCronometro3.setText(horasString + " : " + minutosString + " : " + segundosString);
    }

    public void DeterminarCRN3() {
        String tHora = txtHora3.getText();
        String tMinuto = txtMinuto3.getText();
        String tSegundo = txtSegundo3.getText();

        hora3 = Integer.parseInt(tHora);
        minuto3 = Integer.parseInt(tMinuto);
        segundo3 = Integer.parseInt(tSegundo);
    }
    
    /**
     * Creates new form Tiempo
     */
    // Aqui inicia el tempo4
    public void Cronometro4() {

        hora4 = 0;
        minuto4 = 0;
        segundo4 = 0;
        
        lbCronometro4.setFont(new Font("Verdana", Font.BOLD, 24));
    }
    
    public void Limpiartxt4() {
        txtHora4.setText("");
        txtMinuto4.setText("");
        txtSegundo4.setText("");
    }
    
    private void iniciarCronometro4() {
        timer4 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundo4--;
                if (segundo4 == -1) {
                    segundo4 = 59;
                    minuto4--;
                    if (minuto4 == -1) {
                        minuto4 = 59;
                        hora4--;
                        if (hora4 == -1) {
                            reiniciarCronometro4();
                            if (minuto4 == -1) {
                                reiniciarCronometro4();
                                if (segundo4 == -1) {
                                    juegoBTN4();
                                    reiniciarCronometro4();

                                }
                            }
                        }
                    }
                }
                actualizarTiempoLB4();
            }
        });
        timer4.start();
    
    }
    
    private void detenerCronometro4() {
        if (timer4 != null) {
            timer4.stop();
        }
    }
        public void juegoBTN4() {
        this.btnIniciar4.setEnabled(true);
        this.btnPausar4.setEnabled(false);
        this.btnReiniciar4.setEnabled(false);
    }
        
        private void reiniciarCronometro4() {
        detenerCronometro4();
        hora4 = 0;
        minuto4 = 0;
        segundo4 = 0;
        actualizarTiempoLB4();
    }

    private void actualizarTiempoLB4() {
        String horasString = String.format("%02d", hora);
        String minutosString = String.format("%02d", minuto);
        String segundosString = String.format("%02d", segundo);
        lbCronometro4.setText(horasString + " : " + minutosString + " : " + segundosString);
    }

    public void DeterminarCRN4() {
        String tHora = txtHora4.getText();
        String tMinuto = txtMinuto4.getText();
        String tSegundo = txtSegundo4.getText();

        hora4 = Integer.parseInt(tHora);
        minuto4 = Integer.parseInt(tMinuto);
        segundo4 = Integer.parseInt(tSegundo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lbCronometro1 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        txtMinuto = new javax.swing.JTextField();
        txtSegundo = new javax.swing.JTextField();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        lbCronometro2 = new javax.swing.JLabel();
        btnReiniciar2 = new javax.swing.JButton();
        btnPausar2 = new javax.swing.JButton();
        btnIniciar2 = new javax.swing.JButton();
        txtHora2 = new javax.swing.JTextField();
        txtMinuto2 = new javax.swing.JTextField();
        txtSegundo2 = new javax.swing.JTextField();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        lbCronometro4 = new javax.swing.JLabel();
        btnReiniciar4 = new javax.swing.JButton();
        btnPausar4 = new javax.swing.JButton();
        btnIniciar4 = new javax.swing.JButton();
        txtHora4 = new javax.swing.JTextField();
        txtMinuto4 = new javax.swing.JTextField();
        txtSegundo4 = new javax.swing.JTextField();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        lbCronometro3 = new javax.swing.JLabel();
        btnReiniciar3 = new javax.swing.JButton();
        btnPausar3 = new javax.swing.JButton();
        btnIniciar3 = new javax.swing.JButton();
        txtHora3 = new javax.swing.JTextField();
        txtMinuto3 = new javax.swing.JTextField();
        txtSegundo3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 670));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jInternalFrame1.setPreferredSize(new java.awt.Dimension(261, 223));
        jInternalFrame1.setVisible(true);

        lbCronometro1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbCronometro1.setText("00 : 00 : 00");

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        txtHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoraKeyReleased(evt);
            }
        });

        txtMinuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMinutoKeyReleased(evt);
            }
        });

        txtSegundo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbCronometro1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMinuto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciar)
                            .addComponent(txtSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCronometro1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar)
                    .addComponent(btnPausar)
                    .addComponent(btnIniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jInternalFrame2.setPreferredSize(new java.awt.Dimension(261, 223));
        jInternalFrame2.setVisible(true);

        lbCronometro2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbCronometro2.setText("00 : 00 : 00");

        btnReiniciar2.setText("Reiniciar");
        btnReiniciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciar2ActionPerformed(evt);
            }
        });

        btnPausar2.setText("Pausar");
        btnPausar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausar2ActionPerformed(evt);
            }
        });

        btnIniciar2.setText("Iniciar");
        btnIniciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar2ActionPerformed(evt);
            }
        });

        txtHora2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHora2KeyReleased(evt);
            }
        });

        txtMinuto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinuto2ActionPerformed(evt);
            }
        });
        txtMinuto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMinuto2KeyReleased(evt);
            }
        });

        txtSegundo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundo2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHora2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReiniciar2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPausar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMinuto2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIniciar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSegundo2)))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbCronometro2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbCronometro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar2)
                    .addComponent(btnPausar2)
                    .addComponent(btnReiniciar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinuto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jInternalFrame3.setPreferredSize(new java.awt.Dimension(261, 223));
        jInternalFrame3.setVisible(true);

        lbCronometro4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbCronometro4.setText("00 : 00 : 00");

        btnReiniciar4.setText("Reiniciar");
        btnReiniciar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciar4ActionPerformed(evt);
            }
        });

        btnPausar4.setText("Pausar");
        btnPausar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausar4ActionPerformed(evt);
            }
        });

        btnIniciar4.setText("Iniciar");
        btnIniciar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar4ActionPerformed(evt);
            }
        });

        txtHora4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHora4KeyReleased(evt);
            }
        });

        txtMinuto4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMinuto4KeyReleased(evt);
            }
        });

        txtSegundo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundo4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReiniciar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHora4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPausar4)
                    .addComponent(txtMinuto4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar4)
                    .addComponent(txtSegundo4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCronometro4)
                .addGap(45, 45, 45))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbCronometro4)
                .addGap(51, 51, 51)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar4)
                    .addComponent(btnPausar4)
                    .addComponent(btnIniciar4))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinuto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jInternalFrame4.setPreferredSize(new java.awt.Dimension(261, 223));
        jInternalFrame4.setVisible(true);

        lbCronometro3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbCronometro3.setText("00 : 00 : 00");

        btnReiniciar3.setText("Reiniciar");
        btnReiniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciar3ActionPerformed(evt);
            }
        });

        btnPausar3.setText("Pausar");
        btnPausar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausar3ActionPerformed(evt);
            }
        });

        btnIniciar3.setText("Iniciar");
        btnIniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar3ActionPerformed(evt);
            }
        });

        txtHora3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHora3ActionPerformed(evt);
            }
        });
        txtHora3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHora3KeyReleased(evt);
            }
        });

        txtMinuto3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMinuto3KeyReleased(evt);
            }
        });

        txtSegundo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundo3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHora3)
                    .addComponent(btnReiniciar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addComponent(btnPausar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciar3))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addComponent(txtMinuto3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSegundo3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbCronometro3)
                .addGap(48, 48, 48))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbCronometro3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar3)
                    .addComponent(btnPausar3)
                    .addComponent(btnReiniciar3))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinuto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInternalFrame4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInternalFrame2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInternalFrame3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrame4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        if (evt.getSource() == btnReiniciar) {
            reiniciarCronometro();
            btnIniciar.setEnabled(true);
            btnPausar.setEnabled(false);
            btnReiniciar.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (evt.getSource() == btnIniciar) {
            iniciarCronometro();
            btnIniciar.setEnabled(false);
            btnPausar.setEnabled(true);
            btnReiniciar.setEnabled(true);
        }
        Limpiartxt();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        if (evt.getSource() == btnPausar) {
            detenerCronometro();
            btnIniciar.setEnabled(true);
            btnPausar.setEnabled(false);
            btnReiniciar.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPausarActionPerformed

    private void txtHoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraKeyReleased
    String tHora = txtHora.getText();

        hora = Integer.parseInt(tHora);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraKeyReleased

    private void txtMinutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutoKeyReleased
        String tMinuto = txtMinuto.getText();

        minuto = Integer.parseInt(tMinuto);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutoKeyReleased

    private void txtSegundoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoKeyReleased
        String tSegundo = txtSegundo.getText();

        segundo = Integer.parseInt(tSegundo);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoKeyReleased

    private void btnReiniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciar2ActionPerformed
        if (evt.getSource() == btnReiniciar2) {
            reiniciarCronometro2();
            btnIniciar2.setEnabled(true);
            btnPausar2.setEnabled(false);
            btnReiniciar2.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciar2ActionPerformed

    private void txtMinuto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinuto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinuto2ActionPerformed

    private void btnIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar2ActionPerformed
        if (evt.getSource() == btnIniciar2) {
            iniciarCronometro2();
            btnIniciar2.setEnabled(false);
            btnPausar2.setEnabled(true);
            btnReiniciar2.setEnabled(true);
        }
        Limpiartxt2();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciar2ActionPerformed

    private void btnPausar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausar2ActionPerformed
        if (evt.getSource() == btnPausar2) {
            detenerCronometro2();
            btnIniciar2.setEnabled(true);
            btnPausar2.setEnabled(false);
            btnReiniciar2.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPausar2ActionPerformed

    private void txtHora2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora2KeyReleased
        String tHora = txtHora2.getText();

        hora2 = Integer.parseInt(tHora);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHora2KeyReleased

    private void txtMinuto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinuto2KeyReleased
        String tMinuto = txtMinuto2.getText();

        minuto2 = Integer.parseInt(tMinuto);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinuto2KeyReleased

    private void txtSegundo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundo2KeyReleased
        String tSegundo = txtSegundo2.getText();

        segundo2 = Integer.parseInt(tSegundo);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundo2KeyReleased

    private void btnReiniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciar3ActionPerformed
        if (evt.getSource() == btnReiniciar3) {
            reiniciarCronometro();
            btnIniciar3.setEnabled(true);
            btnPausar3.setEnabled(false);
            btnReiniciar3.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciar3ActionPerformed

    private void txtHora3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHora3ActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHora3ActionPerformed

    private void txtHora3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora3KeyReleased
        String tHora = txtHora3.getText();

        hora3 = Integer.parseInt(tHora);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHora3KeyReleased

    private void txtMinuto3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinuto3KeyReleased
        String tMinuto = txtMinuto3.getText();

        minuto3 = Integer.parseInt(tMinuto);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinuto3KeyReleased

    private void txtSegundo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundo3KeyReleased
        String tSegundo = txtSegundo3.getText();

        segundo3 = Integer.parseInt(tSegundo);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundo3KeyReleased

    private void txtHora4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora4KeyReleased
        String tHora = txtHora4.getText();

        hora = Integer.parseInt(tHora);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHora4KeyReleased

    private void txtMinuto4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinuto4KeyReleased
        String tMinuto = txtMinuto4.getText();

        minuto = Integer.parseInt(tMinuto);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinuto4KeyReleased

    private void txtSegundo4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundo4KeyReleased
        String tSegundo = txtSegundo4.getText();

        segundo = Integer.parseInt(tSegundo);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundo4KeyReleased

    private void btnIniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar3ActionPerformed
        if (evt.getSource() == btnIniciar3) {
            iniciarCronometro3();
            btnIniciar3.setEnabled(false);
            btnPausar3.setEnabled(true);
            btnReiniciar3.setEnabled(true);
        }
        Limpiartxt3();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciar3ActionPerformed

    private void btnPausar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausar3ActionPerformed
        if (evt.getSource() == btnPausar3) {
            detenerCronometro2();
            btnIniciar3.setEnabled(true);
            btnPausar3.setEnabled(false);
            btnReiniciar3.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPausar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Menuprincipal panel2 = new Menuprincipal()
            ;
            panel2.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar el panel: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIniciar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar4ActionPerformed
    if (evt.getSource() == btnIniciar4) {
            iniciarCronometro4();
            btnIniciar4.setEnabled(false);
            btnPausar4.setEnabled(true);
            btnReiniciar4.setEnabled(true);
        }
        Limpiartxt4();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciar4ActionPerformed

    private void btnPausar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausar4ActionPerformed
        if (evt.getSource() == btnPausar4) {
            detenerCronometro2();
            btnIniciar4.setEnabled(true);
            btnPausar4.setEnabled(false);
            btnReiniciar4.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPausar4ActionPerformed

    private void btnReiniciar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciar4ActionPerformed
    if (evt.getSource() == btnReiniciar4) {
            reiniciarCronometro4();
            btnIniciar4.setEnabled(true);
            btnPausar4.setEnabled(false);
            btnReiniciar4.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciar4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tiempo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciar2;
    private javax.swing.JButton btnIniciar3;
    private javax.swing.JButton btnIniciar4;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnPausar2;
    private javax.swing.JButton btnPausar3;
    private javax.swing.JButton btnPausar4;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnReiniciar2;
    private javax.swing.JButton btnReiniciar3;
    private javax.swing.JButton btnReiniciar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCronometro1;
    private javax.swing.JLabel lbCronometro2;
    private javax.swing.JLabel lbCronometro3;
    private javax.swing.JLabel lbCronometro4;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHora2;
    private javax.swing.JTextField txtHora3;
    private javax.swing.JTextField txtHora4;
    private javax.swing.JTextField txtMinuto;
    private javax.swing.JTextField txtMinuto2;
    private javax.swing.JTextField txtMinuto3;
    private javax.swing.JTextField txtMinuto4;
    private javax.swing.JTextField txtSegundo;
    private javax.swing.JTextField txtSegundo2;
    private javax.swing.JTextField txtSegundo3;
    private javax.swing.JTextField txtSegundo4;
    // End of variables declaration//GEN-END:variables
}
