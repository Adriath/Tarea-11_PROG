
package aplicacion.modelos;

import aplicacion.modelos.excepciones.ExcepcionJugador;
import aplicacion.modelos.excepciones.ExcepcionPartida;

/**
 * Plantilla de una partida de Tuki Tuki.
 * 
 * @author Adrián Arjona
 */
public class Partida {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 11: Gestión de bases de datos relacionales.
    */
    
    
    // -------------- DECLARACIÓN DE VARIABLES ---------------------
    
    /**
     * Número de rondas que tendrá la partida.
     * De 1 a 5 rondas.
     */
    private byte rondas ;
    
    /**
     * Número de jugadores de la partida.
     * De 2 a 6 jugadores.
     */
    private byte numJugadores ;
    
    /**
     * Número de puntos del jugador.
     */
    private int puntos ;
    
    /**
     * Lista de jugadores de la partida.
     */
    private Jugador[] listaJugadores ;
    
    
    // ------------------ DECLARACIÓN DE MÉTODOS ------------------------
    
    
        // --- CONSTRUCTOR POR DEFECTO ---

        
        public Partida() {
            
        this.rondas = 0 ;
        this.numJugadores = 0 ;
        this.puntos = 0 ;
        this.listaJugadores = new Jugador[6] ;
        }

    
        // --- CONSTRUCTOR CON PARÁMETROS ---
        
        public Partida(byte rondas, byte numJugadores, int puntos, Jugador[] listaJugadores) throws ExcepcionPartida{
            
            this.setRondas(rondas) ;
            this.setNumJugadores(numJugadores) ;
            this.setPuntos(puntos) ;
            this.setListaJugadores(listaJugadores) ;
        }
        
        
        // --- GETTERS & SETTERS ---

        
            // RONDAS
        
            /**
             * Método que devuelve el número de rondas.
             * 
             * @return Devuelve el número de rondas.
             */
            public byte getRondas() {
                
                return rondas;
            }

            
            /**
             * Método que modifica el número de rondas.
             * 
             * @param rondas Número de rondas de la partida.
             * @throws ExcepcionPartida 
             */
            public void setRondas(byte rondas) throws ExcepcionPartida{
                
                if ( (rondas > 0) & (rondas <= 5)) 
                {
                    this.rondas = rondas ;
                }
                else
                {
                    throw new ExcepcionPartida("Puedes jugar desde 1 hasta 5 rondas.") ;
                }
            }

            
            
            // NÚMERO DE JUGADORES
            
            
            /**
             * Método que devuelve el número de jugaodores.
             * 
             * @return Devuelve el número de jugadores.
             */
            public byte getNumJugadores() {
                
                return numJugadores;
            }

            
            
            /**
             * Método que modifica el número de jugadores de una partida.
             * 
             * @param numJugadores Número de jugadores.
             * @throws ExcepcionPartida 
             */
            public void setNumJugadores(byte numJugadores) throws ExcepcionPartida{
                
                if ( (numJugadores >= 2) && (numJugadores <= 6 )) 
                {
                    this.numJugadores = numJugadores ;
                }
                else
                {
                    throw new ExcepcionPartida("La partida es entre 2-6 jugadores.") ;
                }
            }

            
            
            // PUNTOS
            
            /**
             * Método que devuelve el número de puntos en la partida.
             * 
             * @return Devuelve el número de puntos.
             */
            public int getPuntos() {
                
                return puntos;
            }

            
            /**
             * Método que modifica el número de puntos.
             * 
             * @param puntos Número de puntos.
             */
            public void setPuntos(int puntos) {
                
                this.puntos = puntos;
            }

            
            
            // LISTA DE JUGADORES
            

            /**
             * Método que devuelve la lista de jugadores de la partida.
             * 
             * @return Devuelve la lista de jugadores
             */
            public Jugador[] getListaJugadores() {
                
                return listaJugadores;
            }
            
            
            
            /**
             * Método que modifica la lista de jugadores de la partida.
             * 
             * @param listaJugadores Lista de jugadores.
             */
            public void setListaJugadores(Jugador[] listaJugadores) throws ExcepcionPartida{
                
                if ( (numJugadores >= 2) && (numJugadores <= 6) )
                {
                    this.listaJugadores = listaJugadores;
                }
                else
                {
                    throw new ExcepcionPartida("El número de jugadores tiene que ser de entre 2 y 6.") ;
                }
            }

            
        // --- TO STRING ---

        /**
         * Método toString() de la clase Partida.
         * 
         * @return Devuelve los datos de la partida.
         */
        @Override
        public String toString() {

            StringBuilder sb = new StringBuilder() ;
            
            sb.append("Número de rondas = ").append(rondas) ;
            sb.append("\nNúmero de jugadores = ").append(numJugadores) ;
            sb.append("\nPUNTUACIONES: ") ;
            sb.append("\n---------------- = ") ;

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