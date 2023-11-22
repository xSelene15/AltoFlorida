/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import controlador.RegistroSocio;
import modelo.socio;
/**
 *
 * @author Orion
 */
public class Form_AgregarSocio extends javax.swing.JFrame {

    /**
     * Creates new form Form_AgregarSocio
     */
    public Form_AgregarSocio() {
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

        jPanel2 = new javax.swing.JPanel();
        jText_RutReg = new javax.swing.JTextField();
        jLabel_RutRegSocio = new javax.swing.JLabel();
        jText_DVRegSocio = new javax.swing.JTextField();
        jLabel_NombreRegSocio = new javax.swing.JLabel();
        jLabel_ApPaterRegSocio = new javax.swing.JLabel();
        jLabel_ApMaterRegSocio = new javax.swing.JLabel();
        jLabel_TelRegSocio = new javax.swing.JLabel();
        jText_NombreRegSocio = new javax.swing.JTextField();
        jText_AppaternoRegSocio = new javax.swing.JTextField();
        jText_ApmaternoRegSocio = new javax.swing.JTextField();
        jText_TelRegSocio = new javax.swing.JTextField();
        jButton_IngRegSocio = new javax.swing.JButton();
        jButton_SalirRegSocio = new javax.swing.JButton();
        jLabel_TituloRegistrarSocio = new javax.swing.JLabel();
        jLabel_Rut1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jText_direccionRegSocio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));

        jText_RutReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_RutRegActionPerformed(evt);
            }
        });

        jLabel_RutRegSocio.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel_RutRegSocio.setText("Rut");

        jText_DVRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_DVRegSocioActionPerformed(evt);
            }
        });

        jLabel_NombreRegSocio.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel_NombreRegSocio.setText("Nombre");

        jLabel_ApPaterRegSocio.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel_ApPaterRegSocio.setText("Apellido Paterno ");

        jLabel_ApMaterRegSocio.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel_ApMaterRegSocio.setText("Apellido Materno");

        jLabel_TelRegSocio.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel_TelRegSocio.setText("Teléfono");

        jText_NombreRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_NombreRegSocioActionPerformed(evt);
            }
        });

        jText_AppaternoRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_AppaternoRegSocioActionPerformed(evt);
            }
        });

        jText_ApmaternoRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ApmaternoRegSocioActionPerformed(evt);
            }
        });

        jText_TelRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_TelRegSocioActionPerformed(evt);
            }
        });

        jButton_IngRegSocio.setText("Ingresar");
        jButton_IngRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngRegSocioActionPerformed(evt);
            }
        });

        jButton_SalirRegSocio.setText("Salir");
        jButton_SalirRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirRegSocioActionPerformed(evt);
            }
        });

        jLabel_TituloRegistrarSocio.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_TituloRegistrarSocio.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel_TituloRegistrarSocio.setText("Registrar Socio");

        jLabel_Rut1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel_Rut1.setText("-");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setText("Dirección");

        jText_direccionRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_direccionRegSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel_TituloRegistrarSocio)
                .addGap(163, 163, 163))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jText_direccionRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_TelRegSocio)
                        .addGap(27, 27, 27)
                        .addComponent(jText_TelRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_NombreRegSocio)
                        .addGap(34, 34, 34)
                        .addComponent(jText_NombreRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel_ApMaterRegSocio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jText_ApmaternoRegSocio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel_ApPaterRegSocio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jText_AppaternoRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_IngRegSocio)
                                .addGap(52, 52, 52)
                                .addComponent(jButton_SalirRegSocio))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_RutRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_RutReg, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Rut1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_DVRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel_TituloRegistrarSocio)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_RutReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jText_DVRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Rut1)
                        .addComponent(jLabel_RutRegSocio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NombreRegSocio)
                    .addComponent(jText_NombreRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ApPaterRegSocio)
                    .addComponent(jText_AppaternoRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ApMaterRegSocio)
                    .addComponent(jText_ApmaternoRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TelRegSocio)
                    .addComponent(jText_TelRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_direccionRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_IngRegSocio)
                    .addComponent(jButton_SalirRegSocio))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_RutRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_RutRegActionPerformed
        this.jText_RutReg.setText("");
    }//GEN-LAST:event_jText_RutRegActionPerformed

    private void jText_NombreRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_NombreRegSocioActionPerformed
        this.jText_NombreRegSocio.setText("");
    }//GEN-LAST:event_jText_NombreRegSocioActionPerformed

    private void jText_AppaternoRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_AppaternoRegSocioActionPerformed
        this.jText_AppaternoRegSocio.setText("");
    }//GEN-LAST:event_jText_AppaternoRegSocioActionPerformed

    private void jText_ApmaternoRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ApmaternoRegSocioActionPerformed
        this.jText_ApmaternoRegSocio.setText("");
    }//GEN-LAST:event_jText_ApmaternoRegSocioActionPerformed

    private void jText_TelRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_TelRegSocioActionPerformed
        this.jText_TelRegSocio.setText("");
    }//GEN-LAST:event_jText_TelRegSocioActionPerformed

    private void jButton_IngRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngRegSocioActionPerformed
       
        String dv,nombre,appaterno,apmaterno,direccion;
        int rut, telefono;
 
        
        try {
            rut = Integer.parseInt(this.jText_RutReg.getText());
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "El Rut debe ser numérico", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jText_RutReg.requestFocus();
            return;
        }
        
        dv = this.jText_DVRegSocio.getText();
        if (dv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese DV", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jText_DVRegSocio.requestFocus();
            return;
        }
        
        nombre = this.jText_NombreRegSocio.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Nombre", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jText_NombreRegSocio.requestFocus();
            return;
        }
        
        appaterno = this.jText_AppaternoRegSocio.getText();
        if (appaterno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Apellido Paterno", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jText_AppaternoRegSocio.requestFocus();
            return;
        }
        
        apmaterno = this.jText_ApmaternoRegSocio.getText();
        if (apmaterno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Apellido Materno", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jText_ApmaternoRegSocio.requestFocus();
            return;
        }
        
        try {
            telefono = Integer.parseInt(this.jText_TelRegSocio.getText());
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "El Teléfono debe ser numérico", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jText_TelRegSocio.requestFocus();
            return;
        }
        
        direccion = this.jText_direccionRegSocio.getText();
        if (direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Direccion", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jText_direccionRegSocio.requestFocus();
            return;
        }
        
        Socio socio = new Socio(0,direccion, rut, dv, nombre, appaterno, apmaterno, telefono);
        
        RegistroSocio reg = new RegistroSocio();
        
        
        
    }                                           
                                   
    }//GEN-LAST:event_jButton_IngRegSocioActionPerformed

    private void jButton_SalirRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirRegSocioActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_SalirRegSocioActionPerformed

    private void jText_DVRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_DVRegSocioActionPerformed
        this.jText_DVRegSocio.setText("");
    }//GEN-LAST:event_jText_DVRegSocioActionPerformed

    private void jText_direccionRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_direccionRegSocioActionPerformed
        this.jText_direccionRegSocio.setText("");
    }//GEN-LAST:event_jText_direccionRegSocioActionPerformed

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
//            java.util.logging.Logger.getLogger(Form_AgregarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Form_AgregarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Form_AgregarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Form_AgregarSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form_AgregarSocio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_IngRegSocio;
    private javax.swing.JButton jButton_SalirRegSocio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ApMaterRegSocio;
    private javax.swing.JLabel jLabel_ApPaterRegSocio;
    private javax.swing.JLabel jLabel_NombreRegSocio;
    private javax.swing.JLabel jLabel_Rut1;
    private javax.swing.JLabel jLabel_RutRegSocio;
    private javax.swing.JLabel jLabel_TelRegSocio;
    private javax.swing.JLabel jLabel_TituloRegistrarSocio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jText_ApmaternoRegSocio;
    private javax.swing.JTextField jText_AppaternoRegSocio;
    private javax.swing.JTextField jText_DVRegSocio;
    private javax.swing.JTextField jText_NombreRegSocio;
    private javax.swing.JTextField jText_RutReg;
    private javax.swing.JTextField jText_TelRegSocio;
    private javax.swing.JTextField jText_direccionRegSocio;
    // End of variables declaration//GEN-END:variables
}
