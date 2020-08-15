/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import clases.ClienteDuenio;
import clases.Conexion;
import static clases.Conexion.conectar;
import clases.ControlFicha;
import clases.Mascota;
import clases.controlPreguntas;
import clases.usuarios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
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
    DefaultTableModel m;
    /**
     * Creates new form frmFichaClinica
     */
    public frmFichaClinica() {
        initComponents();
        ListarDuenios();
        ListarFichas();
        
        labelNombre.setVisible(false);
        tfDosis.setEnabled(false);
        tfFrecuencia.setEnabled(false);
        tfTratamiento.setEnabled(false);
        cmbMascota.setEnabled(false);
        jButton2.setEnabled(false);
        btnLimpiar.setEnabled(false);
        idd.setEnabled(false);
//        idd.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new JDialog();
        kGradientPanel2 = new KGradientPanel();
        jLabel13 = new JLabel();
        jPanel1 = new JPanel();
        jLabel14 = new JLabel();
        tfdialogo = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTable1dialog = new JTable();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton1 = new JButton();
        jButton6 = new JButton();
        kGradientPanel1 = new KGradientPanel();
        jLabel12 = new JLabel();
        BtnCerrar = new JButton();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jLabel25 = new JLabel();
        jLabel23 = new JLabel();
        tfDosis = new JTextField();
        jLabel22 = new JLabel();
        tfFrecuencia = new JTextField();
        jLabel21 = new JLabel();
        tfTratamiento = new JTextField();
        jLabel27 = new JLabel();
        jButton3 = new JButton();
        btnreporte = new JButton();
        tfDui = new JTextField();
        cmbMascota = new JComboBox<>();
        labelNombre = new JLabel();
        idd = new JTextField();
        jButton2 = new JButton();
        jScrollPane3 = new JScrollPane();
        jTable3 = new JTable();
        btnLimpiar = new JButton();
        jButton7 = new JButton();
        btnReporte1 = new JButton();

        kGradientPanel2.setkEndColor(new Color(113, 186, 133));
        kGradientPanel2.setkGradientFocus(600);
        kGradientPanel2.setkStartColor(new Color(1, 163, 201));

        jLabel13.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("Buscador ficha clínica");

        GroupLayout kGradientPanel2Layout = new GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(kGradientPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(kGradientPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel1.setBackground(new Color(204, 204, 204));

        jLabel14.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("Buscar:");

        tfdialogo.setText("                                                 INGRESE EL DUI DEL DUEÑO ");
        tfdialogo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                tfdialogoMouseClicked(evt);
            }
        });
        tfdialogo.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                tfdialogoPropertyChange(evt);
            }
        });

        jTable1dialog.setModel(new DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1dialog);

        jButton4.setText("AGREGAR");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("SALIR");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("NUEVA BUSQUEDA");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdialogo, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(tfdialogo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        GroupLayout jDialog1Layout = new GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jPanel4.setBackground(new Color(204, 204, 204));
        jPanel4.setBorder(BorderFactory.createTitledBorder(""));

        jLabel25.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel25.setText("DUI:");

        jLabel23.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel23.setText("Dosis:");

        tfDosis.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        tfDosis.setBorder(BorderFactory.createEtchedBorder());

        jLabel22.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel22.setText("Frecuencia:");

        tfFrecuencia.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        tfFrecuencia.setBorder(BorderFactory.createEtchedBorder());

        jLabel21.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel21.setText("Tratamiento:");

        tfTratamiento.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        tfTratamiento.setBorder(BorderFactory.createEtchedBorder());

        jLabel27.setFont(new Font("Ubuntu", 0, 14)); // NOI18N
        jLabel27.setText("Mascota:");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnreporte.setText("Generar reporte");
        btnreporte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        tfDui.setEditable(false);

        labelNombre.setText("jLabel1");

        idd.setBackground(new Color(204, 204, 204));
        idd.setBorder(null);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel23)
                        .addComponent(tfDosis, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addComponent(tfTratamiento))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(29, 29, 29)
                                .addComponent(tfDui, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelNombre, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(btnreporte)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(tfFrecuencia, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(idd, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbMascota, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(tfDui, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cmbMascota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre)
                    .addComponent(idd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDosis, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFrecuencia, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTratamiento, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnreporte, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

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

        btnLimpiar.setFont(new Font("Ubuntu Mono", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnReporte1.setText("Modificar");
        btnReporte1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnReporte1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporte1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GroupLayout kGradientPanel1Layout = new GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(kGradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel12)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCerrar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(kGradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrar)
                    .addComponent(jLabel12, GroupLayout.Alignment.TRAILING))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
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
    public void ListarDuenios(){
        ClienteDuenio obj = new ClienteDuenio();
        obj.CargarDuenio(jTable1dialog);
    }
    
    public void ListarDueniosD(){
        ClienteDuenio obj = new ClienteDuenio();
        
    }
    
    public void CargarMascota(){
        ClienteDuenio obj = new ClienteDuenio();
        obj.consultarMascotaF(cmbMascota);
    }
    
    public void CargarMascota(int duenyo){
        ClienteDuenio obj = new ClienteDuenio();
        obj.consultarMascotaF(cmbMascota, duenyo);
    }
    
    public void ListarFichas(){
        ClienteDuenio obj = new ClienteDuenio();
        obj.CargarFicha(jTable3);
    }
    private void BtnCerrarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void btnreporteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        try {
            Connection con = Conexion.conectar();
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
//        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
//        if (tfDui.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this,"No dejar campos vacíos"); 
//        }
        ControlFicha obj = new ControlFicha();
        obj.setDosis(tfDosis.getText());
        obj.setFrecuencia(tfFrecuencia.getText());
        obj.setTratamiento(tfTratamiento.getText()); 
        
        
        Mascota mas = (Mascota)cmbMascota.getSelectedItem();
        obj.setID_Mascota(mas.getID_mascota());
        
//        ClienteDuenio du = (ClienteDuenio)cmbMascota.getSelectedItem();
//        obj.setID_Mascota(ma.getID_mascota());
        
        int DUI= Integer.parseInt(tfDui.getText());
        obj.setID_DUI(DUI); 
        
        if (obj.guardar()) {
           JOptionPane.showMessageDialog(this,"Datos ingresados correctamente"); 
           ListarFichas();
//           ListarPreguntas();
           }else{ 
           JOptionPane.showMessageDialog(this,"Error al guardar datos"); 
           JOptionPane.showMessageDialog(this,obj.guardar()); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setMinimumSize(new Dimension (800, 600));
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
        //Desde aqui tenes que cargar el otro compoennete
       
                //esta mala la for
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfdialogoPropertyChange(PropertyChangeEvent evt) {//GEN-FIRST:event_tfdialogoPropertyChange
      JTextField t = new JTextField();
      t.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_tfdialogoPropertyChange

    private void tfdialogoMouseClicked(MouseEvent evt) {//GEN-FIRST:event_tfdialogoMouseClicked
        tfdialogo.setText(" ");
    }//GEN-LAST:event_tfdialogoMouseClicked

    private void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tfDosis.setEnabled(true);
        tfFrecuencia.setEnabled(true);
        tfTratamiento.setEnabled(true);
        cmbMascota.setEnabled(true);
        jButton2.setEnabled(true);
        btnLimpiar.setEnabled(true);
        int fsel = jTable1dialog.getSelectedRow();
       String ID, nombre, apellidos;
        if (fsel==-1) {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
        m = (DefaultTableModel)jTable1dialog.getModel();
        ID = jTable1dialog.getValueAt(fsel, 0).toString();
         nombre = jTable1dialog.getValueAt(fsel, 1).toString();
         apellidos = jTable1dialog.getValueAt(fsel, 2).toString();
         
         tfDui.setText(ID);
            CargarMascota(Integer.parseInt(ID)); 
          
         labelNombre.setVisible(true);
         labelNombre.setText(nombre+" "+apellidos);
         
         jDialog1.setVisible(false);
        
//         if (tfdialogo.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this,"No dejar campos vacíos"); 
//        }else{
//            ClienteDuenio dui = new ClienteDuenio();
//            jTable1dialog.setModel(dui.BuscarTabla(tfdialogo.getText()));
//            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLimpiarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       tfDosis.setText(" ");
       tfDui.setText(" ");
       tfFrecuencia.setText(" ");
       tfTratamiento.setText(" ");
       ListarFichas();
        if (tfDui.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"No dejar campos vacíos"); 
        }else{
       labelNombre.setVisible(false);
       tfDosis.setEnabled(false);
        tfFrecuencia.setEnabled(false);
        tfTratamiento.setEnabled(false);
        cmbMascota.setEnabled(false);
        jButton2.setEnabled(false);
        btnLimpiar.setEnabled(false);
      }   
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (tfdialogo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"No dejar campos vacíos"); 
        }else{
            ClienteDuenio dui = new ClienteDuenio();
            jTable1dialog.setModel(dui.BuscarTabla(tfdialogo.getText()));
            
            
//            ClienteDuenio obj = new ClienteDuenio();
//            int fse = jTable1dialog.getSelectedRow();
//            String dato = tfdialogo.getText();
//            String b = jTable1dialog.getValueAt(fse, 0).toString();
//            
//            if (dato==b) {
//                try {
//                    obj.BuscarDuenio(Integer.parseInt(jTable1dialog.getValueAt(fse, 0).toString()));
//                } catch (SQLException ex) {
//                    Logger.getLogger(frmFichaClinica.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tfdialogo.setText("                                                 INGRESE EL DUI DEL DUEÑO ");
        ListarDuenios();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String ID_Ficha;
        int fsel = jTable3.getSelectedRow();
        if (fsel==-1) {
        JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        }else{
         m = (DefaultTableModel)jTable3.getModel();
         ID_Ficha = jTable3.getValueAt(fsel, 0).toString();
         idd.setText(ID_Ficha);
         
         ControlFicha obj = new ControlFicha();
         
         int i = Integer.parseInt(idd.getText());

         obj.setID_Ficha(i);
         
         int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
                "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if (eliminar == 0) {
              if (obj.EliminarFicha()) {
                JOptionPane.showMessageDialog(this, "Datos eliminados");
                ListarFichas();
            }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar "+obj.EliminarFicha());
            }
          }
        } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnReporte1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
//        String ID, DUIC;
//        int fsel = jTable3.getSelectedRow();
//        m = (DefaultTableModel)jTable3.getModel();
//        ID = jTable3.getValueAt(fsel, 0).toString();
//        DUIC = jTable3.getValueAt(fsel, 4).toString();
//        idd.setText(ID);
//         ControlFicha obj = new ControlFicha();
//        int IDf= Integer.parseInt(idd.getText());
//        obj.setID_Ficha(IDf);
//            
//        obj.setDosis(tfDosis.getText());
//        obj.setFrecuencia(tfFrecuencia.getText());
//        obj.setTratamiento(tfTratamiento.getText()); 
//        
//        int DUI= Integer.parseInt(DUIC);
//        obj.setID_DUI(DUI);
//        
//        int i = Integer.valueOf(DUIC); 
//        String numCadena= String.valueOf(i);
//        
//        CargarMascota(Integer.parseInt(numCadena)); 
//        Mascota mas = (Mascota)cmbMascota.getSelectedItem();
//        obj.setID_Mascota(mas.getID_mascota());
//
//
//        if (fsel==-1) {
//            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia",
//                JOptionPane.WARNING_MESSAGE);
//        }else{
//          if (obj.modificarFicha()) {
//                    JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
//                    ListarFichas();
//                }else{
//                    JOptionPane.showMessageDialog(null,"Error al modificar los datos");
//                }
//            }
    }//GEN-LAST:event_btnReporte1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BtnCerrar;
    private JButton btnLimpiar;
    private JButton btnReporte1;
    private JButton btnreporte;
    private JComboBox<String> cmbMascota;
    private JTextField idd;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JDialog jDialog1;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel25;
    private JLabel jLabel27;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane3;
    private JTable jTable1dialog;
    private JTable jTable3;
    private KGradientPanel kGradientPanel1;
    private KGradientPanel kGradientPanel2;
    private JLabel labelNombre;
    private JTextField tfDosis;
    private JTextField tfDui;
    private JTextField tfFrecuencia;
    private JTextField tfTratamiento;
    private JTextField tfdialogo;
    // End of variables declaration//GEN-END:variables
}
