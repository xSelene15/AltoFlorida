/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
/**
 *
 * @author kalan
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu_Plantel = new javax.swing.JMenu();
        jMenuItem_BuscarPlantel = new javax.swing.JMenuItem();
        jMenuItem_RegistrarPlantel = new javax.swing.JMenuItem();
        jMenuItem_EliminarPlantel = new javax.swing.JMenuItem();
        jMenu_Socio = new javax.swing.JMenu();
        jMenuItem_BuscarSocio = new javax.swing.JMenuItem();
        jMenuItem_RegistrarSocio = new javax.swing.JMenuItem();
        jMenuItem_EliminarSocio = new javax.swing.JMenuItem();
        jMenu_Horario = new javax.swing.JMenu();
        jMenuItem_HorarioPartido = new javax.swing.JMenuItem();
        jMenu_Extra = new javax.swing.JMenu();
        jMenuItem_ExtrInfor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AltoFloridaClub");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagram-06_24511.png"))); // NOI18N
        jMenu1.setText("Inicio");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mbrilogout_99583.png"))); // NOI18N
        jMenuItem1.setText("Salir ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu_Plantel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Football_2-61_icon-icons.com_72117.png"))); // NOI18N
        jMenu_Plantel.setText("Plantel");

        jMenuItem_BuscarPlantel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        jMenuItem_BuscarPlantel.setText("Buscar ");
        jMenuItem_BuscarPlantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_BuscarPlantelActionPerformed(evt);
            }
        });
        jMenu_Plantel.add(jMenuItem_BuscarPlantel);

        jMenuItem_RegistrarPlantel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jMenuItem_RegistrarPlantel.setText("Registrar");
        jMenuItem_RegistrarPlantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegistrarPlantelActionPerformed(evt);
            }
        });
        jMenu_Plantel.add(jMenuItem_RegistrarPlantel);

        jMenuItem_EliminarPlantel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jMenuItem_EliminarPlantel.setText("Eliminar");
        jMenuItem_EliminarPlantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EliminarPlantelActionPerformed(evt);
            }
        });
        jMenu_Plantel.add(jMenuItem_EliminarPlantel);

        jMenuBar1.add(jMenu_Plantel);

        jMenu_Socio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        jMenu_Socio.setText("Socios ");

        jMenuItem_BuscarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        jMenuItem_BuscarSocio.setText("Buscar");
        jMenuItem_BuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_BuscarSocioActionPerformed(evt);
            }
        });
        jMenu_Socio.add(jMenuItem_BuscarSocio);

        jMenuItem_RegistrarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jMenuItem_RegistrarSocio.setText("Registrar");
        jMenuItem_RegistrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegistrarSocioActionPerformed(evt);
            }
        });
        jMenu_Socio.add(jMenuItem_RegistrarSocio);

        jMenuItem_EliminarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jMenuItem_EliminarSocio.setText("Eliminar");
        jMenuItem_EliminarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EliminarSocioActionPerformed(evt);
            }
        });
        jMenu_Socio.add(jMenuItem_EliminarSocio);

        jMenuBar1.add(jMenu_Socio);

        jMenu_Horario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cup_icon-icons.com_55322.png"))); // NOI18N
        jMenu_Horario.setText("Horarios ");

        jMenuItem_HorarioPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1490877818-sport-badges05_82419.png"))); // NOI18N
        jMenuItem_HorarioPartido.setText("Partidos");
        jMenuItem_HorarioPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_HorarioPartidoActionPerformed(evt);
            }
        });
        jMenu_Horario.add(jMenuItem_HorarioPartido);

        jMenuBar1.add(jMenu_Horario);

        jMenu_Extra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3844437-hamburger-list-menu-more-navigation_110311.png"))); // NOI18N
        jMenu_Extra.setText("Extras");

        jMenuItem_ExtrInfor.setText("Informacion ");
        jMenuItem_ExtrInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ExtrInforActionPerformed(evt);
            }
        });
        jMenu_Extra.add(jMenuItem_ExtrInfor);

        jMenuBar1.add(jMenu_Extra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_BuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_BuscarSocioActionPerformed
        Form_BuscarSocio search1 = new Form_BuscarSocio();
        search1.show();
    }//GEN-LAST:event_jMenuItem_BuscarSocioActionPerformed

    private void jMenuItem_ExtrInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ExtrInforActionPerformed
        Form_Informacion info = new Form_Informacion();
        info.show();
    }//GEN-LAST:event_jMenuItem_ExtrInforActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem_BuscarPlantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_BuscarPlantelActionPerformed
        Form_BuscarJugador search2 = new Form_BuscarJugador();
        search2.show();
       
    }//GEN-LAST:event_jMenuItem_BuscarPlantelActionPerformed

    private void jMenuItem_HorarioPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_HorarioPartidoActionPerformed
        Form_Partido partido = new Form_Partido();
        partido.show();
    }//GEN-LAST:event_jMenuItem_HorarioPartidoActionPerformed

    private void jMenuItem_RegistrarPlantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegistrarPlantelActionPerformed
        Form_AgregarJugador jugador = new Form_AgregarJugador();
        jugador.show();
    }//GEN-LAST:event_jMenuItem_RegistrarPlantelActionPerformed

    private void jMenuItem_RegistrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegistrarSocioActionPerformed
        Form_AgregarSocio socio = new Form_AgregarSocio();
        socio.show();
    }//GEN-LAST:event_jMenuItem_RegistrarSocioActionPerformed

    private void jMenuItem_EliminarPlantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EliminarPlantelActionPerformed
        Form_EliminarJugador elimJug = new Form_EliminarJugador();
        elimJug.show();
    }//GEN-LAST:event_jMenuItem_EliminarPlantelActionPerformed

    private void jMenuItem_EliminarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EliminarSocioActionPerformed
        Form_EliminarSocio elimSoc = new Form_EliminarSocio();
        elimSoc.show();
    }//GEN-LAST:event_jMenuItem_EliminarSocioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_BuscarPlantel;
    private javax.swing.JMenuItem jMenuItem_BuscarSocio;
    private javax.swing.JMenuItem jMenuItem_EliminarPlantel;
    private javax.swing.JMenuItem jMenuItem_EliminarSocio;
    private javax.swing.JMenuItem jMenuItem_ExtrInfor;
    private javax.swing.JMenuItem jMenuItem_HorarioPartido;
    private javax.swing.JMenuItem jMenuItem_RegistrarPlantel;
    private javax.swing.JMenuItem jMenuItem_RegistrarSocio;
    private javax.swing.JMenu jMenu_Extra;
    private javax.swing.JMenu jMenu_Horario;
    private javax.swing.JMenu jMenu_Plantel;
    private javax.swing.JMenu jMenu_Socio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
////class FondoPanel extends Jpanel
//{
//    private Image imagen;
//    
//    @Override
//    public void Paint(Graphics g)
//    {
//      imagen = new Image(getClass().getResource("/Imsgenes/e4691175-73d1-447f-a552-2c82d59cf77c.jpeg"));
//    }       
//            
}



