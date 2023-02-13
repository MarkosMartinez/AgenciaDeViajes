package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorReserva {
	Scanner scan = new Scanner(System.in);
	public static void run(Scanner scan) throws SQLException, ParseException {		
		
		int opcion_menu;
		GestorBBDD gestorbbdd = new GestorBBDD();

		do {
			Menu.menuReserva();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.REALIZAR_RESERVA:
				
				Cliente cliente = gestorbbdd.getCliente(FormularioDeDatos.pedirDniClientes(scan));
				if (cliente.getDni() == "-1") {
					break;
				}
					Hotel hotel = gestorbbdd.getHoteles(FormularioDeDatos.pedirIdHotel(scan));
					if(hotel.getId() == -1) {
						Visor.mostrarMensajeError("El hotel no existe");
				}else {
					Visor.mostrarHabitaciones(gestorbbdd.getHabitaciones(hotel.getId()));
					int idHabitacion = FormularioDeDatos.pedirIdHabitacion(scan);
					Habitacion habitacion = gestorbbdd.getHabitacion(idHabitacion, hotel.getId());
					if(habitacion.getId()== -1) {
						Visor.mostrarMensajeError("La habitacion no ha sido encontrada");
					}else {
						Reserva reserva = FormularioDeDatos.pedirDatosReserva(scan, cliente.getDni(), hotel.getId(), habitacion.getId());
						gestorbbdd.realizarReserva(reserva);
						
						Visor.mostrarMensajeCorrecto("Reserva realizada con exito!");
					
					}
				}
				
				break;
			case Menu.ANULAR_RESERVA:
				
				
				break;
			case Menu.SALIR:
				System.out.println("\nAgur!");
				break;
			default:
				Visor.mostrarMensajeError("Opcion no valida!\nIntentalo de nuevo.");
			}

		} while (opcion_menu != Menu.SALIR);
		
	}
	
	
}
