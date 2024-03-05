package com.paredesfederico.herencia;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "personas")
@DiscriminatorValue(value = "E")
public class Empleado extends Persona{

	@Column(name = "per_emp_area")
	private String area;
	
	@Column(name = "per_emp_puesto")
	private String puesto;
	
	@Column(name = "per_emp_antiguedad")
	private Integer antiguedad;
	
	
	
	
}
