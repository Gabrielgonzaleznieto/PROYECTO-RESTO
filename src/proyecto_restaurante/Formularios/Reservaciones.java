package proyecto_restaurante.Formularios;

import Conexion.conexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.ImageIcon;
import proyecto_restaurante.Formularios.MesasDisponibles;

/**
 *
 * @author gabriel gonzalez
 */
public class Reservaciones extends javax.swing.JFrame {

    public Reservaciones() {

        initComponents();

        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.
        txtidreservaciones.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSALIR = new javax.swing.JButton();
        txtcostoreservacion = new javax.swing.JTextField();
        btnCostoreservacion = new javax.swing.JButton();
        txtmesas = new javax.swing.JTextField();
        btnMapaMesas = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtnumeropersonas = new javax.swing.JTextField();
        btnGUARDAR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDnicliente = new javax.swing.JTextField();
        txtidreservaciones = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDniempleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSALIR.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        btnSALIR.setText("REGRESAR");
        btnSALIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 170, 40));
=======
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 170, 50));
>>>>>>> efd488a7c5f167312f236678078424b63a42a29f

        txtcostoreservacion.setEditable(false);
        txtcostoreservacion.setBackground(new java.awt.Color(227, 227, 227));
        txtcostoreservacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtcostoreservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 390, 40));

        btnCostoreservacion.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        btnCostoreservacion.setForeground(new java.awt.Color(102, 102, 102));
        btnCostoreservacion.setText("COSTO DE RESARVACION:");
        btnCostoreservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoreservacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCostoreservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 370, 40));

        txtmesas.setBackground(new java.awt.Color(227, 227, 227));
        txtmesas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtmesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesasActionPerformed(evt);
            }
        });
        txtmesas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmesasKeyTyped(evt);
            }
        });
        getContentPane().add(txtmesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 390, 40));

        btnMapaMesas.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnMapaMesas.setText("VER MESAS");
        btnMapaMesas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMapaMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaMesasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMapaMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 160, 40));

        jDateChooser1.setBackground(new java.awt.Color(227, 227, 227));
        jDateChooser1.setForeground(new java.awt.Color(255, 51, 0));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 220, 40));

        txtnumeropersonas.setBackground(new java.awt.Color(227, 227, 227));
        txtnumeropersonas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtnumeropersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeropersonasActionPerformed(evt);
            }
        });
        txtnumeropersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeropersonasKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumeropersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 390, 40));

        btnGUARDAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnGUARDAR.setText("GUARDAR");
        btnGUARDAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 170, 40));
=======
        getContentPane().add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 170, 50));

        txtmail.setBackground(new java.awt.Color(227, 227, 227));
        txtmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 390, 40));

        txttelefono.setBackground(new java.awt.Color(227, 227, 227));
        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 390, 40));
>>>>>>> efd488a7c5f167312f236678078424b63a42a29f

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("RESERVACION DE MESAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 520, 50));

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("FECHA DE LA RESERVA:");
        jPanel1.add(jLabel4);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 370, 40));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("ID_RESERVACION:");
        jPanel2.add(jLabel8);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 370, 40));

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText(" ELIJA NUMERO DE MESA:");
        jPanel3.add(jLabel6);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 370, 40));

        jPanel4.setBackground(new java.awt.Color(227, 227, 227));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("LUGARES A RESERVAR:");
        jPanel4.add(jLabel3);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 370, 40));

        jPanel7.setBackground(new java.awt.Color(227, 227, 227));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("D.N.I  DEL CLIENTE:");
        jPanel7.add(jLabel2);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 370, 40));

        txtDnicliente.setBackground(new java.awt.Color(227, 227, 227));
        txtDnicliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDnicliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtDnicliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 390, 40));

        txtidreservaciones.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtidreservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 60, 40));

        jPanel5.setBackground(new java.awt.Color(227, 227, 227));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("D.N.I MESERO:");
        jPanel5.add(jLabel1);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 370, 40));

        txtDniempleado.setBackground(new java.awt.Color(227, 227, 227));
        txtDniempleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtDniempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 390, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSALIRActionPerformed

    private void btnCostoreservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoreservacionActionPerformed
        String b;
        int c = 0, d;
        b = txtmesas.getText();
        String numeros[] = b.split(",");
        for (String numero : numeros) {
            c = c + 1;
        }
        d = c * 60;
        txtcostoreservacion.setText(String.valueOf(d));

    }//GEN-LAST:event_btnCostoreservacionActionPerformed

    private void btnMapaMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaMesasActionPerformed

        String f1;
        Date fe;
        fe = jDateChooser1.getDate();
        String formato = jDateChooser1.getDateFormatString();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        f1 = String.valueOf(sdf.format(fe));
        MesasDisponibles map = new MesasDisponibles(f1);
        map.setVisible(true);

    }//GEN-LAST:event_btnMapaMesasActionPerformed

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed

        String f1, mes;
        int np, dni_cli, dni_emple;
        Date fe;
        double cost;
        
        dni_cli = Integer.parseInt(txtDnicliente.getText());
        dni_emple = Integer.parseInt(txtDniempleado.getText());
        np = Integer.parseInt(txtnumeropersonas.getText());
        cost = Double.parseDouble(txtcostoreservacion.getText());
        mes = txtmesas.getText();
        fe = jDateChooser1.getDate();
      
       

        String formato = jDateChooser1.getDateFormatString();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);

        f1 = String.valueOf(sdf.format(fe));

        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.

        String sql = "INSERT INTO reservaciones(id_res,numeropersonas,fecha,mesas,costo,dni_cliente,dni_empleado) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setInt(2, np);
            pst.setString(3, f1);
            pst.setString(4, mes);
            pst.setDouble(5, cost);
            pst.setInt(6, dni_cli);
            pst.setInt(7, dni_emple);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "RESERVACION REALIZADA");
                
                txtDnicliente.setText("");
                txtDniempleado.setText("");
                txtnumeropersonas.setText("");
                txtcostoreservacion.setText("");
                txtmesas.setText("");
                jDateChooser1.setDate(null);                //Se vacian al registrar
                txtidreservaciones.setText("");
                
                this.setLocationRelativeTo(null);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "El error es:" + e.getMessage());
        }


    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void txtnumeropersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeropersonasKeyTyped

        char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtnumeropersonasKeyTyped

    private void txtmesasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmesasKeyTyped
      /*  char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }  */
    }//GEN-LAST:event_txtmesasKeyTyped

    private void txtmesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesasActionPerformed
         txtmesas.transferFocus(); 
    }//GEN-LAST:event_txtmesasActionPerformed

    private void txtDniclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniclienteActionPerformed
         txtDnicliente.transferFocus(); 
    }//GEN-LAST:event_txtDniclienteActionPerformed

    private void txtnumeropersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeropersonasActionPerformed
         txtnumeropersonas.transferFocus(); 
    }//GEN-LAST:event_txtnumeropersonasActionPerformed

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
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostoreservacion;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnMapaMesas;
    private javax.swing.JButton btnSALIR;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtDnicliente;
    private javax.swing.JTextField txtDniempleado;
    private javax.swing.JTextField txtcostoreservacion;
    private javax.swing.JTextField txtidreservaciones;
    private javax.swing.JTextField txtmesas;
    private javax.swing.JTextField txtnumeropersonas;
    // End of variables declaration//GEN-END:variables
}
