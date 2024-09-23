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
        CantUnidades = new javax.swing.JLabel();
        AniadirMenu = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        CantUnidades1 = new javax.swing.JLabel();
        CantUnidades2 = new javax.swing.JLabel();
        CantUnidades3 = new javax.swing.JLabel();
        AniadirPlatoPcipalCl = new javax.swing.JTextField();
        AniadirGuarnicionCl = new javax.swing.JTextField();
        AniadirPostreCl = new javax.swing.JTextField();
        CantUnidades8 = new javax.swing.JLabel();
        CantUnidades9 = new javax.swing.JLabel();
        AniadirCantidadCl = new javax.swing.JTextField();
        AniadirPlatoPcipal1 = new javax.swing.JTextField();
        CantUnidades10 = new javax.swing.JLabel();
        AniadirGuarnicion1 = new javax.swing.JTextField();
        CantUnidades11 = new javax.swing.JLabel();
        AniadirPostre2 = new javax.swing.JTextField();
        CantUnidades12 = new javax.swing.JLabel();
        CantUnidades13 = new javax.swing.JLabel();
        AniadirPostre3 = new javax.swing.JTextField();
        AniadirMenu1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(805, 540));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Viandas");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargar Vianda del dia");

        CantUnidades.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CantUnidades.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades.setText("Tipo de Menu: Clasico");
        CantUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CantUnidadesMousePressed(evt);
            }
        });

        AniadirMenu.setText("Publicar Menu Clasico");
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

        CantUnidades1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades1.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades1.setText("Plato principal");

        CantUnidades2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades2.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades2.setText("Guarnicion");

        CantUnidades3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades3.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades3.setText("Postre");

        AniadirGuarnicionCl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AniadirGuarnicionClMousePressed(evt);
            }
        });
        AniadirGuarnicionCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AniadirGuarnicionClActionPerformed(evt);
            }
        });

        CantUnidades8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CantUnidades8.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades8.setText("Tipo de Menu: Saludable");
        CantUnidades8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CantUnidades8MousePressed(evt);
            }
        });

        CantUnidades9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades9.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades9.setText("Cantidad:");

        CantUnidades10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades10.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades10.setText("Plato principal");

        AniadirGuarnicion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AniadirGuarnicion1ActionPerformed(evt);
            }
        });

        CantUnidades11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades11.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades11.setText("Guarnicion");

        CantUnidades12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades12.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades12.setText("Postre");

        CantUnidades13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CantUnidades13.setForeground(new java.awt.Color(255, 255, 255));
        CantUnidades13.setText("Cantidad:");

        AniadirMenu1.setText("Publicar Menu Saludable");
        AniadirMenu1.setBorderPainted(false);
        AniadirMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AniadirMenu1MousePressed(evt);
            }
        });
        AniadirMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AniadirMenu1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(CantUnidades1)
                .addGap(158, 158, 158)
                .addComponent(CantUnidades2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CantUnidades3)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(289, 289, 289))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(514, 514, 514)
                                .addComponent(btnvolver))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AniadirMenu)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CantUnidades9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AniadirCantidadCl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(550, 550, 550)
                                    .addComponent(CantUnidades13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AniadirPostre3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CantUnidades12)
                                    .addGap(84, 84, 84))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(CantUnidades10)
                                            .addGap(158, 158, 158)
                                            .addComponent(CantUnidades11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(AniadirPlatoPcipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(AniadirGuarnicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(AniadirPostre2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(CantUnidades8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CantUnidades)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AniadirPlatoPcipalCl, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AniadirGuarnicionCl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AniadirPostreCl, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(AniadirMenu1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addComponent(CantUnidades)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantUnidades1)
                    .addComponent(CantUnidades3)
                    .addComponent(CantUnidades2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AniadirPlatoPcipalCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AniadirGuarnicionCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AniadirPostreCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantUnidades9)
                    .addComponent(AniadirCantidadCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(AniadirMenu)
                .addGap(39, 39, 39)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CantUnidades8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantUnidades10)
                    .addComponent(CantUnidades12)
                    .addComponent(CantUnidades11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AniadirPlatoPcipal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AniadirGuarnicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AniadirPostre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantUnidades13)
                    .addComponent(AniadirPostre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(AniadirMenu1)
                .addGap(40, 40, 40)
                .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverActionPerformed

    private void AniadirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AniadirMenuActionPerformed
        // TODO add your handling code here:
        //agregar();
    }//GEN-LAST:event_AniadirMenuActionPerformed

    private void CantUnidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CantUnidadesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantUnidadesMousePressed

    private void AniadirGuarnicionClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AniadirGuarnicionClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AniadirGuarnicionClActionPerformed

    private void AniadirMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AniadirMenuMousePressed
        // TODO add your handling code here:
        ViandaDAO ViandaDao = new ViandaDAO();
        ViandaVO ViandaVo = new ViandaVO();
        ViandaVo.setCodVianda(ViandaDao.ObtenerIDUltimaVianda()+1);
        ViandaVo.setTipoMenu("Clasico");
        ViandaVo.setPlato(AniadirPlatoPcipalCl.getText());
        ViandaVo.setGuarnicion(AniadirGuarnicionCl.getText());
        ViandaVo.setPostre(AniadirPostreCl.getText());
        ViandaVo.setCantidad(int(AniadirCantidadCl.getText()));
        ViandaVo.setFecha(obtenerFecha());
        ViandaDao.Agregar_ViandaVO(ViandaVo);
        
        //ANIADIR UN CUADRO DE DIALOGO ACA
    }//GEN-LAST:event_AniadirMenuMousePressed

    private void CantUnidades8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CantUnidades8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantUnidades8MousePressed

    private void AniadirGuarnicion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AniadirGuarnicion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AniadirGuarnicion1ActionPerformed

    private void AniadirMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AniadirMenu1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AniadirMenu1MousePressed

    private void AniadirMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AniadirMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AniadirMenu1ActionPerformed

    private void AniadirGuarnicionClMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AniadirGuarnicionClMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AniadirGuarnicionClMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AniadirCantidadCl;
    private javax.swing.JTextField AniadirGuarnicion1;
    private javax.swing.JTextField AniadirGuarnicionCl;
    public javax.swing.JButton AniadirMenu;
    public javax.swing.JButton AniadirMenu1;
    private javax.swing.JTextField AniadirPlatoPcipal1;
    private javax.swing.JTextField AniadirPlatoPcipalCl;
    private javax.swing.JTextField AniadirPostre2;
    private javax.swing.JTextField AniadirPostre3;
    private javax.swing.JTextField AniadirPostreCl;
    private javax.swing.JLabel CantUnidades;
    private javax.swing.JLabel CantUnidades1;
    private javax.swing.JLabel CantUnidades10;
    private javax.swing.JLabel CantUnidades11;
    private javax.swing.JLabel CantUnidades12;
    private javax.swing.JLabel CantUnidades13;
    private javax.swing.JLabel CantUnidades2;
    private javax.swing.JLabel CantUnidades3;
    private javax.swing.JLabel CantUnidades8;
    private javax.swing.JLabel CantUnidades9;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    
}
