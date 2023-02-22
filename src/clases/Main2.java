package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		//INICIO DEL MENU
		final int VISUALIZAR_HABITACIONES = 1;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		do {
			System.out.println(" ------MENU------");
			System.out.println(VISUALIZAR_HABITACIONES + ". Visualizar habitaciones");
			System.out.println("Elije una de las opciones: ");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case VISUALIZAR_HABITACIONES:
				System.out.println("Escribe el nombre del hotel al que le quieres consultar las habitaciones:");
				String nombreHotel = scan.nextLine();
				Hotel idHotel = getIdHotel(nombreHotel);
				ArrayList<Habitacion> habitaciones = getHabitacionesHotel(idHotel.getId());
				
				if(habitaciones.size()<1) {
					System.out.println("No se ha encontrado ningun hotel/habitacion!");
				}else {
					System.out.println("Lista de la/s habitacion/es encontradas: ");
					for (Habitacion habitacion : habitaciones) {
						System.out.println("ID de la habitacion: " + habitacion.getId() + "\nID del hotel: " + habitacion.getId_hotel() + "\nNumero de la habitacion: " + habitacion.getNumero() + "\nDescripcion de la habitacion: " + habitacion.getDescripcion() + "\nPrecio de la habitacion: " + habitacion.getPrecio() + "\n");
					}
				}

				break;
			case SALIR:
				System.out.println("\nAgur!");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != SALIR);
		scan.close();

	}
	
	private static final String HOST = "localhost";
	private static final String BBDD = "agencia_viajes";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	
	private static Hotel getIdHotel(String nombreHotel) {
		Hotel hotel = new Hotel();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			
			PreparedStatement gettearId = conexion.prepareStatement("SELECT * FROM hoteles WHERE nombre = ?");
			gettearId.setString(1, nombreHotel);
			ResultSet resultado = gettearId.executeQuery();
			while(resultado.next()) {
				hotel.setId(resultado.getInt("id"));
				hotel.setCif(resultado.getString("cif"));
				hotel.setNombre(resultado.getString("nombre"));
				hotel.setGerente(resultado.getString("gerente"));
				hotel.setEstrellas(resultado.getInt("estrellas"));
				hotel.setCompania(resultado.getString("compania"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hotel;
	}
	
	private static ArrayList<Habitacion> getHabitacionesHotel(int idHotel) {
		ArrayList<Habitacion> habitaciones = new ArrayList<>();

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection conexion;
			try {
				conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
				
				PreparedStatement gettearHabitacion = conexion.prepareStatement("SELECT * FROM habitaciones WHERE id_hotel = ?");
				gettearHabitacion.setInt(1, idHotel);
				ResultSet resultado = gettearHabitacion.executeQuery();
				while(resultado.next()) {
					Habitacion habitacion = new Habitacion();
					habitacion.setId(resultado.getInt("id"));
					habitacion.setId_hotel(resultado.getInt("id_hotel"));
					habitacion.setNumero(resultado.getInt("numero"));
					habitacion.setDescripcion(resultado.getString("descripcion"));
					habitacion.setPrecio(resultado.getDouble("precio"));
					habitaciones.add(habitacion);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return habitaciones;
	}

}
