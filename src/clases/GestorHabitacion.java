package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorHabitacion {
	Scanner scan = new Scanner(System.in);
	public static void run(Scanner scan) throws SQLException {		
		
		int opcion_menu;
		GestorBBDD gestorbbdd = new GestorBBDD();

		do {
			Menu.menuHabitaciones();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.CREAR_HABITACION:
				//Pedir el CIF del hotel o el ID?
				Hotel hotel = gestorbbdd.getHoteles(FormularioDeDatos.pedirIdHotel(scan));
				if(hotel.getId() == -1) {
					Visor.mostrarMensajeError("Ese hotel no existe en nuesta BD.");
				}else {
					gestorbbdd.insertarHabitacion(FormularioDeDatos.pedirDatosHabitacion(scan, hotel.getId()));
					Visor.mostrarMensajeCorrecto("Habitacion creada!");
					/*Habitacion habitacion = FormularioDeDatos.pedirDatosHabitacion(scan, opcion_menu);
					gestorbbdd.getHabitacion(opcion_menu, opcion_menu);*/
				}

				break;
			case Menu.SALIR:
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != Menu.SALIR);
		
	}
	
	
}
