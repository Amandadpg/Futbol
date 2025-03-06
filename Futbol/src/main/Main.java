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
<<<<<<< Updated upstream
				equipo = new Equipo();
				System.out.println("Equipo creado correctamente.");
=======
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

				switch (tipoPosicion) {
				case 1:
					System.out.print("Introduce el número de paradas: ");
					int paradas = scanner.nextInt();
					scanner.nextLine();
					equipo.añadirJugador(0, new Portero(nombre, dorsal, equipoNombre, paradas));
					break;
				case 2:
					System.out.println("Seleccione si es lateral o central:");
					System.out.println("1. Central");
					System.out.println("2. Lateral");
					int tipoDefensa = scanner.nextInt();
					scanner.nextLine();

					if (tipoDefensa == 1) {
						System.out.println("Seleccione si el central es izquierdo o derecho:");
						System.out.println("1. Izquierdo");
						System.out.println("2. Derecho");
						int ladoDefensa = scanner.nextInt();
						scanner.nextLine();

						if (ladoDefensa == 1) {
							System.out.print("Introduce el número de disputas realizadas: ");
							int disputasIzquierdo = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(2,
									new Central(nombre, dorsal, equipoNombre, disputasIzquierdo, tipoPosicion, PuestoDefensa.IZQUIERDO));
						} else {
							System.out.print("Introduce el número de disputas realizadas: ");
							int disputasDerecho = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(3,
									new Central(nombre, dorsal, equipoNombre, disputasDerecho, tipoPosicion, PuestoDefensa.DERECHO));
						}
					} else if (tipoDefensa == 2) {
						System.out.println("Seleccione si el lateral es izquierdo o derecho:");
						System.out.println("1. Izquierdo");
						System.out.println("2. Derecho");
						int ladoDefensa = scanner.nextInt();
						scanner.nextLine();

						if (ladoDefensa == 1) {
							System.out.print("Introduce el número de disputas realizadas: ");
							int disputasIzquierdo = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(1,
									new Lateral(nombre, dorsal, equipoNombre, disputasIzquierdo, PuestoDefensa.IZQUIERDO));
						} else {
							System.out.print("Introduce el número de disputas realizadas: ");
							int disputasDerecho = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(4,
									new Lateral(nombre, dorsal, equipoNombre, disputasDerecho, PuestoDefensa.DERECHO));
						}
					}
					break;
				case 3:
					
				case 4:
					System.out.println("Seleccione si es extremo o delantero centro:");
					System.out.println("1. Extremo");
					System.out.println("2. Centro");
					int tipoDelantero = scanner.nextInt();
					scanner.nextLine();

					if (tipoDelantero == 1) {
						System.out.print("Introduce el número de goles anotados: ");
						int goles = scanner.nextInt();
						scanner.nextLine();
						equipo.añadirJugador(10, new DelanteroCentro(nombre, dorsal, equipoNombre, goles, null));
					} else if (tipoDelantero == 2) {
						System.out.println("Seleccione si el extremo es izquierdo o derecho:");
						System.out.println("1. Izquierdo");
						System.out.println("2. Derecho");
						int ladoDefensa = scanner.nextInt();
						scanner.nextLine();

						if (ladoDefensa == 1) {
							System.out.print("Introduce el número de goles anotados: ");
							int golesIzquierdo = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(8,
									new Extremo(nombre, dorsal, equipoNombre, golesIzquierdo, PuestoDelantero.IZQUIERDO));
						} else {
							System.out.print("Introduce el número de goles anotados: ");
							int golesDerecho = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(9,
									new Extremo(nombre, dorsal, equipoNombre, golesDerecho, PuestoDelantero.DERECHO));
						}
					}
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
>>>>>>> Stashed changes
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
