/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import java.awt.Dimension;
import javax.swing.JOptionPane;

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
        BtnCerrar1 = new javax.swing.JButton();
        JPDatosCitas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCitas = new javax.swing.JTable();
        JPGestionCitas = new javax.swing.JPanel();
        JBGuardar = new javax.swing.JButton();
        JBMostrar = new javax.swing.JButton();
        JBModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JPIngresoCitas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFHoraCitas = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(760, 714));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPCitas.setBackground(new java.awt.Color(157, 34, 202));
        JPCitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Citas");
        JPCitas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BtnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar1.setToolTipText("");
        BtnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrar1ActionPerformed(evt);
            }
        });
        JPCitas.add(BtnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 27, 25));

        getContentPane().add(JPCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 748, 51));

        JPDatosCitas.setBackground(new java.awt.Color(255, 255, 255));
        JPDatosCitas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las citas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jTablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablaCitas);

        javax.swing.GroupLayout JPDatosCitasLayout = new javax.swing.GroupLayout(JPDatosCitas);
        JPDatosCitas.setLayout(JPDatosCitasLayout);
        JPDatosCitasLayout.setHorizontalGroup(
            JPDatosCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDatosCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPDatosCitasLayout.setVerticalGroup(
            JPDatosCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDatosCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(JPDatosCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 417, 720, 190));

        JPGestionCitas.setBackground(new java.awt.Color(255, 255, 255));
        JPGestionCitas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de citas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        JBGuardar.setBackground(new java.awt.Color(0, 136, 130));
        JBGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.setPreferredSize(new java.awt.Dimension(90, 60));
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBMostrar.setBackground(new java.awt.Color(0, 136, 130));
        JBMostrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBMostrar.setForeground(new java.awt.Color(255, 255, 255));
        JBMostrar.setText("Mostrar");
        JBMostrar.setPreferredSize(new java.awt.Dimension(90, 60));
        JBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarActionPerformed(evt);
            }
        });

        JBModificar.setBackground(new java.awt.Color(0, 136, 130));
        JBModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBModificar.setForeground(new java.awt.Color(255, 255, 255));
        JBModificar.setText("Modificar");
        JBModificar.setPreferredSize(new java.awt.Dimension(90, 60));

        javax.swing.GroupLayout JPGestionCitasLayout = new javax.swing.GroupLayout(JPGestionCitas);
        JPGestionCitas.setLayout(JPGestionCitasLayout);
        JPGestionCitasLayout.setHorizontalGroup(
            JPGestionCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPGestionCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPGestionCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(JBMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPGestionCitasLayout.setVerticalGroup(
            JPGestionCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPGestionCitasLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(JPGestionCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, -1, -1));

        JPIngresoCitas.setBackground(new java.awt.Color(255, 255, 255));
        JPIngresoCitas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las citas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Hora:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Seleccione el tipo de cita:");

        rSDateChooser1.setColorBackground(new java.awt.Color(0, 136, 130));
        rSDateChooser1.setColorButtonHover(new java.awt.Color(157, 34, 202));

        javax.swing.GroupLayout JPIngresoCitasLayout = new javax.swing.GroupLayout(JPIngresoCitas);
        JPIngresoCitas.setLayout(JPIngresoCitasLayout);
        JPIngresoCitasLayout.setHorizontalGroup(
            JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIngresoCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIngresoCitasLayout.createSequentialGroup()
                        .addGroup(JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFHoraCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPIngresoCitasLayout.createSequentialGroup()
                        .addGroup(JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 218, Short.MAX_VALUE))))
        );
        JPIngresoCitasLayout.setVerticalGroup(
            JPIngresoCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIngresoCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(JTFHoraCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(JPIngresoCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 69, 480, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrarActionPerformed

    }//GEN-LAST:event_JBMostrarActionPerformed

    private void BtnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar1;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBMostrar;
    private javax.swing.JPanel JPCitas;
    private javax.swing.JPanel JPDatosCitas;
    private javax.swing.JPanel JPGestionCitas;
    private javax.swing.JPanel JPIngresoCitas;
    private javax.swing.JTextField JTFHoraCitas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTablaCitas;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    // End of variables declaration//GEN-END:variables
}
