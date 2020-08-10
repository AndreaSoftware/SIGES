/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import clases.conexion;
import static clases.conexion.conectar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import keeptoo.KGradientPanel;
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
public class frmFichaClinica extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFichaClinica
     */
    public frmFichaClinica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new KGradientPanel();
        jLabel12 = new JLabel();
        BtnCerrar = new JButton();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jLabel25 = new JLabel();
        jLabel23 = new JLabel();
        jTextField2 = new JTextField();
        jLabel22 = new JLabel();
        jTextField3 = new JTextField();
        jLabel21 = new JLabel();
        jTextField1 = new JTextField();
        jLabel27 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jButton1 = new JButton();
        btnreporte = new JButton();
        jButton2 = new JButton();
        jScrollPane3 = new JScrollPane();
        jTable3 = new JTable();

        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        kGradientPanel1.setkEndColor(new Color(113, 186, 133));
        kGradientPanel1.setkStartColor(new Color(1, 163, 201));
        kGradientPanel1.setMaximumSize(new Dimension(697, 518));

        jLabel12.setFont(new Font("Ubuntu", 0, 24)); // NOI18N
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText("Ficha clínica");

        BtnCerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new Color(255, 255, 255));

        jPanel4.setBorder(BorderFactory.createTitledBorder(""));

        jLabel25.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel25.setText("DUI:");

        jLabel23.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel23.setText("Dosis:");

        jTextField2.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jTextField2.setBorder(BorderFactory.createEtchedBorder());

        jLabel22.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel22.setText("Frecuencia:");

        jTextField3.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jTextField3.setBorder(BorderFactory.createEtchedBorder());

        jLabel21.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel21.setText("Tratamiento:");

        jTextField1.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jTextField1.setBorder(BorderFactory.createEtchedBorder());

        jLabel27.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel27.setText("Mascota:");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel27))
                                .addGap(256, 256, 256))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jButton1.setText("Buscar mascota");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnreporte.setText("Generar reporte");
        btnreporte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Ubuntu Mono", 0, 14)); // NOI18N
        jButton2.setText("Guardar ");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable3.setModel(new DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addGap(40, 40, 40)
                .addComponent(btnreporte)
                .addGap(191, 191, 191))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnreporte, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        GroupLayout kGradientPanel1Layout = new GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(kGradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(271, 271, 271)
                .addComponent(BtnCerrar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(kGradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrar)
                    .addComponent(jLabel12))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addComponent(kGradientPanel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Buscador llamar = new Buscador();
         llamar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnreporteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        try {
            Connection con = conexion.conectar();
//            Connection conn = con.getConexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reporte-Ficha.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
                    
        } catch (JRException ex) {
            Logger.getLogger(frmFichaClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnreporteActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BtnCerrar;
    private JButton btnreporte;
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel12;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel25;
    private JLabel jLabel27;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane3;
    private JTable jTable3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
