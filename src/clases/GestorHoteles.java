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
					Hotel registrarHotel = FormularioDeDatos.pedirDatosHotel(scan);
					//TODO comprobar si el CIF ya existe para evitar duplicados.
					gestorbbdd.registrarHotel(registrarHotel);
					Visor.mostrarMensajeCorrecto("Hotel registado!");
					Menu.menuHabitaciones();
					GestorHabitacion.run(scan);

				
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
