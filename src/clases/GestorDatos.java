package clases;

import java.util.ArrayList;
import java.util.Date;

public class GestorDatos {

	public ArrayList<Cliente> ordenarApellido(ArrayList<Cliente> clientesSinOrdenar) {
		  ArrayList<Cliente> clientesOrdenado = new ArrayList<Cliente>();
		  clientesSinOrdenar.sort((o1, o2) -> o1.getApellidos().compareTo(o2.getApellidos()));
		  for (Cliente cliente : clientesSinOrdenar) {
				clientesOrdenado.add(cliente);
			}
			return clientesOrdenado;
	    }
	
	public ArrayList<Cliente> ordenarNombre(ArrayList<Cliente> clientesSinOrdenar) {
		  ArrayList<Cliente> clientesOrdenado = new ArrayList<Cliente>();
		  clientesSinOrdenar.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
		  for (Cliente cliente : clientesSinOrdenar) {
				clientesOrdenado.add(cliente);
			}
			return clientesOrdenado;
	    }

	public ArrayList<Cliente> buscarCaracter(String cadenaABuscar, ArrayList<Cliente> clientesABuscar) {
		ArrayList<Cliente> clientesEncontrados = new ArrayList<Cliente>();
		for (Cliente cliente : clientesABuscar) {
			if(cliente.getNombre().contains(cadenaABuscar) || cliente.getApellidos().contains(cadenaABuscar)) {
				clientesEncontrados.add(cliente);
			}
		}
		
		return clientesEncontrados;
	}

	public ArrayList<Reserva> getReservasPorFecha(Date fecha1, Date fecha2, ArrayList<Reserva> reservasABuscar) {
		ArrayList<Reserva> ReservasEncontradas = new ArrayList<Reserva>();
		for (Reserva reserva : reservasABuscar) {
			if((reserva.getDesde().getTime() >= fecha1.getTime()) && (reserva.getHasta().getTime() <= fecha2.getTime())) {
				ReservasEncontradas.add(reserva);
			}
		}
		
		
		return ReservasEncontradas;
	}

	public ArrayList<Reserva> buscarReservasClientes(ArrayList<Reserva> reservas, String dni) {
		ArrayList<Reserva> reservasEncontradasClientes = new ArrayList<Reserva>();
		
		for (Reserva reserva : reservas) {
			if(reserva.getDni().equals(dni)) {
				reservasEncontradasClientes.add(reserva);
			}
		}
		
		
		
		return reservasEncontradasClientes;
	}
	
	
}
