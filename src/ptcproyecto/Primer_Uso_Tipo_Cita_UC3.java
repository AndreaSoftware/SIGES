/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

/**
 *
 * @author Nanos
 */
public class Primer_Uso_Tipo_Cita_UC3 extends javax.swing.JFrame {

    /**
     * Creates new form Primer_Uso_Tipo_Cita_UC3
     */
    public Primer_Uso_Tipo_Cita_UC3() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(btnCerrar_UC1, "Recursos_UC1/Imagenes_UC1/delete.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btnContinuar_UC1, "Recursos_UC1/Imagenes_UC1/forward.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btnOmitir_UC1, "Recursos_UC1/Imagenes_UC1/more.png");
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
        jLabel4 = new javax.swing.JLabel();
        btnCerrar_UC1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnContinuar_UC2 = new javax.swing.JLabel();
        btnContinuar_UC1 = new javax.swing.JLabel();
        btnOmitir_UC2 = new javax.swing.JLabel();
        btnOmitir_UC1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(120, 127, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 63, 58), 4));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(244, 243, 238));
        jLabel4.setText("TIPO CITA - PRIMER USO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 620, 40);

        btnCerrar_UC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrar_UC1.setToolTipText("");
        btnCerrar_UC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(btnCerrar_UC1);
        btnCerrar_UC1.setBounds(650, 10, 50, 40);

        jPanel2.setBackground(new java.awt.Color(70, 63, 58));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 135, 255), 4));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 243, 238));
        jLabel1.setText("Ingrese el nombre del encargado de registrar la cita:");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 170, 380, 30);

        jTextField1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(410, 170, 290, 30);

        jTextField2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTextField2.setText("jTextField1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(410, 120, 290, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 243, 238));
        jLabel2.setText("veterinaria poseera, por favor llene los datos solicitados:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 50, 680, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 243, 238));
        jLabel3.setText("Ingrese que clase de cita contendra su sistema:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 120, 350, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 243, 238));
        jLabel5.setText("Bienvenido querido usuario, en esta ventana usted podra registrar el tipo de citas que su");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 20, 680, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(20, 230, 680, 10);

        btnContinuar_UC2.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar_UC2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        btnContinuar_UC2.setForeground(new java.awt.Color(74, 222, 222));
        btnContinuar_UC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContinuar_UC2.setText("Continuar");
        btnContinuar_UC2.setToolTipText("");
        btnContinuar_UC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 243, 238), 3));
        jPanel2.add(btnContinuar_UC2);
        btnContinuar_UC2.setBounds(440, 260, 210, 40);

        btnContinuar_UC1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnContinuar_UC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnContinuar_UC1.setToolTipText("");
        btnContinuar_UC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 243, 238), 3));
        jPanel2.add(btnContinuar_UC1);
        btnContinuar_UC1.setBounds(390, 260, 50, 40);

        btnOmitir_UC2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        btnOmitir_UC2.setForeground(new java.awt.Color(74, 222, 222));
        btnOmitir_UC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOmitir_UC2.setText("Omitir");
        btnOmitir_UC2.setToolTipText("");
        btnOmitir_UC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 243, 238), 3));
        jPanel2.add(btnOmitir_UC2);
        btnOmitir_UC2.setBounds(110, 260, 210, 40);

        btnOmitir_UC1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnOmitir_UC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOmitir_UC1.setToolTipText("");
        btnOmitir_UC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 243, 238), 3));
        jPanel2.add(btnOmitir_UC1);
        btnOmitir_UC1.setBounds(60, 260, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Primer_Uso_Tipo_Cita_UC3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Primer_Uso_Tipo_Cita_UC3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Primer_Uso_Tipo_Cita_UC3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Primer_Uso_Tipo_Cita_UC3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primer_Uso_Tipo_Cita_UC3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar_UC1;
    private javax.swing.JLabel btnContinuar_UC1;
    private javax.swing.JLabel btnContinuar_UC2;
    private javax.swing.JLabel btnOmitir_UC1;
    private javax.swing.JLabel btnOmitir_UC2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
