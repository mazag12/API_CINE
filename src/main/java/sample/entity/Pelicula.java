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
@Table(name = "pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpeli")
	String id;
	
	@Column(name = "titulo")
	String titulo;

    @ManyToOne
	@JoinColumn(name = "tipopeli", insertable = false, updatable = false)
    Tipopelicula tipopelicula;
    
    String tipopeli;
    
    @Column(name = "fechaestreno")
    Date fechaestreno;
    
    @Column(name = "fechafinal")
    Date fechafinal;
    
    @Column(name = "fecharegistro")
    Date fecharegistro;
    
    @Column(name = "estado")
    String estado;
	
}
