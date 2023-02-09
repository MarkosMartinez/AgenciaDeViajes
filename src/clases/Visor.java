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
			System.out.println("ID: " + habitacion.getId() + "\nID del hotel: " + habitacion.getId_hotel() + "\nNumero de la habitacion: " + habitacion.getNumero() + "\nDescipcion de la habitacion: " + habitacion.getDescripcion() + "\nPrecio de la habitacion"+habitacion.getPrecio() + "\n");
		}
	}

	
}
