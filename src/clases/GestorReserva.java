package clases;

import java.util.Scanner;

public class GestorReserva {
	Scanner scan = new Scanner(System.in);
	public static void run(Scanner scan) {		
		
		int opcion_menu;

		do {
			Menu.menuReserva();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.REALIZAR_RESERVA:
				
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
