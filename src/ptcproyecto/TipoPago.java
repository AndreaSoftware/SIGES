/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import clases.*;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author 15-CW0001la
 */
public class TipoPago extends javax.swing.JInternalFrame {

    /**
     * Creates new form TipoPago
     */
    public TipoPago() {
        initComponents();
    }
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater
        (
            new Runnable() 
            {
                public void run() 
                {
                    new TipoPago().setVisible(true);
                }
            }
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMostrar_Tipo_Pago = new javax.swing.JButton();
        btnGuardar_Tipo_Pago = new javax.swing.JButton();
        btnModificar_Tipo_Pago = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnImprimir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNombre_Tipo_Pago = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(744, 560));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Mantenimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        btnMostrar_Tipo_Pago.setBackground(new java.awt.Color(0, 136, 130));
        btnMostrar_Tipo_Pago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMostrar_Tipo_Pago.setText("Mostrar");
        btnMostrar_Tipo_Pago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnMostrar_Tipo_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar_Tipo_PagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar_Tipo_Pago);
        btnMostrar_Tipo_Pago.setBounds(10, 230, 160, 50);

        btnGuardar_Tipo_Pago.setBackground(new java.awt.Color(0, 136, 130));
        btnGuardar_Tipo_Pago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar_Tipo_Pago.setText("Guardar");
        btnGuardar_Tipo_Pago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnGuardar_Tipo_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar_Tipo_PagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar_Tipo_Pago);
        btnGuardar_Tipo_Pago.setBounds(10, 20, 160, 50);

        btnModificar_Tipo_Pago.setBackground(new java.awt.Color(0, 136, 130));
        btnModificar_Tipo_Pago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar_Tipo_Pago.setText("Modificar");
        btnModificar_Tipo_Pago.setPreferredSize(new java.awt.Dimension(90, 60));
        btnModificar_Tipo_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_Tipo_PagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar_Tipo_Pago);
        btnModificar_Tipo_Pago.setBounds(10, 90, 160, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 220, 200, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(-10, 80, 200, 10);

        btnImprimir.setBackground(new java.awt.Color(0, 136, 130));
        btnImprimir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setPreferredSize(new java.awt.Dimension(90, 60));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir);
        btnImprimir.setBounds(10, 160, 160, 50);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(-10, 150, 200, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 70, 180, 290);

        jPanel3.setBackground(new java.awt.Color(157, 34, 202));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo Pago");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 7, 200, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 590, 60);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Datos registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setLayout(null);

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
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 550, 120);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 370, 580, 150);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(null);
        jPanel2.add(txtNombre_Tipo_Pago);
        txtNombre_Tipo_Pago.setBounds(40, 60, 290, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del tipo de pago:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 30, 160, 17);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(200, 70, 390, 290);

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCerrar);
        BtnCerrar.setBounds(0, 0, 65, 41);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrar_Tipo_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar_Tipo_PagoActionPerformed
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
    }//GEN-LAST:event_btnMostrar_Tipo_PagoActionPerformed

    private void btnGuardar_Tipo_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar_Tipo_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar_Tipo_PagoActionPerformed

    private void btnModificar_Tipo_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_Tipo_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar_Tipo_PagoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try 
        {
            java.sql.Connection con = conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\ReporteTipoPagoSIGES.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } 
        catch (JRException ex) 
        {
            Logger.getLogger(frmFichaClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
        //fasdasdasd
        /*
        String path = "";
        try
        {
            path = getClass().getResource("src/Reportes/Reporte_Tipo_Pago_SIGES.jasper").getPath();
            path = URLDecoder.decode(path, "UTF-8");
            Connection cn = new conexion().conectar();
            Map parametros = new HashMap();
            JasperReport reporte = (JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros, cn);
            JasperViewer visor = new JasperViewer(imprimir,false);
            visor.setTitle("Reporte Tipos de Pago");
            visor.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error durante el proceso de presentacion del reporte. Error: " + e);
            System.out.println(e.getMessage());
        }
        */
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnCerrar2;
    private javax.swing.JButton btnGuardar_Tipo_Pago;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar_Tipo_Pago;
    private javax.swing.JButton btnMostrar_Tipo_Pago;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNombre_Tipo_Pago;
    // End of variables declaration//GEN-END:variables
}
