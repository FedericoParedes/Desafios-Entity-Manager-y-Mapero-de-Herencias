package com.paredesfederico.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.paredesfederico.entidades.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class ClienteDAOImpl implements IClienteDAO {
	
	// EJERCICIO 2
	
	// IMPLEMENTACION DE METODOS CON ENTITY MANAGER
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Cliente saveNewCustomer(Cliente customer) {
		
		Cliente newCustomer = new Cliente(customer.getDni(), customer.getNombres(), customer.getApellidos());
		
		entityManager.persist(customer);
		
		return newCustomer;
	}

	@Override
	@Transactional
	public Cliente getCustomerById(Integer customerId) {
		return (Cliente) entityManager.createQuery("SELECT c FROM Cliente c WHERE c.id= : id_param")
				.setParameter("id_param", customerId)
				.getSingleResult();
	}

	@Override
	@Transactional
	public Cliente getCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return (Cliente) entityManager.createQuery("SELECT c FROM Cliente c WHERE c.nombres= : first_name")
				.setParameter("first_name", firstName)
				.getSingleResult();
	}

	@Override
	@Transactional
	public Cliente getCustomerByLastName(String lastName) {
		
		return (Cliente) entityManager.createQuery("SELECT c FROM Cliente c WHERE c.apellidos= : last_name")
				.setParameter("last_name", lastName)
				.getSingleResult();
	}

	@Override
	@Transactional
	public Cliente getCustomerByDni(Integer customerDni) {
		// TODO Auto-generated method stub
		return (Cliente) entityManager.createQuery("SELECT c FROM Cliente c WHERE c.dni= : dni_param")
				.setParameter("dni_param", customerDni)
				.getSingleResult();
	}

	@Override
	@Transactional
	public List<Cliente> getAllCustomers() {
			
		return entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();

	}

	@Override
	@Transactional
	public Integer getNumberOfRegisters() {
		
		/*Query query =  entityManager.createQuery("SELECT COUNT(*) FROM Cliente c");
		
		Integer numberOfRegisteredCustomers = ((Number) query.getSingleResult()).intValue();
		
		return numberOfRegisteredCustomers;*/
		
		return entityManager.createQuery("SELECT COUNT (*) FROM Cliente c", Number.class)
				.getSingleResult().intValue();
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer customerId) {
		
	 // Utilice este metodo porque no supe como hacerlo con una query
					
	  Cliente c = entityManager.find(Cliente.class, customerId);
	  
	  entityManager.remove(c);
	  
	} 

	
	
	
	
	
	
	
	
	
	
	
	
	
}
