package com.doces.apirest.resources;

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

import com.doces.apirest.models.Doce;
import com.doces.apirest.repository.DoceRepository;

@RestController
@RequestMapping(value="/api")
public class DoceResource {
	
	@Autowired
	DoceRepository doceRepository;
	
	@GetMapping("/doces")
	public List<Doce> listaDoces(){
		return doceRepository.findAll();
	}
	
	@GetMapping("/doce/{id}")
	public Doce listaDocesUnico(@PathVariable(value="id") long id){
		return doceRepository.findById(id);
	}
	
	@PostMapping("/doce")
	public Doce salvaDoces(@RequestBody Doce doce) {
		return doceRepository.save(doce);
	}
	
	@DeleteMapping("/doce")
	public void deleteDoces(@RequestBody Doce doce) {
		doceRepository.delete(doce);
	}
	
	@PutMapping("/doce")
	public Doce atualizaDoces(@RequestBody Doce doce) {
		return doceRepository.save(doce);
	}

}
