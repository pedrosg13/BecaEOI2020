package edu.es.eoi.mundobancario.entity;

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
@Table(name = "movimientos")
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

	@ManyToMany(targetEntity = Product.class)
    private List<Product> products;
	
	@ManyToOne(targetEntity = Order.class)
	private User User;
	

}
