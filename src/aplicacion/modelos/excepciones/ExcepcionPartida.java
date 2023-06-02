
package aplicacion.modelos.excepciones;

/**
 * Clase que aloja la excepción de la clase Partida.
 * 
 * @author Adrián Arjona
 * @version junio 2023
 */
public class ExcepcionPartida extends Exception{
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 11: Gestión de bases de datos relacionales.
    */
    
    
    /**
     * Excepción de la clase Partida.
     * 
     * @param msj Mensaje que se muestra al usuario/a.
     */
    public ExcepcionPartida(String msj) {
        
        super(msj) ;
    }
    
}
