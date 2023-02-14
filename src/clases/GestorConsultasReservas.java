package clases;

import java.util.Scanner;

	public class GestorConsultasReservas {
		public static void run(Scanner scan){
			
			int opcion_menu;

			do {
				opcion_menu = Integer.parseInt(scan.nextLine());

				switch (opcion_menu) {
				case Menu.CONSULTAR_RESERVAS_CLIENTE:

					break;
				case Menu.CONSULTAR_FECHA:

					break;
				case Menu.SALIR:
					break;
				default:
					System.out.println("Opcion incorrecta!");
				}

			} while (opcion_menu != Menu.SALIR);
			
		}
}
