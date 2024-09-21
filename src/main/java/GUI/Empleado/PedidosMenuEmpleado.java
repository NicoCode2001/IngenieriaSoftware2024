/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Empleado;

import GUI.Empleado.NuevoPedidoInsumo;
import java.sql.Statement;
import javax.swing.JFrame;
import Conexion.*;
import DAO.*;
import Tabla.*;
import VO.*;
import GUI.Empleado.*;
import GUI.Estudiante.*;
import GUI.Secretario.*;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Anita
 */
public class PedidosMenuEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form PedidosMenuEmpleado
     */
    public PedidosMenuEmpleado() {
        initComponents();
        mostrar("pedidoinsumos",jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        RealizarNuevoPedido = new javax.swing.JButton();
        HistorialPedidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(530, 542));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mis Solicitudes");

        RealizarNuevoPedido.setText("Realizar nuevo pedido");
        RealizarNuevoPedido.setBorder(null);
        RealizarNuevoPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RealizarNuevoPedidoMouseClicked(evt);
            }
        });

        HistorialPedidos.setText("Historial Pedidos");
        HistorialPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialPedidosActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(153, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(160, 0, 0));
        jTable1.setOpaque(false);
        jTable1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(jTable1);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RealizarNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(HistorialPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HistorialPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RealizarNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HistorialPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HistorialPedidosActionPerformed

    private void RealizarNuevoPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RealizarNuevoPedidoMouseClicked
        // TODO add your handling code here:
        NuevoPedidoInsumo p1 = new NuevoPedidoInsumo();
       
        p1.setVisible(true);
        
        //this.setVisible(false);
        JFrame menupedido = new JFrame();
        menupedido.add(p1);
        menupedido.setSize(768, 677);
        //menupedido.setLocation(0,0);
        menupedido.setVisible(true);
        
        /*JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);        
        if (frame != null) {
                frame.setVisible(false);
                frame.dispose();
        }*/
    }//GEN-LAST:event_RealizarNuevoPedidoMouseClicked

    public void mostrar(String tabla, JTable visor){
        /*
        String sql = "select * from " + tabla;
        Statement st;
        //Conexion a la base de datos
       
        Conexion con = new Conexion();
        Connection conexion = con.conectar();
        
        //Defino tabla
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Fecha");
        model.addColumn("Descripción");
        model.addColumn("Estado");
        JTableHeader header = jTable1.getTableHeader();
        header.setBackground(Color.decode("#990000"));
        header.setForeground(Color.white);
        jTable1.setOpaque(true);
        jTable1.setFillsViewportHeight(true);
        jTable1.setBackground(Color.decode("#990000"));
        visor.setModel(model);
        
        //Defino datos en la tabla
        String [] dato = new String[3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(3);
                dato[1] = rs.getString(4);
                dato[2] = rs.getString(5);
                model.addRow(dato);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    */}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HistorialPedidos;
    public javax.swing.JButton RealizarNuevoPedido;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
