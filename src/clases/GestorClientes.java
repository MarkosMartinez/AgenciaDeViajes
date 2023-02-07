package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorClientes {
	public void run(Scanner scan) throws SQLException {
		int opcion_menu;
		GestorBBDD gestor = new GestorBBDD();
		FormularioDeDatos formulario= new FormularioDeDatos();
		do {
			Menu.menuClientes();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.REGISTRAR_CLIENTES:
				Clientes cliente=formulario.pedirDatosClientes(scan);
				gestor.altaCliente(cliente);
				Visor.mostrarMensajeCorrecto("Usuario Insertado correctamente");
				break;
			case Menu.DAR_BAJA:
				
				
				break;
			case Menu.MODIFICAR_CLIENTE:
				
				
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

