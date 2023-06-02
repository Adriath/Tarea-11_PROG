
package aplicacion.modelos;

/**
 * Clase que define un jugador de Tuki Tuki.
 * 
 * @author Adrián Arjona
 * @version Junio 2023
 */
public class Jugador {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 11: Gestión de bases de datos relacionales.
    */
    
    
    // ------------------ DECLARACIÓN DE VARIABLES -----------------
    
    String nombre ;
    int puntosActuales ;
    int puntosTotales ;
    
    
    // ------------------- DECLARAICÓN DE MÉTODOS -------------------

    
        // ----- CONTRUCTOR POR DEFECTO -------
    
        public Jugador() {
            
            this.nombre = "" ;
            this.puntosActuales = 0 ;
            this.puntosTotales = 0 ;
        }
    
        // ---- CONSTRUCTOR CON PARÁMETROS -----
    
        public Jugador(String nombre, int puntosActuales, int puntosTotales) {
            
            this.nombre = nombre;
            this.puntosActuales = puntosActuales;
            this.puntosTotales = puntosTotales;
        }
    
    
    
}
