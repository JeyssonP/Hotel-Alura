package factory;

import java.sql.Connection;
import java.sql.SQLException;



public class TestConexion {

	public static void main(String[] args) throws SQLException {

		ConexionFactory connectionFactory = new ConexionFactory();
		Connection connection = connectionFactory.recuperarConexion();

		System.out.println("Probando conexion!!");

		connection.close();
		
		System.out.println("Conexión cerrada!!");
	}
}
