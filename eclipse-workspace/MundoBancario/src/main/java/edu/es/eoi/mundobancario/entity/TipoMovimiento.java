package edu.es.eoi.mundobancario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "tipo_movimientos", schema = "mundo_bancario")
public class TipoMovimiento {

	@Column
	private Integer id;
	
	@Column
	private String tipo;
	
}