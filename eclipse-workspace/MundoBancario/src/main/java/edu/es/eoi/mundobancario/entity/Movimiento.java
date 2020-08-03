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

}
