package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Conexion.*;
import Dao.*;
import Tabla.*;
import Vo.*;
import java.util.ArrayList;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class IniciarSesion extends javax.swing.JFrame {

    Conectar conexion = new Conectar();
 
    public IniciarSesion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelpantalla = new javax.swing.JPanel();
        panelder = new javax.swing.JPanel();
        fotochicos = new javax.swing.JLabel();
        panelizq = new javax.swing.JPanel();
        txtcontrasenia = new javax.swing.JLabel();
        txtsesion = new javax.swing.JLabel();
        txtusuario1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();
        btnderechos = new javax.swing.JPanel();
        txtderechos = new javax.swing.JLabel();
        btnInfo = new javax.swing.JPanel();
        txtinfo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtsalir = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 540));
        setUndecorated(true);
        setResizable(false);

        panelpantalla.setBackground(new java.awt.Color(255, 255, 255));
        panelpantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelder.setBackground(new java.awt.Color(255, 255, 255));

        fotochicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chicos.png"))); // NOI18N
        fotochicos.setText("jLabel2");

        javax.swing.GroupLayout panelderLayout = new javax.swing.GroupLayout(panelder);
        panelder.setLayout(panelderLayout);
        panelderLayout.setHorizontalGroup(
            panelderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotochicos, javax.swing.GroupLayout.PREFERRED_SIZE, 363, Short.MAX_VALUE)
        );
        panelderLayout.setVerticalGroup(
            panelderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotochicos, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
        );

        panelpantalla.add(panelder, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 360, 540));

        panelizq.setBackground(new java.awt.Color(153, 0, 0));

        txtcontrasenia.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtcontrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtcontrasenia.setText("Contraseña");

        txtsesion.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txtsesion.setForeground(new java.awt.Color(255, 255, 255));
        txtsesion.setText("INICIAR SESIÓN");

        txtusuario1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtusuario1.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario1.setText("Usuario");

        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("su contraseña");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 204));
        user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        user.setText("Ingrese su nombre de usuario");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtingresar.setBackground(new java.awt.Color(255, 255, 255));
        txtingresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresar.setText("Ingresar");
        txtingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtingresarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnIngresarLayout = new javax.swing.GroupLayout(btnIngresar);
        btnIngresar.setLayout(btnIngresarLayout);
        btnIngresarLayout.setHorizontalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtingresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        btnIngresarLayout.setVerticalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnderechos.setBackground(new java.awt.Color(255, 255, 255));
        btnderechos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtderechos.setBackground(new java.awt.Color(255, 255, 255));
        txtderechos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtderechos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtderechos.setText("Derechos");
        txtderechos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtderechos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtderechosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnderechosLayout = new javax.swing.GroupLayout(btnderechos);
        btnderechos.setLayout(btnderechosLayout);
        btnderechosLayout.setHorizontalGroup(
            btnderechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtderechos, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
        btnderechosLayout.setVerticalGroup(
            btnderechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtderechos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtinfo.setBackground(new java.awt.Color(255, 255, 255));
        txtinfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtinfo.setText("Información");
        txtinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtinfoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnInfoLayout = new javax.swing.GroupLayout(btnInfo);
        btnInfo.setLayout(btnInfoLayout);
        btnInfoLayout.setHorizontalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        btnInfoLayout.setVerticalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        txtsalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtsalir.setForeground(new java.awt.Color(255, 255, 255));
        txtsalir.setText("X");
        txtsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsalirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtsalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Todavía no te registraste?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelizqLayout = new javax.swing.GroupLayout(panelizq);
        panelizq.setLayout(panelizqLayout);
        panelizqLayout.setHorizontalGroup(
            panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelizqLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnderechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(panelizqLayout.createSequentialGroup()
                .addGroup(panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelizqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelizqLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelizqLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5))
                    .addGroup(panelizqLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontrasenia)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusuario1))))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelizqLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtsesion)
                .addGap(104, 104, 104))
        );
        panelizqLayout.setVerticalGroup(
            panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelizqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txtsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtusuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnderechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        panelpantalla.add(panelizq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelpantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelpantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void txtsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalirMouseClicked

    private void txtsalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_txtsalirMousePressed

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed
        
        if (user.getText().equals("Ingrese su nombre de usuario")) {
            user.setText("");
            user.setForeground(Color.black);
        }

        if (String.valueOf(password.getPassword()).isEmpty()) {
            password.setText("*******");
            password.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_userMousePressed

    private void txtingresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMousePressed
        String nombre = user.getText();
        String contraseña = new String(password.getPassword());
        boolean isValid = conexion.validarUsuario(nombre, contraseña);
        if (isValid) {
            Conexion conn = new Conexion();
            conn.crearUsuario(nombre, contraseña);
            Usuario usuarioActivo = Sesion.getUsuarioActual();
            
            System.out.println(usuarioActivo.getRol());
            
            if (usuarioActivo.getRol().equals("Estudiante")){
                PrincipalEstudiante principalEs = new PrincipalEstudiante();
                principalEs.setVisible(true);
                principalEs.setLocationRelativeTo(null);
            }else if (usuarioActivo.getRol().equals("Empleado")){
                PrincipalEmpleado principalEm = new PrincipalEmpleado();
                principalEm.setVisible(true);
                principalEm.setLocationRelativeTo(null);
            }else{
                PrincipalSecretario principalSe = new PrincipalSecretario();
                principalSe.setVisible(true);
                principalSe.setLocationRelativeTo(null);
            }
            
            this.setVisible(false);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "¡Falló el inicio de sesión! \nDatos incorrectos", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtingresarMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        
        if (user.getText().isEmpty()) {
            user.setText("Ingrese su nombre de usuario");
            user.setForeground(Color.gray);
        }

        if (String.valueOf(password.getPassword()).equals("su contraseña")) {
            password.setText("");
            password.setForeground(Color.black);
        }
    }//GEN-LAST:event_passwordMousePressed

    private void txtderechosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtderechosMousePressed
        javax.swing.JOptionPane.showMessageDialog(this, "SISTEMAS DE INFORMACIÓN II - GRUPO N° 2 \n DIAZ GERALDINE, BAIGORRIA MIRIAN, SERRANO NICOLAS y AUTALAN ANA.", "DERECHOS", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_txtderechosMousePressed

    private void txtinfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtinfoMousePressed
        javax.swing.JOptionPane.showMessageDialog(this, "Universidad Nacional de Santiago del Estero. \nUna Universidad pluralista, inclusiva, reformista y autónoma, con presencia territorial e integración con la sociedad.", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtinfoMousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        FormularioRegistro formRegistro = new FormularioRegistro();
        formRegistro.setVisible(true);
        formRegistro.setLocationRelativeTo(null);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel5MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnInfo;
    private javax.swing.JPanel btnIngresar;
    private javax.swing.JPanel btnderechos;
    private javax.swing.JLabel fotochicos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelder;
    private javax.swing.JPanel panelizq;
    private javax.swing.JPanel panelpantalla;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel txtcontrasenia;
    private javax.swing.JLabel txtderechos;
    private javax.swing.JLabel txtinfo;
    private javax.swing.JLabel txtingresar;
    private javax.swing.JLabel txtsalir;
    private javax.swing.JLabel txtsesion;
    private javax.swing.JLabel txtusuario1;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
