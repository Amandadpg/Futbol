package equipo;

class AlineacionIncompletaException extends Exception {
 public AlineacionIncompletaException(String mensaje) {
     super(mensaje);
 }
}

public class Equipo{
 private Jugador[] jugadores;

 public Equipo() {
     jugadores = new Jugador[11]; 
 }

 public void añadirJugador(int posicion, String nombre, int dorsal) {
     if (posicion >= 0 && posicion < 11) {
         jugadores[posicion] = new Jugador(nombre, dorsal, this);
     } else {
         System.out.println("Posición no válida.");
     }
 }

 public void mostrarAlineacion() throws AlineacionIncompletaException {
     for (int i = 0; i < 11; i++) {
         if (jugadores[i] == null) {
             throw new AlineacionIncompletaException("La alineación está incompleta. Falta un jugador en la posición " + i);
         }
     }

     System.out.println("Alineación del equipo:");
     System.out.println("0: Portero");
     System.out.println("1: Lateral izquierdo");
     System.out.println("2: Central 1");
     System.out.println("3: Central 2");
     System.out.println("4: Lateral derecho");
     System.out.println("5: Pivote 1");
     System.out.println("6: Pivote 2");
     System.out.println("7: Mediapunta");
     System.out.println("8: Extremo izquierdo");
     System.out.println("9: Extremo derecho");
     System.out.println("10: Delantero centro");

     for (int i = 0; i < 11; i++) {
         Jugador jugador = jugadores[i];
         System.out.println(i + ": " + jugador.getNombre() + " (Dorsal: " + jugador.getDorsal() + ")");
     }
 }

 public static void main(String[] args) {
     try {
         Equipo equipo = new Equipo();
         equipo.añadirJugador(0, "Carlos", 1); 
         equipo.añadirJugador(1, "Juan", 2);   
         equipo.añadirJugador(2, "Pedro", 3);   
         equipo.añadirJugador(3, "Miguel", 4);  
         equipo.añadirJugador(4, "Luis", 5);    
         equipo.añadirJugador(5, "Sergio", 6);  
         equipo.añadirJugador(6, "David", 7);   
         equipo.añadirJugador(7, "Rafael", 8); 
         equipo.añadirJugador(8, "Ana", 9);     
         equipo.añadirJugador(9, "Eva", 10);   
         equipo.añadirJugador(10, "Luisito", 11);

        
         equipo.mostrarAlineacion();
     } catch (AlineacionIncompletaException e) {
         System.out.println(e.getMessage());
     }
 }
}
