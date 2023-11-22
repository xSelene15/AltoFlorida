/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import controlador.RegistroJugador;
import modelo.Jugador;

/**
 *
 * @author jjlet
 */
public class Form_BuscarJugador extends javax.swing.JFrame {

    /**
     * Creates new form Form_BuscarJugador
     */
    public Form_BuscarJugador() {
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_TituloBuscarPlantel = new javax.swing.JLabel();
        jTextField_BuscarPlantel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_BuscarPlantel = new javax.swing.JTable();
        jButton_BuscarPlantel = new javax.swing.JButton();
        jButton_AtrasBuscPlantel = new javax.swing.JButton();
        jButton_BuscarPlantel1 = new javax.swing.JButton();

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel4.setText("Ingresar Socio");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Jugador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel_TituloBuscarPlantel.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_TituloBuscarPlantel.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel_TituloBuscarPlantel.setText("Buscar Plantel");

        jTextField_BuscarPlantel.setText("Ingrese el nombre...");
        jTextField_BuscarPlantel.setToolTipText("");
        jTextField_BuscarPlantel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_BuscarPlantelFocusGained(evt);
            }
        });
        jTextField_BuscarPlantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BuscarPlantelActionPerformed(evt);
            }
        });

        jTable_BuscarPlantel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Primer Apellido", "Segundo Apellido", "Posicion", "Division"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_BuscarPlantel);

        jButton_BuscarPlantel.setText("Buscar");
        jButton_BuscarPlantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarPlantelActionPerformed(evt);
            }
        });

        jButton_AtrasBuscPlantel.setText("Atras");
        jButton_AtrasBuscPlantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtrasBuscPlantelActionPerformed(evt);
            }
        });

        jButton_BuscarPlantel1.setText("Editar Jugador");
        jButton_BuscarPlantel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarPlantel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(271, 271, 271)
                            .addComponent(jLabel_TituloBuscarPlantel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton_AtrasBuscPlantel)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField_BuscarPlantel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_BuscarPlantel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                                    .addComponent(jButton_BuscarPlantel1))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_AtrasBuscPlantel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TituloBuscarPlantel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_BuscarPlantel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_BuscarPlantel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_BuscarPlantel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_BuscarPlantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BuscarPlantelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BuscarPlantelActionPerformed
    
    private void jButton_BuscarPlantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarPlantelActionPerformed
        String nombre,apellido1, apellido2, posicion, division;
        int rut,ruttab;
        
        RegistroJugador reg = new RegistroJugador();
        DefaultTableModel modelo = (DefaultTableModel) this.jTable_BuscarPlantel.getModel();
        
        try {
            rut = Integer.parseInt(this.jTextField_BuscarPlantel.getText());
        } catch (Exception e) {
            rut = 0;
        }
        
        modelo.setRowCount(0);

        if (rut == 0) { //buscar todos

            ArrayList<Jugador> lista = null;
            try {
                lista = reg.buscarTodos();
            } catch (Exception ex) {
                Logger.getLogger(Form_BuscarJugador.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (Jugador jugador : lista) {
                ruttab = jugador.getRutPersona();
                nombre = jugador.getpNombre();
                apellido1 = jugador.getApPaterno();
                apellido2 = jugador.getApMaterno();
                posicion = jugador.getPosicion();
                division = jugador.getDivision();

                modelo.addRow(new Object[]{ruttab, nombre, apellido1, apellido2, posicion,division});
            }
        } else { //buscar por rut

            Jugador jugador = null;
            try {
                jugador = reg.buscarPorRut(rut);
            } catch (Exception ex) {
                Logger.getLogger(Form_AgregarJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
                ruttab = jugador.getRutPersona();
                nombre = jugador.getpNombre();
                apellido1 = jugador.getApPaterno();
                apellido2 = jugador.getApMaterno();
                posicion = jugador.getPosicion();
                division = jugador.getDivision();

                modelo.addRow(new Object[]{ruttab, nombre, apellido1, apellido2, posicion,division});
        }

    }//GEN-LAST:event_jButton_BuscarPlantelActionPerformed

    private void jButton_AtrasBuscPlantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtrasBuscPlantelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_AtrasBuscPlantelActionPerformed

    private void jTextField_BuscarPlantelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_BuscarPlantelFocusGained
        this.jTextField_BuscarPlantel.setText("");
    }//GEN-LAST:event_jTextField_BuscarPlantelFocusGained

    private void jButton_BuscarPlantel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarPlantel1ActionPerformed
        Form_EditarJugador editJug = new Form_EditarJugador();
        editJug.show();
    }//GEN-LAST:event_jButton_BuscarPlantel1ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Form_BuscarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Form_BuscarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Form_BuscarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Form_BuscarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form_BuscarJugador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AtrasBuscPlantel;
    private javax.swing.JButton jButton_BuscarPlantel;
    private javax.swing.JButton jButton_BuscarPlantel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_TituloBuscarPlantel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_BuscarPlantel;
    private javax.swing.JTextField jTextField_BuscarPlantel;
    // End of variables declaration//GEN-END:variables
}
