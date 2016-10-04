import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.PriorityQueue;

/**
 *
 * @author LuisEstuardo
 */
public class Main {
    public static void main(String[] args) {
        String nombre;
        String estado;
        String prioridad;

        File archivo = null;
        FileReader filer = null;
        BufferedReader buffer = null;

        
        //String cadena = "";
        
        //Archivo datos = new Archivo();//creando objeto de clase Archivo para leer el texto
        //cadena = datos.leerTexto("C:\\Users\\LuisEstuardo\\Desktop\\Archivo.txt");//direccion en la computadora para el texto
        //System.out.println(cadena);        

        PriorityQueue<Paciente> caso = new PriorityQueue<Paciente>();
        
        try {
          
           archivo = new File ("C:\\Users\\LuisEstuardo\\Desktop\\Archivo.txt");
           filer = new FileReader (archivo);
           buffer = new BufferedReader(filer);

           String a = buffer.readLine();

           System.out.println("los pacientes que deben ser atendidos asi");

           while(a!=null){
              int posicion1 = a.indexOf(',');
              nombre = a.substring(0, posicion1);
              String b = a.substring(posicion1+2);

              int posicion2= b.indexOf(',');
              estado = b.substring(0, posicion2);
              prioridad = b.substring(posicion2+2);

              System.out.println(a);

              Paciente enfermo = new Paciente(nombre, estado, prioridad);

              caso.add(enfermo);
              
              //System.out.println(caso.element());
              //System.out.println(caso.peek());
              System.out.println(caso);
              //System.out.println(caso.element());
              
              
              
              a = buffer.readLine();
           }
        }
        catch(Exception e){
        }finally{
           try{                    
              if( null != filer ){   
                 filer.close();     
              }                  
           }catch (Exception e1){ 
           }
        }
        
    }
    
}

