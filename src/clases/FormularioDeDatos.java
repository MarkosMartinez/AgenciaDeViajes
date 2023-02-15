package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FormularioDeDatos {
	
	public static Cliente pedirDatosClientes(Scanner scan) {
		Cliente cliente = new Cliente();
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
	
	
	public static Cliente datosModificarCliente(Cliente modificarCliente, Scanner scan) {
		Cliente cliente = new Cliente();
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
	

	public static Hotel pedirDatosHotel(Scanner scan) {
		Hotel nuevoHotel = new Hotel();
		System.out.println("Escribe el CIF del hotel: ");
		nuevoHotel.setCif(scan.nextLine());
		System.out.println("Escribe el Nombre del hotel: ");
		nuevoHotel.setNombre(scan.nextLine());
		System.out.println("Escribe el Gerente del hotel: ");
		nuevoHotel.setGerente(scan.nextLine());
		int estrellas = -1;
		do {
			System.out.println("Escribe la cantidad de estrellas del hotel: ");
			estrellas = Integer.parseInt(scan.nextLine());
		} while (estrellas < 1 && estrellas > 5);
		nuevoHotel.setEstrellas(estrellas);
		System.out.println("Escribe el nombre de compañia del hotel: ");
		nuevoHotel.setCompania(scan.nextLine());
		return nuevoHotel;
	}
	
	
	//------------------------------------------
	public static Habitacion pedirDatosHabitacion(Scanner scan, int id) {
		Habitacion habitacion= new Habitacion();
		
		System.out.println("---INSERTA DATOS DE LA HABITACION---");
		System.out.println("Escribe el ID de la habitacion: ");
		habitacion.setId(Integer.parseInt(scan.nextLine()));
		habitacion.setId_hotel(id);
		System.out.println("Inserta el numero de la habitacion: ");
		habitacion.setNumero(Integer.parseInt(scan.nextLine()));
		System.out.println("Inserte la descripcion de la habitacion:");
		habitacion.setDescripcion(scan.nextLine());
		System.out.println("Inserte el precio del hotel:");
		habitacion.setPrecio(Double.parseDouble(scan.nextLine()));
		return habitacion;
		
	}
	
//Pedir Id habitacion
	
	public static int pedirIdHabitacion(Scanner scan) {
		System.out.println("Escribe el ID de la habitacion de la que desea realizar la reserva: ");
		return Integer.parseInt(scan.nextLine());
	}
	

/*reserva------------------------------------------------------------*/
	
	
	public static Reserva pedirDatosReserva(Scanner scan, String dni, int idHotel, int idHabitacion) throws ParseException {
		Reserva reserva= new Reserva();
		
		System.out.println("---INSERTA DATOS DE LA RESERVA---");
		reserva.setDni(dni);
		reserva.setId(idHotel);
		reserva.setId_habitacion(idHabitacion);
		System.out.println("Desde cuando quieres realizar la reserva (dd/MM/yyyy): ");
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		reserva.setDesde(formatoFecha.parse(scan.nextLine()));
		System.out.println("Hasta cuando quieres realizar la reserva (dd/MM/yyyy): ");
		reserva.setHasta(formatoFecha.parse(scan.nextLine()));
		
		return reserva;
		
	}
	
	
	public static int pedirIdReserva(Scanner scan) {
		
		System.out.println("Escribe el ID de la reserva que quieres eliminar: ");
		return Integer.parseInt(scan.nextLine());
	}

	public static String pedirCadena(Scanner scan) {
		System.out.println("Indica la cadena que desea buscar: ");
		return scan.nextLine();
	}
	
}
