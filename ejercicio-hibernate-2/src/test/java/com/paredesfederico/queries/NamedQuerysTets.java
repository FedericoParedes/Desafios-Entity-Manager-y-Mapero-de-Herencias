package com.paredesfederico.queries;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.paredesfederico.dao.IClienteRepository;
import com.paredesfederico.entidades.Cliente;


@SpringBootTest
public class NamedQuerysTets {

	@Autowired
	private IClienteRepository clienteRepository;
	
	
	@Test
	public void obtenerCliente () {
		
		// METODO QUE REGISTRA LOS CLIENTES
		
		 // INICIO DEL METODO
		
	      /*if(clienteRepository.getAllCustomersRegisters().isEmpty()) {
			
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
	        	  
	          clienteRepository.save(c);
	         }
		
		}*/
	       
	     // FIN DEL METODO
	
		
		/* PRUEBA DEL METODO QUE DEVUELVE UN CLIENTE BUSCADO POR NOMBRE
		
	    Cliente clienteBuscadoPorNombre = clienteRepository.findCustomerByFirstName("Priscila");
	    
	    assertTrue(clienteBuscadoPorNombre.getNombres().equals("Priscila"));*/
		
        
		/* PRUEBA DEL METODO QUE DEVUELVE UN CLIENTE BUSCADO POR APELLIDO
		
		Cliente clienteBuscadoPorApellido = clienteRepository.findCustomerByLastName("Cabrera");	
		
		assertTrue(clienteBuscadoPorNombre.getApellidos().equals("Cabrera"));*/

		
		/* PRUEBA DEL METODO QUE DEVUELVE LA LISTA DE CLIENTES REGISTRADOS
		
		List<Cliente> clientesRegistrados = clienteRepository.getAllCustomersRegisters();
		
		assertThat(clientesRegistrados.size()).isEqualTo(10);*/
		
		
		// PRUEBA DEL METODO QUE DEVUELVE LA CANTIDAD DE REGISTROS
		
		
		/*Integer amount = clienteRepository.getAmountCustomersRegisters();
		
		assertTrue(amount.equals(10));
		
		System.out.println("La cantidad de registros es: " + amount);*/
		
		
	   // PRUEBA DEL METODO QUE DEVUELVE UN CLIENTE BUSCADO POR DNI
		
		/*Cliente clienteBuscadoPorDni = clienteRepository.findCustomerByDni(45322576);

		assertTrue(clienteBuscadoPorDni.getNombres().equals("Priscila"));*/
		
	   // PRUEBA DEL METODO QUE DEVUELVE UN CLIENTE BUSCADO POR ID
		
	    /*Cliente clienteBuscadoPorId = clienteRepository.findCustomerById(2);
		
        assertTrue(clienteBuscadoPorId.getNombres().equals("Federico"));*/

		
		
		
		
		
				
	}
	
	
	
	
	
	
}
