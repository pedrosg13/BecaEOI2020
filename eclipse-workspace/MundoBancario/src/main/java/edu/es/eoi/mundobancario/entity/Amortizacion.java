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
	private String id_prestamos;
	
	@Column
	private Date fecha;
	
	@Column
	private double importe;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "amortizaciones", referencedColumnName = "id_prestamos")
	private Prestamo prestamo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getId_prestamos() {
		return id_prestamos;
	}

	public void setId_prestamos(String id_prestamos) {
		this.id_prestamos = id_prestamos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Prestamo getCliente() {
		return prestamo;
	}

	public void setCliente(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	

}
