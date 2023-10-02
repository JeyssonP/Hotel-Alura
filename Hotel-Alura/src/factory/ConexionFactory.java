package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;


public class ConexionFactory {

	public DataSource dataSource;

	public ConexionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("mysql://localhost/hotelalura?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");
		

		this.dataSource = (DataSource) comboPooledDataSource;
	}

	public Connection recuperarConexion() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

