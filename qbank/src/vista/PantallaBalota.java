/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author richard
 */
public class PantallaBalota extends javax.swing.JInternalFrame {

    /**
     * Creates new form PantallaBalota
     */
    public PantallaBalota() {
        initComponents();
    }
    
    public PantallaBalota(String arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg1,arg2,arg3,arg4,arg5);
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

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        cboxCurso = new javax.swing.JComboBox<>();
        bttnNuevo = new javax.swing.JButton();
        bttnGuardar = new javax.swing.JButton();
        bttnEliminar = new javax.swing.JButton();
        bttnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosBalota = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 155, -1));

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción:");
        getContentPane().add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 155, -1));

        lblCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCurso.setForeground(new java.awt.Color(255, 255, 255));
        lblCurso.setText("Curso:");
        getContentPane().add(lblCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        cboxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 155, -1));

        bttnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479709665_New.png"))); // NOI18N
        bttnNuevo.setText("Nuevo");
        getContentPane().add(bttnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 97, 110, -1));

        bttnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479702704_Save.png"))); // NOI18N
        bttnGuardar.setText("Guardar");
        getContentPane().add(bttnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 110, -1));

        bttnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479702714_Remove.png"))); // NOI18N
        bttnEliminar.setText("Eliminar");
        getContentPane().add(bttnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 110, 30));

        bttnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1479702744_Preview.png"))); // NOI18N
        bttnModificar.setText("Modificar");
        getContentPane().add(bttnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 110, -1));

        DatosBalota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(DatosBalota);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 630, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administracion de Balota");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo pantalla.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable DatosBalota;
    public javax.swing.JButton bttnEliminar;
    public javax.swing.JButton bttnGuardar;
    public javax.swing.JButton bttnModificar;
    public javax.swing.JButton bttnNuevo;
    public javax.swing.JComboBox<String> cboxCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblCurso;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
