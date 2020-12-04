/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import clases.Amistad;
import clases.Mensaje;
import clases.Rutas;
import clases.Session;
import clases.Storage;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ventana_people.People;
import ventana_profile.Profile;

/**
 *
 * @author victo
 */
public class PanelTarjeta extends javax.swing.JPanel {

    /**
     * Creates new form Cuenta
     */
    public PanelTarjeta() {
        initComponents();
    }
    
    public PanelTarjeta(Session session) {
        initComponents();
        this.perfil = session;
        
        // Establecer el tamaño del boton enviar mensaje
        this.btnEnviarMensajeTo.setSize(new Dimension(125, 27));
        this.btnEnviarMensajeTo.setPreferredSize(new Dimension(125, 27));
            
        
        this.campo_nombres.setText( session.getStrNombres() + " " + session.getStrApellidos() );
        this.campo_nombres.setEnabled(false);
        
        this.campo_sexo.setText( "Sexo: " + session.getStrSexo());
        this.campo_sexo.setEnabled(false);
        
        this.campo_email.setText( session.getStrEmail() );
        this.campo_email.setEditable(false);

        
        // Establecer un tamaño al panel para la tarjeta y agregar un imagen de fondo
        this.setSize(600, 135);
        Storage.fncStorageInsertarPicture(this, Rutas.path_background_panel_paneltarjeta, false);
        
        // Establecer un tamaño al panel para la foto y agregar el imagen del correspondiente...
        this.panel_foto.setSize(165, 135);
        String img_profile = Storage.fncStorageObtenerImgProfile(this.perfil);
        Storage.fncStorageInsertarPicture(this.panel_foto, img_profile, true);
        
        // * Verificar si hay una conversación con perfil
        if(Storage.fncStorageBuscarUnaLinea(People.session_activa.stgChats, this.perfil.getStrEmail())){
            this.btnEnviarMensajeTo.setText("Mensaje+1");    
        }
        
        // * Verificar amistad con perfil
        String estado = Storage.fncStorageVerificarAmistad(People.session_activa.stgFriends, this.perfil.getStrEmail());
        
        // ****** TESTING
        System.out.println("Estado >>> " + estado );
        
        if(estado.equals("amigos")){
            this.btnAgregarAmigo.setText("Son "+ estado + "...");
        }else if( estado.equals("none") || estado.equals("pendiente") ){
            this.btnAgregarAmigo.setText("Amigo+1");
        }else{
            this.btnAgregarAmigo.setText("Solicitud "+estado);
        }
        
        
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarAmigo = new javax.swing.JButton();
        btnEnviarMensajeTo = new javax.swing.JButton();
        panel_foto = new javax.swing.JPanel();
        campo_nombres = new javax.swing.JTextField();
        campo_sexo = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        btnVerPerfil = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarAmigo.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigo.setText("Amigo+");
        btnAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseReleased(evt);
            }
        });

        btnEnviarMensajeTo.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviarMensajeTo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarMensajeTo.setText("Enviar mensaje");
        btnEnviarMensajeTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEnviarMensajeToMouseReleased(evt);
            }
        });

        panel_foto.setPreferredSize(new java.awt.Dimension(165, 135));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        campo_nombres.setText("jTextField1");

        campo_sexo.setText("jTextField1");

        campo_email.setText("jTextField1");

        btnVerPerfil.setBackground(new java.awt.Color(0, 153, 204));
        btnVerPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPerfil.setText("Ver perfil");
        btnVerPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVerPerfilMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(campo_sexo)
                    .addComponent(campo_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnviarMensajeTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerPerfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarMensajeTo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAmigo)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(panel_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMensajeToMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMensajeToMouseReleased
       
        this.fncEnviarMensaje();
        
    }//GEN-LAST:event_btnEnviarMensajeToMouseReleased
    
    private void btnAgregarAmigoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseReleased
        this.fncAgregarAmigoPlus();
    }//GEN-LAST:event_btnAgregarAmigoMouseReleased

    private void btnVerPerfilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPerfilMouseReleased
        
        // Se borra la ventana People liberando memoria
        People.CerrarVentana = true;
        this.padre.setVisible(false);
        
        // Se inicializa la vetana People
        if( !this.padre.isVisible() ){
            Profile ventana = new Profile( People.session_activa, this.perfil );
            ventana.ventana_People = true; // Inidicar a la ventana que vuelva a People
            People.session_activa = null; // En la ventana People se elimina la session activa
            ventana.setVisible(true);
            ventana.fncBienvenidoToPerfil();
        }
        
    }//GEN-LAST:event_btnVerPerfilMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAmigo;
    private javax.swing.JButton btnEnviarMensajeTo;
    private javax.swing.JButton btnVerPerfil;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_sexo;
    private javax.swing.JPanel panel_foto;
    // End of variables declaration//GEN-END:variables
    private Session perfil;
    private Session session;
    private boolean solicitud_enviada = false;
    public JFrame padre;
    
    private void fncAgregarAmigoPlus() {
        
        Amistad solicitud = new Amistad(People.session_activa);
        solicitud.ventana_People = true;
        solicitud.fncAmistadEnviarSolicitudTo(this.perfil);
        
        if( solicitud.getOperacion().equals("cancelado") || solicitud.getOperacion().equals("eliminado") ){
            this.btnAgregarAmigo.setText("Amigo+1");
        }else{
            this.btnAgregarAmigo.setText("Solicitud " + solicitud.getOperacion());
        }   
        
    }

    private void fncEnviarMensaje(){
            
        // * Restriccion de mensaje
        // Si el perfil seleccionado es amigo de session_activa puede enviar mensaje...
        if(Storage.fncStorageEncontrarUnaLinea(People.session_activa.stgFriends, this.perfil.getStrEmail()+Storage.identificador_amigo1)){
            // * Testing
            System.out.println("Enviar mensaje a ....");

            try {
                // * Intentar capturar el mensaje...
                String mensaje = JOptionPane.showInputDialog(null,"Escribe un mensaje");

                if( mensaje.isEmpty() && mensaje != null ){

                    if(mensaje.isEmpty())
                    JOptionPane.showMessageDialog(null, "El mensaje no puede estar vacio. No fue enviado.");

                }else{

                    // * Enviar mensaje to ...
                    Mensaje conversacion = new Mensaje(People.session_activa, mensaje.trim());
                    conversacion.fncMensajeEnviarMensajeTo(this.perfil);  

                }

            } catch (Exception e) { }
        }else{
            JOptionPane.showMessageDialog(null, "Este perfil no es tu amigo, enviale una solicitud de amistad.");
        }
        
    }
}
