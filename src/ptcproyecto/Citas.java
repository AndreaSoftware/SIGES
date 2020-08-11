/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;
import clases.Cita;
import clases.Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
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
public class Citas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Citas
     */
    public Citas() {
        initComponents();
        this.setPreferredSize(new Dimension(760,714));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPCitas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        BtnCerrar1 = new javax.swing.JButton();
        JPIngresoCitas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfHora = new javax.swing.JTextField();
        cbTipoCita = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbDUI = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JbtGuardar = new javax.swing.JButton();
        JbtnConsultar = new javax.swing.JButton();
        JbtnImprimir = new javax.swing.JButton();
        JbtnModificar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(760, 714));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPCitas.setBackground(new java.awt.Color(157, 34, 202));
        JPCitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Citas");
        JPCitas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jTextField1.setBackground(new java.awt.Color(204, 102, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        BtnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar1.setToolTipText("");
        BtnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(BtnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BtnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JPCitas.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 270, 50));

        getContentPane().add(JPCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        JPIngresoCitas.setBackground(new java.awt.Color(255, 255, 255));
        JPIngresoCitas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las citas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Hora:");

        tfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraActionPerformed(evt);
            }
        });

        cbTipoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Seleccione el tipo de cita:");

        jLabel5.setText("DUI:");

        jcbDUI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout JPIngresoCitasLayout = new javax.swing.GroupLayout(JPIngresoCitas);
        JPIngresoCitas.setLayout(JPIngresoCitasLayout);
        JPIngresoCitasLayout.setHorizontalGroup(
            JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIngresoCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tfFecha)
                    .addComponent(tfHora)
                    .addComponent(cbTipoCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbDUI, 0, 180, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        JPIngresoCitasLayout.setVerticalGroup(
            JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIngresoCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(JPIngresoCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 280));

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
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 430, 180));

        JbtGuardar.setBackground(new java.awt.Color(0, 153, 153));
        JbtGuardar.setText("Guardar");
        JbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(JbtGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 130, 40));

        JbtnConsultar.setBackground(new java.awt.Color(0, 153, 153));
        JbtnConsultar.setText("Mostrar");
        JbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 163, 130, 40));

        JbtnImprimir.setBackground(new java.awt.Color(0, 153, 153));
        JbtnImprimir.setText("Imprimir");
        JbtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 130, 40));

        JbtnModificar1.setBackground(new java.awt.Color(0, 153, 153));
        JbtnModificar1.setText("Modificar");
        JbtnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnModificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 223, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrar1ActionPerformed

    private void JbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtGuardarActionPerformed
       Cita obj = new Cita();
       obj.setcita_hora(Integer.parseInt(tfHora.getText ()));
       obj.setcita_fecha(Integer.parseInt(tfFecha.getText ()));
       obj.setID_tipoCita((Integer) cbTipoCita.getSelectedItem());
       obj.setDUI((Integer)jcbDUI.getSelectedItem ());
       if (obj.guardar()) {
            JOptionPane.showMessageDialog(this, "Los datos han sido guardados");
        }else{
            JOptionPane.showMessageDialog(this, "Error al guardar los datos");
        }
    }//GEN-LAST:event_JbtGuardarActionPerformed

    private void tfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraActionPerformed

    private void JbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnConsultarActionPerformed
        Cita obj = new Cita();
       if (obj.Consultar()) {
       obj.setcita_hora(Integer.parseInt(tfHora.getText ()));
       obj.setcita_fecha(Integer.parseInt(tfFecha.getText ()));
       obj.setID_tipoCita((Integer) cbTipoCita.getSelectedItem());
       obj.setDUI((Integer)jcbDUI.getSelectedItem ());
     
            
        }else{
            JOptionPane.showMessageDialog(this, "Error al guardar los consultas");
        }
    }//GEN-LAST:event_JbtnConsultarActionPerformed

    private void JbtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnImprimirActionPerformed
         try 
        {
            java.sql.Connection con = Conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-cita(D).jasper";
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
    }//GEN-LAST:event_JbtnImprimirActionPerformed

    private void JbtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnModificar1ActionPerformed
        try {
            Connection con = Conexion.conectar();
//            Connection conn = con.getConexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-cita(D).jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
                    
        } catch (JRException ex) {
            Logger.getLogger(frmFichaClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JbtnModificar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar1;
    private javax.swing.JPanel JPCitas;
    private javax.swing.JPanel JPIngresoCitas;
    private javax.swing.JButton JbtGuardar;
    private javax.swing.JButton JbtnConsultar;
    private javax.swing.JButton JbtnImprimir;
    private javax.swing.JButton JbtnModificar1;
    private javax.swing.JComboBox<String> cbTipoCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcbDUI;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfHora;
    // End of variables declaration//GEN-END:variables
}
