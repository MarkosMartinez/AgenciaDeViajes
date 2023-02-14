package clases;

import java.util.Scanner;

public class GestorConsultasClientes {
	public static void run(Scanner scan){

		int opcion_menu;

		do {
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.ORDENAR_APELLIDO:
				

				break;
			case Menu.ORDENAR_NOMBRE:

				break;
			case Menu.MOSTRAR_CADENA:

				break;
			case Menu.SALIR:
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != Menu.SALIR);
		
	}
}
