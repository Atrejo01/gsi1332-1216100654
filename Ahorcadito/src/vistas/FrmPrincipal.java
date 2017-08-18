/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.JuegoAhorcado;
import clases.PlayWave;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nany
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private JuegoAhorcado ja1 = new JuegoAhorcado();
    private FrmAcercaDe frmAcercaDe;

    /**
     * Creates new form FrmPrin,bbcipal
     */
    public FrmPrincipal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOportunidades = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLetras = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado v1.0");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("AngryBirds", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Ahorcadito");

        jLabel2.setFont(new java.awt.Font("AngryBirds", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Categoría:");

        txtCategoria.setEditable(false);
        txtCategoria.setBackground(new java.awt.Color(255, 255, 255));
        txtCategoria.setFont(new java.awt.Font("AngryBirds", 0, 18)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 0, 51));
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.setText("Animales");
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("AngryBirds", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Oportunidades:");

        txtOportunidades.setEditable(false);
        txtOportunidades.setFont(new java.awt.Font("AngryBirds", 0, 18)); // NOI18N
        txtOportunidades.setForeground(new java.awt.Color(255, 0, 51));
        txtOportunidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOportunidades.setText("0");
        txtOportunidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOportunidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtOportunidades, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtOportunidades))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCategoria)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        cmbCategoria.setFont(new java.awt.Font("AngryBirds", 0, 18)); // NOI18N
        cmbCategoria.setForeground(new java.awt.Color(255, 0, 51));
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Animales", "TICs", "Peliculas", "Equipos", "Frutas" }));
        cmbCategoria.setFocusCycleRoot(true);
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("AngryBirds", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Categoría:");
        jLabel6.setFocusCycleRoot(true);

        jLabel7.setFont(new java.awt.Font("AngryBirds", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Letra:");
        jLabel7.setFocusCycleRoot(true);

        txtLetras.setFont(new java.awt.Font("AngryBirds", 0, 18)); // NOI18N
        txtLetras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLetras.setEnabled(false);
        txtLetras.setFocusCycleRoot(true);
        txtLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetrasActionPerformed(evt);
            }
        });
        txtLetras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLetrasKeyPressed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(255, 255, 0));
        btnVerificar.setFont(new java.awt.Font("AngryBirds", 0, 14)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerificar.setBorderPainted(false);
        btnVerificar.setEnabled(false);
        btnVerificar.setFocusCycleRoot(true);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 0));
        btnSalir.setFont(new java.awt.Font("AngryBirds", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(255, 255, 0));
        btnNuevo.setFont(new java.awt.Font("AngryBirds", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo Juego");
        btnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevo.setBorderPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCreditos.setBackground(new java.awt.Color(255, 255, 0));
        btnCreditos.setFont(new java.awt.Font("AngryBirds", 0, 14)); // NOI18N
        btnCreditos.setText("CRÉDITOS");
        btnCreditos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreditos.setBorderPainted(false);
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.Alignment.TRAILING, 0, 178, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ahorcados/a8.jpg"))); // NOI18N

        txtDisplay.setEditable(false);
        txtDisplay.setColumns(20);
        txtDisplay.setFont(new java.awt.Font("AngryBirds", 0, 18)); // NOI18N
        txtDisplay.setLineWrap(true);
        txtDisplay.setRows(3);
        txtDisplay.setText("  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        txtDisplay.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDisplay);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblImagen)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtOportunidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOportunidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOportunidadesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        //ja1.cargarPalabras();

        if (ja1.isBanNany()) {
            sonidoInicio();
            ja1.inicializar();
            ja1.seleccionarPalabra();

            ja1.esLetraCorrecta(' ');       //<----------
            //ja1.generaDisplay();

            txtDisplay.setText(ja1.getDisplay());
            btnVerificar.setEnabled(true);
            txtLetras.setEnabled(true);
            txtOportunidades.setText(String.valueOf(ja1.getOportunidades()));
            lblImagen.setIcon(new ImageIcon(
                    getClass().getResource("/ahorcados/" + ja1.getImagen())));
            ja1.setBanInicio(true);         // Inicia el juego
            ja1.setBanInicio(rootPaneCheckingEnabled);
            
        } else {
            sonidoCatego();
            JOptionPane.showMessageDialog(this, "SELECCIONA UNA CATEGORÍA.");
            
        }


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
        String catego = cmbCategoria.getSelectedItem().toString();
        ja1.setCatego(catego);
        ja1.cargarPalabras();
        txtCategoria.setText(catego);
        ja1.setBanNany(true);
        btnNuevoActionPerformed(null);

        //lblImagen.setIcon(new ImageIcon(
        //            getClass().getResource("/Ahorcados/"+ja1.getImagen())));
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        //if (ja1.isBanInicio() && txtLetras.getText().length() > 0) {
            try {
            char letra = txtLetras.getText().trim().toUpperCase().charAt(0);
            //ja1.setLetra(letra);
            if (ja1.esLetraCorrecta(letra)) {     //es correcta la letra
                sonidoAcierto();
                txtDisplay.setText(ja1.getDisplay());
                if (ja1.yaGano()) {
                    sonidoYaGano();
                    JOptionPane.showMessageDialog(this, "¡GANASTE!");
                    btnVerificar.setEnabled(false);
                    txtLetras.setEnabled(false);
                    
                }
            } else {          // No es correcta
                //Cambiar la imagen
                sonidoError();
                lblImagen.setIcon(new ImageIcon(
                        getClass().getResource("/ahorcados/"
                                + ja1.getImagen())));
                txtOportunidades.setText(String.valueOf(
                        ja1.getOportunidades()));
                if (ja1.yaPerdio()) {
                    sonidoYaPerdio();
                    JOptionPane.showMessageDialog(this, "¡PERDISTE!"
                            + "\nLA RESPUESTA ES: "
                            + ja1.getPalabra());
                    txtDisplay.setText(ja1.getPalabra());
                    btnVerificar.setEnabled(false);
                }
            }
            } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Introduce una letra.");
        }
            txtLetras.setText(null);
//            if(ja1.yaGano()||ja1.yaPerdio()){
//                btnVerificar.setEnabled(false);
//                txtLetras.setEnabled(false);
//            }
        //}
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txtLetrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetrasKeyPressed
        // TODO add your handling code here:
        txtLetras.setText("");


    }//GEN-LAST:event_txtLetrasKeyPressed

    private void txtLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetrasActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        // TODO add your handling code here:
        frmAcercaDe = new FrmAcercaDe();
        frmAcercaDe.setVisible(true);
    }//GEN-LAST:event_btnCreditosActionPerformed

    public void sonidoInicio() {
        try {
            PlayWave pw1;
            URL url = getClass().getResource("/sonidos/inicio.wav");
            pw1 = new PlayWave(url);
            pw1.start();
        } catch (URISyntaxException e) {
            System.out.println("Error en la URL!!");
        }
    }
    
    public void sonidoError() {
        try {
            PlayWave pw1;
            URL url = getClass().getResource("/sonidos/error.wav");
            pw1 = new PlayWave(url);
            pw1.start();
        } catch (URISyntaxException e) {
            System.out.println("Error en la URL!!");
        }
    }
    
    public void sonidoAcierto() {
        try {
            PlayWave pw1;
            URL url = getClass().getResource("/sonidos/acierto.wav");
            pw1 = new PlayWave(url);
            pw1.start();
        } catch (URISyntaxException e) {
            System.out.println("Error en la URL!!");
        }
    }
    
    public void sonidoYaGano() {
        try {
            PlayWave pw1;
            URL url = getClass().getResource("/sonidos/win.wav");
            pw1 = new PlayWave(url);
            pw1.start();
        } catch (URISyntaxException e) {
            System.out.println("Error en la URL!!");
        }
    }
    
    public void sonidoYaPerdio() {
        try {
            PlayWave pw1;
            URL url = getClass().getResource("/sonidos/lose.wav");
            pw1 = new PlayWave(url);
            pw1.start();
        } catch (URISyntaxException e) {
            System.out.println("Error en la URL!!");
        }
    }
    
    public void sonidoCatego() {
        try {
            PlayWave pw1;
            URL url = getClass().getResource("/sonidos/muerta.wav");
            pw1 = new PlayWave(url);
            pw1.start();
        } catch (URISyntaxException e) {
            System.out.println("Error en la URL!!");
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDisplay;
    private javax.swing.JTextField txtLetras;
    private javax.swing.JTextField txtOportunidades;
    // End of variables declaration//GEN-END:variables
}