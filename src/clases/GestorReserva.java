package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorReserva {
	Scanner scan = new Scanner(System.in);
	public static void run(Scanner scan) throws SQLException, ParseException {		
		
		int opcion_menu;
		GestorBBDD gestorbbdd = new GestorBBDD();
		GestorDatos gestordatos = new GestorDatos();

		do {
			Menu.menuReserva();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menu.REALIZAR_RESERVA:
				
				Cliente cliente = gestorbbdd.getCliente(FormularioDeDatos.pedirDniClientes(scan));
				if (cliente.getDni() == "-1") {
					break;
				}
					Hotel hotel = gestorbbdd.getHoteles(FormularioDeDatos.pedirIdHotel(scan));
					if(hotel.getId() == -1) {
						Visor.mostrarMensajeError("El hotel no existe");
				}else {
					ArrayList<Habitacion> habitacionesDelHotel = gestorbbdd.getHabitaciones(hotel.getId());
					if(habitacionesDelHotel.size() == 0) {
						Visor.mostrarMensajeError("En este hotel no hay habitaciones disponibles");
					}else {
					Visor.mostrarHabitaciones(habitacionesDelHotel);
					int idHabitacion = FormularioDeDatos.pedirIdHabitacion(scan);
					Habitacion habitacion = gestorbbdd.getHabitacion(idHabitacion, hotel.getId());
					if(habitacion.getId()== -1) {
						Visor.mostrarMensajeError("La habitacion no ha sido encontrada");
					}else {
						Reserva reserva = FormularioDeDatos.pedirDatosReserva(scan, cliente.getDni(), hotel.getId(), habitacion.getId());
						gestorbbdd.realizarReserva(reserva);
					}
					}
				}
				
				break;
			case Menu.ANULAR_RESERVA:
			int idEliminar = FormularioDeDatos.pedirIdReserva(scan);
			Reserva reserva = gestorbbdd.getReserva(idEliminar);
			if (reserva.getId()!=-1) {
				gestorbbdd.anularReserva(idEliminar);
				Visor.mostrarMensajeCorrecto("Reserva Eliminada!");
			}
				
				break;
			case Menu.CONSULTAR_RESERVAS_CLIENTE:
				String dni = FormularioDeDatos.pedirDniClientes(scan);
				ArrayList<Reserva> reservas = gestorbbdd.getReservas();
				ArrayList<Reserva> reservaBuscarCliente = gestordatos.buscarReservasClientes(reservas, dni);
				
				if(reservaBuscarCliente.size()==0) {
					Visor.mostrarMensajeError("Ninguna reserva encontrada! ");
				}else {
					Visor.mostrarReservas(reservaBuscarCliente);
				}
	
				
				break;
			case Menu.CONSULTAR_FECHA:
				java.util.Date fecha1 = FormularioDeDatos.consultarFecha(scan);
				java.util.Date fecha2 = FormularioDeDatos.consultarFecha2(scan);
				ArrayList<Reserva> reservasABuscar =  gestorbbdd.getReservas();
				ArrayList<Reserva> reservasEncontradas = gestordatos.getReservasPorFecha(fecha1, fecha2, reservasABuscar);
				if(reservasEncontradas.size() == 0) {
					Visor.mostrarMensajeError("No hemos encontrado ninguna reserva entre esas fechas!");
				}else {
				Visor.mostrarReservas(reservasEncontradas);
				}
				
				break;
			case Menu.SALIR:
				break;
			default:
				Visor.mostrarMensajeError("Opcion no valida!\nIntentalo de nuevo.");
			}

		} while (opcion_menu != Menu.SALIR);
		
	}
	
	
}
