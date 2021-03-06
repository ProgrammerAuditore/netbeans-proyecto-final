/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watcher;

import clases.Observador;
import clases.Rutas;
import clases.Session;
import clases.Storage;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import paneles.PanelTarjeta;
import ventana_people.People;

/**
 *
 * @author max98
 */
public class peopleWatcherProfile extends Observador{
    private JPanel panel_perfiles;
    private JFrame JFramePadre;
    private int coordenadaY = 20;
    
    public peopleWatcherProfile(File path) {
        super(path);
    }

    public peopleWatcherProfile(String path, JPanel perfiles) {
        super(new File(path));
        this.panel_perfiles = perfiles;
    }
    
    public void Inicializar(){
        
        if(this.fncVerificarCambiosEnElArchivoPath()){

            try {
                
                panel_perfiles.removeAll();
                File archivo = new File(Rutas.path_profiles);
                BufferedReader db_profiles = new BufferedReader(new FileReader(archivo));
                String linea;

                while ((linea = db_profiles.readLine()) != null) {
                
                    // * Obtener el email correcto
                    linea = Storage.fncStorageObtenerEmailProfile(linea);
                    
                    if ( !linea.isEmpty() && linea.contains(Storage.extension_rs) ) {
                        // * Verificar si existe una cuenta
                        boolean cuenta = Storage.fncStorageBuscarUnaLinea(Rutas.path_profiles, linea);
                        boolean cuenta_data = new File( new Session(linea).stgData).exists();
                        File cuenta_contenedor = new File( Rutas.storage_profiles + new Session(linea).getStrEmail()  );

                        if( (cuenta_contenedor.isDirectory() && cuenta_contenedor.exists()) && (cuenta == true && cuenta_data)
                        && linea.contains(People.session_activa.getStrEmail()) == false ){
                            // * Mostrando el perfil de la cuenta...
                            PanelTarjeta a = new PanelTarjeta(new Session(linea));
                            a.padre = JFramePadre;
                            a.setBounds(60, coordenadaY, 600, 135);
                            panel_perfiles.add(a);
                            panel_perfiles.validate();
                            panel_perfiles.repaint();
                            coordenadaY += 20 + a.getHeight();
                        }
                    }
                    
                }
                
                if( panel_perfiles.getComponentCount() == 0 ){
                    
                    // * Insertar una etiqueta por defecto
                    JLabel a = new JLabel("No hay perfiles que mostrar aún...");
                    a.setForeground(Color.WHITE);
                    a.setBounds(290, 10, 220, 20);
                    panel_perfiles.add(a);
                    panel_perfiles.validate();
                    panel_perfiles.repaint();
                    
                }

                panel_perfiles.setPreferredSize(new Dimension(0, coordenadaY));
                panel_perfiles.validate();
                panel_perfiles.revalidate();
                panel_perfiles.repaint();
                coordenadaY = 20;
                db_profiles.close();
                
            } catch (IOException e) {}
            
        }
        
    }
    
    // Metodos setters
    public void setPanel_perfiles(JPanel panel_perfiles) {
        this.panel_perfiles = panel_perfiles;
    }

    public void JFramePadre(JFrame JFpadre) {
        this.JFramePadre = JFpadre;
    }
    
}
