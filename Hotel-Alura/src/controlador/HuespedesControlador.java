package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import DAO.HuespedesDAO;
import factory.ConexionFactory;
import modelo.Huespedes;



public class HuespedesControlador {

	 private HuespedesDAO huespedDAO;
	 
	 public HuespedesControlador() {
			Connection connection = new ConexionFactory().recuperarConexion();
			this.huespedDAO = new HuespedesDAO(connection);
		}
	 
		public void guardar(Huespedes huespedes) {
			this.huespedDAO.guardar(huespedes);
		}
		public List<Huespedes> listarHuespedes() {
			return this.huespedDAO.listarHuespedes();
		}
		
		public List<Huespedes> listarHuespedesId(String id) {
			return this.huespedDAO.buscarId(id);
		}
		
		public void actualizar(String nombre, String apellido, Date fechaN, String nacionalidad, String telefono, Integer idReserva, Integer id) {
			this.huespedDAO.Actualizar(nombre, apellido, fechaN, nacionalidad, telefono, idReserva, id);
		}
		
		public void Eliminar(Integer id) {
			this.huespedDAO.Eliminar(id);
		}
}
