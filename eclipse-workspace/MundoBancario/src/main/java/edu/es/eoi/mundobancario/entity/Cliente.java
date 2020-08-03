package edu.es.eoi.mundobancario.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clientes", schema = "mundo_bancario")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private String pass;
	
	@Column
	private String usuario;
	
	@Column
	private String Email;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> cuentas;

}
