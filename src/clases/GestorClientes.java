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
				Cliente altaCliente = FormularioDeDatos.pedirDatosClientes(scan);
				gestorbbdd.altaCliente(altaCliente);
				Visor.mostrarMensajeCorrecto("Usuario Insertado correctamente");
				break;
			case Menu.DAR_BAJA:
				Cliente bajaCliente = gestorbbdd.getCliente(FormularioDeDatos.pedirDniClientes(scan));
				if(bajaCliente.getDni() != "-1") {
					gestorbbdd.bajaCliente(bajaCliente);
					Visor.mostrarMensajeCorrecto("Cliente eliminado!");
				}
				
				break;
			case Menu.MODIFICAR_CLIENTE:
				Cliente modificarCliente = gestorbbdd.getCliente(FormularioDeDatos.pedirDniClientes(scan));
				if(modificarCliente.getDni() != "-1") {
					Cliente modificarNuevoCliente = FormularioDeDatos.datosModificarCliente(modificarCliente, scan);
					gestorbbdd.modificarCliente(modificarNuevoCliente);
					Visor.mostrarMensajeCorrecto("Cliente actualizado!");
				}
				
				break;
			case Menu.ORDENAR_APELLIDO:
				

				break;
			case Menu.ORDENAR_NOMBRE:

				break;
			case Menu.MOSTRAR_CADENA:

				break;
			case Menu.SALIR:
				break;
			default:
				Visor.mostrarMensajeError("Opcion no valida!\nIntentalo de nuevo.");
			}

		} while (opcion_menu != Menu.SALIR);
		
	}

		
	}

