package com.paredesfederico.herencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoDAO extends CrudRepository<Empleado, Integer>{

}
