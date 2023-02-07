package clases;

import java.util.Scanner;

public class GestorClientes {
	public void run(Scanner scan) {
		int opcion_menu;

		do {
			Menu.menuClientes();;
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.REGISTRAR_CLIENTES:
				
				break;
			case Menu.DAR_BAJA:
				
				
				break;
			case Menu.MODIFICAR_CLIENTE:
				
				
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

