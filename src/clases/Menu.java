package clases;

public class Menu {
	
	//SALIR
	public static final int SALIR = 0;
	
	//menu principal
	public static final int GESTIONAR_CLIENTES = 1;
	public static final int GESTIONAR_RESERVAS = 2;
	public static final int GESTIONAR_HOTELES = 3;
	
	//MENU CLIENTES		
	public static final int REGISTRAR_CLIENTES = 1;
	public static final int DAR_BAJA = 2;
	public static final int MODIFICAR_CLIENTE = 3;
	
	
	// MENU RESERVA
	public static final int REALIZAR_RESERVA = 1;
	public static final int ANULAR_RESERVA = 2;
	
	//MENU HOTELES
	public static final int REGISTRAR_HOTEL = 1;
	public static final int CREAR_HABITACION = 2;
	
	
	public static void menuPrincipal() {
		System.out.println(GESTIONAR_CLIENTES + ".- Gestionar Clientes" );
		System.out.println(GESTIONAR_RESERVAS + ".- Gestionar Reservas" );
		System.out.println(GESTIONAR_HOTELES + ".- Gestionar Hoteles" );
		System.out.println(SALIR + ".- Salir" );
	}
	
	public static void menuClientes() {
		System.out.println(REGISTRAR_CLIENTES + ".- Registrar Clientes" );
		System.out.println(DAR_BAJA + ".- Dar de baja al Cliente" );
		System.out.println(MODIFICAR_CLIENTE + ".- Modificar Clientes" );
		System.out.println(SALIR + ".- Salir" );

	}
	
	public static void menuReserva() {
		System.out.println(REALIZAR_RESERVA + ".- Realizar Reserva" );
		System.out.println(ANULAR_RESERVA + ".- Anular Reserva" );
		System.out.println(SALIR + ".- Salir" );

		
	}
	
	public static void menuHoteles() {
		System.out.println(REGISTRAR_HOTEL + ".- Registrar Hotel" );
		System.out.println(CREAR_HABITACION + ".- Crear habitacion Hotel" );
		System.out.println(SALIR + ".- Salir" );


	}

}
