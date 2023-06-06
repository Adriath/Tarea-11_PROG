
package aplicacion.modelos;

import aplicacion.modelos.excepciones.ExcepcionJugador;

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
    
    /**
     * Total de partidas jugadas.
     */
    private int partidasJugadas ;
    
    /**
     * Total de partidas ganadas.
     */
    private int partidasGanadas ;
    
//    /**
//     * Indica si ha ganado la partida.
//     */
//    private boolean esGanador ;
    
    
    // ------------------- DECLARAICÓN DE MÉTODOS -------------------

    
        // ----- CONSTRUCTOR POR DEFECTO -------
    
        
        /**
         * Constructor por defecto de la clase Jugador.
         */
        public Jugador() {
            
            this.nombre = "" ;
            this.puntosActuales = 0 ;
            this.puntosTotales = 0 ;
            this.partidasJugadas = 0 ;
            this.partidasGanadas = 0 ;
//            this.esGanador = false ;
        }
    
        // ---- CONSTRUCTORES CON PARÁMETROS -----
    
        
        /**
         * Constructor con parámetros de la clase Jugador.
         * Crea el/la jugador/a a partir del nombre. 
         * Enfocado a la ejecución local de una partida.
         * 
         * @param nombre Nombre del jugador/a.
         * @throws ExcepcionJugador 
         */
        public Jugador(String nombre) throws ExcepcionJugador{
            
            this.setNombre(nombre) ;
            this.puntosActuales = 0 ;
            this.puntosTotales = 0 ;
            this.partidasJugadas = 0 ;
            this.partidasGanadas = 0 ;
//            this.esGanador = false ;
            
        }

        
        /**
         * Constructor con parámetros de la clase Jugador.
         * Es el que se utiliza para el ranking ya que se necesita un objeto 
         * Jugador para almacenar los datos ya existentes.
         * Enfocado a la comunicación con la base de datos.
         * Los parámetros coinciden con la base de datos.
         * 
         * @param nombre Nombre del jugador/a
         * @param puntosTotales Puntos totales
         * @param partidasJugadas Total de partidas jugadas
         * @param partidasGanadas Total de partidas ganadas
         */
        public Jugador(String nombre, int puntosTotales, int partidasJugadas, int partidasGanadas) {
            this.nombre = nombre;
            puntosActuales = 0 ;
            this.puntosTotales = puntosTotales;
            this.partidasJugadas = partidasJugadas;
            this.partidasGanadas = partidasGanadas;
//            this.esGanador = false ;
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
                
                this.puntosActuales = puntosActuales ;
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
                
                this.puntosTotales += puntosTotales ;
            }
            
            
            // PARTIDAS JUGADAS

            
            /**
             * Método que devuelve el total de las partidas jugadas.
             * 
             * @return Total de partidas jugadas.
             */
            public int getPartidasJugadas() {
                
                return partidasJugadas;
            }

            
            /**
             * Método que modifica el total de partidas jugadas.
             * Suma una partida al total.
             * 
             */
            public void setPartidasJugadas() {
                
                this.partidasJugadas++ ;
            }
            
            
            /**
             * Método que modifica el total de partidas jugadas.Suma una partida al total.
             *
             * @param partidasJugadas Total de partidas jugadas.
             */
            public void setPartidasJugadas(int partidasJugadas) {
                
                this.partidasJugadas = partidasJugadas ;
            }

            
            // PARTIDAS GANADAS

            
            /**
             * Método que devuelve el total de las partidas ganadas.
             * 
             * @return Total de partidas ganadas.
             */
            public int getPartidasGanadas() {
                
                return partidasGanadas ;
            }

            
            /**
             * Método que modifica el total de partidas ganadas.
             * Suma una partida al total.
             * 
             */
            public void setPartidasGanadas() {
                
                this.partidasGanadas++ ;
            }
            
            
            /**
             * Método que modifica el total de partidas ganadas.
             * 
             * @param partidasGanadas Total de partidas ganadas.
             */
            public void setPartidasGanadas(int partidasGanadas) {
                
                this.partidasGanadas = partidasGanadas ;
            }
            
            
            
//            // ES GANADOR
//
//            
//            /**
//             * Método que devuelve si el/la jugador/a es ganador/a.
//             * 
//             * @return Si se ha ganado la partida. True gana, false pierde.
//             */
//            public boolean isEsGanador() {
//                
//                return esGanador;
//            }
//
//            
//            /**
//             * Método que modifica el estado del jugador/a entre perder y ganar.
//             * 
//             * @param esGanador Estado del jugador/a (ganar o perder).
//             */
//            public void setEsGanador(boolean esGanador) {
//                
//                this.esGanador = esGanador;
//            }

            
        
        
        // -------- TO STRING ---------            

        
        /**
         * Método toString() de la clase Jugador.
         * 
         * @return Devuelve los datos relevantes del jugador/a.
         */
            @Override
        public String toString() {
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("\nJugador/a = ").append(getNombre());
            sb.append(" \n// Puntos = ").append(getPuntosTotales()) ;
            sb.append(" \n// Partidas jugadas = ").append(getPartidasJugadas()) ;
            sb.append(" \n// Partidas ganadas = ").append(getPartidasGanadas()) ;
            
            return sb.toString();
        }
        
}
