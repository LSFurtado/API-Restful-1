package com.lsfurtado.desafiobtg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsfurtado.desafiobtg.entities.Product;
import com.lsfurtado.desafiobtg.entities.Usuario;
import com.lsfurtado.desafiobtg.repositories.ProductRepository;
import com.lsfurtado.desafiobtg.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	@Autowired
	private ProductRepository prodRepos;
	public List<Usuario> findAll() {
		return repo.findAll();
	}

	public Optional<Usuario> findById(Integer id) throws Exception {
		Optional<Usuario> search = repo.findById(id);
		if (search.isEmpty()) {
			throw new Exception("Not Found");
		}
		return search;

	}
	
	public Usuario save(Usuario usuario) throws Exception {
		for(int i = 0; i > usuario.getProduct().size(); i++ ) {
			Optional<Product> prod = prodRepos.findById(usuario.getProduct().get(i).getId());
			if (prod.isEmpty()) {
				throw new Exception("Not Found");
			}
			Product found = prod.get();
			usuario.getProduct().set(i, found);

			}
		
		
		Usuario savedUsuario = repo.save(usuario);
		return savedUsuario;
	}
	
	public String delete(Integer id) {
		repo.deleteById(id);
		return "Usuario deletado com sucesso!";
	}
}
