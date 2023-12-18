package com.lsfurtado.desafiobtg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsfurtado.desafiobtg.entities.Product;
import com.lsfurtado.desafiobtg.services.ProductService;

@RestController
@RequestMapping("/desafio/produto")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> listAll() {
		List<Product> usuarios = productService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(usuarios);

	}

	@PostMapping
	public ResponseEntity<String> save(@RequestBody Product product) {
		String entradas = productService.save(product);
		return ResponseEntity.status(HttpStatus.OK).body(entradas);
	}

}
