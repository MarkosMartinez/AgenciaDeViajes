package clases;

import java.util.ArrayList;

public class Visor {
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void mostrarMensajeError(String mensaje) {
		System.out.println(Colores.ROJO + mensaje + Colores.NEGRO + "\n");
	}
	
	public static void mostrarMensajeCorrecto(String mensaje) {
		System.out.println(Colores.VERDE + mensaje + Colores.NEGRO + " \n");
	}
	
	public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {
		System.out.println("Estos son todas las habitaciones del hotel: ");
		for (Habitacion habitacion : habitaciones) {
			System.out.println("ID de la habitacion: " + habitacion.getId() + "\nID del hotel: " + habitacion.getId_hotel() + "\nNumero de la habitacion: " + habitacion.getNumero() + "\nDescipcion de la habitacion: " + habitacion.getDescripcion() + "\nPrecio de la habitacion: "+habitacion.getPrecio() + "\n");
		}
	}
	
	public static void mostrarReservas(ArrayList<Reserva> reservas) {
		System.out.println("Estos son todas las reservas: ");
		for (Reserva reserva : reservas) {
			System.out.println("ID de la reserva: " + reserva.getId() + "\nID de la habitacion: " + reserva.getId_habitacion() + "\nDNI: " + reserva.getDni() + "\nDesde: " + reserva.getDesde() + "\nHasta: "+reserva.getHasta() + "\n");
		}
	}

	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		System.out.println("Estos son todas los clientes: ");
		for (Cliente cliente : clientes) {
			System.out.println("DNI: " + cliente.getDni() + "\nNombre: " + cliente.getNombre() + "\nApellido: " + cliente.getApellidos() + "\nDireccion: " + cliente.getDireccion() + "\nLocalidad: "+ cliente.getLocalidad() + "\n");
		}
	}
	
	
	
}
