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
public class Cuenta {

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

}
