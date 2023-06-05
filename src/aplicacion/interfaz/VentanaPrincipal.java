
package aplicacion.interfaz;

import aplicacion.modelos.Jugador;
import aplicacion.modelos.Partida;
import aplicacion.modelos.excepciones.ExcepcionJugador;
import aplicacion.modelos.excepciones.ExcepcionPartida;
import javax.swing.table.DefaultTableModel;
import utilidades.Utilidades;

/**
 * Ventana principal de la aplicación para contabilizar partidas de Tuki Tuki.
 * 
 * @author Adrián Arjona
 * @version Junio 2023
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    
    // ----------- DECLARACIÓN DE VARIABLES --------------
    
    private byte numeroRondas ;
    private byte numeroJugadores ;
    
    private static int ronda = 0;
    
    private static Jugador[] listaJugadores ;
//    private static int[] listaPuntos ;
    
    private static Object[][] data ;
    private static Object[][] data2 ;
    
    private static Partida partida ;
    
    
    // -------------- OONSTRUCTOR -------------------
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    
    
    // -------------- MÉTODOS PERSONALIZADOS -----------------
    
    
    private static void aniadirJugadores(byte numeroJugadores){
        
        boolean validador = false ;
        
        
        listaJugadores = new Jugador[numeroJugadores] ;
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            do 
            {
                String nombre = Utilidades.leerCadenaGUI("Introduce el nombre del jugador/a " + (i + 1)) ;
                validador = false ;
                
                try
                {
                    listaJugadores[i] = new Jugador(nombre) ;
                    
                    if (listaJugadores[i] != null) 
                    {
                        validador = true ;
                    }
                }
                catch(ExcepcionJugador e){

                    Utilidades.mostrarMensajeGUI(e.getMessage()) ;
                }
                catch(Exception e){
                    
                    Utilidades.mostrarMensajeGUI("Error.") ;
                    System.out.println(e.getMessage()) ;
                }
                
            } while (!validador);
        }
        
    }
    
    
    private static String muestraListaJugadores(){
        
        StringBuilder sb = new StringBuilder() ;
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            sb.append("\n") ;
            sb.append(listaJugadores[i].getNombre()) ;
        }
        
        return sb.toString() ;
    }
    
    
    private static void sumarPuntos(){
        
        int puntos ; 
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            puntos = Utilidades.leerEnteroGUI("Inserta la puntuación de " + listaJugadores[i].getNombre()) ;
            
            listaJugadores[i].setPuntosActuales(puntos) ;
            listaJugadores[i].setPuntosTotales(puntos) ;
        }
    }
    
    
    private static DefaultTableModel actualizarModeloTabla(int ronda, Object[][] data){
        
         // CREACIÓN DEL MODELO PARA LA TABLA
        
          // Creación de los datos de la tabla en un array bidimensional
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            data[ronda][i] = listaJugadores[i].getPuntosActuales() ;
            
        }

        // Crear los nombres de las columnas
        String[] columnaNombres = new String[listaJugadores.length] ;
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            columnaNombres[i] = listaJugadores[i].getNombre() ;
        }

        // Crear el modelo de la tabla con los datos y los nombres de las columnas
        DefaultTableModel modeloTabla = new DefaultTableModel(data, columnaNombres) ;
        
        return modeloTabla ;
    }
    
    
     private static DefaultTableModel actualizarModeloTabla(Object[][] data){
        
        
        // CREACIÓN DEL MODELO PARA LA TABLA
        
        // Creación de los datos de la tabla en un array bidimensional
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            data[0][i] = listaJugadores[i].getPuntosTotales() ;
            
        }

        // Crear los nombres de las columnas
        String[] columnaNombres = new String[listaJugadores.length] ;
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            columnaNombres[i] = listaJugadores[i].getNombre() ;
        }

        // Crear el modelo de la tabla con los datos y los nombres de las columnas
        DefaultTableModel modeloTabla = new DefaultTableModel(data, columnaNombres) ;
        
        return modeloTabla ;
    }
     
     
    // ----------- CONTROL DE EVENTOS ----------------
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        marcoPrincipal = new javax.swing.JPanel();
        ventanaNuevaPartida = new javax.swing.JInternalFrame();
        marcoNuevaPartida = new javax.swing.JPanel();
        labelImagenNuevaPartida = new javax.swing.JLabel();
        labelNumeroJugadores = new javax.swing.JLabel();
        sliderNumeroJugadores = new javax.swing.JSlider();
        labelNumeroRondas = new javax.swing.JLabel();
        sliderNumeroRondas = new javax.swing.JSlider();
        botonJugar = new javax.swing.JButton();
        ventanaProvisional = new javax.swing.JInternalFrame();
        marcoNuevaPartida1 = new javax.swing.JPanel();
        labelImagenNuevaPartida1 = new javax.swing.JLabel();
        labelNumeroJugadores1 = new javax.swing.JLabel();
        cajaTextoNumeroJugadores1 = new javax.swing.JTextField();
        separadorNumeroJugadores1 = new javax.swing.JSeparator();
        ventanaListaJugadoresInicial = new javax.swing.JInternalFrame();
        marcoListaJugadores = new javax.swing.JPanel();
        labelImagenListaJugadores = new javax.swing.JLabel();
        botonContinuarListaJugadoresInicial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaListaJugadoresInicialNOOO = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaListaJugadoresInicial = new javax.swing.JTextArea();
        ventanaMostrarTabla = new javax.swing.JInternalFrame();
        marcoMostrarTabla = new javax.swing.JPanel();
        labelImagenTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPuntuaciones = new javax.swing.JTable();
        jlabelIndicadorRondas = new javax.swing.JLabel();
        botonConocerResultado = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JPanel();
        botonNuevaPartida1 = new javax.swing.JButton();
        botonRanking = new javax.swing.JButton();
        labelMenuPrincipal = new javax.swing.JLabel();
        separadorMenuPrincipal = new javax.swing.JSeparator();
        fondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marcoPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        marcoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventanaNuevaPartida.setBackground(new java.awt.Color(51, 51, 51));
        ventanaNuevaPartida.setClosable(true);
        ventanaNuevaPartida.setResizable(true);
        ventanaNuevaPartida.setTitle("Nueva partida");
        ventanaNuevaPartida.setVisible(false);

        marcoNuevaPartida.setBackground(new java.awt.Color(204, 204, 0));
        marcoNuevaPartida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImagenNuevaPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/interfaz/imagenes/Tuki sobre fondo negro_editado.png"))); // NOI18N
        marcoNuevaPartida.add(labelImagenNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -30, -1, 580));

        labelNumeroJugadores.setFont(new java.awt.Font("MV Boli", 0, 21)); // NOI18N
        labelNumeroJugadores.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroJugadores.setText("¿Cuántas personas van a jugar?");
        marcoNuevaPartida.add(labelNumeroJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 70));

        sliderNumeroJugadores.setMajorTickSpacing(1);
        sliderNumeroJugadores.setMaximum(6);
        sliderNumeroJugadores.setMinimum(2);
        sliderNumeroJugadores.setPaintLabels(true);
        sliderNumeroJugadores.setValue(4);
        marcoNuevaPartida.add(sliderNumeroJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 310, 60));

        labelNumeroRondas.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        labelNumeroRondas.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroRondas.setText("¿Cuántas rondas?");
        marcoNuevaPartida.add(labelNumeroRondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 310, 70));

        sliderNumeroRondas.setMajorTickSpacing(1);
        sliderNumeroRondas.setMaximum(5);
        sliderNumeroRondas.setMinimum(1);
        sliderNumeroRondas.setPaintLabels(true);
        marcoNuevaPartida.add(sliderNumeroRondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 310, 60));

        botonJugar.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        botonJugar.setForeground(new java.awt.Color(204, 0, 0));
        botonJugar.setText("¡A JUGAR!");
        botonJugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        botonJugar.setContentAreaFilled(false);
        botonJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });
        marcoNuevaPartida.add(botonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 230, 100));

        ventanaProvisional.setBackground(new java.awt.Color(51, 51, 51));
        ventanaProvisional.setClosable(true);
        ventanaProvisional.setResizable(true);
        ventanaProvisional.setTitle("Nueva partida");
        ventanaProvisional.setVisible(false);

        marcoNuevaPartida1.setBackground(new java.awt.Color(204, 204, 0));
        marcoNuevaPartida1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImagenNuevaPartida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/interfaz/imagenes/Tuki sobre fondo negro_editado.png"))); // NOI18N
        marcoNuevaPartida1.add(labelImagenNuevaPartida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -30, -1, 580));

        labelNumeroJugadores1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        labelNumeroJugadores1.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroJugadores1.setText("¿Cuántas personas van a jugar?");
        marcoNuevaPartida1.add(labelNumeroJugadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 70));

        cajaTextoNumeroJugadores1.setBackground(new java.awt.Color(204, 204, 0));
        cajaTextoNumeroJugadores1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cajaTextoNumeroJugadores1.setText("Número de jugadores...");
        cajaTextoNumeroJugadores1.setBorder(null);
        cajaTextoNumeroJugadores1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaTextoNumeroJugadores1MouseClicked(evt);
            }
        });
        cajaTextoNumeroJugadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoNumeroJugadores1ActionPerformed(evt);
            }
        });
        marcoNuevaPartida1.add(cajaTextoNumeroJugadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 320, 30));

        separadorNumeroJugadores1.setBackground(new java.awt.Color(0, 0, 0));
        separadorNumeroJugadores1.setForeground(new java.awt.Color(0, 0, 0));
        separadorNumeroJugadores1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        separadorNumeroJugadores1.setOpaque(true);
        marcoNuevaPartida1.add(separadorNumeroJugadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 320, -1));

        javax.swing.GroupLayout ventanaProvisionalLayout = new javax.swing.GroupLayout(ventanaProvisional.getContentPane());
        ventanaProvisional.getContentPane().setLayout(ventanaProvisionalLayout);
        ventanaProvisionalLayout.setHorizontalGroup(
            ventanaProvisionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marcoNuevaPartida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaProvisionalLayout.setVerticalGroup(
            ventanaProvisionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaProvisionalLayout.createSequentialGroup()
                .addComponent(marcoNuevaPartida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ventanaNuevaPartidaLayout = new javax.swing.GroupLayout(ventanaNuevaPartida.getContentPane());
        ventanaNuevaPartida.getContentPane().setLayout(ventanaNuevaPartidaLayout);
        ventanaNuevaPartidaLayout.setHorizontalGroup(
            ventanaNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marcoNuevaPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ventanaNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaNuevaPartidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaProvisional, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ventanaNuevaPartidaLayout.setVerticalGroup(
            ventanaNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaNuevaPartidaLayout.createSequentialGroup()
                .addComponent(marcoNuevaPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ventanaNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaNuevaPartidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaProvisional, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        marcoPrincipal.add(ventanaNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 840, 580));

        ventanaListaJugadoresInicial.setBackground(new java.awt.Color(51, 51, 51));
        ventanaListaJugadoresInicial.setClosable(true);
        ventanaListaJugadoresInicial.setResizable(true);
        ventanaListaJugadoresInicial.setTitle("Lista de jugadores");
        ventanaListaJugadoresInicial.setVisible(false);

        marcoListaJugadores.setBackground(new java.awt.Color(0, 0, 0));
        marcoListaJugadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImagenListaJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/interfaz/imagenes/Tuki sobre fondo negro_editado.png"))); // NOI18N
        marcoListaJugadores.add(labelImagenListaJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -30, -1, 580));

        botonContinuarListaJugadoresInicial.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        botonContinuarListaJugadoresInicial.setForeground(new java.awt.Color(0, 0, 255));
        botonContinuarListaJugadoresInicial.setText("Continuar");
        botonContinuarListaJugadoresInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        botonContinuarListaJugadoresInicial.setContentAreaFilled(false);
        botonContinuarListaJugadoresInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContinuarListaJugadoresInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarListaJugadoresInicialActionPerformed(evt);
            }
        });
        marcoListaJugadores.add(botonContinuarListaJugadoresInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, 100));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textAreaListaJugadoresInicialNOOO.setEditable(false);
        textAreaListaJugadoresInicialNOOO.setBackground(new java.awt.Color(0, 0, 0));
        textAreaListaJugadoresInicialNOOO.setColumns(20);
        textAreaListaJugadoresInicialNOOO.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        textAreaListaJugadoresInicialNOOO.setForeground(new java.awt.Color(204, 204, 0));
        textAreaListaJugadoresInicialNOOO.setRows(5);
        textAreaListaJugadoresInicialNOOO.setText("¡Esta es la\nlista de jugadores!");
        textAreaListaJugadoresInicialNOOO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(textAreaListaJugadoresInicialNOOO);

        marcoListaJugadores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 310, 100));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        marcoListaJugadores.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 197, 310, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textAreaListaJugadoresInicial.setEditable(false);
        textAreaListaJugadoresInicial.setBackground(new java.awt.Color(0, 0, 0));
        textAreaListaJugadoresInicial.setColumns(20);
        textAreaListaJugadoresInicial.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        textAreaListaJugadoresInicial.setForeground(new java.awt.Color(204, 204, 0));
        textAreaListaJugadoresInicial.setRows(5);
        textAreaListaJugadoresInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(textAreaListaJugadoresInicial);

        marcoListaJugadores.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 310, 190));

        javax.swing.GroupLayout ventanaListaJugadoresInicialLayout = new javax.swing.GroupLayout(ventanaListaJugadoresInicial.getContentPane());
        ventanaListaJugadoresInicial.getContentPane().setLayout(ventanaListaJugadoresInicialLayout);
        ventanaListaJugadoresInicialLayout.setHorizontalGroup(
            ventanaListaJugadoresInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marcoListaJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaListaJugadoresInicialLayout.setVerticalGroup(
            ventanaListaJugadoresInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaListaJugadoresInicialLayout.createSequentialGroup()
                .addComponent(marcoListaJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        marcoPrincipal.add(ventanaListaJugadoresInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 840, 580));

        ventanaMostrarTabla.setTitle("Puntuaciones");
        ventanaMostrarTabla.setVisible(false);

        marcoMostrarTabla.setForeground(new java.awt.Color(204, 204, 204));
        marcoMostrarTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImagenTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/interfaz/imagenes/Tuki_titulo.jpg"))); // NOI18N
        marcoMostrarTabla.add(labelImagenTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 800, 260));

        tablaPuntuaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tablaPuntuaciones.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        tablaPuntuaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaPuntuaciones);
        if (tablaPuntuaciones.getColumnModel().getColumnCount() > 0) {
            tablaPuntuaciones.getColumnModel().getColumn(0).setResizable(false);
            tablaPuntuaciones.getColumnModel().getColumn(1).setResizable(false);
            tablaPuntuaciones.getColumnModel().getColumn(2).setResizable(false);
            tablaPuntuaciones.getColumnModel().getColumn(3).setResizable(false);
        }

        marcoMostrarTabla.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, 190));

        jlabelIndicadorRondas.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jlabelIndicadorRondas.setForeground(new java.awt.Color(204, 204, 0));
        marcoMostrarTabla.add(jlabelIndicadorRondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 200, 60));

        botonConocerResultado.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        botonConocerResultado.setText("Conocer resultado");
        botonConocerResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConocerResultadoActionPerformed(evt);
            }
        });
        marcoMostrarTabla.add(botonConocerResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 210, 70));

        javax.swing.GroupLayout ventanaMostrarTablaLayout = new javax.swing.GroupLayout(ventanaMostrarTabla.getContentPane());
        ventanaMostrarTabla.getContentPane().setLayout(ventanaMostrarTablaLayout);
        ventanaMostrarTablaLayout.setHorizontalGroup(
            ventanaMostrarTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaMostrarTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(marcoMostrarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                .addContainerGap())
        );
        ventanaMostrarTablaLayout.setVerticalGroup(
            ventanaMostrarTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marcoMostrarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        marcoPrincipal.add(ventanaMostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1080, 780));

        menuPrincipal.setOpaque(false);

        botonNuevaPartida1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        botonNuevaPartida1.setForeground(new java.awt.Color(0, 0, 0));
        botonNuevaPartida1.setText("NUEVA PARTIDA");
        botonNuevaPartida1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botonNuevaPartida1.setContentAreaFilled(false);
        botonNuevaPartida1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNuevaPartida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaPartida1ActionPerformed(evt);
            }
        });

        botonRanking.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        botonRanking.setForeground(new java.awt.Color(0, 0, 0));
        botonRanking.setText("RANKING");
        botonRanking.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botonRanking.setContentAreaFilled(false);
        botonRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRankingActionPerformed(evt);
            }
        });

        labelMenuPrincipal.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        labelMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        labelMenuPrincipal.setText("Menú principal");

        separadorMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        separadorMenuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPrincipalLayout.createSequentialGroup()
                        .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuPrincipalLayout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonNuevaPartida1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPrincipalLayout.createSequentialGroup()
                        .addComponent(separadorMenuPrincipal)
                        .addContainerGap())))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(botonNuevaPartida1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(botonRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        marcoPrincipal.add(menuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 400, 520));

        fondoPantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/interfaz/imagenes/Fonde de pantalla Tuki_editado.png"))); // NOI18N
        fondoPantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoPantallaMouseClicked(evt);
            }
        });
        marcoPrincipal.add(fondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1180, 810));

        getContentPane().add(marcoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1059, 777));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fondoPantallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPantallaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fondoPantallaMouseClicked

    private void botonNuevaPartida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaPartida1ActionPerformed
        ventanaNuevaPartida.setVisible(true) ;
        
        ronda = 0 ;
    }//GEN-LAST:event_botonNuevaPartida1ActionPerformed

    private void botonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRankingActionPerformed
        
        Utilidades.mostrarMensajeGUI("¡En construcción!") ;
    }//GEN-LAST:event_botonRankingActionPerformed

    private void cajaTextoNumeroJugadores1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaTextoNumeroJugadores1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoNumeroJugadores1MouseClicked

    private void cajaTextoNumeroJugadores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoNumeroJugadores1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoNumeroJugadores1ActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        
        // Recuperamos los valores de los slider
        
        numeroJugadores = (byte)sliderNumeroJugadores.getValue() ;
        
        numeroRondas = (byte)sliderNumeroRondas.getValue() ;
        
        // Pedimos el nombre de los jugadores y obtenemos la lista de jugadores
        
        aniadirJugadores(numeroJugadores) ;
        
        //Ahora que tenemos el número de rondas y los datos de los jugadores creamos la partida
        
        try
        {
            partida = new Partida(numeroRondas, numeroJugadores, listaJugadores) ;
        }
        catch(ExcepcionPartida e){
            
            Utilidades.mostrarMensajeGUI(e.getMessage()) ;
        }
        catch(Exception e){
            
            Utilidades.mostrarMensajeGUI("Error") ;
            System.out.println(e.getMessage()) ;
        }
        
        
        // Cerramos la ventana
        
        ventanaNuevaPartida.dispose() ;
        
        // Abre la ventana que muestra la lista de jugadores inicial
        
        ventanaListaJugadoresInicial.pack() ;
        ventanaListaJugadoresInicial.setVisible(true) ;
        
        textAreaListaJugadoresInicial.setText(muestraListaJugadores()) ;
        
        Utilidades.mostrarMensajeGUI("Cuando hayáis jugado la primera ronda dadle a CONTINUAR. \n\n\n ░░░░░░░░▄▄▄▀▀▀▄▄███▄\n" +
"░░░░░▄▀▀░░░░░░░▐░▀██▌\n" +
"░░░▄▀░░░░▄▄███░▌▀▀░▀█\n" +
"░░▄█░░▄▀▀▒▒▒▒▒▄▐░░░░█▌\n" +
"░▐█▀▄▀▄▄▄▄▀▀▀▀▌░░░░░▐█▄\n" +
"░▌▄▄▀▀░░░░░░░░▌░░░░▄███████▄\n" +
"░░░░░░░░░░░░░▐░░░░▐███████████▄\n" +
"░░░░░▒░░░░░░░▐░░░░▐█████████████▄\n" +
"░░░░▒▒▒▒░░░░░░▀▄░░░▐██████████████▄\n" +
"░░░░░░▒▒░░░░░░░░▀▄▄████████████████▄\n" +
"░░░░░▒▒▒▒░░░░░░░░░░░░█▀██████▀") ;
        
        
    }//GEN-LAST:event_botonJugarActionPerformed

    private void botonContinuarListaJugadoresInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarListaJugadoresInicialActionPerformed
        
        botonConocerResultado.setVisible(false) ;
        
        data = new Object[partida.getRondas()][listaJugadores.length] ;
        
        for (ronda = 0; ronda < partida.getRondas(); ronda++) {
            
            sumarPuntos() ;
            
            tablaPuntuaciones.setModel(actualizarModeloTabla(ronda, data)) ;

            ventanaListaJugadoresInicial.dispose() ;

            ventanaMostrarTabla.setVisible(true) ;

            jlabelIndicadorRondas.setText("RONDA " + (ronda +1)) ;
            
            if ((ronda + 1) != partida.getRondas())
            {
                Utilidades.mostrarMensajeGUI("---------------- COMIENZA LA RONDA " + (ronda + 2) + " ----------------" + "\n\nDadle a OK cuando estéis listos \npara introducir los puntos de la ronda.") ;
            }
            
        }
        
        botonConocerResultado.setVisible(true) ;
        
        for (int i = 0; i < listaJugadores.length; i++) {
            
            System.out.println(listaJugadores[i].toString());
        }
        
    }//GEN-LAST:event_botonContinuarListaJugadoresInicialActionPerformed

    private void botonConocerResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConocerResultadoActionPerformed
        
        data2 = new Object[1][listaJugadores.length] ;
        
        jlabelIndicadorRondas.setText("PUNTOS TOTALES") ;
        
        tablaPuntuaciones.setModel(actualizarModeloTabla(data2)) ;
    }//GEN-LAST:event_botonConocerResultadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConocerResultado;
    private javax.swing.JButton botonContinuarListaJugadoresInicial;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton botonNuevaPartida1;
    private javax.swing.JButton botonRanking;
    private javax.swing.JTextField cajaTextoNumeroJugadores1;
    private javax.swing.JLabel fondoPantalla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabelIndicadorRondas;
    private javax.swing.JLabel labelImagenListaJugadores;
    private javax.swing.JLabel labelImagenNuevaPartida;
    private javax.swing.JLabel labelImagenNuevaPartida1;
    private javax.swing.JLabel labelImagenTitulo;
    private javax.swing.JLabel labelMenuPrincipal;
    private javax.swing.JLabel labelNumeroJugadores;
    private javax.swing.JLabel labelNumeroJugadores1;
    private javax.swing.JLabel labelNumeroRondas;
    private javax.swing.JPanel marcoListaJugadores;
    private javax.swing.JPanel marcoMostrarTabla;
    private javax.swing.JPanel marcoNuevaPartida;
    private javax.swing.JPanel marcoNuevaPartida1;
    private javax.swing.JPanel marcoPrincipal;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JSeparator separadorMenuPrincipal;
    private javax.swing.JSeparator separadorNumeroJugadores1;
    private javax.swing.JSlider sliderNumeroJugadores;
    private javax.swing.JSlider sliderNumeroRondas;
    private javax.swing.JTable tablaPuntuaciones;
    private javax.swing.JTextArea textAreaListaJugadoresInicial;
    private javax.swing.JTextArea textAreaListaJugadoresInicialNOOO;
    private javax.swing.JInternalFrame ventanaListaJugadoresInicial;
    private javax.swing.JInternalFrame ventanaMostrarTabla;
    private javax.swing.JInternalFrame ventanaNuevaPartida;
    private javax.swing.JInternalFrame ventanaProvisional;
    // End of variables declaration//GEN-END:variables
}
