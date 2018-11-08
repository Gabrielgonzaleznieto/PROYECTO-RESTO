package proyecto_restaurante.Formularios;



import proyecto_restaurante.Formularios.*;
import proyecto_restaurante.Formularios.*;
import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author gabriel gonzalez
 */
public class ModificarClientes extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    boolean opc = true;
    Clientes f = new Clientes();
   
    
    public ModificarClientes() {

        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        Connection conn;
        conn = conexion.getConnection(); //Para tener conexión a la Base de Datos. 
            
        tabla(); //ACA LLAMO A LA TABLA PARA QUE ME REFLEJE LA INFORMACION ALMACENADA EN LA BASE DE DATOS-

        //ACA SE HACE TRANSPARENTE EL JTABLE.
        jTable1.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        jTable1.setGridColor(Color.DARK_GRAY);
        jTable1.setForeground(Color.DARK_GRAY);
        jScrollPane2.setBackground(new Color(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);
        jTable1.setOpaque(false);
        ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        // jScrollPane1.getViewport().setOpaque(false);
        jTable1.setShowGrid(true);

        //ACA CAMBIO LA LETRA Y EL TAMAÑO Y TAMBIEN AGRANDO O ACHICO LAS COLUMNAS DE LA TABLA.
        jTable1.setFont(new Font("Tahoma", 1, 13));
        TableColumn TableColumn = jTable1.getColumnModel().getColumn(0);
        TableColumn.setPreferredWidth(20);
        TableColumn TableColumn1 = jTable1.getColumnModel().getColumn(1);
        TableColumn1.setPreferredWidth(100);
        TableColumn TableColumn2 = jTable1.getColumnModel().getColumn(2);
        TableColumn2.setPreferredWidth(50);
        TableColumn TableColumn3 = jTable1.getColumnModel().getColumn(3);
        TableColumn3.setPreferredWidth(50);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnGUARDAR = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        btnMODIFICAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnACTUALIZAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCANCELAR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnSalir.setText("REGRESAR");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 180, 40));

        btnGUARDAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnGUARDAR.setText("GUARDAR");
        btnGUARDAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });
        getContentPane().add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 210, 40));

        txtDni.setBackground(new java.awt.Color(227, 227, 227));
        txtDni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 240, 40));

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 240, 40));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NOMBRE Y APELLIDO");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, 40));

        jPanel4.setBackground(new java.awt.Color(227, 227, 227));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("NUMERO DOCUMENTO");
        jPanel4.add(jLabel3);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 40));

        jPanel10.setBackground(new java.awt.Color(227, 227, 227));

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("E_MAIL");
        jPanel10.add(jLabel13);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 170, 40));

        jPanel11.setBackground(new java.awt.Color(227, 227, 227));

        jLabel12.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("TELEFONO");
        jPanel11.add(jLabel12);

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 170, 40));

        txtTelefono.setBackground(new java.awt.Color(227, 227, 227));
        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 260, 40));

        txtMail.setBackground(new java.awt.Color(227, 227, 227));
        txtMail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 260, 40));

        btnMODIFICAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnMODIFICAR.setText("MODIFICAR");
        btnMODIFICAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFICARActionPerformed(evt);
            }
        });
        getContentPane().add(btnMODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 210, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1020, 180));

        btnACTUALIZAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnACTUALIZAR.setText("ACTUALIZAR ");
        btnACTUALIZAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACTUALIZARActionPerformed(evt);
            }
        });
        getContentPane().add(btnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 40));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SELECCIONE LA FILA A MODIFICAR:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 710, -1));

        btnCANCELAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnCANCELAR.setText("CANCELAR");
        btnCANCELAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELARActionPerformed(evt);
            }
        });
        getContentPane().add(btnCANCELAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 200, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed
    
        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.

        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE cliente SET dni_cliente='"+txtDni.getText()+"',nombre='"+txtNombre.getText()+"',telefono='"+txtTelefono.getText()+"',e_mail='"+txtMail.getText()+"'");
           
            int n = pst.executeUpdate();

            if (n > 0) {
                
                JOptionPane.showMessageDialog(this, "El Cliente se Modificó Correctamente");
               
                txtNombre.setText("");
                txtDni.setText("");
                txtTelefono.setText("");
                txtMail.setText("");         
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El error es:" + e.getMessage());
        }
    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char a = evt.getKeyChar();                               //VALIDACION SOLO LETRAS.
        if (Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped

        char a = evt.getKeyChar();           //VALIDACION SOLO NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void btnMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFICARActionPerformed

        int Fila = jTable1.getSelectedRow(); // ACA SELECCIONO LA FILA A MODIFICAR PERTENECIENTE A LA TABLA.

        if (Fila >= 0) {     
            
            txtDni.setText(jTable1.getValueAt(Fila, 0).toString());
            txtNombre.setText(jTable1.getValueAt(Fila, 1).toString());
            txtTelefono.setText(jTable1.getValueAt(Fila, 2).toString());
            txtMail.setText(jTable1.getValueAt(Fila, 3).toString());

        } else {
        }

    }//GEN-LAST:event_btnMODIFICARActionPerformed

    private void btnACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACTUALIZARActionPerformed
        tabla();
    }//GEN-LAST:event_btnACTUALIZARActionPerformed

    private void btnCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELARActionPerformed

        JOptionPane.showMessageDialog(this, "MODIFICACION CANCELADA");

        txtNombre.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtMail.setText("");


    }//GEN-LAST:event_btnCANCELARActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       txtNombre.transferFocus(); 
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
       txtDni.transferFocus();
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
       txtTelefono.transferFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
       txtMail.transferFocus();
    }//GEN-LAST:event_txtMailActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModificarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTUALIZAR;
    private javax.swing.JButton btnCANCELAR;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnMODIFICAR;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
 private void tabla() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM cliente");
        modelotabla.setColumnIdentifiers(new Object[]{"Dni_cliente", "Nombre", "telefono", "e_mail"});
        try {
            while (rs.next()) {
                modelotabla.addRow(new Object[]{rs.getString("dni_cliente"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("e_mail")});
            }
            jTable1.setModel(modelotabla);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
