package edu.es.eoi.mundobancario.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movimientos", schema = "mundo_bancario")
@NoArgsConstructor
public class Movimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String num_cuenta;
	
	@Column
	private String id_tipos_movimiento;
	
	@Column
	private String descripcion;
	
	@Column
	private Date fecha;
	
	@Column
	private String importe;

	@ManyToMany(targetEntity = Amortizacion.class)
	private List<Amortizacion> products;

	@ManyToOne(targetEntity = Cliente.class)
	private Cliente Cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public String getId_tipos_movimiento() {
		return id_tipos_movimiento;
	}

	public void setId_tipos_movimiento(String id_tipos_movimiento) {
		this.id_tipos_movimiento = id_tipos_movimiento;
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

	public String getImporte() {
		return importe;
	}

	public void setImporte(String importe) {
		this.importe = importe;
	}

	public List<Amortizacion> getProducts() {
		return products;
	}

	public void setProducts(List<Amortizacion> products) {
		this.products = products;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

}
