package com.paredesfederico;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.paredesfederico.dao.IClienteDAO;
import com.paredesfederico.entidades.Cliente;


@SpringBootApplication
public class EjercicioHibernate2Application implements CommandLineRunner{
	
	@Autowired
	private IClienteDAO clienteDAO;
	
	private Log logger = LogFactory.getLog(getClass());
	
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioHibernate2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// EJERCICIO 2
		
		// METODO PARA CARGAR LOS CLIENTES EN LA BASE DE DATOS
		
		
		/*if(clienteDAO.getAllCustomers().isEmpty()) {
			
            List<Cliente> customersToSave = new ArrayList<>();
			
			String[] firstNames = {"Federico","Priscila","Guadalupe","Camila","Facundo","Brian","Enzo","Angeles","Tania","Jonatan"};
			
			String[] lastNames = {"Paredes","Cabrera","Lanuti","Aguero","Schulz","Ocaranza","Sanchez","Caselli","Ramirez","Rosales"};
			
			int[] documents = {45322576,40541362,46281634,43129772,41573296,42674302,45998543,41681714,43408195,41994268};

						
			for(int i=0;i<10;i++) {
				
		     Cliente customerToSave = new Cliente();
		    
		    customerToSave.setDni(documents[i]);
		    
		    customerToSave.setNombres(firstNames[i]);
		    
		    customerToSave.setApellidos(lastNames[i]);
		    
		    customersToSave.add(customerToSave);
		    							
			}
			       
	         for(Cliente c : customersToSave) {
	        	 
	        	  clienteDAO.saveNewCustomer(c);
	         }
		
		}*/
		
		// METODO PARA ELEIMINAR LOS REGISTROS DE CLIENTES
		
		/*List<Cliente> customersToDelete = clienteDAO.getAllCustomers();
		
		for(Cliente c : customersToDelete) {
			
			clienteDAO.deleteCustomer(c.getId());

		}
		
		logger.info("\nAmount of registers: " + customersToDelete.size());*/
		
		
	   // METODO PARA REGISTRAR UN NUEVO CLIENTE
		
	  /* Integer numberOfSavedClients = clienteDAO.getAllCustomers().size();
	   
	   logger.info("\nInitial number of clients: " + numberOfSavedClients);

	 
	  Cliente newCustomerToSave = new Cliente(41573296, "Micaela", "Forziati");
		
	   Cliente newSavedCustomer = clienteDAO.saveNewCustomer(newCustomerToSave);
	   
	   Integer updatedNumberOfSavedClients = clienteDAO.getAllCustomers().size();
	   
	   logger.info("\nUpdated number of clients: " + updatedNumberOfSavedClients);
		
	   logger.info(
	           "\nSaved customer id: " + newSavedCustomer.getId() + 
			   "\nSaved customer dni: " + newSavedCustomer.getDni() + 
			   "\nSaved customer first name: " + newSavedCustomer.getNombres() + 
			   "\nSaved customer last name: " + newSavedCustomer.getApellidos()
			   
			  );*/
	   
		
	   
		
		// METODO PARA OBTENER UN CLIENTE POR ID
		
		/*Cliente customerSearchedById = clienteDAO.getCustomerById(3);
		
		logger.info("\nRetrieved customer id: " + retrievedCustomerById.getId() + 
				   "\nRetrieved customer dni: " + retrievedCustomerById.getDni() + 
				   "\nRetrieved customer first name: " + retrievedCustomerById.getNombres() + 
				   "\nRetrieved customer last name: " + retrievedCustomerById.getApellidos());*/

		// METODO PARA OBTENER UN CLIENTE POR NOMBRE
		
	  /*Cliente customerSearchedByFirstName = clienteDAO.getCustomerByFirstName("Priscila");
	   
	    logger.info("\nRetrieved customer id: " + customerSearchedByFirstName.getId() + 
				   "\nRetrieved customer dni: " + customerSearchedByFirstName.getDni() + 
				   "\nRetrieved customer first name: " + customerSearchedByFirstName.getNombres() + 
				   "\nRetrieved customer last name: " + customerSearchedByFirstName.getApellidos());*/

	    // METODO PARA OBTENER UN CLIENTE POR APELLIDO
	
	    /*Cliente customerSearchedByLastName = clienteDAO.getCustomerByLastName("Aguero");
		   
	    logger.info("\nRetrieved customer id: " + customerSearchedByLastName.getId() + 
				   "\nRetrieved customer dni: " + customerSearchedByLastName.getDni() + 
				   "\nRetrieved customer first name: " + customerSearchedByLastName.getNombres() + 
				   "\nRetrieved customer last name: " + customerSearchedByLastName.getApellidos());*/
	
	   // METODO PARA OBTENER UN CLIENTE POR DNI
		
		/*Cliente customerSearchedByDni = clienteDAO.getCustomerByDni(40541366);
		   
	    logger.info("\nRetrieved customer id: " + customerSearchedByDni.getId() + 
				   "\nRetrieved customer dni: " + customerSearchedByDni.getDni() + 
				   "\nRetrieved customer first name: " + customerSearchedByDni.getNombres() + 
				   "\nRetrieved customer last name: " + customerSearchedByDni.getApellidos());*/
		
		// METODO PARA OBTENER TODOS LOS REGISTROS DE CLIENTES
		
		/*List<Cliente> allCustomerRegisters = clienteDAO.getAllCustomers();
	
	    for(Cliente c : allCustomerRegisters) {
	    	
	       logger.info("\nRetrieved customer id: " + c.getId() + 
					   "\nRetrieved customer dni: " + c.getDni() + 
					   "\nRetrieved customer first name: " + c.getNombres() + 
					   "\nRetrieved customer last name: " + c.getApellidos() + 
					   "\n------------------------------------------------"); 	
	     }*/
	
	     // METODO PARA OBTENER LA CANTIDAD DE CLIENTES REGISTRADOS
	
	      /*Integer numberOfRegisteredCustomers = clienteDAO.getNumberOfRegisters();
	      
	      logger.info("\nThe number of registered customers is: " + numberOfRegisteredCustomers);*/
	
	
	
	}

}
