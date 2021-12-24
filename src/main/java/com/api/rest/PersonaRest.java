package com.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dao.PersonaDAO;
import com.api.model.Persona;

@RestController
@RequestMapping("persona")
public class PersonaRest {
	
	//Inyeccion de depencias
	
	@Autowired
	private PersonaDAO personaDAO;
	
	//Metodos HTTP
	
	//Guarda registro
	@PostMapping("/guardar")
	public void guardar(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
	//Muestra registros
	@GetMapping("/listar")
	public List <Persona> listar(){
		return personaDAO.findAll();
	}
	
	//Borra registro
	@DeleteMapping("/eliminar{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		personaDAO.deleteById(id);
	}
	
	//Actualiza registro
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}

}
