package edu.es.eoi.mundobancario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class TipoMovimiento {

	@Column
	private Integer id;
	
	@Column
	private String tipo;
	
}