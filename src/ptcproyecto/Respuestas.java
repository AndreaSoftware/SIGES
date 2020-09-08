/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcproyecto;

import clases.Conexion;
import clases.CrudRespuestas;
import clases.Usuario;
import clases.controlPreguntas;
import clases.usuarios;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 15-CW0001la
 */
public class Respuestas extends javax.swing.JInternalFrame {
    
    DefaultTableModel m;
    
    Scanner teclado = new Scanner(System.in);
    /**
     * Creates new form Respuestas
     */
    public Respuestas() 
    {
        initComponents();
        CargarTablaRespuestas();
        ListarPreguntas();
        jTextField1.setVisible(false);
        InputMap map2 = txtRespuesta.getInputMap(txtRespuesta.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        Login ventana = new Login();
        jLabel1.setText(ventana.ID.toString());
        System.out.println(ventana.ID);
        jLabel1.setVisible(false);
    }
    
    public void CargarTablaRespuestas()
    {
        CrudRespuestas obj = new CrudRespuestas();
        obj.CargarRespuestas(jTableRespuestas);
    }
    
    public void ListarPreguntas()
    {
        CrudRespuestas obj = new CrudRespuestas();
        obj.consultarPreguntas(cmbPregunta);
    }
    
    public void LimpiarCampos()
    {
        txtRespuesta.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel15 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbPregunta = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtI = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRespuestas = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(704, 620));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(1, 163, 201));
        kGradientPanel1.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Configuración de respuestas");
        kGradientPanel1.add(jLabel15);
        jLabel15.setBounds(160, 10, 330, 28);

        btnCerrar1.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1487086345-cross_81577.png"))); // NOI18N
        btnCerrar1.setBorder(null);
        btnCerrar1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnCerrar1);
        btnCerrar1.setBounds(640, 0, 50, 50);

        jLabel1.setText("jLabel1");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 34, 14);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 690, 55);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(490, 170, 120, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Respuesta:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 80, 70, 17);

        jPanel2.add(cmbPregunta);
        cmbPregunta.setBounds(90, 30, 500, 20);

        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar);
        btnLimpiar.setBounds(370, 170, 110, 50);

        btnImprimir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel2.add(btnImprimir);
        btnImprimir.setBounds(250, 170, 110, 50);

        txtI.setBorder(null);
        jPanel2.add(txtI);
        txtI.setBounds(590, 10, 30, 22);

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(30, 170, 100, 50);

        btnModificar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar1);
        btnModificar1.setBounds(140, 170, 100, 50);

        jTextField1.setBorder(null);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(610, 20, 20, 10);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Pregunta:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 30, 70, 17);

        txtRespuesta.setColumns(20);
        txtRespuesta.setRows(5);
        txtRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRespuestaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtRespuesta);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(90, 60, 500, 96);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 76, 632, 249);

        jTableRespuestas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableRespuestas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 340, 639, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String opcion = cmbPregunta.getSelectedItem().toString();
        if  (txtRespuesta.getText().isEmpty() ||opcion=="Preguntas" ){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else {
            CrudRespuestas obj = new CrudRespuestas();
            String Respuesta = (txtRespuesta.getText());
            obj.setRespuesta(Respuesta);
            controlPreguntas ti = (controlPreguntas)cmbPregunta.getSelectedItem();
            obj.setIDPregunta(ti.getID_pregunta());
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText()));
            if (obj.GuardarRespuesta()) 
            {
               JOptionPane.showMessageDialog(this,"Datos ingresados correctamente"); 
               CargarTablaRespuestas();
               LimpiarCampos();
               Bit.BitacoraCreateRespuestas();
            }
            else
            { 
               JOptionPane.showMessageDialog(this,"Error al guardar datos"); 
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRespuesta.setText("");
        //        cmbUsuario.set();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
      
        try
        {
            java.sql.Connection con = Conexion.conectar();
            JasperReport reporte = null;
            String path = "src\\Reportes\\Reportes-Respuestas-SIGES.jasper";
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
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String ID;
        int fsel = jTableRespuestas.getSelectedRow();
        if (fsel==-1) 
        {   
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            m = (DefaultTableModel)jTableRespuestas.getModel();
            ID = jTableRespuestas.getValueAt(fsel, 0).toString();
            txtRespuesta.setText(ID);
            CrudRespuestas obj = new CrudRespuestas();
            obj.setIDRespuesta(Integer.parseInt(txtRespuesta.getText()));
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText()));
            int Eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?","Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (Eliminar == 0) 
            {
                if (obj.EliminarRespuesta()) 
                {
                    JOptionPane.showMessageDialog(this, "Datos eliminados");
                    CargarTablaRespuestas();
                    LimpiarCampos();
                    Bit.BitacoraDeleteRespuestas();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        String IDRespuesta;
        int fsel = jTableRespuestas.getSelectedRow();
        if (fsel==-1) 
        {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String opcion = cmbPregunta.getSelectedItem().toString();
            if  (txtRespuesta.getText().isEmpty() ||opcion=="Preguntas" ){
            JOptionPane.showMessageDialog(this, "Favor de no dejar datos vacios.");
        }
        else {
            m = (DefaultTableModel)jTableRespuestas.getModel();
            IDRespuesta = jTableRespuestas.getValueAt(fsel, 0).toString();
            txtI.setText(IDRespuesta);
            int idm = Integer.parseInt(txtI.getText());
            CrudRespuestas u = new CrudRespuestas();
            u.setIDRespuesta(idm);
            u.setRespuesta(txtRespuesta.getText());
            int Tipo = cmbPregunta.getSelectedIndex();
            u.setIDPregunta(Tipo);
            clases.Bitacora Bit = new clases.Bitacora();
            Bit.setID(Integer.parseInt(jLabel1.getText()));
            if (u.ModificarRespuesta()) 
            {
                JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
                 CargarTablaRespuestas();
                 LimpiarCampos();
                 Bit.BitacoraUpdateRespuestas();
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Error al modificar los datos");
            }
        }
        }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose ();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void txtRespuestaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespuestaKeyPressed
//        if((evt.getKeyCode() < 64 || evt.getKeyCode() > 90) || (evt.getKeyCode() < 97 || evt.getKeyCode() > 122) || (evt.getKeyCode() < 48 || evt.getKeyCode() > 57) || evt.getKeyCode() != 164 || evt.getKeyCode() != 165 || evt.getKeyCode() != 44 || evt.getKeyCode() != 127 || (evt.getKeyCode() < 1 || evt.getKeyCode() > 31))
//        {
//            evt.consume();
//        }
    }//GEN-LAST:event_txtRespuestaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JComboBox<String> cmbPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRespuestas;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtI;
    private javax.swing.JTextArea txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
