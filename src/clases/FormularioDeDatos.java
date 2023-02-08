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
	
	
	public static Clientes datosModificarCLiente(Clientes modificarCliente) {
		Clientes cliente = new Clientes();
		Scanner scan = new Scanner(System.in);
		System.out.println("---MODIFICA TUS DATOS---");
		System.out.println("Indica tu  nuevo nombre:");
		String nombreCliente=scan.nextLine();
		System.out.println("Indica tu nuevo apellido:");
		String apellidoCliente=scan.nextLine();
		System.out.println("Indica tu nuevo direccion:");
		String direccionCliente = scan.nextLine();
		System.out.println("Indica tu nuevo  localidad:");
		String localidadCliente=scan.nextLine();
		
	
		cliente.setNombre(nombreCliente);
		cliente.setApellidos(apellidoCliente);
		cliente.setDireccion(direccionCliente);
		cliente.setLocalidad(localidadCliente);
		
		return cliente;
				
	}
}
