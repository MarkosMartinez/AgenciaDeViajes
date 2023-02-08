package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		alta.setString(5, cliente.getLocalidad());
		alta.execute();
		conector.cerrar();	
	}
	
	//TODO Crear el get del cliente (le llega el DNI)
	
	public  Clientes getCliente(String dni) throws SQLException {
		Clientes cliente = new Clientes();
		conector.conectar();
		PreparedStatement gettear =conector.getCon().prepareStatement("SELECT * FROM clientes WHERE dni =?");
		gettear.setString(1, dni);
		ResultSet resultado=gettear.executeQuery();
		if(resultado.next()) {
		cliente.setDni(resultado.getString("dni"));
		cliente.setNombre(resultado.getString("nombre"));
		cliente.setApellidos(resultado.getString("apellidos"));
		cliente.setDireccion(resultado.getString("direccion"));
		cliente.setLocalidad(resultado.getString("direccion"));

		}else {
			Visor.mostrarMensajeError("cliente no encontrado, porfavor vuelva a intentarlo");
			cliente.setDni("-1");
		}
		
		conector.cerrar();
		return cliente;
		
	}
}
