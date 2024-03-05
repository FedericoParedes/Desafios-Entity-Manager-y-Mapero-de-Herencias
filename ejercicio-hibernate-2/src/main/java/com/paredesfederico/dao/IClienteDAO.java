package com.paredesfederico.dao;

import java.util.List;


import com.paredesfederico.entidades.Cliente;

public interface IClienteDAO {
	
	// EJERCICIO 2
	
	// METODOS A IMPLEMENTAR CON ENTITY MANAGER

	Cliente saveNewCustomer (Cliente customer);
	
	Cliente getCustomerById (Integer customerId);
	
	Cliente getCustomerByFirstName (String firstName);
	
	Cliente getCustomerByLastName (String lastName);
	
	Cliente getCustomerByDni (Integer customerDni);
	
	List<Cliente> getAllCustomers();
	
	Integer getNumberOfRegisters();
	
	void deleteCustomer(Integer customer);
	
} 
