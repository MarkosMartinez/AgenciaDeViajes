package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorHoteles {

	public static void run(Scanner scan) throws SQLException {
		int opcion;
		GestorBBDD gestorbbdd = new GestorBBDD();
		
		do {
			Menu.menuHoteles();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.REGISTRAR_HOTEL:
					Hoteles registrarHotel = FormularioDeDatos.pedirDatosHotel(scan);
					//TODO comprobar si el CIF ya existe para evitar duplicados.
					gestorbbdd.registrarHotel(registrarHotel);
					Visor.mostrarMensajeCorrecto("Hotel registado!");

						int opcion_menu;

						do {
							Menu.menuHabitaciones();
							opcion_menu = Integer.parseInt(scan.nextLine());

							switch (opcion_menu) {
							case Menu.CREAR_HABITACION:
								//Pedir el CIF del hotel o el ID?
								Hoteles hotel = gestorbbdd.getHoteles(FormularioDeDatos.pedirIdHotel(scan));
								if(hotel.getId() == -1) {
									Visor.mostrarMensajeError("Ese hotel no existe en nuesta BD.");
								}else {
									gestorbbdd.insertarHabitacion(FormularioDeDatos.pedirDatosHabitacion(scan, hotel.getId()));
									Visor.mostrarMensajeCorrecto("Habitacion creada!");
								}

								break;
							case Menu.SALIR:
								break;
							default:
								System.out.println("Opcion incorrecta!");
							}

						} while (opcion_menu != Menu.SALIR);
				
				break;
				
			case Menu.SALIR:
				break;
			default:
				Visor.mostrarMensajeError("Opcion no valida!\nIntentalo de nuevo.");
				break;
			}
			
		}while(opcion != 0);
		
	}
	
}
