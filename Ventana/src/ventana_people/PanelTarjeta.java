/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana_people;

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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
        this.fncInsertarPicture(this, getClass().getResource("/img/b2.jpg").getPath(), false);
        
        // Establecer un tamaño al panel para la foto y agregar el imagen del correspondiente...
        this.panel_foto.setSize(165, 135);
        String img_profile = "";
        if( session.getStrImgPerfil().equals("user_default.png") ){
            img_profile = Rutas.path_user_default;
            this.fncInsertarPicture(this.panel_foto, img_profile , false); 
        }else{
            img_profile = Storage.fncStorageCrearRutaProfile(session.getStrEmail(), Rutas.extesion_svg);
            this.fncInsertarPicture(this.panel_foto, img_profile , false);
        }
        
        // Verificar si, si somos amigos...
        /*
        String session_friends = Storage.fncStorageCrearRutaProfile(People.session_activa.getStrEmail(), Rutas.extesion_friends);
        if( Storage.fncStorageEncontrarUnaCuenta(session_friends, this.perfil.getStrEmail() ) ){
            this.somos_amigos = true;
            this.btnAgregarAmigo.setText("Somos amigos");
        }else        
        if( Storage.fncStorageEncontrarUnaCuenta(session_friends, this.perfil.getStrEmail() + "*") ){
            this.btnAgregarAmigo.setText("Amigo+");
        }
        */
        
        // Verificar si tengo conversacion
        if(Storage.fncStorageBuscarUnaLinea(People.session_activa.stgChats, this.perfil.getStrEmail())){
            this.btnEnviarMensajeTo.setText("Mensaje+1");
            
        }
        
        //
        
       
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
        jButton3 = new javax.swing.JButton();

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

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ver perfil");

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
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
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
        // TODO add your handling code here:
            String mensaje =null;
                
            // Intentar capturar el mensaje
            try {
                mensaje = JOptionPane.showInputDialog(null, "Saluda a "+ this.perfil.getStrNombres() + " " + this.perfil.getStrApellidos());
            } catch (Exception e) {}
            
            // Si el mensaje esta vacia o se cancela, no se envia... 
            if( mensaje == null ||  mensaje.trim().isEmpty()  ){
                
                if( !(mensaje == null) ){
                    JOptionPane.showMessageDialog(null, "El mensaje esta vacio, no fue enviado");
                }else{
                    JOptionPane.showMessageDialog(null, "El mensaje no enviado");
                }
                
            }else{
                                
                // Generar mensaje...
                mensaje = People.session_activa.getStrNombres() + 
                        People.session_activa.getStrApellidos() + 
                        " ("+ People.session_activa.getStrEmail() + "): \n" +
                        mensaje + Storage.espacios;
                
                String perfil = this.perfil.getStrEmail();
                String yoker = People.session_activa.getStrEmail();
                
                // Verificar si es perfil es amigo
                if( Storage.fncStorageEncontrarUnaCuenta(People.session_activa.stgFriends, perfil) == false ){
                    // Si no somos amigos nos ponemos un *
                    perfil += "*"; // Si perfil selecciona no es amigo mio se pone un *
                    yoker += "*";
                }
                
                // Buscar el chat
                boolean db_chats = Storage.fncStorageEncontrarUnaLinea(People.session_activa.stgChats, perfil);
                boolean db_friends = Storage.fncStorageEncontrarUnaLinea(People.session_activa.stgFriends, perfil);
                
                System.out.println(" amigo = "+ perfil);
                System.out.println(" amigo = "+ yoker);
                System.out.println(" db_chats = " + db_chats);
                System.out.println(" db_friends = " + db_friends);
                
                if(db_friends == true && db_chats == true){
                    
                    // Tengo una conversacion
                    // Seleccionas al chat del perfil en mi session_activa
                    // y haces una copia a pefil
                    System.out.println("STAGE 1");
                    
                    // * Agregar el mensaje en mi cuenta o session_activa
                    String chat = Storage.fncStorageCrearRutaChats(this.perfil.getStrEmail(), People.session_activa.getStrEmail());
                    Storage.fncStorageAcoplarUnaLinea(chat, mensaje);
                    
                    // * Copiar el chat de mi cuenta o session a perfil
                    String chat_clone = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());
                    Storage.fncStorageCopiarArchivo(new File(chat), chat_clone);
                    
                    
                    JOptionPane.showMessageDialog(null, "Mensaje+1");
                    
                }else if( db_friends == true && db_chats == false ){
                    
                    // No tengo una conversacion, pero perfil si.
                    // Seleccionas al chat del perfil y agregas el mensaje
                    // despues notificas....
                    System.out.println("STAGE 2");
                    
                    // Respodiendo a perfil 
                    // Seleccionar la conversion de perfil con sesion_activa
                    String chat = Storage.fncStorageCrearRutaChats(this.perfil.getStrEmail(), People.session_activa.getStrEmail());
                    Storage.fncStorageAcoplarUnaLinea(chat, mensaje);
                    
                    
                    // Si session_activa no esta en la lista de amigo de perfil
                    if( Storage.fncStorageEncontrarUnaLinea(this.perfil.stgFriends, yoker) == false ){
                        
                        System.out.println("STAGE 2 - AAAA");
                        
                        // Constentando el mensaje deperfil
                        // Notificar - Registrar session_activa en .friends de perfil
                        // es decir, que session_activa se registra en la lista de amigos de perfil...
                        Storage.fncStorageAcoplarUnaLinea(this.perfil.stgFriends, yoker);
                        
                        // Notificar - Registrar perfil en .chats de session_activa  
                        // es decir, perfil se registra en la lista de conversaciones de session_activa
                        Storage.fncStorageAcoplarUnaLinea(People.session_activa.stgChats, perfil);
                        
                        // Clonar la conversion de perfil a session_activa
                        String chat_clone = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());
                        Storage.fncStorageCopiarArchivo(new File(chat), chat_clone);
                        
                        JOptionPane.showMessageDialog(null, "Este usuario te habia enviado un mensaje\n"+
                                "Puedes chatear con el en las lista de amigos.");
                    }else{
                        
                        System.out.println("STAGE 2 - BBBB");
                        
                        JOptionPane.showMessageDialog(null, "Mensaje enviado.");
                    }
                    
                }else if( db_friends == false && db_chats == true  ){
                    
                    // Tengo una conversion en session_activa
                    // Sin que me responda perfil
                    System.out.println("STAGE 4");
                    
                    // Agrego un nuevo mensaje a mi conversacion pendiente
                    String chat = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());
                    Storage.fncStorageAcoplarUnaLinea(chat, mensaje);
                    
                    JOptionPane.showMessageDialog(null, "Mensaje enviado.");
                    
                    
                    
                }else if( db_friends == false && db_chats == false ){
                    
                    // Crear una conversacion
                    String chat = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());
                    
                    try {
                        if( new File(chat).createNewFile() ){
                            
                            System.out.println("STAGE 5");
                            
                            // * Agregar el mensaje
                            Storage.fncStorageAcoplarUnaLinea(chat, mensaje);
                            
                            // * Notificar - Registra a perfil en el .chats de session_activa
                            // es decir session_activa abre una conversacion....
                            Storage.fncStorageAcoplarUnaLinea(People.session_activa.stgChats, perfil);
                            
                            // * Notificar - Registra a perfil en el .friends de session_activa
                            // es decir session_activa se registra en lista de amigos de pefil....
                            Storage.fncStorageAcoplarUnaLinea(this.perfil.stgFriends, yoker);
                            
                            // Mensaje de salida
                            JOptionPane.showMessageDialog(null, "Mensaje enviado.\nEl usuario no aparece en tu lista de amigos\n"+
                                    "Espera su respuesta para conversar.");
                            
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(PanelTarjeta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }

                
            }
        
    }//GEN-LAST:event_btnEnviarMensajeToMouseReleased
    
    private void btnAgregarAmigoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseReleased
        // TODO add your handling code here:
        /*
        String session_friends = Storage.fncStorageCrearRutaProfile(People.session_activa.getStrEmail(), Rutas.extesion_friends);
        String session_chats = Storage.fncStorageCrearRutaProfile(People.session_activa.getStrEmail(), Rutas.extesion_chats);
        
        if(this.somos_amigos == true){
            int respuesta = JOptionPane.showConfirmDialog(null, this.perfil.getStrNombres() + " y tú son amigos.\nDeseas eliminar de tu lista de amigos?");
            
            if(respuesta == 0){
                // Eliminar de mi lista de amigos
                //Storage.fncStorageEliminarUnaLinea(new File(session_friends), this.perfil.getStrEmail() );
                
                // Si tenemos una conversacion pendiente, entonces te los paso
                if( Storage.fncStorageBuscarUnaLinea(session_chats, this.perfil.getStrEmail()) ){
                    
                    try {
                        //Storage.fncStorageAcoplarUnaLinea(session_friends, this.perfil.getStrEmail() + "*" );
                        String pathA = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail(), Rutas.storage_chats);
                        String pathB = Storage.fncStorageCrearRutaChats(this.perfil.getStrEmail(), People.session_activa.getStrEmail(), Rutas.storage_chats);
                        Storage.fncStorageMoverArchivo(new File(pathA), pathB );
                    } catch (IOException ex) {
                        Logger.getLogger(PanelTarjeta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                //this.btnAgregarAmigo.setText("Amigos+");
            }
            
        }
       */
        
    }//GEN-LAST:event_btnAgregarAmigoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAmigo;
    private javax.swing.JButton btnEnviarMensajeTo;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_sexo;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panel_foto;
    // End of variables declaration//GEN-END:variables
    private Session perfil;
    private Session session;
    private boolean solicitud_enviada = false;
    private boolean somos_amigos = false;
    private boolean chat_pendiente = false;
    
    private void fncInsertarPicture(JPanel contenedor, String url, boolean vaciar){
        
        if(vaciar) contenedor.removeAll();
        
        System.out.println(url);
        ImageIcon icono = new ImageIcon( url );
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(0, 0, contenedor.getWidth(), contenedor.getHeight());
        etiquetaImagen.setIcon( new ImageIcon(icono.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)) );
        contenedor.add(etiquetaImagen);
        
        if(vaciar) contenedor.validate();
        if(vaciar) contenedor.repaint();
    }
}
