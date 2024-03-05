package com.paredesfederico;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.util.Streamable;

import com.paredesfederico.herencia.Empleado;
import com.paredesfederico.herencia.IEmpleadoDAO;
import com.paredesfederico.herencia.IPersonaDAO;
import com.paredesfederico.herencia.Persona;

@SpringBootApplication
public class EjercicioHibernateHerenciaApplication implements CommandLineRunner {
	
	@Autowired
	private IPersonaDAO personaDAO;
	
	@Autowired
	private IEmpleadoDAO empleadoDAO;
	
	private Log logger = LogFactory.getLog(getClass());
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioHibernateHerenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// METODO PARA REGISTRAR EMPLEADOS
		
      /* INICIO DEL METODO
       
        List<Empleado> employees = new ArrayList<>();
       
       String[] firstNames = {"Oscar","Liliana","Luis","Graciela","Ana","Luis","Claudia","Raul","Pedro","Julio"};
			
        String[] lastNames = {"Benitez","Gimenez","Acosta","Perez","Gomez","Romero","Flores","Alvarez","Ramirez","Torres"};
		
		int[] ages = {30,28,27,32,24,29,36,26,42,44};
		
		String[] areas = {"Software","Recursos Humanos","Marketing","Finanzas","Marketing","Administracion","Recursos Humanos","Software",
				           "Recursos humanos", "Administracion"};
		
		String[] positions = {"Software engineer","HR Coordinator", "Digital marketing manager","Business Account Manager", "Content manager",
				              "Chief technology officer","Carrer advisor", "Software developer", "Recruiter", "Technical project manager"};
		
		int[] seniorities = {4,3,1,10,2,5,13,4,19,21};
		
		
		 for(int i=0;i<10;i++) {
			
			 Empleado newEmployee = new Empleado();
			 
			 newEmployee.setNombre(firstNames[i]);
			 
			 newEmployee.setApellido(lastNames[i]);
			 
			 newEmployee.setEdad(ages[i]);
			 
			 newEmployee.setArea(areas[i]);
			 
			 newEmployee.setPuesto(positions[i]);
			 
			 newEmployee.setAntiguedad(seniorities[i]);
			 
			 employees.add(newEmployee);	 
			 
		 }
		
		
		for(Empleado e : employees) {
			
			empleadoDAO.save(e);
		}
		
		   FIN DEL METODO
		*/
		
	  
		// METODO PARA OBTENER UNA LISTA DE EMPLEADOS Y MOSTRAR LA INFORMACION DE CADA UNO
		
		/* INICIO DEL METODO
		
		List<Empleado> employees =  Streamable.of(empleadoDAO.findAll()).toList();
		
		   for(Empleado e : employees) {
			
			logger.info("\nEmployee id: " + e.getId() +
					     "\nEmployee firstName: " + e.getNombre() +
					     "\nEmployee lastName: " + e.getApellido() +
					      "\nEmployee age: " + e.getEdad() +
					      "\nEmployee area: " + e.getArea() +
					      "\nEmployee position: " + e.getPuesto() +
					      "\nEmployee seniority: " + e.getAntiguedad() +
					      "\n------------------------------------------"
			                                       
			);
		
		}
		 
		   FIN DEL METODO
		*/
		
		// METODO PARA REGISTRAR PERSONAS
		
		/* INICIO DEL METODO
		 
		 List<Persona> persons = new ArrayList<>();
			
		 String[] firstNames = {"Marta","Roberto","Miguel","Maria","Jose","Cecilia","Daniel","Mirta","Mauricio","Monica"};
			
	        String[] lastNames = {"Suarez","Gonzalez","Martinez","Ruiz","Aguirre","Medina","Sanchez","Garcia","Gutierrez","Lopez"};
			
			int[] ages = {35,29,26,32,30,28,24,40,33,21};
			
			
			for(int i=0;i<10;i++) {
				
			  Persona newPerson = new Persona();
			  
			  newPerson.setNombre(firstNames[i]);
			  
			  newPerson.setApellido(lastNames[i]);

			  newPerson.setEdad(ages[i]);

			  persons.add(newPerson);			
				
			}
			
			
			for(Persona p : persons) {
				
				personaDAO.save(p);
			}
			
			   FIN DEL METODO
			*/
		
		
		// METODO PARA OBTENER UNA LISTA DE PERSONAS Y MOSTRAR LA INFORMACION DE CADA UNA
		
		
		/* INICIO DEL METODO
		
		List<Persona> persons = Streamable.of(personaDAO.findAll()).toList();
		
		for(Persona p : persons) {
			
			logger.info("\nPerson id: " + p.getId() +
				     "\nPerson firstName: " + p.getNombre() +
				     "\nPerson lastName: " + p.getApellido() +
				      "\nPerson age: " + p.getEdad() +
				      "\n------------------------------------------"
                   );	
		}
		
		    FIN DEL METODO
		*/
		
		
		
		
		
		
		// METODO PARA OBTENER LA CANTIDAD DE REGISTROS DE PERSONAS
		
		 /* INICIO DEL METODO
		
		  Integer numberOfPersonRegisters = Streamable.of(personaDAO.findAll()).toList().size();
		  
		  Integer numberOfEmployeeRegisters = Streamable.of(empleadoDAO.findAll()).toList().size();
		
		  logger.info("\nNumber of persons registers: " + numberOfPersonRegisters);
		
		  logger.info("\nNumber of employees registers: " + numberOfEmployeeRegisters);
		
		     FIN DEL METODO
		  */
		
		
		
		
		
		
	}	
		
			
}
