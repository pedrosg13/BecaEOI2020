package edu.es.eoi.mundobancario.entity;

import java.util.Date;

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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prestamos", referencedColumnName = "id_cliente")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(Integer num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public String getPlazos() {
		return plazos;
	}

	public void setPlazos(String plazos) {
		this.plazos = plazos;
	}

	public Cliente getCuentas() {
		return cliente;
	}

	public void setCuentas(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setPrestamo(Object object) {
	}

}
