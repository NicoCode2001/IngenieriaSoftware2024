/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Empleado;
import Conexion.*;
import DAO.*;
import Tabla.*;
import VO.*;
import GUI.Empleado.*;
import GUI.Estudiante.*;
import GUI.Secretario.*;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Anita
 */
public class Viandas extends javax.swing.JPanel {

    /**
     * Creates new form NuevoPedidoInsumo
     */
    public Viandas() {
        initComponents();
        //tabla(TablaProductos);
    }
    
     public String obtenerFecha(){
         // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Definir el formato deseado
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        // Dar formato a la fecha actual
        String fechaFormateada = fechaActual.format(formateador);
        
        return fechaFormateada;
    }
   /* 
    DefaultTableModel model = new DefaultTableModel();
    
    public void tabla(JTable visor){

        model.addColumn("Productos");
        model.addColumn("Cantidad");
        
        JTableHeader header = TablaProductos.getTableHeader();
        header.setBackground(Color.decode("#990000"));
        header.setForeground(Color.white);
        TablaProductos.setOpaque(true);
        TablaProductos.setFillsViewportHeight(true);
        TablaProductos.setBackground(Color.decode("#990000"));
        visor.setModel(model);
    }
    
    public void agregar(){
        model.addRow( new Object[]{
        CampoNombreProducto.getText(), txtcantu.getText()
        });
    }
    
    public void eliminar(){
        int fila = TablaProductos.getSelectedRow();
        model.removeRow(fila);
    }*/
    
    public void agregarPedidoBD(){
        /*
        //se obtienen los datos de los campos ingresados
        String fecha = txtfecha.getText();
        String dni = txtdni.getText();
        String area = txtarea.getText();
        
        try{
            if(fecha.equals("") ||dni.equals("") ||area.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            }else{
                String sql = "insert into pedidoinsumos(dni,fecha,area,estado) values('"+ dni + "','" + fecha + "','" + area +"', 'En evaluación')";
                System.out.println(sql);
                
                //Abro conexión con la base de datos
                try{
                Conexion con = new Conexion();
                Connection conexion = con.conectar();
                Statement st;
                st = conexion.createStatement();
                st.executeUpdate(sql);
                
                System.out.println("Registro creado");
                
                
                //Añado a la base de datos los productos de la lista que figura en tabla
                
                for (int i = 0; i < TablaProductos.getRowCount(); i++) {
                    
                    //Obtengo la clave primaria del pedido creado en la Bd
                    String sqlCod = "Select codpedido from pedidoinsumos p where p.fecha = ('"+ fecha + "')";
                    ResultSet rs = st.executeQuery(sqlCod);
                    rs.next();
                    //rs.getString(1);
                    System.out.println(rs.getString(1));
                    
                    //System.out.println("Registro número: "+i);
                    System.out.println("Producto: "+TablaProductos.getValueAt(i, 0));
                    System.out.println("Cantidad: "+TablaProductos.getValueAt(i, 1));
                    String sql1 = "insert into insumos(codpedido, cantidad,nombreinsumo) values("+ rs.getString(1) + ",'" + TablaProductos.getValueAt(i, 0) + "','" + TablaProductos.getValueAt(i, 1) +"')";
                    st.executeUpdate(sql1);
                                    
                }
                }catch(SQLException e){
                    System.out.println(e.toString());
                }
                
                
                JOptionPane.showMessageDialog(null, "Nuevo Pedido Registrado");
                
                
                
            }
        }catch(Exception e){
        }
        
   */ }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CantUnidades = new javax.swing.JLabel();
        AniadirMenu = new javax.swing.JButton();
        PublicarMenu = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        SelectMenuDelDia = new javax.swing.JComboBox<>();
        CantUnidades1 = new javax.swing.JLabel();
        CantUnidades2 = new javax.swing.JLabel();
        CantUnidades3 = new javax.swing.JLabel();
        CantUnidades4 = new javax.swing.JLabel();
        CantUnidades5 = new javax.swing.JLabel();
        CantUnidades6 = new javax.swing.JLabel();
        CantUnidades7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        SelectTipoMenu = new javax.swing.JComboBox<>();
        AniadirPlatoPcipal = new javax.swing.JTextField();
        AniadirGuarnicion = new javax.swing.JTextField();
        AniadirPostre = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(768, 677));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Viandas");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargar Vianda del dia");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccionar Menu:");

        CantUnidades.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades.setText("Tipo de Menu");
        CantUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CantUnidadesMousePressed(evt);
            }
        });

        AniadirMenu.setText("Añadir Nuevo Menu");
        AniadirMenu.setBorderPainted(false);
        AniadirMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AniadirMenuMousePressed(evt);
            }
        });
        AniadirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AniadirMenuActionPerformed(evt);
            }
        });

        PublicarMenu.setText("Publicar Menu");
        PublicarMenu.setBorderPainted(false);
        PublicarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicarMenuActionPerformed(evt);
            }
        });

        btnvolver.setBackground(new java.awt.Color(153, 0, 0));
        btnvolver.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnvolver.setForeground(new java.awt.Color(255, 255, 255));
        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha-hacia-atras.png"))); // NOI18N
        btnvolver.setText("Volver atrás");
        btnvolver.setBorderPainted(false);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        SelectMenuDelDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CantUnidades1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades1.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades1.setText("Plato principal");

        CantUnidades2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades2.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades2.setText("Guarnicion");

        CantUnidades3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades3.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades3.setText("Postre");

        CantUnidades4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades4.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades4.setText("Tipo de Menu");

        CantUnidades5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades5.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades5.setText("Plato principal");

        CantUnidades6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades6.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades6.setText("Guarnicion");

        CantUnidades7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades7.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades7.setText("Postre");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cargar Nueva Vianda");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        SelectTipoMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasico", "Saludable" }));
        SelectTipoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectTipoMenuActionPerformed(evt);
            }
        });

        AniadirGuarnicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AniadirGuarnicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(AniadirMenu)
                                        .addComponent(PublicarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(CantUnidades4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(SelectTipoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(46, 46, 46)
                                            .addComponent(CantUnidades5)
                                            .addGap(105, 105, 105)
                                            .addComponent(CantUnidades6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CantUnidades7)
                                            .addGap(110, 110, 110))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(AniadirPlatoPcipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(AniadirGuarnicion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(AniadirPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnvolver)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(CantUnidades))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectMenuDelDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CantUnidades1)
                        .addGap(92, 92, 92)
                        .addComponent(CantUnidades2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CantUnidades3)))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SelectMenuDelDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantUnidades)
                    .addComponent(CantUnidades1)
                    .addComponent(CantUnidades2)
                    .addComponent(CantUnidades3))
                .addGap(59, 59, 59)
                .addComponent(PublicarMenu)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CantUnidades6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CantUnidades7)
                        .addComponent(CantUnidades5)
                        .addComponent(CantUnidades4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectTipoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AniadirPlatoPcipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AniadirGuarnicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AniadirPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(AniadirMenu)
                .addGap(67, 67, 67)
                .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void PublicarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicarMenuActionPerformed
        // TODO add your handling code here:
        //eliminar();
    }//GEN-LAST:event_PublicarMenuActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverActionPerformed

    private void AniadirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AniadirMenuActionPerformed
        // TODO add your handling code here:
        //agregar();
    }//GEN-LAST:event_AniadirMenuActionPerformed

    private void SelectTipoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectTipoMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectTipoMenuActionPerformed

    private void CantUnidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CantUnidadesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantUnidadesMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void AniadirGuarnicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AniadirGuarnicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AniadirGuarnicionActionPerformed

    private void AniadirMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AniadirMenuMousePressed
        // TODO add your handling code here:
        ViandaDAO ViandaDao = new ViandaDAO();
        ViandaVO ViandaVo = new ViandaVO();
        ViandaVo.setCodVianda(ViandaDao.ObtenerIDUltimaVianda()+1);
        String seleccionTipoMenu = (String) SelectTipoMenu.getSelectedItem();
        ViandaVo.setTipoMenu(seleccionTipoMenu);
        ViandaVo.setPlato(AniadirPlatoPcipal.getText());
        ViandaVo.setGuarnicion(AniadirGuarnicion.getText());
        ViandaVo.setPostre(AniadirPostre.getText());
        ViandaVo.setFecha(obtenerFecha());
        ViandaDao.Agregar_ViandaVO(ViandaVo);
        
        //ANIADIR UN CUADRO DE DIALOGO ACA
    }//GEN-LAST:event_AniadirMenuMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AniadirGuarnicion;
    public javax.swing.JButton AniadirMenu;
    private javax.swing.JTextField AniadirPlatoPcipal;
    private javax.swing.JTextField AniadirPostre;
    private javax.swing.JLabel CantUnidades;
    private javax.swing.JLabel CantUnidades1;
    private javax.swing.JLabel CantUnidades2;
    private javax.swing.JLabel CantUnidades3;
    private javax.swing.JLabel CantUnidades4;
    private javax.swing.JLabel CantUnidades5;
    private javax.swing.JLabel CantUnidades6;
    private javax.swing.JLabel CantUnidades7;
    public javax.swing.JButton PublicarMenu;
    private javax.swing.JComboBox<String> SelectMenuDelDia;
    private javax.swing.JComboBox<String> SelectTipoMenu;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    
}
