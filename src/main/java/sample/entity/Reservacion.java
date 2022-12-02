package sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "reservacion")
public class Reservacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idreservacion")
	String id;
	
	@ManyToOne
	@JoinColumn(name = "idpeli", insertable = false, updatable = false)
    Pelicula pelicula;
	
    String idpeli;
	
    @ManyToOne
	@JoinColumn(name = "idcliente", insertable = false, updatable = false)
    Cliente cliente;
    
    String idcliente;
	
    @ManyToOne
   	@JoinColumn(name = "idreserva", insertable = false, updatable = false)
    Tiporeservacion tiporeserva;
    
    int idreserva;
	
	@Column(name = "contactoreserva")
    String contacto;
	
	@Column(name = "reserva")
    boolean reserva;
	
	@Column(name = "pago")
    boolean pago;
	
	@Column(name = "estado")
    String estado;
	
}
