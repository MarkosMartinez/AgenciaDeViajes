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
			Visor.mostrarMensajeError("Cliente no encontrado\nporfavor vuelve a intentarlo!");
			cliente.setDni("-1");
		}
		
		conector.cerrar();
		return cliente;
		
	}
	
	public void bajaCliente(Clientes cliente) throws SQLException {
		conector.conectar();
		PreparedStatement pstDelete = conector.getCon().prepareStatement("DELETE FROM clientes WHERE dni =?");
		pstDelete.setString(1, cliente.getDni());
		pstDelete.execute();
		conector.cerrar();
		
	}
	
	public void modificarCliente(Clientes nuevosDatosCliente) throws SQLException {
		conector.conectar();
		PreparedStatement pstModificar = conector.getCon().prepareStatement("UPDATE clientes SET nombre= ?, apellidos= ?, direccion= ?, localidad=? WHERE dni = ?;");
		pstModificar.setString(1, nuevosDatosCliente.getNombre());
		pstModificar.setString(2, nuevosDatosCliente.getApellidos());
		pstModificar.setString(3, nuevosDatosCliente.getDireccion());
		pstModificar.setString(4, nuevosDatosCliente.getLocalidad());
		pstModificar.setString(5, nuevosDatosCliente.getDni());
		pstModificar.execute();
		conector.cerrar();
		
	}
	
/*---------------------A PARTIR DE AQUI ES PARA HOTELES */
	public void registrarHotel(Hoteles hotel) throws SQLException{
		conector.conectar();
		PreparedStatement registrarHotel = conector.getCon().prepareStatement("INSERT INTO hoteles (cif, nombre, gerente, estrellas, compania) VALUES (?,?,?,?,?);");
		registrarHotel.setString(1,hotel.getCif());
		registrarHotel.setString(2, hotel.getNombre());
		registrarHotel.setString(3, hotel.getGerente());
		registrarHotel.setInt(4, hotel.getEstrellas());
		registrarHotel.setString(5, hotel.getCompania());

		registrarHotel.execute();
		conector.cerrar();	
	}
	
	
	
	public  Hoteles getHoteles(int id) throws SQLException {
		Hoteles hotel= new Hoteles();
		conector.conectar();
		PreparedStatement gettear =conector.getCon().prepareStatement("SELECT * FROM clientes WHERE id =?");
		gettear.setInt(1, id);
		ResultSet resultado=gettear.executeQuery();
		if(resultado.next()) {
		hotel.setId(resultado.getInt("id"));
		hotel.setCif(resultado.getString("cif"));
		hotel.setNombre(resultado.getString("nombre"));
		hotel.setGerente(resultado.getString("gerente"));
		hotel.setEstrellas(resultado.getInt("estrellas"));

		}else {
			hotel.setId(-1);
		}
		
		conector.cerrar();
		return hotel;
		
	}
	
	
}
