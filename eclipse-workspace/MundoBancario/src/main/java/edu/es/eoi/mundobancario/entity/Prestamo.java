package edu.es.eoi.mundobancario.entity;

import java.util.Date;
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
@Table(name = "prestamos", schema = "mundo_bancario")
public class Prestamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer num_cuenta;
	
	@Column
	private String descripcion;
	
	@Column
	private Date fecha;
	
	@Column
	private double importe;
	
	@Column
	private String plazos;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> cuentas;

	
}
