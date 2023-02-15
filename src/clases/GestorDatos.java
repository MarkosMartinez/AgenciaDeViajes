package clases;

import java.util.ArrayList;

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
	
	
}
