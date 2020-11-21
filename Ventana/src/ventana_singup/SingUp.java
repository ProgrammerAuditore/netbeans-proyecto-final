/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana_singup;

// Importar mis clases
import clases.*;
import ventana_pricipal.Principal;
import jpanelimagen.ImagenFondo;

// Importar librerias java
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author max98
 */
public class SingUp extends javax.swing.JFrame {

    /**
     * Creates new form SingUp
     */
    public SingUp() {  
        initComponents();
        this.InicializarVentana();
    }
    
    public SingUp(Session session_activa) {
        initComponents();
        this.session_activa = session_activa;
        this.InicializarVentana();
    }

    public Session getSession_activa() {
        return session_activa;
    }

    public void setSession_activa(Session session_activa) {
        this.session_activa = session_activa;
    }
    
    public void fncMostrarMensajeDeBienvenida(){
        JOptionPane.showMessageDialog(null, "Hola, " + session_activa.getStrNombres() + " bienvenido a RS Gobim.");
    }
    
    public void fncDetectandoMensajes() throws FileNotFoundException, IOException{
        /*
        this.mensajes.removeAllElements();
        this.llistaMensajes.removeAll();
        DefaultListModel a = new DefaultListModel();
        
        File archivo = new File( Rutas.db_chat + session_activa.getStrEmail() + ".txt" );
        BufferedReader br = new BufferedReader( new FileReader(archivo) );
        String st; 
        
        while ((st = br.readLine()) != null){
            mensajes.addElement(st);
        }
        
        this.llistaMensajes.setModel(mensajes);
        this.llistaMensajes.setAutoscrolls(true);
        this.llistaMensajes.setSelectedIndex( 1 );
        //System.out.println(st); 
        */
        
        /*
        // Cambiar foto de perfil
        JFileChooser elegirArchivo = new JFileChooser();
        elegirArchivo.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("gif","jpg","jpeg", "png");
        elegirArchivo.addChoosableFileFilter(filter);
        int respuesta = elegirArchivo.showOpenDialog(this);
        
        if( respuesta == JFileChooser.APPROVE_OPTION ){
            File archivo = elegirArchivo.getSelectedFile();
            
            try {
                this.fncCopiarImagen(archivo.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(SingUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.session_activa.fncActualizarDatos();
            this.fncInsertarPicture(this.panel_foto_de_perfil, Rutas.db_img + this.session_activa.getStrImgPerfil() , true);
        }
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_2_Background = new jpanelimagen.JPanelImagen();
        panel_foto_de_perfil = new javax.swing.JPanel();
        panel_portada = new jpanelimagen.JPanelImagen();
        campo_nombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        campo_correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        campo_sexo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        opcionesDeCuenta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel_foto_de_perfil.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto_de_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_foto_de_perfilMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_foto_de_perfilLayout = new javax.swing.GroupLayout(panel_foto_de_perfil);
        panel_foto_de_perfil.setLayout(panel_foto_de_perfilLayout);
        panel_foto_de_perfilLayout.setHorizontalGroup(
            panel_foto_de_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        panel_foto_de_perfilLayout.setVerticalGroup(
            panel_foto_de_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_portada.setBackground(new java.awt.Color(204, 255, 255));

        campo_nombres.setEditable(false);
        campo_nombres.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Nombre (s):");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Apellido (s):");

        campo_apellidos.setEditable(false);
        campo_apellidos.setText("jTextField1");

        campo_correo.setEditable(false);
        campo_correo.setText("jTextField1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Sexo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Correo:");

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar Session");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 204, 0));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modifcar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnModificarMouseReleased(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(204, 204, 0));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnActualizarMouseReleased(evt);
            }
        });

        campo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        javax.swing.GroupLayout panel_portadaLayout = new javax.swing.GroupLayout(panel_portada);
        panel_portada.setLayout(panel_portadaLayout);
        panel_portadaLayout.setHorizontalGroup(
            panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_portadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(campo_nombres)
                    .addComponent(jLabel3)
                    .addComponent(campo_sexo, 0, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(57, 57, 57)
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        panel_portadaLayout.setVerticalGroup(
            panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_portadaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
            .addGroup(panel_portadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("Ver amigos");

        jButton5.setText("People");

        opcionesDeCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones", "Cambiar foto de background", "Cambiar foto de perfil", "Eliminar cuenta" }));
        opcionesDeCuenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcionesDeCuentaItemStateChanged(evt);
            }
        });
        opcionesDeCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcionesDeCuentaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcionesDeCuentaMouseReleased(evt);
            }
        });
        opcionesDeCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesDeCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(266, 266, 266)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opcionesDeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(opcionesDeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_2_BackgroundLayout = new javax.swing.GroupLayout(panel_2_Background);
        panel_2_Background.setLayout(panel_2_BackgroundLayout);
        panel_2_BackgroundLayout.setHorizontalGroup(
            panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_2_BackgroundLayout.createSequentialGroup()
                        .addComponent(panel_foto_de_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_portada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_2_BackgroundLayout.setVerticalGroup(
            panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_portada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_foto_de_perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_2_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_2_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_foto_de_perfilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_foto_de_perfilMouseReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_panel_foto_de_perfilMouseReleased

    private void btnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseReleased
        // TODO add your handling code here:
        this.btnModificar.setEnabled(false);
        this.btnActualizar.setEnabled(true);
        this.fncCambiarEstados(true);
    }//GEN-LAST:event_btnModificarMouseReleased

    private void btnActualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseReleased
        // TODO add your handling code here:
        this.btnModificar.setEnabled(true);
        this.btnActualizar.setEnabled(false);
        this.fncCambiarEstados(false);
    }//GEN-LAST:event_btnActualizarMouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        // TODO add your handling code here:
        Principal ventana_principal = new Principal();
        ventana_principal.setVisible(true);
        this.session_activa.CerrarSession();
        this.dispose();
    }//GEN-LAST:event_jButton2MouseReleased

    private void opcionesDeCuentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcionesDeCuentaItemStateChanged
        // TODO add your handling code here:                
    }//GEN-LAST:event_opcionesDeCuentaItemStateChanged

    private void opcionesDeCuentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionesDeCuentaMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_opcionesDeCuentaMouseReleased

    private void opcionesDeCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionesDeCuentaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_opcionesDeCuentaMouseClicked

    private void opcionesDeCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesDeCuentaActionPerformed
        // TODO add your handling code here:
        abc@quasar.org
    }//GEN-LAST:event_opcionesDeCuentaActionPerformed
    
    private void fncCambiarEstados(boolean opcion){
        this.campo_nombres.setEditable(opcion);
        this.campo_apellidos.setEditable(opcion);
        this.campo_correo.setEditable(opcion);
        this.campo_sexo.setEnabled(opcion);
 
    }
    
    private void InicializarVentana(){
        this.setLocationRelativeTo(null);
        this.panel_2_Background.setImagenFondo(new ImagenFondo( new java.io.File( getClass().getResource("/img/b3.jpg").getPath() ), 1.0f ));
        this.panel_portada.setImagenFondo(new ImagenFondo( new java.io.File( getClass().getResource("/img/b1.jpg").getPath() ), .2f ));
        
        
        this.btnModificar.setEnabled(true);
        this.btnActualizar.setEnabled(false);
        this.fncCambiarEstados(false);
        this.campo_correo.setEnabled(false);
        
        this.fncInsertarPicture(this.panel_foto_de_perfil, Rutas.db_img + session_activa.getStrImgPerfil(), false);
        this.campo_nombres.setText( session_activa.getStrNombres() );
        this.campo_apellidos.setText( session_activa.getStrApellidos());
        this.campo_correo.setText( session_activa.getStrEmail());
        this.campo_sexo.setSelectedItem(session_activa.getStrSexo());
    }
    
    
    private void fncCopiarImagen(String img) throws FileNotFoundException, IOException{
        String short_name = session_activa.getStrEmail() + ".SVG";
        FileInputStream in = new FileInputStream(img);
        FileOutputStream ou = new FileOutputStream( Rutas.db_img + short_name);
        BufferedInputStream bin = new BufferedInputStream(in);
        BufferedOutputStream bou = new BufferedOutputStream(ou);
        session_activa.setStrImgPerfil(short_name);
        
        int b=0;
        while(b!=-1){
         b=bin.read();
         bou.write(b);
        }
        
        bin.close();
        bou.close();
    }
    
    private void fncInsertarPicture(JPanel contenedor, String url, boolean vaciar){
        
        if(vaciar) contenedor.removeAll();
        
        ImageIcon icono = new ImageIcon( url );
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(0, 0, contenedor.getWidth(), contenedor.getHeight());
        etiquetaImagen.setIcon( new ImageIcon(icono.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)) );
        contenedor.add(etiquetaImagen);
        
        if(vaciar) contenedor.validate();
        if(vaciar) contenedor.repaint();
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
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JComboBox<String> campo_sexo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> opcionesDeCuenta;
    private jpanelimagen.JPanelImagen panel_2_Background;
    private javax.swing.JPanel panel_foto_de_perfil;
    private jpanelimagen.JPanelImagen panel_portada;
    // End of variables declaration//GEN-END:variables
    Session session_activa;
    DefaultListModel mensajes = new DefaultListModel();
}
