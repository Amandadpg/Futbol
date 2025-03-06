package main;

import java.util.Scanner;
import equipo.Equipo;
import equipo.Jugador;
import jugador.Portero;
import jugador.subclases.Central;
import jugador.subclases.DelanteroCentro;
import jugador.subclases.Extremo;
import jugador.subclases.Lateral;
import jugador.subclases.Mediapunta;
import jugador.subclases.Pivote;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Equipo equipo = null;

		while (true) {
			System.out.println("\n--- MENÚ DE GESTIÓN DE EQUIPO ---");
			System.out.println("1. Crear un nuevo equipo");
			System.out.println("2. Añadir jugador a una posición");
			System.out.println("3. Mostrar alineación");
			System.out.println("4. Mostrar datos de todos los jugadores");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				equipo = new Equipo();
				System.out.println("Equipo creado correctamente.");
				break;

			case 2:
				if (equipo == null) {
					System.out.println("Primero debe crear un equipo.");
					break;
				}
				System.out.println("\n--- AÑADIR JUGADOR ---");
				System.out.println("Seleccione la posición:");
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
				System.out.print("Posición: ");
				int posicion = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Nombre del jugador: ");
				String nombre = scanner.nextLine();
				System.out.print("Dorsal: ");
				int dorsal = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Equipo: ");
				String equipoJugador = scanner.nextLine();

				try {
					switch (posicion) {
					case 0:
						System.out.print("Paradas realizadas: ");
						int paradas = scanner.nextInt();
						equipo.añadirJugador(posicion, new Portero(nombre, dorsal, equipoJugador, paradas));
						break;
					case 1:
						System.out.print("Disputas realizadas: ");
						int disputasLateral = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Puesto (izquierdo/derecho): ");
						String puestoLateral = scanner.nextLine();
						equipo.añadirJugador(posicion,
								new Lateral(nombre, dorsal, equipoJugador, disputasLateral, puestoLateral));
						break;
					case 2:
					case 3:
						System.out.print("Disputas realizadas: ");
						int disputasCentral = scanner.nextInt();
						System.out.print("Entradas realizadas: ");
						int entradas = scanner.nextInt();
						equipo.añadirJugador(posicion,
								new Central(nombre, dorsal, equipoJugador, disputasCentral, entradas));
						break;
					case 4:
						System.out.print("Disputas realizadas: ");
						int disputasLateralDerecho = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Puesto (izquierdo/derecho): ");
						String puestoLateralDerecho = scanner.nextLine();
						equipo.añadirJugador(posicion, new Lateral(nombre, dorsal, equipoJugador,
								disputasLateralDerecho, puestoLateralDerecho));
						break;
					case 5:
					case 6:
						System.out.print("Pases completados: ");
						int pasesPivote = scanner.nextInt();
						System.out.print("Intercepciones: ");
						int intercepciones = scanner.nextInt();
						equipo.añadirJugador(posicion,
								new Pivote(nombre, dorsal, equipoJugador, pasesPivote, intercepciones));
						break;
					case 7:
						System.out.print("Pases completados: ");
						int pasesMediapunta = scanner.nextInt();
						System.out.print("Asistencias: ");
						int asistencias = scanner.nextInt();
						equipo.añadirJugador(posicion,
								new Mediapunta(nombre, dorsal, equipoJugador, pasesMediapunta, asistencias));
						break;
					case 8:
					case 9:
						System.out.print("Goles: ");
						int golesExtremo = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Puesto (izquierdo/derecho): ");
						String puestoExtremo = scanner.nextLine();
						equipo.añadirJugador(posicion,
								new Extremo(nombre, dorsal, equipoJugador, golesExtremo, puestoExtremo));
						break;
					case 10:
						System.out.print("Goles: ");
						int golesDelantero = scanner.nextInt();
						System.out.print("Goles de penalti: ");
						int golesPenalti = scanner.nextInt();
						equipo.añadirJugador(posicion,
								new DelanteroCentro(nombre, dorsal, equipoJugador, golesDelantero, golesPenalti));
						break;
					default:
						System.out.println("Posición no válida.");
						break;
					}
					System.out.println("Jugador añadido correctamente.");
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 3:
				if (equipo == null) {
					System.out.println("Primero debe crear un equipo.");
					break;
				}
				try {
					equipo.mostrarAlineacion();
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 4:
				if (equipo == null) {
					System.out.println("Primero debe crear un equipo.");
					break;
				}
				System.out.println("\n--- DATOS DE LOS JUGADORES ---");
				for (Jugador jugador : equipo.getAlineacion()) {
					if (jugador != null) {
						jugador.mostrarDatos();
					}
				}
				break;

			case 5:
				System.out.println("Saliendo del programa...");
				scanner.close();
				return;

			default:
				System.out.println("Opción no válida. Intente de nuevo.");
				break;
			}
		}
	}
}
