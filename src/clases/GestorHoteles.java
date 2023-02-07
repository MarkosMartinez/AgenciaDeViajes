package clases;

import java.util.Scanner;

public class GestorHoteles {

	public static void run(Scanner scan) {
		int opcion;
		
		do {
			Menu.menuHoteles();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.REGISTRAR_HOTEL:
				
				
				break;
			case Menu.CREAR_HABITACION:

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
