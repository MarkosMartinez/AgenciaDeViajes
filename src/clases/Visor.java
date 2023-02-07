package clases;

public class Visor {
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void mostrarMensajeError(String mensaje) {
		System.out.println(Colores.ROJO + mensaje + Colores.NEGRO);
	}
	
	public static void mostrarMensajeCorrecto(String mensaje) {
		System.out.println(Colores.VERDE + mensaje + Colores.NEGRO);
	}

	
}
