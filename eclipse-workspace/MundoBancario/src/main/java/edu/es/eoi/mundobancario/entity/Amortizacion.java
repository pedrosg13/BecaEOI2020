package edu.es.eoi.mundobancario.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "amortizaciones", schema = "mundo_bancario")
public class Amortizacion extends Prestamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer id_prestamos;
	
	@Column
	private Date fecha;
	
	@Column
	private double importe;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "amortizaciones", referencedColumnName = "id_prestamos")
	private Prestamo prestamo;

	public void setAmortizacion(Object object) {
	}

}
