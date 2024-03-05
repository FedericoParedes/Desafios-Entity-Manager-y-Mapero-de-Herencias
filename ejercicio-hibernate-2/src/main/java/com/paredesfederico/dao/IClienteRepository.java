package com.paredesfederico.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.paredesfederico.entidades.Cliente;


@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
	
	// EJERCICIO 1

	// METODOS QUE IMPLEMENTAN NAMED QUERY
		
	/*Cliente findCustomerByFirstName(@Param("first_name") String firstName);
	
	Cliente findCustomerByLastName(@Param("last_name") String lastName);
	
	List<Cliente> getAllCustomersRegisters();
	
	Integer getAmountCustomersRegisters();
	
	Cliente findCustomerByDni(@Param("dni_param") Integer dni);
	
	Cliente findCustomerById(@Param("id_param") Integer id);*/
	
	
	
}
