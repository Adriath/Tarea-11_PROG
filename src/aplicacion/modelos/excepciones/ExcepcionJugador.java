package aplicacion.modelos.excepciones;



/**
 * Clase que alberga la excepción del jugador/a.
 * @author Adrián Arjona
 * @version junio 2023
 */
public class ExcepcionJugador extends Exception{
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 11: Gestión de bases de datos relacionales.
    */
    
    
    /**
     * Excepción de la clase Jugador.
     * 
     * @param msj Mensaje que se muestra al usuario/a.
     */
    public ExcepcionJugador(String msj){
        
        super(msj) ;
    }
    
}
