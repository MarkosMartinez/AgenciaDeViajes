package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) throws ParseException, SQLException {
		
		Scanner scan = new Scanner(System.in);
		GestorBBDD gestorbbdd = new GestorBBDD();
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Escribe desde que fecha quieres comprobar las reservas: ");
			Date fechaDesde = formatoFecha.parse(scan.nextLine());
			System.out.println("Escribe hasta que fecha quieres comprobar las reservas: ");
			Date fechaHasta = formatoFecha.parse(scan.nextLine());
		
		ArrayList<Reserva> reservasABuscar =  gestorbbdd.getReservas();
		ArrayList<Habitacion> habitacion = new ArrayList<Habitacion>();
		for (Reserva reserva : reservasABuscar) {
			if((reserva.getDesde().getTime() >= fechaDesde.getTime()) && (reserva.getHasta().getTime() <= fechaHasta.getTime())) {
				habitacion.add(gestorbbdd.getHabitacion(reserva.getId_habitacion(), reserva.getId()));
			}
		}
		
		for (Habitacion habitacion2 : habitacion) {
			System.out.println("Descripcion: " + habitacion2.getDescripcion());
		}
		
		scan.close();
	}

}
