package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import DAO.ReservaDAO;
import factory.ConexionFactory;
import modelo.Reserva;


public class ReservaControlador {

	 private ReservaDAO reservaDAO;
	 
	 public ReservaControlador() {
			Connection connection = new ConexionFactory().recuperarConexion();
			this.reservaDAO = new ReservaDAO(connection);
		}
	 
		public void guardar(Reserva reserva) {
			this.reservaDAO.guardar(reserva);
		}
			
		public List<Reserva> buscar() {
			return this.reservaDAO.buscar();
		}
		
		public List<Reserva> buscarId(String id) {
			return this.reservaDAO.buscarId(id);
		}
		
		public void actualizar(Date fechaE, Date fechaS, String valor, String formaPago, Integer id) {
			this.reservaDAO.Actualizar(fechaE, fechaS, valor, formaPago, id);
		}
		
		public void Eliminar(Integer id) {
			this.reservaDAO.Eliminar(id);
		}
}
