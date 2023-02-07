package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector{ //TODO Es extends?
	Conector conector = new Conector();
	
	//Clientes ----------------------------------------------------
	public void altaCliente(Clientes cliente) throws SQLException{
		conector.conectar();
		PreparedStatement alta = conector.getCon().prepareStatement("INSERT INTO clientes (dni, nombre, apellidos, direccion, localidad) VALUES (?,?,?,?,?);");
		alta.setString(1, cliente.getDni());
		alta.setString(2, cliente.getNombre());
		alta.setString(3, cliente.getApellidos());
		alta.setString(4, cliente.getDireccion());
		alta.setString(4, cliente.getLocalidad());
		alta.execute();
		conector.cerrar();	
	}

}
