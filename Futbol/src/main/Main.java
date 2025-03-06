package main;

import equipo.Equipo;
import equipo.jugadores.Portero;
import equipo.jugadores.defensa.Lateral;
import equipo.jugadores.centrocampista.Mediapunta;
import equipo.jugadores.delantero.DelanteroCentro;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Equipo equipo = new Equipo();
		boolean salir = false;

		while (!salir) {
			System.out.println();
			System.out.println("Menú:");
			System.out.println("1. Crear un jugador y añadirlo al equipo");
			System.out.println("2. Ver la alineación del equipo");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				System.out.println();
				System.out.println("Selecciona la posición del jugador:");
				System.out.println("1. Portero");
				System.out.println("2. Defensa");
				System.out.println("3. Centrocampista");
				System.out.println("4. Delantero");
				int tipoPosicion = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Introduce el nombre del jugador: ");
				String nombre = scanner.nextLine();
				System.out.print("Introduce el dorsal del jugador: ");
				int dorsal = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Introduce el nombre del equipo: ");
				String equipoNombre = scanner.nextLine();

				switch (tipoPosicion) {
				case 1:
					System.out.print("Introduce el número de paradas: ");
					int paradas = scanner.nextInt();
					equipo.añadirJugador(0, new Portero(nombre, dorsal, equipoNombre, paradas));
					break;
				case 2:
					System.out.print("Introduce el número de disputas realizadas: ");
					int disputas = scanner.nextInt();
					equipo.añadirJugador(1, new Lateral(nombre, dorsal, equipoNombre, disputas, null)); 
																										
					break;
				case 3:
					System.out.print("Introduce el número de pases completados: ");
					int pases = scanner.nextInt();
					equipo.añadirJugador(2, new Mediapunta(nombre, dorsal, equipoNombre, pases, 0)); 
					break;
				case 4:
					System.out.print("Introduce el número de goles: ");
					int goles = scanner.nextInt();
					equipo.añadirJugador(3, new DelanteroCentro(nombre, dorsal, equipoNombre, goles, 0));
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
				break;

			case 2:
				equipo.mostrarAlineacion();
				break;

			case 3:
				salir = true;
				break;

			default:
				System.out.println("Opción no válida.");
				break;
			}
		}

		scanner.close();
	}
}
