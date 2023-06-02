
package utilidades;

/**
 * Excepción que controla la decisión del usuario/a.
 * 
 * @author Adrián Arjona
 */
public class ExcepcionDecisionUsuario extends Exception{
    
    /**
     * Excepción de la clase ExcepcionDecisionUsuario.
     * 
     * @param msj Mensaje tipo String para el usuario/a.
     */
    public ExcepcionDecisionUsuario(String msj){
        
        super(msj) ;
    }
}
