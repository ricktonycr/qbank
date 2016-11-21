/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorPantArea;
import controlador.ControladorPantAreaDet;
import controlador.ControladorPantBalota;
import controlador.ControladorPantCurso;
import controlador.ControladorPantDificultad;
import controlador.ControladorPantExamen_cab;
import controlador.ControladorPantPregunta;
import controlador.ControladorPantUserTipo;
import controlador.ControladorPantUsuario;
import javax.swing.JDesktopPane;
import modelo.AreaDAO;
import modelo.AreaDetalleDAO;
import modelo.BalotaDAO;
import modelo.CursoDAO;
import modelo.DificultadDAO;
import modelo.Examen_cabDAO;
import modelo.PreguntaDAO;
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
        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo pantalla.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        Escritorio.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 590);

        Administrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479712763_Key.png"))); // NOI18N
        Administrador.setMnemonic('f');
        Administrador.setText("Administrador");

        MantenimientoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479712780_User.png"))); // NOI18N
        MantenimientoUsuario.setMnemonic('o');
        MantenimientoUsuario.setText("Mantener Usuarios");
        MantenimientoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoUsuarioActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoUsuario);

        MantenimientoArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479712828_Download_1.png"))); // NOI18N
        MantenimientoArea.setMnemonic('s');
        MantenimientoArea.setText("Mantener áreas");
        MantenimientoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoAreaActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoArea);

        MantenimientoCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479717476_17_Paste_16x16.png"))); // NOI18N
        MantenimientoCurso.setMnemonic('a');
        MantenimientoCurso.setText("Mantener cursos");
        MantenimientoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoCursoActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoCurso);

        MantenimientoBalota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479712839_Edit_1.png"))); // NOI18N
        MantenimientoBalota.setMnemonic('x');
        MantenimientoBalota.setText("Mantener Balotas");
        MantenimientoBalota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoBalotaActionPerformed(evt);
            }
        });
        Administrador.add(MantenimientoBalota);

        menuBar.add(Administrador);

        MantenimientoSecundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479717667_032.png"))); // NOI18N
        MantenimientoSecundario.setMnemonic('e');
        MantenimientoSecundario.setText("Mantenimiento Secundario");

        UserTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479714811_Copy v2.png"))); // NOI18N
        UserTipo.setMnemonic('t');
        UserTipo.setText("Tipos de usuario");
        UserTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTipoActionPerformed(evt);
            }
        });
        MantenimientoSecundario.add(UserTipo);

        DificultadTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479717065_Properties.png"))); // NOI18N
        DificultadTipo.setMnemonic('y');
        DificultadTipo.setText("Tipo de dificultad");
        DificultadTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificultadTipoActionPerformed(evt);
            }
        });
        MantenimientoSecundario.add(DificultadTipo);

        AreaDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479717455_29_House_16x16.png"))); // NOI18N
        AreaDetalle.setMnemonic('p');
        AreaDetalle.setText("Detalle de área");
        AreaDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaDetalleActionPerformed(evt);
            }
        });
        MantenimientoSecundario.add(AreaDetalle);

        menuBar.add(MantenimientoSecundario);

        Formulador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479714677_Paste.png"))); // NOI18N
        Formulador.setText("Formulador");

        Examen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479717715_pdf.png"))); // NOI18N
        Examen.setText("Examen");
        Examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenActionPerformed(evt);
            }
        });
        Formulador.add(Examen);

        menuBar.add(Formulador);

        Digitador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479718723_laptop.png"))); // NOI18N
        Digitador.setMnemonic('h');
        Digitador.setText("Digitador");

        MantenimientoPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479717520_16_Copy_16x16.png"))); // NOI18N
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
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenimientoBalotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoBalotaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaBalota internal = new PantallaBalota("Balota",true,true,true,true);
        BalotaDAO usuarioC  = new BalotaDAO();
        ControladorPantBalota controladorC = new ControladorPantBalota(internal, usuarioC);
        controladorC.inicializarBalotaCRUD();
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
        controladorC.inicializarUsuarioCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoUsuarioActionPerformed

    private void MantenimientoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoAreaActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaArea internal = new PantallaArea("Area",true,true,true,true);
        AreaDAO areaC  = new AreaDAO();
        ControladorPantArea controladorC = new ControladorPantArea(internal, areaC);
        controladorC.inicializarAreaCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoAreaActionPerformed

    private void UserTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTipoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaUserTipo internal = new PantallaUserTipo("Tipos de usuarios",true,true,true,true);
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
        PantallaAreaDet internal = new PantallaAreaDet("Detalles de área",true,true,true,true);
        AreaDetalleDAO areaDetalleC  = new AreaDetalleDAO();
        ControladorPantAreaDet controladorC = new ControladorPantAreaDet(internal, areaDetalleC);
        controladorC.inicializarAreaDetCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_AreaDetalleActionPerformed

    private void MantenimientoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoCursoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaCurso internal = new PantallaCurso("Curso",true,true,true,true);
        CursoDAO cursoC  = new CursoDAO();
        ControladorPantCurso controladorC = new ControladorPantCurso(internal, cursoC);
        controladorC.inicializarCursoCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoCursoActionPerformed

    private void DificultadTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificultadTipoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaDificultadTipo internal = new PantallaDificultadTipo("Dificultad",true,true,true,true);
        DificultadDAO dificultadC  = new DificultadDAO();
        ControladorPantDificultad controladorC = new ControladorPantDificultad(internal, dificultadC);
        controladorC.inicializarDificultadCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_DificultadTipoActionPerformed

    private void MantenimientoPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoPreguntasActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaPregunta internal = new PantallaPregunta("Preguntas",true,true,true,true);
        PreguntaDAO dificultadC  = new PreguntaDAO();
        ControladorPantPregunta controladorC = new ControladorPantPregunta(internal, dificultadC);
        controladorC.inicializarUsuarioCRUD();
        Escritorio.add(internal);
        internal.show();
    }//GEN-LAST:event_MantenimientoPreguntasActionPerformed

    private void ExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PantallaExamen_cab internal = new PantallaExamen_cab("Examen",true,true,true,true);
        Examen_cabDAO examen_cab  = new Examen_cabDAO();
        ControladorPantExamen_cab controladorC = new ControladorPantExamen_cab(internal, examen_cab, Escritorio);
        controladorC.inicializarExamen_cabCRUD();
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
    public javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem Examen;
    public javax.swing.JMenu Formulador;
    private javax.swing.JMenuItem MantenimientoArea;
    private javax.swing.JMenuItem MantenimientoBalota;
    private javax.swing.JMenuItem MantenimientoCurso;
    private javax.swing.JMenuItem MantenimientoPreguntas;
    public javax.swing.JMenu MantenimientoSecundario;
    private javax.swing.JMenuItem MantenimientoUsuario;
    private javax.swing.JMenuItem UserTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
    public String userTipo;
    
    
    public JDesktopPane getEscritorio(){
        return Escritorio;
    }
}
