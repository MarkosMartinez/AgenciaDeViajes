package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorReserva {
	Scanner scan = new Scanner(System.in);
	public static void run(Scanner scan) throws SQLException {		
		
		int opcion_menu;
		GestorBBDD gestorbbdd = new GestorBBDD();

		do {
			Menu.menuReserva();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.REALIZAR_RESERVA:
				
				Cliente cliente = gestorbbdd.getCliente(FormularioDeDatos.pedirDniClientes(scan));
				if (cliente.getDni() == "-1") {
					Visor.mostrarMensajeError("El usuario no esta registrado.\nRegistre el usuario primero");
					break;
				}
					Hotel hotel = gestorbbdd.getHoteles(FormularioDeDatos.pedirIdHotel(scan));
					if(hotel.getId() == -1) {
						Visor.mostrarMensajeError("El hotel no existe");
				}else {
					Visor.mostrarMensaje("El hotel tiene las siguiente habitaciones: ");
					
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
