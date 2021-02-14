/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaCliente;

import javax.swing.JOptionPane;
import capaLogica.Usuario;
import capaDatos.ListaUsuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
/**
 *
 * @author Josue
 */
public class FrmRegistro extends javax.swing.JFrame {

    
   
    /**
     * Creates new form FrmRegistro
     */
    public FrmRegistro() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEtiquetaTitulo = new javax.swing.JLabel();
        lblEtiquetaRegistroU = new javax.swing.JLabel();
        lblEtiquetaRegistroC = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtContraseña2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEtiquetaRegistroC2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEtiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEtiquetaTitulo.setText("REGISTRO DE USUARIOS");
        getContentPane().add(lblEtiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lblEtiquetaRegistroU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEtiquetaRegistroU.setText("Introduce un nombre de usuario:");
        getContentPane().add(lblEtiquetaRegistroU, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        lblEtiquetaRegistroC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEtiquetaRegistroC.setText("Confirme su contraseña:");
        getContentPane().add(lblEtiquetaRegistroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, 40));

        btnInicio.setText("Iniciar Sesion");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 200, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 200, -1));
        getContentPane().add(txtContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 430, -1));

        jLabel3.setText("¿ Ya tienes un usuario? Inicia sesion dando click al boton de abajo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        lblEtiquetaRegistroC2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEtiquetaRegistroC2.setText("Introduce una contraseña:");
        getContentPane().add(lblEtiquetaRegistroC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String nombre = txtNombre.getText();
        String contra = txtContraseña2.getText();
        String password = txtContraseña.getText();
        Usuario objeto = new Usuario();
        ListaUsuario obj = new ListaUsuario();
        if(password.equals("") || nombre.equals("") || contra.equals("")){
            JOptionPane.showMessageDialog(null, "CAMPOS VACIOS.");
        }else{
            if(contra.equals(password)){
            objeto.setNombre(nombre);
            objeto.setPassword(password);
            obj.agregar(objeto);
            txtNombre.setText("");
            txtContraseña.setText("");
            JOptionPane.showMessageDialog(this, "USUARIO RESGISTRADO EXITOSAMENTE.");
            FrmInicio abrir = new FrmInicio();
            abrir.setVisible(true);
            this.dispose();
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "TE PEDIMOS LLENAR EL SIGUIENTE FORMULARIO");
            
            }else{
                JOptionPane.showMessageDialog(this, "CONTRASEÑAS DIFERENTES");
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        FrmInicio abrir = new FrmInicio();
        abrir.setVisible(true);
        this.dispose();
        FrmRegistro cerrar = new FrmRegistro();
        cerrar.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEtiquetaRegistroC;
    private javax.swing.JLabel lblEtiquetaRegistroC2;
    private javax.swing.JLabel lblEtiquetaRegistroU;
    private javax.swing.JLabel lblEtiquetaTitulo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtContraseña2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}