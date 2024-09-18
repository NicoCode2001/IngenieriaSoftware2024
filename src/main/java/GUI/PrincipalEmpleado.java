/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import logica.Sesion;
import logica.Usuario;

/**
 *
 * @author dgera
 */
public class PrincipalEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public PrincipalEmpleado() {
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

        panelDer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMisSolicitudes = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnpri = new javax.swing.JPanel();
        iconpri = new javax.swing.JLabel();
        txtpri = new javax.swing.JLabel();
        btnevaluar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnconfig = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btncerrar1 = new javax.swing.JPanel();
        txtcerrar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout panelDerLayout = new javax.swing.GroupLayout(panelDer);
        panelDer.setLayout(panelDerLayout);
        panelDerLayout.setHorizontalGroup(
            panelDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE)
        );
        panelDerLayout.setVerticalGroup(
            panelDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 530, 540));

        panelIzq.setBackground(new java.awt.Color(153, 0, 0));
        panelIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        panelIzq.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 50, -1, -1));

        btnMisSolicitudes.setBackground(new java.awt.Color(175, 0, 0));
        btnMisSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMisSolicitudes.setPreferredSize(new java.awt.Dimension(270, 51));
        btnMisSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMisSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMisSolicitudesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMisSolicitudesMousePressed(evt);
            }
        });
        btnMisSolicitudes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/archivo.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        btnMisSolicitudes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Mis solicitudes");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel14AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        btnMisSolicitudes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        panelIzq.add(btnMisSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, -1, -1));

        btnpri.setBackground(new java.awt.Color(183, 52, 66));
        btnpri.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnpri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpriMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnpriMousePressed(evt);
            }
        });
        btnpri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconpri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconpri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home-outline.png"))); // NOI18N
        btnpri.add(iconpri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        txtpri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpri.setForeground(new java.awt.Color(255, 255, 255));
        txtpri.setText("Principal");
        btnpri.add(txtpri, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        panelIzq.add(btnpri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 270, 50));

        btnevaluar.setBackground(new java.awt.Color(175, 0, 0));
        btnevaluar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnevaluar.setPreferredSize(new java.awt.Dimension(270, 51));
        btnevaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnevaluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnevaluarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnevaluarMousePressed(evt);
            }
        });
        btnevaluar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mis evaluaciones");
        btnevaluar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inscripcion.png"))); // NOI18N
        btnevaluar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        panelIzq.add(btnevaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 256, -1, -1));

        btnconfig.setBackground(new java.awt.Color(175, 0, 0));
        btnconfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnconfig.setPreferredSize(new java.awt.Dimension(270, 51));
        btnconfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnconfigMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnconfigMousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Configuración");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/configuraciones.png"))); // NOI18N

        javax.swing.GroupLayout btnconfigLayout = new javax.swing.GroupLayout(btnconfig);
        btnconfig.setLayout(btnconfigLayout);
        btnconfigLayout.setHorizontalGroup(
            btnconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnconfigLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        btnconfigLayout.setVerticalGroup(
            btnconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnconfigLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(btnconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelIzq.add(btnconfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 306, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        panelIzq.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 118, 190, 20));

        btncerrar1.setBackground(new java.awt.Color(175, 0, 0));
        btncerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncerrar1.setPreferredSize(new java.awt.Dimension(270, 51));
        btncerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncerrar1MousePressed(evt);
            }
        });

        txtcerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcerrar.setForeground(new java.awt.Color(255, 255, 255));
        txtcerrar.setText("Cerrar sesión");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion.png"))); // NOI18N

        javax.swing.GroupLayout btncerrar1Layout = new javax.swing.GroupLayout(btncerrar1);
        btncerrar1.setLayout(btncerrar1Layout);
        btncerrar1Layout.setHorizontalGroup(
            btncerrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncerrar1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcerrar)
                .addGap(132, 132, 132))
        );
        btncerrar1Layout.setVerticalGroup(
            btncerrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncerrar1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(btncerrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelIzq.add(btncerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 351, -1, 50));

        getContentPane().add(panelIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMisSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisSolicitudesMouseEntered

    }//GEN-LAST:event_btnMisSolicitudesMouseEntered

    private void btnMisSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisSolicitudesMouseExited

    }//GEN-LAST:event_btnMisSolicitudesMouseExited

    private void btnMisSolicitudesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisSolicitudesMousePressed
        resetColor(btnpri);
        setColor(btnMisSolicitudes);
        resetColor(btnevaluar);
        resetColor(btnconfig);
        resetColor(btnevaluar);
        resetColor(btnconfig);
        // Abrir sección
        PedidosMenuEmpleado p1 = new PedidosMenuEmpleado();
        p1.setSize(530, 540);
        p1.setLocation(0,0);
        //p1.show();

        panelDer.removeAll();
        panelDer.add(p1, BorderLayout.CENTER);
        panelDer.revalidate();
        panelDer.repaint();
    }//GEN-LAST:event_btnMisSolicitudesMousePressed

    private void btnpriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpriMouseEntered

    }//GEN-LAST:event_btnpriMouseEntered

    private void btnpriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpriMouseExited

    }//GEN-LAST:event_btnpriMouseExited

    private void btnpriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpriMousePressed
        /*setColor(btnpri);
        resetColor(btnMisSolicitudes);
        resetColor(btnevaluar);
        resetColor(btnconfig);
        resetColor(btnevaluar);
        resetColor(btnconfig);
        // Abrir sección
        PrincipalEmpleado p1 = new PrincipalEmpleado();
        p1.setSize(530, 540);
        p1.setLocation(0,0);

        panelDer.removeAll();
        panelDer.add(p1, BorderLayout.CENTER);
        panelDer.revalidate();
        panelDer.repaint();*/
        
        
    }//GEN-LAST:event_btnpriMousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed

    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel14AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel14AncestorAdded

    }//GEN-LAST:event_jLabel14AncestorAdded

    private void btnconfigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconfigMousePressed
        resetColor(btnpri);
        resetColor(btnMisSolicitudes);
        resetColor(btnevaluar);
        resetColor(btnconfig);
        setColor(btnconfig);
       /* Sesion.cerrarSesion();
        IniciarSesion iniciarSesion = new IniciarSesion();
        iniciarSesion.setVisible(true);
        iniciarSesion.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        this.dispose();*/
        // Abrir sección
        Configuracion p1 = new Configuracion();
        p1.setSize(530, 540);
        p1.setLocation(0,0);

        panelDer.removeAll();
        panelDer.add(p1, BorderLayout.CENTER);
        panelDer.revalidate();
        panelDer.repaint();
    }//GEN-LAST:event_btnconfigMousePressed

    private void btnconfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconfigMouseExited

    }//GEN-LAST:event_btnconfigMouseExited

    private void btnconfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconfigMouseEntered

    }//GEN-LAST:event_btnconfigMouseEntered

    private void btnevaluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnevaluarMousePressed
        resetColor(btnpri);
        resetColor(btnMisSolicitudes);
        resetColor(btnevaluar);
        resetColor(btnconfig);
        setColor(btnevaluar);
        resetColor(btnconfig);
        // Abrir sección
        Configuracion p1 = new Configuracion();
        p1.setSize(530, 540);
        p1.setLocation(0,0);

        panelDer.removeAll();
        panelDer.add(p1, BorderLayout.CENTER);
        panelDer.revalidate();
        panelDer.repaint();
    }//GEN-LAST:event_btnevaluarMousePressed

    private void btnevaluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnevaluarMouseExited

    }//GEN-LAST:event_btnevaluarMouseExited

    private void btnevaluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnevaluarMouseEntered

    }//GEN-LAST:event_btnevaluarMouseEntered

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        
    }//GEN-LAST:event_jLabel12MousePressed

    private void btncerrar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrar1MousePressed
        // TODO add your handling code here:
        resetColor(btnpri);
        resetColor(btnevaluar);
        resetColor(btnMisSolicitudes);
        //resetColor(btnturnos);
        resetColor(btnconfig);
        setColor(btncerrar1);
       /* Sesion.cerrarSesion();
        IniciarSesion iniciarSesion = new IniciarSesion();
        iniciarSesion.setVisible(true);
        iniciarSesion.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        this.dispose();*/
        // Abrir sección
        Configuracion p1 = new Configuracion();
        p1.setSize(530, 540);
        p1.setLocation(0,0);

        panelDer.removeAll();
        panelDer.add(p1, BorderLayout.CENTER);
        panelDer.revalidate();
        panelDer.repaint();
    }//GEN-LAST:event_btncerrar1MousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(183,52,66));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(175,0,0));
    }
    /**
     * @param args the command line arguments
     */
    
    

    public static javax.swing.JPanel content;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnMisSolicitudes;
    private javax.swing.JPanel btncerrar1;
    private javax.swing.JPanel btnconfig;
    private javax.swing.JPanel btnevaluar;
    private javax.swing.JPanel btnpri;
    private javax.swing.JLabel iconpri;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JLabel txtcerrar;
    private javax.swing.JLabel txtpri;
    // End of variables declaration//GEN-END:variables
}
