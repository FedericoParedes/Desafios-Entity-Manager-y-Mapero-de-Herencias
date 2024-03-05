package com.paredesfederico.entidades;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

// EJERCICIO 1
 
// NAMED QUERIES

/*@NamedQueries(
		{
			@NamedQuery(
					name = "Cliente.findCustomerByFirstName",
					query = "SELECT c FROM Cliente c WHERE c.nombres= : first_name"),
			
			@NamedQuery(name = "Cliente.findCustomerByLastName",
			query = "SELECT c FROM Cliente c WHERE c.apellidos= : last_name"),
			
			@NamedQuery(
					name = "Cliente.getAllCustomersRegisters",
					query = "SELECT c FROM Cliente c"),
			
			@NamedQuery(name = "Cliente.getAmountCustomersRegisters",
			query = "SELECT COUNT (*) FROM Cliente c"),
			
			@NamedQuery(name = "Cliente.findCustomerByDni",
			 query = "SELECT c FROM Cliente c WHERE c.dni= : dni_param"),
			
			@NamedQuery(name = "Cliente.findCustomerById",
			    query = "SELECT c FROM Cliente c WHERE c.id= : id_param")
			
			
		}
		)*/
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Integer id;
	
	@Column(name = "cli_dni")
     private Integer dni;

	@Column(name = "cli_nombres")
   private String nombres;
	
	@Column(name = "cli_apellidos")
	private String apellidos;
	
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(Integer dni, String nombres, String apellidos) {
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	

}
