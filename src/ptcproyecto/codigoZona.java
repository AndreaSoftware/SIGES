/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import clases.conexion;
import clases.controlCodigoZona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 15-CW0001la
 */
public class codigoZona extends javax.swing.JInternalFrame {

    /**
     * Creates new form codigoZona
     */
    public codigoZona() {
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

        JPForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcodigoZona = new javax.swing.JTable();
        btnlimpiar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtcodigozona = new javax.swing.JTextField();

        JPForm.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo Zona");

        BtnCerrar.setToolTipText("");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPFormLayout = new javax.swing.GroupLayout(JPForm);
        JPForm.setLayout(JPFormLayout);
        JPFormLayout.setHorizontalGroup(
            JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFormLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187)
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPFormLayout.setVerticalGroup(
            JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFormLayout.createSequentialGroup()
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Codigo Zona");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(32, 15, 78, 29);

        btnguardar.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btnguardar.setText("Guardar ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar);
        btnguardar.setBounds(20, 60, 89, 23);

        btnmodificar.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnmodificar);
        btnmodificar.setBounds(120, 60, 95, 23);

        tblcodigoZona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcodigoZona.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblcodigoZonaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblcodigoZona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcodigoZonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcodigoZona);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(17, 103, 530, 242);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnlimpiar);
        btnlimpiar.setBounds(340, 60, 97, 23);

        btneliminar.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar);
        btneliminar.setBounds(230, 60, 97, 23);
        jPanel2.add(txtcodigozona);
        txtcodigozona.setBounds(128, 19, 258, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(383, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose ();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int codigo_zona = Integer.parseInt (txtcodigozona.getText());
        try
        {
            Connection con = conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO codigo_zona(codigo_zona) VALUES (?)");
            ps.setInt(1, codigo_zona);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiar();
            cargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        int codigo_zona = Integer.parseInt (txtcodigozona.getText());
        try
        {
            Connection con = conexion.conectar();
            PreparedStatement ps = con.prepareStatement("UPDATE codigo_zona SET codigo_zona = ? WHERE id = ?");
            ps.setInt(1, codigo_zona);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");
            limpiar();
            cargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void tblcodigoZonaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblcodigoZonaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblcodigoZonaAncestorAdded

    private void tblcodigoZonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcodigoZonaMouseClicked
        try
        {
            int fila = tblcodigoZona.getSelectedRow();
            int id = Integer.parseInt(tblcodigoZona.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = conexion.conectar();
            ps = con.prepareStatement("SELECT codigo_zona FROM codigo_zona WHERE id=? ");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next())
            {
                txtcodigozona.setText(rs.getString("codigo_zona"));
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblcodigoZonaMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
//        int idCodigoZona = Integer.parseInt(txtid.getText());
//        try
//        {
//            Connection con = conexion.conectar();
//            PreparedStatement ps = con.prepareStatement("DELETE FROM  codigo_zona WHERE id =?");
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Registro Eliminado");
//            limpiar();
//            cargarTabla();
//        }
//        catch(SQLException e)
//        {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
    }//GEN-LAST:event_btneliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JPanel JPForm;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcodigoZona;
    private javax.swing.JTextField txtcodigozona;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtcodigozona.setText(" ");
    }

    private void cargarTabla() {
        
    }
}