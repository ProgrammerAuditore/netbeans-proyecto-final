/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author max98
 */
public class Storage {
    
    public static void fncStorageEliminarUnaLinea(String pathA, String pathB, String find_linea){
        File archivo_original = new File(pathA);
        if(archivo_original.exists()){
            try {
               
                File archivo_tmp = new File(pathB);
                if(archivo_tmp.createNewFile()){
                    FileWriter sobrescribirArchivo = new FileWriter(pathB);
                    BufferedReader leerArchivo = new BufferedReader(new FileReader(pathA));
                    String linea;
                    
                     while ((linea = leerArchivo.readLine()) != null){
                        // Sobreescribiendo archivo
                        if( !linea.equals(find_linea) )
                            sobrescribirArchivo.write( linea + "\n");
                    }
                    leerArchivo.close();
                    sobrescribirArchivo.close();
                    
                    // Cambio de storage
                    archivo_original.delete();
                    archivo_tmp.renameTo(new File(pathA));
                }
                
            } catch (IOException e) {}
        }
    }
    
    public static void fncStorageAcoplarUnaLinea(String pathA, String linea){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathA, true));
            bw.append(linea + "\n");
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}