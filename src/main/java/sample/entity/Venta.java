package sample.entity;

import java.sql.Date;

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
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idventa")
	int idventa;
	
	@Column(name = "idtrasac")
    String idtrasac;
        
    @ManyToOne
	@JoinColumn(name = "idcliente", insertable = false, updatable = false)
    Cliente cliente;
    
    String idcliente;

    @Column(name = "fechaventa")
    Date fechaventa ;
    
    @Column(name = "descripcionventa")
    String descripcionventa;
    
    @Column(name = "preciototal")
    String preciototal;
	
}
