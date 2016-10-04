/*
 *Luis Estuardo Abadía Lopez
 *carnet 13300
 *Hoja de trabajo 8
 */

/**
 *
 * @author LuisEstuardo
 */
public class Paciente implements Comparable<Paciente> {

    //Definimos las variables que debe tener cada paciente
    private String nombre; 
    private String estado;
    private String prioridad;

    //Constructor de la clase
    public Paciente(String nombre, String estado, String prioridad){
        //Se guardan los datos que recibe en las variables locales de la clase
        this.nombre = nombre;
        this.estado = estado;
        this.prioridad = prioridad;
}
    
    public String getNombre(){
        return nombre;    
}
    
    
public String getEstado(){
        return estado;
 }
    
    
public String getpriority(){
       return prioridad;  
 }
//Metodo que compara el paciente actual con el siguiente con el tag de prioridad
public int compareTo(Paciente siguiente){

    if (getpriority().compareTo(siguiente.getpriority()) > 0){
        return 1;
    }
    else if (getpriority().compareTo(siguiente.getpriority()) < 0){
        return -1;
	}
    else 
    return 0;
    
}

    public String toString(){
        return (nombre+" - "+estado+" - "+prioridad);
    } 
}


