package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorClientes {
	public static void run(Scanner scan) throws SQLException {
		int opcion_menu;
		GestorBBDD gestorbbdd = new GestorBBDD();

		do {
			Menu.menuClientes();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.REGISTRAR_CLIENTES:
				Clientes altaCliente = FormularioDeDatos.pedirDatosClientes(scan);
				gestorbbdd.altaCliente(altaCliente);
				Visor.mostrarMensajeCorrecto("Usuario Insertado correctamente");
				break;
			case Menu.DAR_BAJA:
				Clientes bajaCliente = gestorbbdd.getCliente(FormularioDeDatos.pedirDniClientes(scan));
				if(bajaCliente.getDni() != "-1") {
					gestorbbdd.bajaCliente(bajaCliente);
					Visor.mostrarMensajeCorrecto("Cliente eliminado!");
				}
				
				break;
			case Menu.MODIFICAR_CLIENTE:
				Clientes modificarCliente = gestorbbdd.getCliente(FormularioDeDatos.pedirDniClientes(scan));
				if(modificarCliente.getDni() != "-1") {
					Clientes modificarNuevoCliente = Formulario.modificarCliente(modificarCliente);
					gestorbbdd.modificarCliente(modificarNuevoCliente);
					Visor.mostrarMensajeCorrecto("Cliente actualizado!");
				}
				
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

