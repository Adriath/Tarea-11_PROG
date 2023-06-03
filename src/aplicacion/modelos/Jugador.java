
package aplicacion.modelos;

import aplicacion.modelos.excepciones.ExcepcionJugador;
import aplicacion.modelos.excepciones.ExcepcionPartida;

/**
 * Clase que define un/a jugador/a de Tuki Tuki.
 * 
 * @author Adrián Arjona
 * @version Junio 2023
 */
public class Jugador {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 11: Gestión de bases de datos relacionales.
    */
    
    
    // ------------------ DECLARACIÓN DE VARIABLES -----------------
    
    /**
     * Nombre del jugador/a. 
     * Tendrá un límite de 20 caracteres.
     */
    private String nombre ;
    
    /**
     * Puntos en la actual partida.
     */
    private int puntosActuales ;
    
    /**
     * Puntos totales en todas sus partidas.
     */
    private int puntosTotales ;
    
    
    // ------------------- DECLARAICÓN DE MÉTODOS -------------------

    
        // ----- CONSTRUCTOR POR DEFECTO -------
    
        public Jugador() {
            
            this.nombre = "" ;
            this.puntosActuales = 0 ;
            this.puntosTotales = 0 ;
        }
    
        // ---- CONSTRUCTOR CON PARÁMETROS -----
    
        public Jugador(String nombre, int puntosActuales, int puntosTotales) throws ExcepcionJugador{
            
            this.setNombre(nombre) ;
            this.puntosActuales = puntosActuales ;
            this.puntosTotales = puntosTotales ;
            
        }
    
    
        // ----- GETTERS & SETTERS -----

            
            // NOMBRE
        
            
            /**
             * Método que devuelve el nombre del jugador/a.
             * 
             * @return Nombre del jugador/a.
             */
            public String getNombre() {
                
                return nombre;
            }
            

            /**
             * Método que modifica el nombre del jugador/a.
             * 
             * @param nombre Nombre del jugador/a.
             * @throws ExcepcionJugador 
             */
            public void setNombre(String nombre) throws ExcepcionJugador{
                
                if ( (nombre.length() > 0) && (nombre.length() <= 20) ) 
                {
                    this.nombre = nombre;
                }
                else
                {
                    throw new ExcepcionJugador("El nombre del jugador/a no puede tener más de 20 caracteres.") ;
                }
            }
            
            
            // PUNTOS ACTUALES
            

            /**
             * Método que devuelve los puntos del jugador/a durante una partida.
             * 
             * @return Puntos del jugador/a.
             */
            public int getPuntosActuales() {
                
                return puntosActuales;
            }

            /**
             * Método que modifica los puntos actuales del jugador/a.
             * 
             * @param puntosActuales Puntos actuales.
             */
            public void setPuntosActuales(int puntosActuales) {
                
                this.puntosActuales = puntosActuales;
            }
            
            
            // PUNTOS TOTALES
            

            /**
             * Método que devuelve los puntos totales del jugador/a.
             * 
             * @return Puntos totales del jugador/a durante todas sus partidas.
             */
            public int getPuntosTotales() {
                return puntosTotales;
            }

            
            /**
             * Método que modifica los puntos totales del jugador/a.
             * 
             * @param puntosTotales Puntos totales.
             */
            public void setPuntosTotales(int puntosTotales) {
                
                this.puntosTotales = puntosTotales;
            }
        
        
        // -------- TO STRING ---------            

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("\nJugador/a = ").append(nombre);
            sb.append(" // Puntos = ").append(puntosActuales) ;
            
            return sb.toString();
        }
        
        
        
        // --------------------------------------------------
        // -------------- MAIN DE PRUEBAS -------------------
        // --------------------------------------------------
        
            
        public static void main(String[] args) {
        
         Partida partida1 = null;
         
         Jugador listaJugadores[] = new Jugador[3]; 
         
         Jugador jugador1 = null ;
         Jugador jugador2 = null ;
         Jugador jugador3 = null ;
         
         try
         {
            jugador1 = new Jugador("Adrián", 0, 0) ;
            jugador2 = new Jugador("Sara", 0, 0) ;
            jugador3 = new Jugador("Margari", 0, 0) ;
         }
         catch(ExcepcionJugador e){
             
             System.out.println("Error jugador") ;
         }
         
         
         try
         {
             partida1 = new Partida((byte)2, (byte)3, 0, listaJugadores) ;
         }
         catch(ExcepcionPartida e){
             System.out.println(e.getMessage()) ;
         }
         
        
         
         listaJugadores[0] = jugador1 ;
         listaJugadores[1] = jugador2 ;
         listaJugadores[2] = jugador3 ;
         
         jugador1.setPuntosActuales(50);
         jugador2.setPuntosActuales(30);
         jugador3.setPuntosActuales(-4);
         
            System.out.println(partida1.toString());
            for (int i = 0; i < listaJugadores.length; i++) 
            {
                System.out.println(listaJugadores[i].toString() );
            }
    }
}
