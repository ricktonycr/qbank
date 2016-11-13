/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorPantUserTipo;
import controlador.ControladorPantUsuario;
import modelo.UserTipoDAO;
import modelo.UsuarioDAO;

/**
 *
 * @author richard
 */
public class FormPantPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPantPrincipal
     */
    public FormPantPrincipal() {
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

        Escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Administrador = new javax.swing.JMenu();
        MantenimientoUsuario = new javax.swing.JMenuItem();
        MantenimientoArea = new javax.swing.JMenuItem();
        MantenimientoCurso = new javax.swing.JMenuItem();
        MantenimientoBalota = new javax.swing.JMenuItem();
        MantenimientoSecundario = new javax.swing.JMenu();
        UserTipo = new javax.swing.JMenuItem();
        DificultadTipo = new javax.swing.JMenuItem();
        AreaDetalle = new javax.swing.JMenuItem();
        Formulador = new javax.swing.JMenu();
        Examen = new javax.swing.JMenuItem();
        Digitador = new javax.swing.JMenu();
        MantenimientoPreguntas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Administrador.setMnemonic('f');
        Administrador.setText("Administrador");

        MantenimientoUsuario.setMnemonic('o');
        MantenimientoUsuario.setText("Mantener Usuarios");
        MantenimientoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoUsuarioActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoUsuario);

        MantenimientoArea.setMnemonic('s');
        MantenimientoArea.setText("Mantener áreas");
        MantenimientoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoAreaActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoArea);

        MantenimientoCurso.setMnemonic('a');
        MantenimientoCurso.setText("Mantener cursos");
        MantenimientoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoCursoActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoCurso);

        MantenimientoBalota.setMnemonic('x');
        MantenimientoBalota.setText("Mantener Balotas");
        MantenimientoBalota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoBalotaActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoBalota);

        menuBar.add(Administrador);

        MantenimientoSecundario.setMnemonic('e');
        MantenimientoSecundario.setText("Mantenimiento Secundario");

        UserTipo.setMnemonic('t');
        UserTipo.setText("Tipos de usuario");
        UserTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTipoActionPerformed(evt);
            }
        });
        MantenimientoSecundario.add(UserTipo);

        DificultadTipo.setMnemonic('y');
        DificultadTipo.setText("Tipo de dificultad");
        DificultadTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificultadTipoActionPerformed(evt);
            }
        });
        MantenimientoSecundario.add(DificultadTipo);

        AreaDetalle.setMnemonic('p');
        AreaDetalle.setText("Detalle de área");
        AreaDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaDetalleActionPerformed(evt);
            }
        });
        MantenimientoSecundario.add(AreaDetalle);

        menuBar.add(MantenimientoSecundario);

        Formulador.setText("Formulador");

        Examen.setText("Examen");
        Examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenActionPerformed(evt);
            }
        });
        Formulador.add(Examen);

        menuBar.add(Formulador);

        Digitador.setMnemonic('h');
        Digitador.setText("Digitador");

        MantenimientoPreguntas.setMnemonic('c');
        MantenimientoPreguntas.setText("Preguntas");
        MantenimientoPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoPreguntasActionPerformed(evt);
            }
        });
        Digitador.add(MantenimientoPreguntas);

        menuBar.add(Digitador);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenimientoBalotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoBalotaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaBalota internal = new PantallaBalota("Usuarios",true,true,true,true);
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoBalotaActionPerformed

    private void MantenimientoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoUsuarioActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaUsuario internal = new PantallaUsuario("Usuarios",true,true,true,true);
        UsuarioDAO usuarioC  = new UsuarioDAO();
        ControladorPantUsuario controladorC = new ControladorPantUsuario(internal, usuarioC);
        controladorC.inicializarusuarioCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoUsuarioActionPerformed

    private void MantenimientoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoAreaActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaArea internal = new PantallaArea("Usuarios",true,true,true,true);
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoAreaActionPerformed

    private void UserTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTipoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaUserTipo internal = new PantallaUserTipo("Usuarios",true,true,true,true);
        UserTipoDAO userTipoC  = new UserTipoDAO();
        ControladorPantUserTipo controladorC = new ControladorPantUserTipo(internal, userTipoC);
        controladorC.inicializarUserTipoCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_UserTipoActionPerformed

    private void AreaDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaDetalleActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaAreaDet internal = new PantallaAreaDet("Usuarios",true,true,true,true);
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_AreaDetalleActionPerformed

    private void MantenimientoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoCursoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaCurso internal = new PantallaCurso("Usuarios",true,true,true,true);
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoCursoActionPerformed

    private void DificultadTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificultadTipoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaDificultadTipo internal = new PantallaDificultadTipo("Usuarios",true,true,true,true);
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_DificultadTipoActionPerformed

    private void MantenimientoPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoPreguntasActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaPregunta internal = new PantallaPregunta("Usuarios",true,true,true,true);
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoPreguntasActionPerformed

    private void ExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaExamen internal = new PantallaExamen("Usuarios",true,true,true,true);
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_ExamenActionPerformed

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
            java.util.logging.Logger.getLogger(FormPantPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPantPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPantPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPantPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPantPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu Administrador;
    private javax.swing.JMenuItem AreaDetalle;
    private javax.swing.JMenuItem DificultadTipo;
    public javax.swing.JMenu Digitador;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem Examen;
    public javax.swing.JMenu Formulador;
    private javax.swing.JMenuItem MantenimientoArea;
    private javax.swing.JMenuItem MantenimientoBalota;
    private javax.swing.JMenuItem MantenimientoCurso;
    private javax.swing.JMenuItem MantenimientoPreguntas;
    public javax.swing.JMenu MantenimientoSecundario;
    private javax.swing.JMenuItem MantenimientoUsuario;
    private javax.swing.JMenuItem UserTipo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
    public String userTipo;
    
}
