/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 30
 * Grupo: Luis Abadia, Maria Fernanda Estrada y Jorge Suchite
 * @author Fernanda Estrada
 * Programa para calcular en formato POSTFIX
 */

/**
 *
 * @author LuisEstuardo
 */

import java.io.*;

public class Archivo {
   
    public String leerTexto(String archivo){
    
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(archivo));//direccion del archivo
            String temporal = "";//creamos una variable temporal
            String bfRead;
            
            while ((bfRead = bf.readLine()) !=null){//se hara el cilco mientras bfRead tiene datos
                temporal = temporal + bfRead;///para que se almacene todo el archivo, lo guardamos
        }
            texto = temporal;//guardamos en una variable el texto
            
        }catch(Exception e){
            System.out.println("No hay datos!!  =(");
        }
        
        return texto;
        
    }
}
