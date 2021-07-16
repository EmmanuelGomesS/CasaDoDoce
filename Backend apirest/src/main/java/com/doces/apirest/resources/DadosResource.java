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

import com.doces.apirest.models.Dados;
import com.doces.apirest.repository.DadosRepository;

@RestController
@RequestMapping(value="/api")
public class DadosResource {
	
	@Autowired
	DadosRepository dadosRepository;
	
	@GetMapping("/dados")
	public List<Dados> listaPedido(){
		return dadosRepository.findAll();
	}
	
	@GetMapping("/dado/{id}")
	public Dados listaDadosUnico(@PathVariable(value="id") long id){
		return dadosRepository.findById(id);
	}
	
	@PostMapping("/dado")
	public Dados salvaDados(@RequestBody Dados dado) {
		return dadosRepository.save(dado);
	}
	
	@DeleteMapping("/dado")
	public void deleteDados(@RequestBody Dados dado) {
		dadosRepository.delete(dado);
	}
	
	@PutMapping("/dado")
	public Dados atualizaDados(@RequestBody Dados dado) {
		return dadosRepository.save(dado);
	}

}