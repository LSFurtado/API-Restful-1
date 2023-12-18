package com.lsfurtado.desafiobtg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsfurtado.desafiobtg.entities.Product;
import com.lsfurtado.desafiobtg.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public List<Product> findAll() {
		return repo.findAll();
	}

	public String save(Product prod) {
		prod.setTotal(prod.getQuantity() * prod.getPrice());

		repo.save(prod);
		return "Produto salvo com sucesso.";
	}

}
