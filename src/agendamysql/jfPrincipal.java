/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamysql;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Batman
 */

public class jfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfPrincipal
     */
    
    DefaultTableModel tablaModelo = new DefaultTableModel();
    List<datosDTO> listaDatos = new ArrayList<>();
    int vid = 0 ;
    public jfPrincipal() {
        initComponents();
        cargartitulos();
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistra = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnLimpia = new javax.swing.JButton();
        btnActualiza = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agenda");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Sexo");

        btnRegistra.setText("Registrar");
        btnRegistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraActionPerformed(evt);
            }
        });

        btnElimina.setText("Eliminar");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        btnLimpia.setText("Limpiar");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        btnActualiza.setText("Actualizar");
        btnActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(btnRegistra))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(89, 89, 89)
                                        .addComponent(btnElimina)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualiza)
                                    .addComponent(btnLimpia)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistra)
                        .addComponent(btnActualiza)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnElimina)
                            .addComponent(btnLimpia))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed
        txtnombre.setText("");
        txtedad.setText("");
        txtsexo.setText("");
    }//GEN-LAST:event_btnLimpiaActionPerformed

    private void btnRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraActionPerformed
        datosDTO datos = new datosDTO();
        ConexionDAO conexion = new ConexionDAO();
        
        datos.setNombre(txtnombre.getText());
        datos.setEdad(txtedad.getText());
        datos.setSexo(txtsexo.getText());
        
        if(conexion.insertar(datos)){
            JOptionPane.showMessageDialog(this, "Se registro correctamente..." ,
                    "Registro" , JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaultTableModel) tablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al insertar..." ,
                    "Error" , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistraActionPerformed

    private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed
        // TODO add your handling code here:
        
        ConexionDAO conexion = new ConexionDAO();
        datosDTO datos = new datosDTO();
        
        datos.setId(vid);
        datos.setNombre(txtnombre.getText());
        datos.setEdad(txtedad.getText());
        datos.setSexo(txtsexo.getText());
        
        if(conexion.actualizar(datos)){
            JOptionPane.showMessageDialog(this, "Se actualizo correctamente..." ,
                    "Actualización" , JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaultTableModel) tablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
            
        }else{
             JOptionPane.showMessageDialog(this, "Error al actualizar..." ,
                    "Error" , JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_btnActualizaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        // TODO add your handling code here:
        datosDTO datos = new datosDTO();
        ConexionDAO conexion = new ConexionDAO();
        
        datos.setId(vid);
        
        if(conexion.eliminar(datos)){
            JOptionPane.showMessageDialog(this, "Se elimino correctamente..." ,
                    "Eliminación" , JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaultTableModel) tablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar..." ,
                    "Error" , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
       int nfilas = 0;
       int fila = 0; 
        nfilas = tablaDatos.getSelectedRow();
        if(nfilas==1){
            fila = tablaDatos.getSelectedRow();
            vid = (int) tablaDatos.getValueAt(fila, 0);
            txtnombre.setText((String) tablaDatos.getValueAt(fila, 1));
            txtedad.setText((String) tablaDatos.getValueAt(fila, 2));
            txtsexo.setText((String) tablaDatos.getValueAt(fila, 3));
            
            
       }
    }//GEN-LAST:event_tablaDatosMouseClicked

    private void cargar(){
        ConexionDAO conexion = new ConexionDAO();
        if(conexion.cargar()){
            listaDatos = conexion.getDatos();
        }else{
             JOptionPane.showMessageDialog(this, "Error al cargar la información..." ,
                    "Error" , JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(listaDatos.size()>0 && listaDatos != null){
            cargarcontenido();
        }
    }
    
    private void cargarcontenido(){
        Object [] filatabla = new Object[4];
        for(datosDTO datos : listaDatos){
            filatabla[0] = datos.getId();
            filatabla[1] = datos.getNombre();
            filatabla[2] = datos.getEdad();
            filatabla[3] = datos.getSexo();
            tablaModelo.addRow(filatabla);
        }
        
        tablaDatos.setModel(tablaModelo);
    }
    
    public void cargartitulos(){
        tablaModelo.addColumn("id");
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Edad");
        tablaModelo.addColumn("Sexo");
        tablaDatos.setModel(tablaModelo);
    }
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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiza;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnLimpia;
    private javax.swing.JButton btnRegistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
