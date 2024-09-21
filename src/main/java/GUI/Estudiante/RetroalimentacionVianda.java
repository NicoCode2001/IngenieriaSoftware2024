/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Estudiante;


import Conexion.*;
import DAO.*;
import Tabla.*;
import VO.*;
import GUI.Empleado.*;
import GUI.Estudiante.*;
import GUI.Secretario.*;

/**
 *
 * @author m
 */
public class RetroalimentacionVianda extends javax.swing.JFrame {

  
    public RetroalimentacionVianda() {
        initComponents();
    }
    String calificacionSeleccionada="Ninguno";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        familyCalificacion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        opinion = new javax.swing.JTextArea();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtatras = new javax.swing.JLabel();
        iconatras = new javax.swing.JLabel();
        enviarRetroalimentacion = new javax.swing.JButton();
        caliExcelente = new javax.swing.JRadioButton();
        caliBuena = new javax.swing.JRadioButton();
        caliMala = new javax.swing.JRadioButton();

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Reserva del día");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 540));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nos interesa tu opinión");

        opinion.setColumns(20);
        opinion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opinion.setForeground(new java.awt.Color(102, 102, 102));
        opinion.setRows(5);
        opinion.setText("Ecribe una breve reseña...");
        jScrollPane1.setViewportView(opinion);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Retroalimentación");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/opinion.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/puntuacion.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Califica tu vianda");

        txtatras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtatras.setForeground(new java.awt.Color(255, 255, 255));
        txtatras.setText("Volver atrás");
        txtatras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtatrasMousePressed(evt);
            }
        });

        iconatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha-hacia-atras.png"))); // NOI18N
        iconatras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconatrasMousePressed(evt);
            }
        });

        enviarRetroalimentacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enviarRetroalimentacion.setForeground(new java.awt.Color(153, 0, 0));
        enviarRetroalimentacion.setText("Enviar");
        enviarRetroalimentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enviarRetroalimentacionMousePressed(evt);
            }
        });
        enviarRetroalimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarRetroalimentacionActionPerformed(evt);
            }
        });

        caliExcelente.setBackground(new java.awt.Color(153, 0, 0));
        familyCalificacion.add(caliExcelente);
        caliExcelente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caliExcelente.setForeground(new java.awt.Color(255, 255, 255));
        caliExcelente.setText("Excelente");
        caliExcelente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caliExcelenteActionPerformed(evt);
            }
        });

        caliBuena.setBackground(new java.awt.Color(153, 0, 0));
        familyCalificacion.add(caliBuena);
        caliBuena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caliBuena.setForeground(new java.awt.Color(255, 255, 255));
        caliBuena.setText("Buena");
        caliBuena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caliBuenaActionPerformed(evt);
            }
        });

        caliMala.setBackground(new java.awt.Color(153, 0, 0));
        familyCalificacion.add(caliMala);
        caliMala.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caliMala.setForeground(new java.awt.Color(255, 255, 255));
        caliMala.setText("Mala");
        caliMala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caliMalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(64, 64, 64)
                            .addComponent(jLabel20)
                            .addGap(243, 243, 243))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(enviarRetroalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                                        .addComponent(iconatras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtatras))))
                            .addGap(62, 62, 62)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(244, 244, 244))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(caliMala)
                        .addGap(18, 18, 18)
                        .addComponent(caliBuena)
                        .addGap(18, 18, 18)
                        .addComponent(caliExcelente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel22)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caliBuena)
                    .addComponent(caliMala)
                    .addComponent(caliExcelente))
                .addGap(49, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtatras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iconatras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enviarRetroalimentacion)
                        .addGap(6, 6, 6)))
                .addGap(15, 15, 15))
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

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void txtatrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtatrasMousePressed
        PrincipalEstudiante principalE = new PrincipalEstudiante();
        principalE.setVisible(true);
        principalE.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        // Opcional: Cerrar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_txtatrasMousePressed

    private void iconatrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconatrasMousePressed
        PrincipalEstudiante principalE = new PrincipalEstudiante();
        principalE.setVisible(true);
        principalE.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        // Opcional: Cerrar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_iconatrasMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void enviarRetroalimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarRetroalimentacionActionPerformed

    }//GEN-LAST:event_enviarRetroalimentacionActionPerformed

    private void caliExcelenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caliExcelenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caliExcelenteActionPerformed

    private void caliBuenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caliBuenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caliBuenaActionPerformed

    private void caliMalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caliMalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caliMalaActionPerformed

    private void enviarRetroalimentacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarRetroalimentacionMousePressed
       /* Usuario usuarioActivo = Sesion.getUsuarioActual();
            
            if (caliMala.isSelected()){
                calificacionSeleccionada = "Mala";
            }else if (caliBuena.isSelected()){
                calificacionSeleccionada = "Buena";
            }else {
                calificacionSeleccionada = "Excelente";
            }
            
            if(calificacionSeleccionada == "Mala"){
                Conexion conn = new Conexion();
                conn.enviarReserva(calificacionSeleccionada, usuarioActivo.getUsername(),opinion.getText());
                javax.swing.JOptionPane.showMessageDialog(this, "¡Retroalimentacion registrada!","Registro", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                PrincipalEstudiante principalE = new PrincipalEstudiante();
                    principalE.setVisible(true);
                    principalE.setLocationRelativeTo(null);
                    // Ocultar el JFrame actual
                    this.setVisible(false);
                    // Opcional: Cerrar el JFrame actual
                    this.dispose();

            }else if(calificacionSeleccionada== "Buena"){
                Conexion conn = new Conexion();
                conn.enviarReserva(calificacionSeleccionada, usuarioActivo.getUsername(),opinion.getText());
                javax.swing.JOptionPane.showMessageDialog(this, "¡Retroalimentacion registrada!","Registro", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                PrincipalEstudiante principalE = new PrincipalEstudiante();
                    principalE.setVisible(true);
                    principalE.setLocationRelativeTo(null);
                    // Ocultar el JFrame actual
                    this.setVisible(false);
                    // Opcional: Cerrar el JFrame actual
                    this.dispose();
                
            }else if (calificacionSeleccionada== "Excelente"){
                Conexion conn = new Conexion();
                conn.enviarReserva(calificacionSeleccionada, usuarioActivo.getUsername(),opinion.getText());
                javax.swing.JOptionPane.showMessageDialog(this, "¡Retroalimentacion registrada!","Registro", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                PrincipalEstudiante principalE = new PrincipalEstudiante();
                    principalE.setVisible(true);
                    principalE.setLocationRelativeTo(null);
                    // Ocultar el JFrame actual
                    this.setVisible(false);
                    // Opcional: Cerrar el JFrame actual
                    this.dispose();
                
            }else{
                 javax.swing.JOptionPane.showMessageDialog(this, 
            "¡Error al registrar la retroalimentacion!\nPor favor, seleccione la calificacion(*).", 
            "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }*/
        
    }//GEN-LAST:event_enviarRetroalimentacionMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton caliBuena;
    private javax.swing.JRadioButton caliExcelente;
    private javax.swing.JRadioButton caliMala;
    private javax.swing.JButton enviarRetroalimentacion;
    private javax.swing.ButtonGroup familyCalificacion;
    private javax.swing.JLabel iconatras;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JTextArea opinion;
    private javax.swing.JLabel txtatras;
    // End of variables declaration//GEN-END:variables
}
