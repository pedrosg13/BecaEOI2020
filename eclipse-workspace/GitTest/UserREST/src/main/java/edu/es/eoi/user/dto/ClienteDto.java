package edu.es.eoi.user.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {

	private String dni;

	private String nombre;

	private Date fechaAlta;
}
