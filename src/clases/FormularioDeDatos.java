package clases;

import java.util.Scanner;

public class FormularioDeDatos {
	
	public static Clientes pedirDatosClientes(Scanner scan) {
		Clientes cliente = new Clientes();
		System.out.println("---INDICA TUS DATOS---");
		System.out.println("Indica tu dni:");
		String dniCliente=scan.nextLine();
		System.out.println("Indica tu nombre:");
		String nombreCliente=scan.nextLine();
		System.out.println("Indica tu apellido:");
		String apellidoCliente=scan.nextLine();
		System.out.println("Indica tu direccion:");
		String direccionCliente = scan.nextLine();
		System.out.println("Indica tu localidad:");
		String localidadCliente=scan.nextLine();
		
		cliente.setDni(dniCliente);
		cliente.setNombre(nombreCliente);
		cliente.setApellidos(apellidoCliente);
		cliente.setDireccion(direccionCliente);
		cliente.setLocalidad(localidadCliente);
		
		return cliente;
		
		
		}

	public static String pedirDniClientes(Scanner scan) {
		System.out.println("Escribe el DNI del cliente: ");
		return scan.nextLine();
	}
	
	
	public static Clientes datosModificarCliente(Clientes modificarCliente, Scanner scan) {
		Clientes cliente = new Clientes();
		System.out.println("---MODIFICA TUS DATOS---");
		System.out.println("Indica tu  nuevo nombre:");
		String nombreCliente=scan.nextLine();
		System.out.println("Indica tu nuevo apellido:");
		String apellidoCliente=scan.nextLine();
		System.out.println("Indica tu nuevo direccion:");
		String direccionCliente = scan.nextLine();
		System.out.println("Indica tu nuevo  localidad:");
		String localidadCliente=scan.nextLine();
		
		cliente.setDni(modificarCliente.getDni());
		cliente.setNombre(nombreCliente);
		cliente.setApellidos(apellidoCliente);
		cliente.setDireccion(direccionCliente);
		cliente.setLocalidad(localidadCliente);
		
		return cliente;
				
	}

	//------------------------------------------------
	public static int pedirIdHotel(Scanner scan) {
		System.out.println("Escribe el id del hotel: ");
		return Integer.parseInt(scan.nextLine());
	}

	public static Hoteles pedirDatosHotel(Scanner scan) {
		Hoteles nuevoHotel = new Hoteles();
		System.out.println("Escribe el CIF del hotel: ");
		nuevoHotel.setCif(scan.nextLine());
		System.out.println("Escribe el Nombre del hotel: ");
		nuevoHotel.setNombre(scan.nextLine());
		System.out.println("Escribe el Gerente del hotel: ");
		nuevoHotel.setGerente(scan.nextLine());
		System.out.println("Escribe la cantidad de estrellas del hotel: ");
		nuevoHotel.setEstrellas(Integer.parseInt(scan.nextLine()));
		System.out.println("Escribe el nombre de compañia del hotel: ");
		nuevoHotel.setCompania(scan.nextLine());
		return nuevoHotel;
	}
}
