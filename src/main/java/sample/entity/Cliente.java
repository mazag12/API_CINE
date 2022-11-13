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
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	String id;
	
	@Column(name = "nombre")
	String nombre;
    
    @Column(name = "apellidos")
    String apellidos;
    
    @Column(name = "telefono")
    String telefono;
    
    @Column(name = "email")
    String email;
    
    @Column(name = "password")
    String password;
	
	@Column(name = "fecharegistro")
	Date fecharegistro;
	
}
