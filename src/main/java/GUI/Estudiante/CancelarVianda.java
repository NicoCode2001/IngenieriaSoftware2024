/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Estudiante;

import GUI.Estudiante.PrincipalEstudiante;
import conexion.Conexion;
import javax.swing.JOptionPane;
import logica.Sesion;
import logica.Usuario;
import logica.reservaVianda;


public class CancelarVianda extends javax.swing.JFrame {

   
    public CancelarVianda() {
        initComponents();
        Usuario usuarioActivo = Sesion.getUsuarioActual();
        Conexion conn = new Conexion();
        reservaVianda reser=conn.crearReserva(usuarioActivo.getUsername());
        menuDinamico.setText(reser.getTipoMenu());
        platoDinamico.setText(reser.getPlato());
        guarnicionDinamico.setText(reser.getGuarnicion());
        postreDinamico.setText(reser.getPostre());
       
        
    }

     String mensajeCancelar = "¿Estás seguro que quieres cancelar?\n\n                  Sí        No";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        fechaReserva = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        platoDia = new javax.swing.JLabel();
        menuDinamico = new javax.swing.JLabel();
        guarnicionDia = new javax.swing.JLabel();
        guarnicionDinamico = new javax.swing.JLabel();
        postreDia = new javax.swing.JLabel();
        postreDinamico = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        platoDinamico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        cancelarReserva = new javax.swing.JButton();
        txtatras = new javax.swing.JLabel();
        iconatras = new javax.swing.JLabel();

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Menú del día");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Plato");

        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 540));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Reserva del día");

        fechaReserva.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        fechaReserva.setForeground(new java.awt.Color(255, 255, 255));
        fechaReserva.setText("04/07/2024");

        platoDia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        platoDia.setForeground(new java.awt.Color(255, 255, 255));
        platoDia.setText("Plato");

        menuDinamico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuDinamico.setForeground(new java.awt.Color(255, 255, 255));
        menuDinamico.setText("Clasico");

        guarnicionDia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guarnicionDia.setForeground(new java.awt.Color(255, 255, 255));
        guarnicionDia.setText("Guarnición");

        guarnicionDinamico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guarnicionDinamico.setForeground(new java.awt.Color(255, 255, 255));
        guarnicionDinamico.setText("Ensalada");

        postreDia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        postreDia.setForeground(new java.awt.Color(255, 255, 255));
        postreDia.setText("Postre");

        postreDinamico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        postreDinamico.setForeground(new java.awt.Color(255, 255, 255));
        postreDinamico.setText("Fruta");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Menú");

        platoDinamico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        platoDinamico.setForeground(new java.awt.Color(255, 255, 255));
        platoDinamico.setText("Tortilla de papa");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reserva.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        cancelarReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarReserva.setForeground(new java.awt.Color(153, 0, 0));
        cancelarReserva.setText("Cancelar");
        cancelarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarReservaMousePressed(evt);
            }
        });
        cancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarReservaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guarnicionDia)
                            .addComponent(postreDia)
                            .addComponent(platoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(platoDinamico)
                            .addComponent(menuDinamico)
                            .addComponent(guarnicionDinamico)
                            .addComponent(postreDinamico)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel19)
                        .addGap(55, 55, 55)
                        .addComponent(fechaReserva)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(cancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconatras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtatras)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtatras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaReserva)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(menuDinamico))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(platoDia)
                                    .addComponent(platoDinamico))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(guarnicionDia)
                                    .addComponent(guarnicionDinamico))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(postreDia)
                                    .addComponent(postreDinamico))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(cancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(iconatras)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarReservaActionPerformed
       
    }//GEN-LAST:event_cancelarReservaActionPerformed

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

    private void cancelarReservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarReservaMousePressed
         Usuario usuarioActivo = Sesion.getUsuarioActual();
         // Mostrar el mensaje y obtener la respuesta del usuario
                int respuesta = JOptionPane.showConfirmDialog(null, mensajeCancelar, "Alerta de Cancelación", JOptionPane.YES_NO_OPTION);
             // Procesar la respuesta del usuario
                if (respuesta == JOptionPane.YES_OPTION) {
                    // Realizar la acción de reserva aquí
                    Conexion conn = new Conexion();
                    conn.cancelarReserva(usuarioActivo.getUsername());
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Reserva Cancelada!","", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    PrincipalEstudiante principalE = new PrincipalEstudiante();
                    principalE.setVisible(true);
                    principalE.setLocationRelativeTo(null);
                    // Ocultar el JFrame actual
                    this.setVisible(false);
                    // Opcional: Cerrar el JFrame actual
                    this.dispose();
                    
                    
                    
                }
                 
    }//GEN-LAST:event_cancelarReservaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarReserva;
    private javax.swing.JLabel fechaReserva;
    private javax.swing.JLabel guarnicionDia;
    private javax.swing.JLabel guarnicionDinamico;
    private javax.swing.JLabel iconatras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JLabel menuDinamico;
    private javax.swing.JLabel platoDia;
    private javax.swing.JLabel platoDinamico;
    private javax.swing.JLabel postreDia;
    private javax.swing.JLabel postreDinamico;
    private javax.swing.JLabel txtatras;
    // End of variables declaration//GEN-END:variables
}
