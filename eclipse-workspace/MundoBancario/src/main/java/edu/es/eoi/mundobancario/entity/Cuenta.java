package edu.es.eoi.mundobancario.entity;

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
@Table(name = "cuentas", schema = "mundo_bancario")
public class Cuenta  extends Cliente{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_cuenta;
	
	@Column
	private Integer id_cliente;
	
	@Column
	private String id_tipos_movimiento;
	
	@Column
	private String alias;
	
	@Column
	private double saldo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente", referencedColumnName = "id_cliente")
	private Cliente cliente;

	public Integer getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(Integer num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getId_tipos_movimiento() {
		return id_tipos_movimiento;
	}

	public void setId_tipos_movimiento(String id_tipos_movimiento) {
		this.id_tipos_movimiento = id_tipos_movimiento;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
