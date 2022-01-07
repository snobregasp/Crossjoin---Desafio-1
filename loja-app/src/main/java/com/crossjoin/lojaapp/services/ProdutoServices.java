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

import com.crossjoin.lojaapp.model.Produto;
import com.crossjoin.lojaapp.repository.ProdutoRepository;


@RestController
@RequestMapping("/")
public class ProdutoServices {

	@Autowired
	private  ProdutoRepository produtoRepository;
	
	@GetMapping
	public String mensagem() {
		return "POST / DELETE / PUT --> Devem ser realizadas pelo POSTMAN para esta versão da aplicação";
	}
	
	@GetMapping("/api/mostra/produto")
	public List<Produto> listar(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/api/mostra/produto/{idprod}")
	public Produto listarProdutoPorId(@PathVariable Long idprod) {
		return produtoRepository.findById(idprod).get();	
	}
	
	
	@PostMapping("/api/criar/produto")
	@ResponseStatus(HttpStatus.CREATED)
	public Produto save(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/api/apagar/produto/{idprod}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable Long idprod) {
		produtoRepository.deleteById(idprod);
	}
	
	@PutMapping("/api/atualizar/produto/{idprod}")
	public Produto atualizar(@PathVariable Long idprod, @RequestBody Produto produto) {
		Produto produtoAtual = produtoRepository.findById(idprod).get();
		BeanUtils.copyProperties(produto, produtoAtual, "idprod");
		return produtoRepository.save(produtoAtual);
	}
	
	
	
	
	
}
