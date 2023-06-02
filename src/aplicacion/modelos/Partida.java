
package aplicacion.modelos;

import java.util.ArrayList;

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
    
    private byte rondas ;
    private byte numJugadores ;
    private int puntos ;
    private ArrayList<Jugador> listaJugadores ;
    
    
    // ------------------ DECLARACIÓN DE MÉTODOS ------------------------
    
    
        // --- CONSTRUCTOR POR DEFECTO ---

        
        public Partida() {
            
        this.rondas = 0 ;
        this.numJugadores = 0 ;
        this.puntos = 0 ;
        this.listaJugadores = null ;
            
        }

    
        // --- CONSTRUCTOR CON PARÁMETROS ---
        
        public Partida(byte rondas, byte numJugadores, int puntos, ArrayList<Jugador> listaJugadores) {
            
            
        }
        
        
        // --- GETTERS & SETTERS ---

            // RONDAS
        
            public byte getRondas() {
                return rondas;
            }

            public void setRondas(byte rondas) {
                this.rondas = rondas;
            }

            // NÚMERO DE JUGADORES
            
            public byte getNumJugadores() {
                return numJugadores;
            }

            public void setNumJugadores(byte numJugadores) {
                this.numJugadores = numJugadores;
            }

            // PUNTOS
            
            public int getPuntos() {
                return puntos;
            }

            public void setPuntos(int puntos) {
                this.puntos = puntos;
            }

            // LISTA DE JUGADORES
            
            public ArrayList<Jugador> getListaJugadores() {
                return listaJugadores;
            }

            public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
                this.listaJugadores = listaJugadores;
            }
        
        
    
}
