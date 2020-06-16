/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author 15-CW0001la
 */
public class Consultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
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

        JPConsultas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        JPGestionConsultas = new javax.swing.JPanel();
        JBGuardarConsultas = new javax.swing.JButton();
        JBMostrarConsultas = new javax.swing.JButton();
        JBModificarConsultas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPTablaDatosConsultas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPIngresoConsultas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFHoraConsultas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        JPConsultas.setBackground(new java.awt.Color(153, 204, 255));
        JPConsultas.setForeground(new java.awt.Color(153, 204, 255));
        JPConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultas");
        JPConsultas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 11, -1, -1));

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1487086345-cross_81577.png"))); // NOI18N
        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        JPConsultas.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 0, 27, 25));

        JPGestionConsultas.setBackground(new java.awt.Color(153, 204, 255));
        JPGestionConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        JPGestionConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBGuardarConsultas.setBackground(new java.awt.Color(153, 153, 255));
        JBGuardarConsultas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBGuardarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        JBGuardarConsultas.setText("Guardar");
        JBGuardarConsultas.setPreferredSize(new java.awt.Dimension(90, 60));
        JBGuardarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarConsultasActionPerformed(evt);
            }
        });
        JPGestionConsultas.add(JBGuardarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 200, 48));

        JBMostrarConsultas.setBackground(new java.awt.Color(153, 153, 255));
        JBMostrarConsultas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBMostrarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        JBMostrarConsultas.setText("Mostrar");
        JBMostrarConsultas.setPreferredSize(new java.awt.Dimension(90, 60));
        JBMostrarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarConsultasActionPerformed(evt);
            }
        });
        JPGestionConsultas.add(JBMostrarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, 200, 53));

        JBModificarConsultas.setBackground(new java.awt.Color(153, 153, 255));
        JBModificarConsultas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JBModificarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        JBModificarConsultas.setText("Modificar");
        JBModificarConsultas.setPreferredSize(new java.awt.Dimension(90, 60));
        JPGestionConsultas.add(JBModificarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 252, 200, -1));
        JPGestionConsultas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 210, 10));
        JPGestionConsultas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 236, 210, 10));

        jPTablaDatosConsultas.setBackground(new java.awt.Color(204, 204, 255));
        jPTablaDatosConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPTablaDatosConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPTablaDatosConsultas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 337));

        jPIngresoConsultas.setBackground(new java.awt.Color(204, 204, 255));
        jPIngresoConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPIngresoConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Fecha:");
        jPIngresoConsultas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Hora:");
        jPIngresoConsultas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));
        jPIngresoConsultas.add(JTFHoraConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 73, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Seleccione el tipo de cita:");
        jPIngresoConsultas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPIngresoConsultas.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jPTablaDatosConsultas.add(jPIngresoConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 210, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jPTablaDatosConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JPGestionConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(JPConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 15, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jPTablaDatosConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(JPConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(JPGestionConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarConsultasActionPerformed
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
    }//GEN-LAST:event_JBGuardarConsultasActionPerformed

    private void JBMostrarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrarConsultasActionPerformed

    }//GEN-LAST:event_JBMostrarConsultasActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton JBGuardarConsultas;
    private javax.swing.JButton JBModificarConsultas;
    private javax.swing.JButton JBMostrarConsultas;
    private javax.swing.JPanel JPConsultas;
    private javax.swing.JPanel JPGestionConsultas;
    private javax.swing.JTextField JTFHoraConsultas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPIngresoConsultas;
    private javax.swing.JPanel jPTablaDatosConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}