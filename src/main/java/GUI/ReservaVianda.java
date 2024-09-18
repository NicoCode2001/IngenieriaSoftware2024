/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import conexion.Conexion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Sesion;
import logica.Usuario;

public class ReservaVianda extends javax.swing.JFrame {
    
    public ReservaVianda() {
   
        initComponents();
    }
     String menuSeleccionado="Ninguno";
     String mensajeReserva = "¿Estás seguro que quieres reservar?\n\n                  Sí        No";
    
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel23 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        familyMenu = new javax.swing.ButtonGroup();
        barra = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        opClasico = new javax.swing.JRadioButton();
        opSaludable = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        fechaMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        platoCla = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        guarnicionCla = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        postreCla = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        postreSa = new javax.swing.JLabel();
        platoSa = new javax.swing.JLabel();
        guarnicionSa = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        atras = new javax.swing.JLabel();
        iconoAtras = new javax.swing.JLabel();
        reservar = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Plato");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barra.setBackground(new java.awt.Color(153, 0, 0));
        barra.setPreferredSize(new java.awt.Dimension(800, 540));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Saludable");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/restaurante.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        opClasico.setBackground(new java.awt.Color(153, 0, 0));
        familyMenu.add(opClasico);
        opClasico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opClasico.setForeground(new java.awt.Color(255, 255, 255));
        opClasico.setText("Clásico");
        opClasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                opClasicoMousePressed(evt);
            }
        });
        opClasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opClasicoActionPerformed(evt);
            }
        });

        opSaludable.setBackground(new java.awt.Color(153, 0, 0));
        familyMenu.add(opSaludable);
        opSaludable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opSaludable.setForeground(new java.awt.Color(255, 255, 255));
        opSaludable.setText("Saludable");
        opSaludable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSaludableActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Seleccione el menú");

        fechaMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fechaMenu.setForeground(new java.awt.Color(255, 255, 255));
        fechaMenu.setText("04/07/2024");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menuSaludable.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menuClasico.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Menú del día");

        platoCla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        platoCla.setForeground(new java.awt.Color(255, 255, 255));
        platoCla.setText("Tortilla de papa");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Clásico");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Postre");

        guarnicionCla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guarnicionCla.setForeground(new java.awt.Color(255, 255, 255));
        guarnicionCla.setText("Ensalada");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Plato");

        postreCla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        postreCla.setForeground(new java.awt.Color(255, 255, 255));
        postreCla.setText("Fruta");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Guarnición");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Plato");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Guarnición");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Postre");

        postreSa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        postreSa.setForeground(new java.awt.Color(255, 255, 255));
        postreSa.setText("Fruta");

        platoSa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        platoSa.setForeground(new java.awt.Color(255, 255, 255));
        platoSa.setText("Ensalada tibia");

        guarnicionSa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guarnicionSa.setForeground(new java.awt.Color(255, 255, 255));
        guarnicionSa.setText("-");

        atras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Volver atrás");
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atrasMousePressed(evt);
            }
        });

        iconoAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha-hacia-atras.png"))); // NOI18N
        iconoAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconoAtrasMousePressed(evt);
            }
        });

        reservar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reservar.setForeground(new java.awt.Color(153, 0, 0));
        reservar.setText("Reservar");
        reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reservarMousePressed(evt);
            }
        });
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(postreSa))
                .addGap(145, 145, 145))
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaMenu)
                    .addGroup(barraLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel18))
                    .addGroup(barraLayout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(postreCla))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(barraLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(barraLayout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(barraLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(platoCla)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(138, 138, 138)
                                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(guarnicionCla)))
                            .addGroup(barraLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(platoSa))
                                .addGap(152, 152, 152)
                                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(guarnicionSa)
                                    .addComponent(jLabel28)))
                            .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(barraLayout.createSequentialGroup()
                                    .addComponent(opClasico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(opSaludable)
                                    .addGap(121, 121, 121)
                                    .addComponent(reservar)
                                    .addGap(163, 163, 163)
                                    .addComponent(iconoAtras)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(atras)
                                    .addGap(6, 6, 6))))))
                .addGap(0, 80, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel20))
                    .addGroup(barraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(platoCla)
                            .addComponent(guarnicionCla)
                            .addComponent(postreCla)))
                    .addGroup(barraLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel21))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel15))
                    .addGroup(barraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(platoSa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(postreSa))
                    .addComponent(guarnicionSa, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opClasico)
                            .addComponent(opSaludable))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconoAtras)
                            .addComponent(reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        opClasico.getAccessibleContext().setAccessibleName("Saludable");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opSaludableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSaludableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opSaludableActionPerformed

    private void opClasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opClasicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opClasicoActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

    }//GEN-LAST:event_jLabel1MousePressed

    private void atrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMousePressed
        PrincipalEstudiante principalE = new PrincipalEstudiante();
        principalE.setVisible(true);
        principalE.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        // Opcional: Cerrar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_atrasMousePressed

    private void iconoAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoAtrasMousePressed
        PrincipalEstudiante principalE = new PrincipalEstudiante();
        principalE.setVisible(true);
        principalE.setLocationRelativeTo(null);
        // Ocultar el JFrame actual
        this.setVisible(false);
        // Opcional: Cerrar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_iconoAtrasMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MousePressed

    private void opClasicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opClasicoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_opClasicoMousePressed

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        // Crear botones personalizados con el texto deseado
        /*JButton botonSi = new JButton("Sí");
        JButton botonNo = new JButton("No");

        // Crear un array de botones
        Object[] opciones = {botonSi, botonNo};

        // Mostrar el diálogo de confirmación con botones personalizados
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea confirmar la operación?", "Confirmar operación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Procesar la respuesta del usuario
        if (respuesta == JOptionPane.YES_OPTION) {
            System.out.println("El usuario seleccionó Sí");
        } else if (respuesta == JOptionPane.NO_OPTION) {
            System.out.println("El usuario seleccionó No");
        } else {
            System.out.println("Se canceló la operación");
        }*/
    }//GEN-LAST:event_reservarActionPerformed

    private void reservarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservarMousePressed
         Usuario usuarioActivo = Sesion.getUsuarioActual();
        
            if (opClasico.isSelected()){
                menuSeleccionado = "Clasico";
            }else if (opSaludable.isSelected()){
                menuSeleccionado = "Saludable";
            }
            if(menuSeleccionado == "Clasico"){
                
                // Mostrar el mensaje y obtener la respuesta del usuario
                int respuesta = JOptionPane.showConfirmDialog(null, mensajeReserva, "Alerta de Reserva", JOptionPane.YES_NO_OPTION);
        
             // Procesar la respuesta del usuario
                if (respuesta == JOptionPane.YES_OPTION) {
                 // Realizar la acción de reserva aquí
                 Conexion conn = new Conexion();
                 conn.enviarReserva(menuSeleccionado, usuarioActivo.getUsername(),fechaMenu.getText(),platoCla.getText(),guarnicionCla.getText(),postreCla.getText());
                 javax.swing.JOptionPane.showMessageDialog(this, "¡Reserva Registrada!","Registro", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 PrincipalEstudiante principalE = new PrincipalEstudiante();
                    principalE.setVisible(true);
                    principalE.setLocationRelativeTo(null);
                    // Ocultar el JFrame actual
                    this.setVisible(false);
                    // Opcional: Cerrar el JFrame actual
                    this.dispose();
            }
        }else if(menuSeleccionado == "Saludable"){
                // Mostrar el mensaje y obtener la respuesta del usuario
                int respuesta = JOptionPane.showConfirmDialog(null, mensajeReserva, "Alerta de Reserva", JOptionPane.YES_NO_OPTION);
             // Procesar la respuesta del usuario
                if (respuesta == JOptionPane.YES_OPTION) {
                 // Realizar la acción de reserva aquí
                 Conexion conn = new Conexion();
                 conn.enviarReserva(menuSeleccionado, usuarioActivo.getUsername(),fechaMenu.getText() , platoSa.getText(),guarnicionSa.getText(),postreSa.getText());
                 javax.swing.JOptionPane.showMessageDialog(this, "¡Reserva Registrada!","Registro", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                PrincipalEstudiante principalE = new PrincipalEstudiante();
                    principalE.setVisible(true);
                    principalE.setLocationRelativeTo(null);
                    // Ocultar el JFrame actual
                    this.setVisible(false);
                    // Opcional: Cerrar el JFrame actual
                    this.dispose();}
                
            }else{
                 javax.swing.JOptionPane.showMessageDialog(this, 
            "¡Error al registrar reserva!\nPor favor, seleccione un menú (*).", 
            "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
          
    }//GEN-LAST:event_reservarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JPanel barra;
    private javax.swing.ButtonGroup familyMenu;
    private javax.swing.JLabel fechaMenu;
    private javax.swing.JLabel guarnicionCla;
    private javax.swing.JLabel guarnicionSa;
    private javax.swing.JLabel iconoAtras;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JRadioButton opClasico;
    private javax.swing.JRadioButton opSaludable;
    private javax.swing.JLabel platoCla;
    private javax.swing.JLabel platoSa;
    private javax.swing.JLabel postreCla;
    private javax.swing.JLabel postreSa;
    private javax.swing.JButton reservar;
    // End of variables declaration//GEN-END:variables
}
