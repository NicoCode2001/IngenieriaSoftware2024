/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Estudiante;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Conexion.*;
import DAO.*;
import Tabla.*;
import VO.*;
import GUI.Empleado.*;
import GUI.Estudiante.*;
import GUI.Secretario.*;


/**
 *
 * @author dgera
 */
public class MisReservas extends javax.swing.JPanel {

    /**
     * Creates new form MisInscripcioness
     */
    public MisReservas() {
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        deportes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnderechos = new javax.swing.JPanel();
        txtcomedor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtcomedor2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtcomedor3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtcomedor4 = new javax.swing.JLabel();
        btnderechos2 = new javax.swing.JPanel();
        txtcomedor6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/restaurante.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Viandas Diarias");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Establecimiento");

        deportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cita.png"))); // NOI18N
        deportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnderechos.setBackground(new java.awt.Color(255, 255, 255));
        btnderechos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtcomedor.setBackground(new java.awt.Color(255, 255, 255));
        txtcomedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcomedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcomedor.setText("Cancelar Vianda");
        txtcomedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcomedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcomedorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnderechosLayout = new javax.swing.GroupLayout(btnderechos);
        btnderechos.setLayout(btnderechosLayout);
        btnderechosLayout.setHorizontalGroup(
            btnderechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        btnderechosLayout.setVerticalGroup(
            btnderechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtcomedor2.setBackground(new java.awt.Color(255, 255, 255));
        txtcomedor2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcomedor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcomedor2.setText("Retroalimentación");
        txtcomedor2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcomedor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcomedor2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtcomedor3.setBackground(new java.awt.Color(255, 255, 255));
        txtcomedor3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcomedor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcomedor3.setText("Reservar Vianda");
        txtcomedor3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcomedor3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcomedor3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtcomedor4.setBackground(new java.awt.Color(255, 255, 255));
        txtcomedor4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcomedor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcomedor4.setText("Cancelar Reserva");
        txtcomedor4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcomedor4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcomedor4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnderechos2.setBackground(new java.awt.Color(255, 255, 255));
        btnderechos2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtcomedor6.setBackground(new java.awt.Color(255, 255, 255));
        txtcomedor6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcomedor6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcomedor6.setText("Reservar Establecimiento");
        txtcomedor6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcomedor6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcomedor6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnderechos2Layout = new javax.swing.GroupLayout(btnderechos2);
        btnderechos2.setLayout(btnderechos2Layout);
        btnderechos2Layout.setHorizontalGroup(
            btnderechos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor6, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        btnderechos2Layout.setVerticalGroup(
            btnderechos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcomedor6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnderechos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnderechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(deportes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnderechos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deportes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnderechos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

    }//GEN-LAST:event_jLabel1MousePressed

    private void txtcomedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcomedorMousePressed
         /*Usuario usuarioActivo = Sesion.getUsuarioActual();
        Conexion conn = new Conexion();
        boolean existeReservaVianda = conn.verificarCancelVianda(usuarioActivo.getUsername());
        System.out.println(existeReservaVianda);
        
        if (existeReservaVianda){
        CancelarVianda cancel = new CancelarVianda();
        cancel.setVisible(true);
       cancel.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        // Opcional: Cerrar el JFrame actual
         JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.setVisible(false);
                frame.dispose();
            } 
        }else{
            
            javax.swing.JOptionPane.showMessageDialog(this, "Usted no reservo en el dia de la fecha o ya pasó el tiempo para cancelar","", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }*/
     
    }//GEN-LAST:event_txtcomedorMousePressed

    private void txtcomedor2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcomedor2MousePressed
        /*Usuario usuarioActivo = Sesion.getUsuarioActual();
        Conexion conn = new Conexion();
        boolean existeReservaVianda = conn.verificarRetroalimentacionVianda(usuarioActivo.getUsername());
        System.out.println(existeReservaVianda);
        
        if (existeReservaVianda){
         RetroalimentacionVianda retro = new RetroalimentacionVianda();
       retro.setVisible(true);
      retro.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        // Opcional: Cerrar el JFrame actual
         JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.setVisible(false);
                frame.dispose();
            } 
        }else{
            
            javax.swing.JOptionPane.showMessageDialog(this, "Usted no reservo en el dia de la fecha, o ya realizo su retroalimentacion de la vianda","", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_txtcomedor2MousePressed

    private void txtcomedor3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcomedor3MousePressed
     /* Usuario usuarioActivo = Sesion.getUsuarioActual();
        Conexion conn = new Conexion();
        boolean existeReservaVianda = conn.verificarReservaVianda(usuarioActivo.getUsername());
        System.out.println(existeReservaVianda);
        
        if (!existeReservaVianda){
            ReservaVianda reser = new ReservaVianda();
       reser.setVisible(true);
        reser.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        // Opcional: Cerrar el JFrame actual
     
       JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.setVisible(false);
                frame.dispose();
            } 
        }else{
            
            javax.swing.JOptionPane.showMessageDialog(this, "Usted ya ha realizado su reserva en el dia de la fecha","con exito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_txtcomedor3MousePressed

    private void txtcomedor4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcomedor4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomedor4MousePressed

    private void txtcomedor6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcomedor6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomedor6MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnderechos;
    private javax.swing.JPanel btnderechos2;
    private javax.swing.JLabel deportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtcomedor;
    private javax.swing.JLabel txtcomedor2;
    private javax.swing.JLabel txtcomedor3;
    private javax.swing.JLabel txtcomedor4;
    private javax.swing.JLabel txtcomedor6;
    // End of variables declaration//GEN-END:variables
}
