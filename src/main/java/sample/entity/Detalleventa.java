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
@Table(name = "detalleventa")
public class Detalleventa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddetaventa")
	int id;
	
	@Column(name = "idventa")
    int venta;
	
	@ManyToOne
	@JoinColumn(name = "idpeli", insertable = false, updatable = false)
    Pelicula pelicula;
	
    String idpeli;
	
    @ManyToOne
	@JoinColumn(name = "idcomestible", insertable = false, updatable = false)
    Comestible comestible;
    
    String idcomestible;
	
	@Column(name = "cantidadtickets")
    int tickets;
	
	@Column(name = "cantidadcomest")
    int cantidadcomestible;
	
	@Column(name = "total")
    Double total;
}
