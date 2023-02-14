package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorAgencia {
	Scanner scan = new Scanner(System.in);
	public void run() throws SQLException, ParseException {		
		
		int opcion_menu;

		do {
			Menu.menuPrincipal();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.GESTIONAR_CLIENTES:
				GestorClientes.run(scan);
				
				break;
			case Menu.GESTIONAR_RESERVAS:
				GestorReserva.run(scan);
				
				break;
			case Menu.GESTIONAR_HOTELES:
				GestorHoteles.run(scan);
				
				break;
			case Menu.GESTIONAR_HABITACION:
				GestorHabitacion.run(scan);
				
				break;
			case Menu.CONSULTAR_CLIENTES:
				GestorConsultasClientes.run(scan);
				
				break;
			case Menu.CONSULTAR_RESERVAS:
				GestorConsultasReservas.run(scan);
				
				break;
			case Menu.SALIR:
				System.out.println("\nAgur!");
				break;
			default:
				System.out.println(Colores.ROJO + "Opcion no valida!\nIntentalo de nuevo." + Colores.NEGRO);
			}

		} while (opcion_menu != Menu.SALIR);
		
	}

}
