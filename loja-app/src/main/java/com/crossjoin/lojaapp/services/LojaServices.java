package com.crossjoin.lojaapp.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crossjoin.lojaapp.model.Loja;
import com.crossjoin.lojaapp.repository.LojaRepository;

@RestController
@RequestMapping()
public class LojaServices {

	@Autowired
	private  LojaRepository lojaRepository;
	
	@GetMapping("/teste")
	public String form() {
		return "loja/formLoja.html";
	
	}
	
	@GetMapping
	public String mensagem() {
		return "POST / DELETE / PUT --> Devem ser realizadas pelo POSTMAN para esta versão da aplicação";
	}
	
	@GetMapping("/api/mostra/loja")
	public List<Loja> listar(){
		return lojaRepository.findAll();
	}
	
	@GetMapping("/api/mostra/loja/{idloja}")
	public Loja listarlojaPorId(@PathVariable Long idloja) {
		return lojaRepository.findById(idloja).get();	
	}
	
	
	@PostMapping("/api/criar/loja")
	@ResponseStatus(HttpStatus.CREATED)
	public Loja save(@RequestBody Loja loja) {
		return lojaRepository.save(loja);
	}
	
	@DeleteMapping("/api/delete/loja/{idloja}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable Long idloja) {
		lojaRepository.deleteById(idloja);
	}
	
	@PutMapping("/api/atualizar/loja/{idloja}")
	public Loja atualizar(@PathVariable Long idloja, @RequestBody Loja loja) {
		Loja lojaAtual = lojaRepository.findById(idloja).get();
		BeanUtils.copyProperties(loja, lojaAtual, "idloja");
		return lojaRepository.save(lojaAtual);
	}
	
	
	
	
	
}
