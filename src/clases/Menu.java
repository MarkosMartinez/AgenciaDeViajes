package clases;

public class Menu {
	
	//menu principal
	static final int GESTIONAR_CLIENTES=1;
	static final int GESTIONAR_RESERVAS=2;
	static final int GESTIONAR_HOTELES=3;
	
	//SALIR
	
	static final int SALIR =0;
	
	//MENU CLIENTES		
	static final int REGISTRAR_CLIENTES=1;
	static final int DAR_BAJA=2;
	static final int MODIFICAR_CLIENTE=3;
	
	
	// MENU RESERVA
	static final int REALIZAR_RESERVA=1;
	static final int ANULAR_RESERVA=2;
	
	//MENU HOTELES
	static final int REGISTRAR_HOTEL=1;
	static final int CREAR_HABITACION=2;
	
	
	public static void menuPrincipal() {
		System.out.println(GESTIONAR_CLIENTES + ".- Gestionar Clientes" );
		System.out.println(GESTIONAR_RESERVAS + ".- Gestionar Reservas" );
		System.out.println(GESTIONAR_HOTELES + ".- Gestionar Hoteles" );
		System.out.println(SALIR + ".- Salir" );
	}
	
	public static void menuClientes() {
		System.out.println(REGISTRAR_CLIENTES + ".- Registrar Clientes" );
		System.out.println(DAR_BAJA + ".- Dar de baja al clientes" );
		System.out.println(MODIFICAR_CLIENTE + ".- Modificar Clientes" );
	}
	
	public static void menuReserva() {
		System.out.println(REALIZAR_RESERVA + ".- Realizar Reserva" );
		System.out.println(ANULAR_RESERVA + ".- Anular Reserva" );
		
	}

}
