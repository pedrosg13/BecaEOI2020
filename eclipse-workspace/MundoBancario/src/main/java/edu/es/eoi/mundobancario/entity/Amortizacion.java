package edu.es.eoi.mundobancario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "amortizaciones")
public class Amortizacion extends Prestamo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	@Column(name = "id_prestamos")
	Long id_prestamos;
	@Column(name = "fecha")
	String fecha;
	@Column(name = "importe")
	String importe;
	@ManyToOne(fetch = FetchType.LAZY, mappedBy = "Amortizacion")
	private List amortizaciones;
	

}
