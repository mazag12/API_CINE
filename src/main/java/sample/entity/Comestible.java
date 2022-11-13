package sample.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comestible")
public class Comestible {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcomestible")
	String id;
	
	@Column(name = "descrip")
    String descrip;
    
    @Column(name = "precio")
    float precio;
    
    @Column(name = "stockactual")
    int stockactual;
    
    @Column(name = "idtipocomestible")
	int idtipocomestible;
	
	@Column(name = "fecharegistro")
	Date fecharegistro;
    
    @Column(name = "estado")
    String estado;
	
}
