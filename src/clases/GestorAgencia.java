package clases;

import java.util.Scanner;

public class GestorAgencia {
	Scanner scan = new Scanner(System.in);
	public void run() {		
		
		int opcion_menu;

		do {
			Menu.menuPrincipal();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.GESTIONAR_CLIENTES:
				
				break;
			case Menu.GESTIONAR_RESERVAS:
				
				
				break;
			case Menu.GESTIONAR_HOTELES:
				
				
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
