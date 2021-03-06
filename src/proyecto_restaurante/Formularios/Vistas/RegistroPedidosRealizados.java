package proyecto_restaurante.Formularios.Vistas;

import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import proyecto_restaurante.Formularios.CargarPedido;  //ACA IMPORTO EL FORMULARIO DE PEDIDOS
import proyecto_restaurante.Formularios.FacturaC;

/**
 *
 * @author gabriel gonzalez
 */
public class RegistroPedidosRealizados extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    boolean opc = true;
    CargarPedido f = new CargarPedido();
    FacturaC fa = new FacturaC();

    public RegistroPedidosRealizados() {

        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        tabla();
        
         //ACA SE HACE TRANSPARENTE EL JTABLE.
        jTable2.setBackground(new Color(0, 0, 0, 0));
       ((DefaultTableCellRenderer) jTable2.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        jTable2.setGridColor(Color.DARK_GRAY);
        jTable2.setForeground(Color.DARK_GRAY);
        jScrollPane2.setBackground(new Color(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);
        jTable2.setOpaque(false);
        ((DefaultTableCellRenderer) jTable2.getDefaultRenderer(Object.class)).setOpaque(false);
       // jScrollPane2.getViewport().setOpaque(false);
        jTable2.setShowGrid(true);
        
        //ACA CAMBIO LA LETRA Y EL TAMAÑO Y TAMBIEN AGRANDO O ACHICO LAS COLUMNAS DE LA TABLA.
        jTable2.setFont(new Font("Tahoma",1,13));
        TableColumn TableColumn = jTable2.getColumnModel().getColumn(0);
        TableColumn.setPreferredWidth(20);
        TableColumn TableColumn1 = jTable2.getColumnModel().getColumn(1);
        TableColumn1.setPreferredWidth(150);
        TableColumn TableColumn2 = jTable2.getColumnModel().getColumn(2);
        TableColumn2.setPreferredWidth(50);
        TableColumn TableColumn3 = jTable2.getColumnModel().getColumn(3);
        TableColumn3.setPreferredWidth(100);
    }

    private void cerrar_ventana() {

        String botones[] = {"ACEPTAR", "CANCELAR"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿DESEA ELIMINAR EL REGISTRO?", null, 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se cancelo el cierre");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAgregarPedido = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnELIMINAR = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnIMPRIMIR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

<<<<<<< HEAD
        BtnAgregarPedido.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnAgregarPedido.setText("AGREGAR ");
        BtnAgregarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
=======
        BtnAgregarProducto.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnAgregarProducto.setText("AGREGAR ");
        BtnAgregarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> efd488a7c5f167312f236678078424b63a42a29f
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarPedidoActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(BtnAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 40));
=======
        getContentPane().add(BtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 40));
>>>>>>> efd488a7c5f167312f236678078424b63a42a29f

        BtnActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 160, 40));

        BtnELIMINAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnELIMINAR.setText("ELIMINAR");
        BtnELIMINAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnELIMINARActionPerformed(evt);
            }
        });
        getContentPane().add(BtnELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 150, 40));

        BtnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 140, 40));

        BtnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 150, 40));

        jTable2.setForeground(new java.awt.Color(204, 102, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 1010, 310));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("REGISTRO DE PEDIDOS REALIZADOS: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 40));

        btnIMPRIMIR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnIMPRIMIR.setText("IMPRIMIR");
        btnIMPRIMIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPRIMIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnIMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        Connection conn;
        conn = conexion.getConnection();
        int valor = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduzca su DNI "));

        String mostrar = "SELECT * FROM pedidos WHERE dni_empleado = " + valor + "";
        String[] Titulos = {"id_Pedido", "Producto", "Codigo", "Cantidad", "Precio", "Total", "Nombre_Mesero", "dni_empleado"};
        String[] Datos = new String[8];
        modeloTabla = new DefaultTableModel(null, Titulos);
        try {
            Statement sqls = conn.prepareStatement(mostrar);
            ResultSet rs = sqls.executeQuery(mostrar);
            while (rs.next()) {
                Datos[0] = rs.getString("id_Pedido");
                Datos[1] = rs.getString("Producto");
                Datos[2] = rs.getString("Codigo");
                Datos[3] = rs.getString("Cantidad");
                Datos[4] = rs.getString("Precio");
                Datos[5] = rs.getString("Total");
                Datos[6] = rs.getString("Nombre_Mesero");
                Datos[7] = rs.getString("dni_empleado");

                modeloTabla.addRow(Datos);
            }
            jTable2.setModel(modeloTabla);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnELIMINARActionPerformed

        cerrar_ventana();
        
        int row = jTable2.getSelectedRow();
        String id = jTable2.getValueAt(row, 0).toString();
        String result = null;
        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.

        String sql = "DELETE FROM pedidos WHERE id_Pedido=?";
        try {
            Connection cn = conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            int n = ps.executeUpdate();
            cn.close();
            ps.close();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Pedido Eliminado");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            result = e.getMessage();
        }
        tabla();
    }//GEN-LAST:event_BtnELIMINARActionPerformed

    private void BtnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarPedidoActionPerformed

        if (opc == true) {
            f.setVisible(true);
            opc = false;
        } else {
            f.dispose();
            opc = true;
            f.setVisible(true);
        }
        tabla();
    }//GEN-LAST:event_BtnAgregarPedidoActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        tabla();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void btnIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPRIMIRActionPerformed
         if (opc == true) {
            fa.setVisible(true);
            opc = false;
        } else {
            fa.dispose();
            opc = true;
            fa.setVisible(true);
        }
        tabla();
    }//GEN-LAST:event_btnIMPRIMIRActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPedidosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPedidosRealizados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregarPedido;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnELIMINAR;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void tabla() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM pedidos");
        modelotabla.setColumnIdentifiers(new Object[]{"id_Pedido", "Producto", "Codigo", "Cantidad", "Precio", "Total","Nombre_Mesero", "dni_empleado"});
        try {
            while (rs.next()) {
                modelotabla.addRow(new Object[]{rs.getString("id_Pedido"), rs.getString("Producto"), rs.getString("Codigo"), rs.getString("Cantidad"), rs.getString("Precio"), rs.getString("Total"), rs.getString("Nombre_Mesero"), rs.getString("dni_empleado")});
            }
            jTable2.setModel(modelotabla);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
