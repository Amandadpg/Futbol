package main;

import java.util.Scanner;

import equipo.Equipo;
import equipo.jugadores.Portero;
import equipo.jugadores.defensa.Central;
import equipo.jugadores.defensa.Lateral;
import equipo.jugadores.defensa.PuestoDefensa;
import equipo.jugadores.delantero.DelanteroCentro;
import equipo.jugadores.delantero.Extremo;
import equipo.jugadores.delantero.PuestoDelantero;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Equipo equipo = new Equipo();
		boolean salir = false;

		System.out.println("Introduce el nombre del equipo:");
		String equipoNombre = scanner.nextLine();
		equipo.setEquipo(equipoNombre);

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
									new Central(nombre, dorsal, equipoNombre, disputasIzquierdo, PuestoDefensa.IZQUIERDO));
						} else {
							System.out.print("Introduce el número de disputas realizadas: ");
							int disputasDerecho = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(3,
									new Central(nombre, dorsal, equipoNombre, disputasDerecho, PuestoDefensa.DERECHO));
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
							equipo.añadirJugador(2,
									new Lateral(nombre, dorsal, equipoNombre, disputasIzquierdo, PuestoDefensa.IZQUIERDO));
						} else {
							System.out.print("Introduce el número de disputas realizadas: ");
							int disputasDerecho = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(3,
									new Lateral(nombre, dorsal, equipoNombre, disputasDerecho, PuestoDefensa.DERECHO));
						}
					}
					break;
				case 3:
					System.out.println("Seleccione si es extremo o delantero centro:");
					System.out.println("1. Extremo");
					System.out.println("2. Centro");
					int tipoDelantero = scanner.nextInt();
					scanner.nextLine();

					if (tipoDelantero == 1) {
						System.out.print("Introduce el número de goles anotados: ");
						int goles = scanner.nextInt();
						scanner.nextLine();
						equipo.añadirJugador(1, new Extremo(nombre, dorsal, equipoNombre, goles, null));
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
							equipo.añadirJugador(2,
									new Extremo(nombre, dorsal, equipoNombre, golesIzquierdo, PuestoDelantero.IZQUIERDO));
						} else {
							System.out.print("Introduce el número de goles anotados: ");
							int golesDerecho = scanner.nextInt();
							scanner.nextLine();
							equipo.añadirJugador(3,
									new Extremo(nombre, dorsal, equipoNombre, golesDerecho, PuestoDelantero.DERECHO));
						}
					}
					break;
				case 4:
					System.out.print("Introduce el número de goles: ");
					int goles = scanner.nextInt();
					scanner.nextLine();
					equipo.añadirJugador(5, new DelanteroCentro(nombre, dorsal, equipoNombre, goles, 0));
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
	}
}
