package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import dao.ReservasDAO;
import factory.ConnectionFactory;
import modelo.Reservas;

public class ReservasController {
	
	private ReservasDAO reservasDAO;
	 
	 public ReservasController() {
			Connection connection = new ConnectionFactory().getConnectionDB();
			this.reservasDAO = new ReservasDAO(connection);
		}
	 
		public void guardar(Reservas reservas) {
			this.reservasDAO.guardar(reservas);
		}
			
		public List<Reservas> buscar() {
			return this.reservasDAO.buscar();
		}
		
		public List<Reservas> buscarId(String id) {
			return this.reservasDAO.buscarId(id);
		}
		
		public void actualizar(Date fechaE, Date fechaS, String valor, String formaPago, Integer id) {
			this.reservasDAO.Actualizar(fechaE, fechaS, valor, formaPago, id);
		}
		
		public void Eliminar(Integer id) {
			this.reservasDAO.Eliminar(id);
		}

}
