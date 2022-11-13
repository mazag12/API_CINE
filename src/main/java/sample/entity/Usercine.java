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
@Table(name = "usercine")
public class Usercine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	String id;
	
	@Column(name = "nombre")
    String nombre;
    
    @Column(name = "apellidos")
    String apellidos;
    
    @ManyToOne
	@JoinColumn(name = "tipouser", insertable = false, updatable = false)
	Tipouser tipousuario;
	
    int tipouser;
    
    @Column(name = "email")
    String email;
    
    @Column(name = "password")
    String password;
    
    @Column(name = "estado")
    String estado;
	
}
